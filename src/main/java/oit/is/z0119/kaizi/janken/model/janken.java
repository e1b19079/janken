package oit.is.z0119.kaizi.model;

public class janken{

  String player;
  String namae;
  public janken(String p){
    player = p;
  }

  public String getp(){
    return player;
  }

  public void setp(){
    this.player = player;
  }

  public String getn(){
    return namae;
  }

  public void setn(){
    this.namae = namae;
  }
}
