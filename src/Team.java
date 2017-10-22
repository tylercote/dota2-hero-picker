import java.util.ArrayList;
import java.util.List;

class Team {

  TeamEnum side;
  List<Hero> picks;
  List<Hero> bans;

  Team(TeamEnum side) {
    this.side = side;
    this.picks = new ArrayList<>();
    this.bans = new ArrayList<>();
  }

  public List<Hero> getPicks() {
    return picks;
  }

  public List<Hero> getBans() {
    return bans;
  }

  int numPicks() {
    return picks.size();
  }

  int numBans() {
    return bans.size();
  }

  void addPick(Hero hero) {
    if (picks.size() < 5 && !picks.contains(hero)) {
      picks.add(hero);
    }
  }

  void addBan(Hero hero) {
    if (!bans.contains(hero)) {
      bans.add(hero);
    }
  }

  void removePick(Hero hero) {
    if (picks.contains(hero)) {
      picks.remove(hero);
    }
  }

  void removeBan(Hero hero) {
    if (bans.contains(hero)) {
      bans.remove(hero);
    }
  }


}
