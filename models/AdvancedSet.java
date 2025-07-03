package models;

public interface AdvancedSet extends Set {
  private BasicSet firstSet();
  private BasicSet secondSet();

  AdvancedSet(Builder builder) {
    this.firstSet = builder.firstSet;
    this.secondSet = builder.secondSet;
  }

  public BasicSet getFirstSet() {
    return firstSet();
  }

  public BasicSet getSecondSet() {
    return secondSet();
  }

  public static class Builder {
    private BasicSet firstSet;
    private BasicSet secondSet;

    public Builder firstSet(BasicSet firstSet) {
      this.firstSet = firstSet;
      return this;
    }

    public Builder secondSet(BasicSet secondSet) {
      this.secondSet = secondSet;
      return this;
    }

    public AdvancedSet build() {
      return new AdvancedSet(this);
    }
  }
}