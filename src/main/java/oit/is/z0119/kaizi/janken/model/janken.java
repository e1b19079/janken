package oit.is.z0119.kaizi.janken.model;

public class janken {

  String player;
  String namae;
  String judge;

  public janken(String p) {
    player = p;
  }

  public String getplayer() {
    return player;
  }

  public void setplayer(String player) {
    this.player = player;
  }

  public String getnamae() {
    return namae;
  }

  public void setnamae(String namae) {
    this.namae = namae;
  }

  public String getjudge() {
    return judge;
  }

  public void setjudge(String judge) {
    this.judge = judge;
  }
}
