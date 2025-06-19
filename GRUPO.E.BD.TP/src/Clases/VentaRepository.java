package Clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Accumulators;
import com.mongodb.client.model.Aggregates;
import com.mongodb.client.model.Filters;

public class VentaRepository {

    private final MongoCollection<Document> collection;

    public VentaRepository(MongoDatabase database) {
        this.collection = database.getCollection("ventas");
    }

    
    
    
    public List<Document> buscarVentasEntreFechas(LocalDate desde, LocalDate hasta) {
        Bson filtro = Filters.and(
            Filters.gte("fecha", desde.toString()),
            Filters.lte("fecha", hasta.toString())
        );

        return collection.find(filtro).into(new ArrayList<>());
    }
    
    //CONSULTA 3 
    public Map<String, Double> totalVentasPorSucursal(LocalDate desde, LocalDate hasta) {
        // Esto asume que tenés "sucursal.ubicacion" o algo similar en los documentos
        List<Bson> pipeline = Arrays.asList(
            Aggregates.match(Filters.and(
                Filters.gte("fecha", desde.toString()),
                Filters.lte("fecha", hasta.toString())
            )),
            Aggregates.group("$empleadoAtiende.sucursal.puntoDeVenta", Accumulators.sum("total", "$totalVenta"))
        );

        Map<String, Double> resultado = new HashMap<>();
        collection.aggregate(pipeline).forEach(doc -> {
        	
            Object valor = doc.get("total");
            double total = (valor instanceof Integer)
                ? ((Integer) valor).doubleValue()
                : (Double) valor;
                
            resultado.put(doc.getString("_id"), total);
        });
        
        return resultado;
    }
    
    
    //CONSULTA 1 
    public Map<String, Integer> cantidadTotalVentasPorSucursal(LocalDate desde, LocalDate hasta) {
    	
        List<Bson> pipeline = Arrays.asList(
            Aggregates.match(Filters.and(
                Filters.gte("fecha", desde.toString()),
                Filters.lte("fecha", hasta.toString())
            )),
            Aggregates.group("$empleadoAtiende.sucursal.puntoDeVenta", Accumulators.sum("cantidad", 1))
        );

        Map<String, Integer> resultado = new HashMap<>();
        collection.aggregate(pipeline).forEach(doc -> {
        	
            Object valor = doc.get("cantidad");
            int total = (Integer) valor;
                
            resultado.put(doc.getString("_id"), total);
        });
        
        return resultado;
    }
    
    
  }