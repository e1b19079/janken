package oit.is.z0119.kaizi.janken.controller;

import java.security.Principal;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

import oit.is.z0119.kaizi.janken.model.Entry;
import oit.is.z0119.kaizi.janken.model.UserMapper;
import oit.is.z0119.kaizi.janken.model.User;
import oit.is.z0119.kaizi.janken.model.MatchMapper;
import oit.is.z0119.kaizi.janken.model.Match;

//@RequestMapping({ "/lec02", "/match" })
@Controller
@RequestMapping({ "/lec02", "/match" })
public class lec02Controller {

  @Autowired
  private Entry room;

  // @Autowired
  // User user1;

  // @Autowired
  // User user2;

  @Autowired
  UserMapper userMapper;

  @Autowired
  MatchMapper matchMapper;

  @GetMapping("start")
  public String start(ModelMap model, Principal prin) {
    String loginUser = prin.getName();
    this.room.addUser(loginUser);
    model.addAttribute("room", this.room);
    String namae = prin.getName();
    model.addAttribute("namae", namae);

    // user1 = userMapper.selectByName(namae);
    // model.addAttribute("user1", user1);

    ArrayList<User> users4 = userMapper.selectAll();
    model.addAttribute("users4", users4);

    ArrayList<Match> match4 = matchMapper.selectAll();
    model.addAttribute("match4", match4);

    return "lec02.html";
  }

  @GetMapping("/janken/{param1}")
  public String janken(@PathVariable String player, ModelMap model) {
    // String player = param1;
    model.addAttribute("player", player);
    if (player.equals("pa")) {
      model.addAttribute("judge", "YOUWIN!");
    } else if (player.equals("choki")) {
      model.addAttribute("judge", "YOULOSE");
    } else if (player.equals("gu")) {
      model.addAttribute("judge", "Draw");
    }

    return "lec02.html";
  }

  @GetMapping("/match")
  public String Match(@RequestParam Integer id, ModelMap model) {

    User user1 = userMapper.selectById(id);
    User user2 = userMapper.selectById(id);
    model.addAttribute("user1", user1);
    model.addAttribute("user2", user2);

    return "match.html";
  }

}
