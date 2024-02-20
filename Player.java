public class Player {
    private int forca;
    private int inteligencia;
    private int defesaMagica;
    private int defesaFisica;

    public Player(int forca, int inteligencia, int defesaMagica, int defesaFisica) {
        this.forca = forca;
        this.inteligencia = inteligencia;
        this.defesaMagica = defesaMagica;
        this.defesaFisica = defesaFisica;
    }

    // Getters e Setters


      public int getForca() {
          return forca;
      }

      public void setForca(int forca) {
          this.forca = forca;
      }

      public int getInteligencia() {
          return inteligencia;
      }

      public void setInteligencia(int inteligencia) {
          this.inteligencia = inteligencia;
      }

      public int getDefesaMagica() {
          return defesaMagica;
      }

      public void setDefesaMagica(int defesaMagica) {
          this.defesaMagica = defesaMagica;
      }

      public int getDefesaFisica() {
          return defesaFisica;
      }

      public void setDefesaFisica(int defesaFisica) {
          this.defesaFisica = defesaFisica;
      }
  // Aplicar o item ao player que irá modificá-lo e irá modificar um atributo ao ingerir frango lhe dará força
  
      public void aplicarItem(Frango Frango) {
         this.forca += Frango.getForca();
        
          
  }
}