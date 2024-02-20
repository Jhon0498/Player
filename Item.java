public class Item {
    private int bonusForca;
    private int bonusInteligencia;
    private int bonusDefesaMagica;
    private int bonusDefesaFisica;

    public Item(int bonusForca, int bonusInteligencia, int bonusDefesaMagica, int bonusDefesaFisica) {
        this.bonusForca = bonusForca;
        this.bonusInteligencia = bonusInteligencia;
        this.bonusDefesaMagica = bonusDefesaMagica;
        this.bonusDefesaFisica = bonusDefesaFisica;
    }

    // Getters

    public int getBonusForca() {
        return bonusForca;
    }

    public int getBonusInteligencia() {
        return bonusInteligencia;
    }

    public int getBonusDefesaMagica() {
        return bonusDefesaMagica;
    }

    public int getBonusDefesaFisica() {
        return bonusDefesaFisica;
    }
}
