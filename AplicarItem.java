public class AplicarItem {
  private int forca;
  private int inteligencia;
  private int defesaMagica;
  private int defesaFisica;
    public void aplicarItem(Item item, Player player) {
        // Implemente como os atributos do jogador mudam ao consumir um item
        this.forca += item.getBonusForca();
        this.inteligencia += item.getBonusInteligencia();
        this.defesaMagica += item.getBonusDefesaMagica();
        this.defesaFisica += item.getBonusDefesaFisica();
    }
}

