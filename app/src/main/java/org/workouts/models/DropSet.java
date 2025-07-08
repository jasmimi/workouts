package org.workouts.models;

public class DropSet implements AdvancedSet {
  private BasicSet firstSet;
  private BasicSet secondSet;

  DropSet(Builder builder) {
    this.firstSet = builder.firstSet;
    this.secondSet = builder.secondSet;
  }

  public BasicSet getFirstSet() {
    return firstSet;
  }

  public BasicSet getSecondSet() {
    return secondSet;
  }

  public static class Builder {
    private BasicSet firstSet;
    private BasicSet secondSet;

    public Builder withFirstSet(BasicSet firstSet) {
      this.firstSet = firstSet;
      return this;
    }

    public Builder withSecondSet(BasicSet secondSet) {
      this.secondSet = secondSet;
      return this;
    }

    public DropSet build() {
      return new DropSet(this);
    }
  }
}