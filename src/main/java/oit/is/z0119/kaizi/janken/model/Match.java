package oit.is.z0119.kaizi.janken.model;

public class Match {
  int id;
  int user1;
  int user2;
  String user1Hand;
  String user2Hand;
  boolean isActive;

  public Match() {

  }

  public Match(int id2, int user12, int user22, String user1hand2, String user2hand2, boolean isActive2) {
    this.id = id2;
    this.user1 = user12;
    this.user2 = user22;
    this.user1Hand = user1hand2;
    this.user2Hand = user2hand2;
    this.isActive = isActive2;
  }

  public int getUser1() {
    return user1;
  }

  public void setUser1(int user12) {
    this.user1 = user12;
  }

  public int getUser2() {
    return user2;
  }

  public void setUser2(int user22) {
    this.user2 = user22;
  }

  public String getUser1Hand() {
    return user1Hand;
  }

  public void setUser1Hand(String user1Hand2) {
    this.user1Hand = user1Hand2;
  }

  public String getUser2Hand() {
    return user2Hand;
  }

  public void serUser2Hand(String user2hand2) {
    this.user2Hand = user2hand2;
  }

  public int getId() {
    return id;
  }

  public void setId(int id2) {
    this.id = id2;
  }

  public boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(boolean isActive2) {
    this.isActive = isActive2;
  }

}
