package jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;

///Clase JsonSerializer:
public class JsonSerializer {
	
	private static ObjectMapper mapper = new ObjectMapper()
	        .registerModule(new JavaTimeModule())
	        .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
	        .enable(SerializationFeature.INDENT_OUTPUT);
	
	
	
	//Serializa un objeto Java a un archivo JSON formateado:
    public static void guardarComoJson(Object objeto, String rutaArchivo) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule()); //Para serializar LocalDateTime.
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS); //Deshabilitación de timestamps.
        mapper.enable(SerializationFeature.INDENT_OUTPUT); //Identado del JSON.

        try {
            mapper.writeValue(new File(rutaArchivo), objeto); //Generación del archivo con los datos en formato JSON.
            System.out.println("Archivo JSON generado en: " + rutaArchivo);
            
            //Imprimimos por consola el JSON cargado en el archivo:
            String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(objeto);
            System.out.println(json);

        } catch (IOException e) {
            System.err.println("Error al guardar el JSON: " + e.getMessage());
        }   
        
    }
    
    
    public static String objetoAJson(Object objeto) throws JsonProcessingException  {
        return mapper.writeValueAsString(objeto);
    }
    
    
    
    
}
