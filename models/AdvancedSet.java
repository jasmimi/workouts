package models;

public interface AdvancedSet extends Set {
  public BasicSet getFirstSet();

  public void setFirstSet(BasicSet firstSet);

  public BasicSet getSecondSet();

  public void setSecondSet(BasicSet secondSet);
}
