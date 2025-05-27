package models;

import java.util.ArrayList;
import java.util.Date;

public class Workout {
  private Date date;
  private String muscleGroup;
  private ArrayList<Set> sets = new ArrayList<>();
  private Weight weight;

  public Workout(Date date, String muscleGroup, ArrayList<Set> sets, Weight weight) {
    this.date = date;
    this.muscleGroup = muscleGroup;
    this.sets = sets;
    this.weight = weight;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public String getMuscleGroup() {
    return muscleGroup;
  }

  public void setMuscleGroup(String muscleGroup) {
    this.muscleGroup = muscleGroup;
  }

  public ArrayList<Set> getSets() {
    return sets;
  }

  public void addSet(Set set) {
    this.sets.add(set);
  }

  public void setSets(ArrayList<Set> sets) {
    this.sets = sets;
  }

  public Weight getWeight() {
    return weight;
  }

  public void setWeight(Weight weight) {
    this.weight = weight;
  }
}