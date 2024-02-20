public class Main {
    public static void main(String[] args) {
        Player jogador = new Player(10, 20, 30, 40);

        Consumable item1 = new CogumeloAzul();
        item1.consume(jogador);

        Consumable item2 = new Frango(1, 2 , 3 , 4, 5);
        item2.consume(jogador);

        System.out.println("Força : " + jogador.getForca());
        System.out.println("Inteligência: " + jogador.getInteligencia());
        System.out.println("Defesa Mágica: " + jogador.getDefesaMagica());
        System.out.println("Defesa Física: " + jogador.getDefesaFisica());
    }
}