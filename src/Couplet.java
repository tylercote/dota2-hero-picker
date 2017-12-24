public class Couplet {

  HeroEnum hero;
  Double winrate;

  public Couplet(HeroEnum hero, Double winrate) {
    this.hero = hero;
    this.winrate = winrate;
  }

  public void setWinrate(Double d) {
    this.winrate = d;
  }

  public Double getWinrate() {
    return this.winrate;
  }
}
