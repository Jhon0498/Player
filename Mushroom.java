abstract class Mushroom extends Item implements Consumable {
  public Mushroom(int bonusInteligencia) {


super(0, bonusInteligencia, 0, 0);
  }

  @Override
  public void consume(Player player) {
      applyBonus(player);
  }



protected abstract void applyBonus(Player player);
}