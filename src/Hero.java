
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.*;

public class Hero {

  HeroEnum hero;
  String heroName;
  ArrayList<Couplet> matchups;
  Image heroImage;

  Hero(HeroEnum hero) {
    this.hero = hero;
    this.heroName = String.valueOf(hero).replaceAll("_", " ");
    this.matchups = updateMatchups(hero);
    ImageIcon icon = new ImageIcon(String.valueOf(hero).toLowerCase().replaceAll("_", "-") + ".jpg");
    this.heroImage = icon.getImage();
  }

  private static final String getUrl(HeroEnum heroEnum) {
    String name = heroEnum.name().toLowerCase();
    name = name.replaceAll("_", "-");
    return "https://www.dotabuff.com/heroes/" + name + "/matchups";
  }

  public ArrayList<Couplet> getMatchups() {
    return this.matchups;
  }

  static final ArrayList<Couplet> updateMatchups(HeroEnum heroEnum) {
    ArrayList<Couplet> matchups = new ArrayList<>();
    Document dbpage;

    try {
      dbpage = Jsoup.connect(getUrl(heroEnum)).get();
    }
    catch (IOException e) {
      throw new IllegalAccessError("Couldn't access dotabuff page");
    }

    Elements tables = dbpage.getElementsByTag("tbody");
    Element winrateTable = tables.get(1);
    Elements matchupRows = winrateTable.select("tr");

    for (Element row : matchupRows) {
      HeroEnum hero = HeroEnum.valueOf(row.select("td").first().attr("data-value").toUpperCase().replaceAll(" ", "_").replaceAll("\'", "").replaceAll("-", ""));
      Double winrate = Double.valueOf(row.select("td").get(2).attr("data-value"));
      matchups.add(new Couplet(hero, winrate));
    }

    return matchups;
  }

}
