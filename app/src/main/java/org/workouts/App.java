package org.workouts;

import java.time.LocalDateTime;

import org.workouts.DBConnection;
import org.workouts.models.Weight;

public class App {
    public static void main(String[] args) {
        Weight weight = new Weight.Builder()
                .mass(58)
                .timeOfWeight(LocalDateTime.now().toLocalTime())
                .build();

        System.out.println(weight.toString());
        // DBConnection db = DBConnection.getConnection();
    }
}
