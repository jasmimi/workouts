package models;

public class SuperSet implements AdvancedSet {
  private BasicSet firstSet;
  private BasicSet secondSet;

  public SuperSet(BasicSet firstSet, BasicSet secondSet) {
    if (!firstSet.getName().equals(secondSet.getName())) {
      this.firstSet = firstSet;
      this.secondSet = secondSet;
    } else {
      System.out.println("Can only superset with the different exercises.");
    }
  }

  public BasicSet getFirstSet() {
    return firstSet;
  }

  public void setFirstSet(BasicSet firstSet) {
    this.firstSet = firstSet;
  }

  public BasicSet getSecondSet() {
    return secondSet;
  }

  public void setSecondSet(BasicSet secondSet) {
    this.secondSet = secondSet;
  }
}