import java.util.ArrayList;

public interface PickerOperations {

  void addPick(HeroEnum heroEnum, TeamEnum team);

  void removePick(HeroEnum heroEnum, TeamEnum team);

  void addBan(HeroEnum heroEnum, TeamEnum team);

  void removeBan(HeroEnum heroEnum, TeamEnum team);

  int heroCount(TeamEnum team);

  void updateAggregatedMatchups(TeamEnum team);

  ArrayList<Couplet> getAggregatedMatchups(TeamEnum team);

}
