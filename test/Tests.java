import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {


  @Test
  public void checkPage() {
    PickerOperations pm = new PickerModel();
    pm.addPick(HeroEnum.DAZZLE, TeamEnum.DIRE);
    pm.addPick(HeroEnum.HUSKAR, TeamEnum.DIRE);
    pm.addPick(HeroEnum.NECROPHOS, TeamEnum.DIRE);
    pm.addPick(HeroEnum.ALCHEMIST, TeamEnum.DIRE);
    pm.addPick(HeroEnum.BRISTLEBACK, TeamEnum.DIRE);

    pm.updateAggregatedMatchups(TeamEnum.DIRE);
    for (Couplet c : pm.getAggregatedMatchups(TeamEnum.DIRE)) {
      System.out.println(String.valueOf(c.hero) + " " + c.winrate + "\n");
    }
  }
}
