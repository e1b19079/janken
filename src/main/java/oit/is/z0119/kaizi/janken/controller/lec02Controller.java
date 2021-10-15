package oit.is.z0119.kaizi.janken.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

import oit.is.z0119.kaizi.janken.model.*;

/**
 * @RequestMapping("/lec02")をクラスの前につけると，このクラスのすべてのメソッドは/lec02で呼び出されることを表す
 */
@Controller
public class lec02Controller {

  @Autowired
  private Entry room;

  @GetMapping("/lec02")
  public String lec02(ModelMap model, Principal prin) {
    String loginUser = prin.getName();
    this.room.addUser(loginUser);
    model.addAttribute("room", this.room);
    String namae = prin.getName();
    model.addAttribute("namae", namae);
    return "lec02.html";
  }

  @GetMapping("/lec02/{param1}")
  public String sample22(@PathVariable String param1, ModelMap model) {
    String player = param1;
    model.addAttribute("player", player);
    /* model.addAttribute("judge", "aho"); */
    if (player.equals("pa")) {
      model.addAttribute("judge", "YOUWIN!");
    } else if (player.equals("choki")) {
      model.addAttribute("judge", "YOULOSE");
    } else if (player.equals("gu")) {
      model.addAttribute("judge", "Draw");
    } else {
      model.addAttribute("judge", "aho");
    }

    return "lec02.html";
  }

  @PostMapping("/lec02/{param2}")
  public String janken(@RequestParam String param2, ModelMap model) {
    String namae = param2;
    model.addAttribute("namae", namae);
    return "lec02.html";
  }

  @PostMapping("/janken")
  public String janken21(@RequestParam String namae, ModelMap model) {
    model.addAttribute("namae", namae);
    return "lec02.html";
  }

  /*
   * @GetMapping("/lec02/") public String sample32(ModelMap model, Principal prin)
   * { String loginUser = prin.getName(); this.room.addUser(loginUser);
   * model.addAttribute("room", this.room); return "lec02.html"; }
   */
}
