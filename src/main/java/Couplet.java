public class Couplet {

  HeroEnum hero;
  Double disadvantage;

  public Couplet(HeroEnum hero, Double disadvantage) {
    this.hero = hero;
    this.disadvantage = disadvantage;
  }

  public void setDisadvantage(Double d) {
    this.disadvantage = d;
  }

  public Double getDisadvantage() {
    return this.disadvantage;
  }
}
