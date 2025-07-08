package org.workouts;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class DBConnection {
  private static DBConnection connection;

  private DBConnection() {
    String uri = System.getenv("MONGO_URI");

    try (MongoClient mongoClient = MongoClients.create(uri)) {
      MongoDatabase database = mongoClient.getDatabase("workouts");
      System.out.println("Connected to DB: " + database.getName());
    } catch (Exception e) {
      System.err.println("Connection failed:");
      e.printStackTrace();
    }
  }

  public static DBConnection getConnection() {
    if (connection == null) {
      connection = new DBConnection();
    }
    return connection;
  }
}
