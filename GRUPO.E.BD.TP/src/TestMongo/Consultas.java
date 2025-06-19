package TestMongo;


import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.bson.Document;
import com.mongodb.client.MongoDatabase;
import Clases.ConexionMongo;
import Clases.VentaRepository;
import jackson.JsonSerializer;

public class Consultas {

	public static void main(String[] args) {
		
		//conectamos a la bd
		MongoDatabase db = ConexionMongo.conectar();
			
		//instanciamos el repositorio
		
		VentaRepository REPO = new VentaRepository(db);
		
		//-------------- CONSULTA 1 ------------------
		//Cantidad de ventas para la cadena completa y por sucursal, entre fechas. 
		System.out.println("-----------------------------------------------------");
		
		LocalDate desde = LocalDate.of(2024, 6, 1);
		LocalDate hasta = LocalDate.of(2024, 6, 30);
		
		System.out.println("Cantidad de ventas entre "+desde+" y "+hasta+":");
		List<Document> ventas = REPO.buscarVentasEntreFechas(desde, hasta);
		for (Document doc : ventas) {
			
			System.out.print(doc+"\n");
			
		}
		
		
        System.out.println("\nCantidad de ventas por sucursal:");
        Map<String, Integer> totales = REPO.cantidadTotalVentasPorSucursal(desde, hasta);
        
        float total = 0;
        
        for (Map.Entry<String, Integer> entrada : totales.entrySet()) {
            System.out.println("Sucursal: " + entrada.getKey() + " - Cantidad: " + entrada.getValue());
            total=  (float) (total + entrada.getValue());
        }

        System.out.println("Cantidad de ventas total de todas las sucursales: "+total);
		
        System.out.println("-----------------------------------------------------");
        
		
		
		
		
		//-------------- CONSULTA 3 ------------------
		//Detalle y totales de ventas para la cadena completa y por sucursal, entre fechas. 
		System.out.println("-----------------------------------------------------");
		
		 desde = LocalDate.of(2024, 6, 1);
		 hasta = LocalDate.of(2024, 6, 30);
		
		System.out.println("Cobranza de ventas entre "+desde+" y "+hasta+":");
		ventas = REPO.buscarVentasEntreFechas(desde, hasta);
		for (Document doc : ventas) {
			
			System.out.print(doc+"\n");
			
		}
		
		
        System.out.println("\nTotales de ventas por sucursal:");
        Map<String, Double> totales2 = REPO.totalVentasPorSucursal(desde, hasta);
        
         total = 0;
        
        for (Map.Entry<String, Double> entrada : totales2.entrySet()) {
            System.out.println("Sucursal: " + entrada.getKey() + " ; Total: $" + entrada.getValue());
            total = (float) (total + entrada.getValue());
        }

        System.out.println("total de todas las sucursales: $"+total);
		
        System.out.println("-----------------------------------------------------");
        
        
     
		ConexionMongo.desconectar();
		
		
		
	}
	
	
	
}
