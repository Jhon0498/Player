  public class Frango extends Item implements Consumable {
      private int forcaAtribuida;
        // Passar argumento do new frango para a força atribuida
     public Frango (int bonusForca, int bonusInteligencia, int bonusDefesaMagica, int bonusDefesaFisica, int forcaAtribuida) {
       super(bonusForca, bonusInteligencia, bonusDefesaMagica, bonusDefesaFisica);
       this.forcaAtribuida = forcaAtribuida;
      }

      public void consume(Player player) {
          player.aplicarItem(this);
      }

      public int getForca() {
          return forcaAtribuida;
      }
  }