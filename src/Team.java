import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Team {

  TeamEnum side;
  HeroEnum[] picks;
  HeroEnum[] bans;


  Team(TeamEnum side) {
    this.side = side;
    this.picks = new HeroEnum[5];
    this.bans = new HeroEnum[5];
  }

  public HeroEnum[] getPicks() {
    return picks;
  }

  public HeroEnum[] getBans() {
    return bans;
  }

  int numPicks() {
    int sum = 0;
    for (int i = 0; i < picks.length; i++) {
      if (picks[i] != null) {
        sum++;
      }
    }
    return sum;
  }

  int numBans() {
    int sum = 0;
    for (int i = 0; i < bans.length; i++) {
      if (bans[i] != null) {
        sum++;
      }
    }
    return sum;
  }

  boolean picksContains(HeroEnum heroEnum) {
    for (int i = 0; i < 5; i++) {
      if (picks[i] != null) {
        if (heroEnum.equals(picks[i])) {
          return true;
        }
      }
    }
    return false;
  }

  boolean bansContains(HeroEnum heroEnum) {
    for (int i = 0; i < 5; i++) {
      if (bans[i] != null) {
        if (heroEnum.equals(bans[i])) {
          return true;
        }
      }
    }
    return false;
  }

  void addPick(HeroEnum heroEnum, int place) {
    /**
    if (picksContains(heroEnum)) {
      throw new IllegalArgumentException("Hero already picked.");
    }
     */
    picks[place] = heroEnum;
  }

  void addBan(HeroEnum heroEnum, int place) {
    /**
    if (bansContains(heroEnum)) {
      throw new IllegalArgumentException("Hero already banned.");
    }
     */
    bans[place] = heroEnum;
  }

  ArrayList<Couplet> getAggregatedMatchups() {
    ArrayList<Couplet> aggregatedMatchups = new ArrayList<>();
    // Initializes couplets to 0, in alphabetical order
    for (int i = 0; i < HeroEnum.values().length; i++) {
      aggregatedMatchups.add(new Couplet(HeroEnum.values()[i], 0.0));
    }
    for (int i = 0; i < 5; i++) {
      if (picks[i] != null) {
        Hero hero = new Hero(picks[i]);
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
    }
    return aggregatedMatchups;
  }

}
