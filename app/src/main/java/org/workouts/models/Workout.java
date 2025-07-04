package org.workouts.models;

import java.util.ArrayList;
import java.util.Date;

public class Workout {
  private Date date;
  private String muscleGroup;
  private ArrayList<Set> sets;
  private Weight weight;

  Workout(Builder builder) {
    this.date = builder.date;
    this.muscleGroup = builder.muscleGroup;
    this.sets = builder.sets;
    this.weight = builder.weight;
  }

  public Date getDate() {
    return date;
  }

  public String getMuscleGroup() {
    return muscleGroup;
  }

  public ArrayList<Set> getSets() {
    return sets;
  }

  public Weight getWeight() {
    return weight;
  }

  public static class Builder {
    private Date date;
    private String muscleGroup;
    private ArrayList<Set> sets;
    private Weight weight;

    public Builder date(Date date) {
      this.date = date;
      return this;
    }

    public Builder muscleGroup(String muscleGroup) {
      this.muscleGroup = muscleGroup;
      return this;
    }

    public Builder sets(ArrayList<Set> sets) {
      this.sets = sets;
      return this;
    }

    public Builder weight(Weight weight) {
      this.weight = weight;
      return this;
    }

    public Workout build() {
      return new Workout(this);
    }
  }
}