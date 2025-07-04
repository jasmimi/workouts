package org.workouts;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

public class App {
    public static void main(String[] args) {
        String uri = System.getenv("MONGO_URI");

        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("workouts");
            System.out.println("Connected to DB: " + database.getName());
        } catch (Exception e) {
            System.err.println("Connection failed:");
            e.printStackTrace();
        }
    }
}
