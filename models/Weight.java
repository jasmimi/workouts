package models;

import java.sql.Time;

public class Weight {
  private Time timeOfWeight;
  private Integer mass;

  Weight(Builder builder) {
    this.timeOfWeight = builder.timeOfWeight;
    this.mass = builder.mass;
  }

  public Time getTimeOfWeight() {
    return timeOfWeight;
  }

  public Integer getMass() {
    return mass;
  }
  
  public static class Builder {
    private Time timeOfWeight;
    private Integer mass;

    public Builder timeOfWeight(Time timeOfWeight) {
      this.timeOfWeight = timeOfWeight;
      return this;
    }

    public Builder mass(Integer mass) {
      this.mass = mass;
      return this;
    }

    public Weight build() {
      return new Weight(this);
    }
  }
}