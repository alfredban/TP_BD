package Clases;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import jackson.JsonSerializer;

public class ConexionMongo {

    private static final String URI = "mongodb://localhost:27017";
    private static final String DB_NAME = "GRUPO_E_TP";
    private static final String COLLECTION_NAME = "ventas";
    private static MongoClient mongoClient = null;
    private static MongoDatabase database = null;

    // Conectar a la BD (solo una vez)
    public static MongoDatabase conectar() {
        if (mongoClient == null) {
            mongoClient = MongoClients.create(URI);
            database = mongoClient.getDatabase(DB_NAME);
            System.out.println(" Conectado a la base de datos: " + DB_NAME);
        }
        return database;
    }

    // Cerrar conexión
    public static void desconectar() {
        if (mongoClient != null) {
            mongoClient.close();
            mongoClient = null;
            database = null;
            System.out.println("Desconectado de la base de datos.");
        }
    }

    // Insertar objeto en la colección "ventas"
    public static void guardarObjeto(Object objeto) {
        try {
            MongoDatabase db = conectar();
            MongoCollection<Document> collection = db.getCollection(COLLECTION_NAME);

            // Convertimos a JSON 
            String json = JsonSerializer.objetoAJson(objeto);

            // Lo parseamos como Document y lo guardamos
            Document doc = Document.parse(json);
            collection.insertOne(doc);

            System.out.println(" Objeto guardado correctamente en la colección 'ventas'.");
        } catch (Exception e) {
            System.err.println(" Error al guardar el objeto: " + e.getMessage());
        }
    }
}