import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;

public class PickerModel {

  Team dire;
  Team radiant;
  ArrayList<Couplet> direAggregatedMatchups;
  ArrayList<Couplet> radiantAggregatedMatchups;

  public PickerModel() {
    this.dire = new Team(TeamEnum.DIRE);
    this.radiant = new Team(TeamEnum.RADIANT);
    this.direAggregatedMatchups = new ArrayList<>();
    this.radiantAggregatedMatchups = new ArrayList<>();
  }

  public void addPick(HeroEnum heroEnum, TeamEnum team, int place) {
    if (team.equals(TeamEnum.DIRE)){
      dire.addPick(heroEnum, place);
    }
    else {
      radiant.addPick(heroEnum, place);
    }
  }

  public void addBan(HeroEnum heroEnum, TeamEnum team, int place) {
    if (team.equals(TeamEnum.DIRE)){
      dire.addBan(heroEnum, place);
    }
    else {
      radiant.addBan(heroEnum, place);
    }
  }

  public int heroCount(TeamEnum team) {
    if (team.equals(TeamEnum.DIRE)) {
      return dire.numPicks();
    }
    else {
      return radiant.numPicks();
    }
  }

  public void updateAggregatedMatchups(TeamEnum team) {
    if (team.equals(TeamEnum.DIRE)) {
      this.direAggregatedMatchups = dire.getAggregatedMatchups();
    }
    else {
      this.radiantAggregatedMatchups = radiant.getAggregatedMatchups();
    }
  }

  public ArrayList<String> getSuggestions(TeamEnum team) {
    ArrayList<String> suggestions = new ArrayList<>();
    if (team.equals(TeamEnum.DIRE)) {
        radiantAggregatedMatchups.sort(new Comparator<Couplet>() {
        @Override
        public int compare(Couplet o1, Couplet o2) {
          return o1.getDisadvantage().compareTo(o2.getDisadvantage());
        }
      });
      for (Couplet c : radiantAggregatedMatchups) {
        double win = c.getDisadvantage() * -1;
        String matchupString;
        if (dire.bansContains(c.hero) || radiant.bansContains(c.hero)) {
          matchupString = "<html><strike><font color=\"red\"> " + new DecimalFormat("#.##").format(win) + "%, " + String.valueOf(c.hero) + "</font></strike></html>";
        }
        else if (win > 0) {
          matchupString = "<html><font color=\"green\">+" + new DecimalFormat("#.##").format(win) + "%,</font> " + String.valueOf(c.hero) + "</html>";
        }
        else if (win < 0) {
          matchupString = "<html><font color=\"red\">" + new DecimalFormat("#.##").format(win) + "%,</font> " + String.valueOf(c.hero) + "</html>";
        }
        else {
          matchupString = "<html><font color=\"black\"> " + new DecimalFormat("#.##").format(win) + "%,</font> " + String.valueOf(c.hero) + "</html>";
        }
        suggestions.add(matchupString);
      }
    }
    else {
      direAggregatedMatchups.sort(new Comparator<Couplet>() {
        @Override
        public int compare(Couplet o1, Couplet o2) {
          return o1.getDisadvantage().compareTo(o2.getDisadvantage());
        }
      });
      for (Couplet c : direAggregatedMatchups) {
        double win = c.getDisadvantage() * -1;
        String matchupString;
        if (dire.bansContains(c.hero) || radiant.bansContains(c.hero)) {
          matchupString = "<html><strike><font color=\"red\"> " + new DecimalFormat("#.##").format(win) + "%, " + String.valueOf(c.hero) + "</font></strike></html>";
        }
        else if (win > 0) {
          matchupString = "<html><font color=\"green\">+" + new DecimalFormat("#.##").format(win) + "%,</font> " + String.valueOf(c.hero) + "</html>";
        }
        else if (win < 0) {
          matchupString = "<html><font color=\"red\">" + new DecimalFormat("#.##").format(win) + "%,</font> " + String.valueOf(c.hero) + "</html>";
        }
        else {
          matchupString = "<html><font color=\"black\"> " + new DecimalFormat("#.##").format(win) + "%,</font> " + String.valueOf(c.hero) + "</html>";
        }
        suggestions.add(matchupString);
      }
    }
    return suggestions;
  }
}
