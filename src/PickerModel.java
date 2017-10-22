import java.util.ArrayList;

public class PickerModel implements PickerOperations {

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

  @Override
  public void addPick(HeroEnum heroEnum, TeamEnum team) {
    if (team.equals(TeamEnum.DIRE)){
      dire.addPick(heroEnum);
    }
    else {
      radiant.addPick(heroEnum);
    }
  }

  @Override
  public void removePick(HeroEnum heroEnum, TeamEnum team) {
    if (team.equals(TeamEnum.DIRE)) {
      dire.removePick(heroEnum);
    }
    else {
      radiant.removePick(heroEnum);
    }
  }

  @Override
  public void addBan(HeroEnum heroEnum, TeamEnum team) {
    if (team.equals(TeamEnum.DIRE)) {
      dire.addBan(heroEnum);
    }
    else {
      radiant.addBan(heroEnum);
    }
  }

  @Override
  public void removeBan(HeroEnum heroEnum, TeamEnum team) {
    if (team.equals(TeamEnum.DIRE)) {
      dire.removeBan(heroEnum);
    }
    else {
      radiant.removeBan(heroEnum);
    }
  }

  @Override
  public int heroCount(TeamEnum team) {
    if (team.equals(TeamEnum.DIRE)) {
      return dire.picks.size();
    }
    else {
      return radiant.picks.size();
    }
  }

  @Override
  public void updateAggregatedMatchups(TeamEnum team) {
    if (team.equals(TeamEnum.DIRE)) {
      this.direAggregatedMatchups = dire.getAggregatedMatchups();
    }
    else {
      this.radiantAggregatedMatchups = radiant.getAggregatedMatchups();
    }
  }

  @Override
  public ArrayList<Couplet> getAggregatedMatchups(TeamEnum team) {
    if (team.equals(TeamEnum.DIRE)) {
      return direAggregatedMatchups;
    }
    else {
      return radiantAggregatedMatchups;
    }
  }
}
