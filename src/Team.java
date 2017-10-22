import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Team {

  TeamEnum side;
  ArrayList<HeroEnum> picks;
  ArrayList<HeroEnum> bans;


  Team(TeamEnum side) {
    this.side = side;
    this.picks = new ArrayList<>();
    this.bans = new ArrayList<>();
  }

  public List<HeroEnum> getPicks() {
    return picks;
  }

  public List<HeroEnum> getBans() {
    return bans;
  }

  int numPicks() {
    return picks.size();
  }

  int numBans() {
    return bans.size();
  }

  void addPick(HeroEnum heroEnum) {
    if (picks.size() < 5 && !picks.contains(heroEnum)) {
      picks.add(heroEnum);
    }
  }

  void addBan(HeroEnum heroEnum) {
    if (!bans.contains(heroEnum)) {
      bans.add(heroEnum);
    }
  }

  void removePick(HeroEnum heroEnum) {
    if (picks.contains(heroEnum)) {
      picks.remove(heroEnum);
    }
  }

  void removeBan(HeroEnum heroEnum) {
    if (bans.contains(heroEnum)) {
      bans.remove(heroEnum);
    }
  }

  ArrayList<Couplet> getAggregatedMatchups() {
    ArrayList<Couplet> aggregatedMatchups = new ArrayList<>();
    // Initializes couplets to 0, in alphabetical order
    for (int i = 0; i < HeroEnum.values().length; i++) {
      aggregatedMatchups.add(new Couplet(HeroEnum.values()[i], 0.0));
    }
    for (HeroEnum heroEnum : picks) {
      Hero hero = new Hero(heroEnum);
      ArrayList<Couplet> matchups = hero.matchups;
      //Sorts matchups alphabetically
      Collections.sort(matchups, new Comparator<Couplet>() {
        @Override
        public int compare(Couplet o1, Couplet o2) {
          return String.valueOf(o1.hero).compareTo(String.valueOf(o2.hero));
        }
      });

      for (Couplet c : matchups) {
        for (Couplet ca : aggregatedMatchups) {
          if (c.hero == ca.hero) {
            ca.setWinrate(ca.getWinrate() + c.getWinrate());
            break;
          }
        }
      }
    }
    return aggregatedMatchups;
  }


}
