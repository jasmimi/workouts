package models;

public class DropSet implements AdvancedSet {
  private BasicSet firstSet;
  private BasicSet secondSet;

  public DropSet(BasicSet firstSet, BasicSet secondSet) {
    if (firstSet.getName().equals(secondSet.getName())
        && firstSet.getWeight() > secondSet.getWeight()) {
      this.firstSet = firstSet;
      this.secondSet = secondSet;
    } else {
      System.out.println("Can only dropset with the same exercise and drop in weight.");
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