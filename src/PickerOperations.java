public interface PickerOperations {

  void addPick(Hero hero, TeamEnum team);

  void removePick(Hero hero, TeamEnum team);

  void addBan(Hero hero, TeamEnum team);

  void removeBan(Hero hero, TeamEnum team);

  int heroCount(TeamEnum team);

}
