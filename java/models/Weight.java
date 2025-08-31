package java.models;

import java.time.LocalTime;

public class Weight {
  private LocalTime timeOfWeight;
  private Integer mass;

  Weight(Builder builder) {
    this.timeOfWeight = builder.timeOfWeight;
    this.mass = builder.mass;
  }

  public LocalTime getTimeOfWeight() {
    return timeOfWeight;
  }

  public Integer getMass() {
    return mass;
  }

  public static class Builder {
    private LocalTime timeOfWeight;
    private Integer mass;

    public Builder withTimeOfWeight(LocalTime timeOfWeight) {
      this.timeOfWeight = timeOfWeight;
      return this;
    }

    public Builder withMass(Integer mass) {
      this.mass = mass;
      return this;
    }

    public Weight build() {
      return new Weight(this);
    }
  }
}
