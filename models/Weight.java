package models;

import java.sql.Time;

public class Weight {
  private Time timeOfWeight;
  private Integer mass;

  public Weight(Time timeOfWeight, Integer mass) {
    this.timeOfWeight = timeOfWeight;
    this.mass = mass;
  }

  public Time getTimeOfWeight() {
    return timeOfWeight;
  }

  public void setTimeOfWeight(Time timeOfWeight) {
    this.timeOfWeight = timeOfWeight;
  }

  public Integer getMass() {
    return mass;
  }

  public void setMass(Integer mass) {
    this.mass = mass;
  }
}