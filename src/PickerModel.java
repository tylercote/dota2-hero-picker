public class PickerModel implements PickerOperations {

  Team dire;
  Team radiant;

  PickerModel() {
    this.dire = new Team(TeamEnum.DIRE);
    this.radiant = new Team(TeamEnum.RADIANT);
  }

  @Override
  public void addPick(Hero hero, TeamEnum team) {
    if (team.equals(TeamEnum.DIRE)){
      dire.addPick(hero);
    }
    else {
      radiant.addPick(hero);
    }
  }

  @Override
  public void removePick(Hero hero, TeamEnum team) {
    if (team.equals(TeamEnum.DIRE)) {
      dire.removePick(hero);
    }
    else {
      radiant.removePick(hero);
    }
  }

  @Override
  public void addBan(Hero hero, TeamEnum team) {
    if (team.equals(TeamEnum.DIRE)) {
      dire.addBan(hero);
    }
    else {
      radiant.addBan(hero);
    }
  }

  @Override
  public void removeBan(Hero hero, TeamEnum team) {
    if (team.equals(TeamEnum.DIRE)) {
      dire.removeBan(hero);
    }
    else {
      radiant.removeBan(hero);
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
}
