package oit.is.z0119.kaizi.janken.model;

public class janken {

  String player;
  String namae;
  String judge;

  public janken(String p) {
    player = p;
  }

  public String getPlayer() {
    return player;
  }

  public void setPlayer(String player) {
    this.player = player;
  }

  public String getNamae() {
    return namae;
  }

  public void setNamae(String namae) {
    this.namae = namae;
  }

  public String getJudge() {
    return judge;
  }

  public void setJudge(String judge) {
    this.judge = judge;
  }
}
