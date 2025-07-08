package org.workouts.models;

public class BasicSet implements Set {
  private String name;
  private Integer weight;
  private Integer reps;

  BasicSet(Builder builder) {
    this.name = builder.name;
    this.weight = builder.weight;
    this.reps = builder.reps;
  }

  public String getName() {
    return name;
  }

  public Integer getWeight() {
    return weight;
  }

  public Integer getReps() {
    return reps;
  }

  public static class Builder {
    private String name;
    private Integer weight;
    private Integer reps;

    public Builder withName(String name) {
      this.name = name;
      return this;
    }

    public Builder withWeight(Integer weight) {
      this.weight = weight;
      return this;
    }

    public Builder withReps(Integer reps) {
      this.reps = reps;
      return this;
    }

    public BasicSet build() {
      return new BasicSet(this);
    }
  }
}