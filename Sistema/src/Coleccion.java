import com.mongodb.client.*;
import org.bson.Document;

public class Coleccion {
    public static void main(String[] args){
        String url="mongodb+srv://Alter:ProtoTest29@cluster0.ogpqv.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";

        try (MongoClient mongoClient = MongoClients.create(url)) {
            MongoDatabase database = mongoClient.getDatabase("sample_mflix");
            System.out.println("Conexion lista");

            MongoCollection<Document> collection = database. getCollection("users");
            FindIterable<Document> documentos = collection.find();

            for(Document doc : documentos){
                System.out.println("Datos:");
                System.out.println("Id:" + doc.getObjectId("_id"));
                System.out.println("Nombre:" + doc.getString("name"));
                System.out.println("Email:" + doc.getString("email"));
                System.out.println("Password:" + doc.getString("password"));
                System.out.println("-----------\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al conectar");
        }

    }

}
