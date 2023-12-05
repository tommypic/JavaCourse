package src;

public class Main {
  public static void main(String[] args) {
    Pokemon pica = new Pokemon("pica", PokemonType.ERBA, 2, 30.0);
    pica.print();
    Pokemon bulba = new Pokemon("bulba", PokemonType.FUOCO, 3, 40.0);
    bulba.print();
    Pokemon pianta = new Pokemon("pianta", PokemonType.ACQUA, 3, 40.0);
    pianta.print();
    bulba.attacco(pica);
    bulba.print();
    pica.print();
    bulba.attacco(pianta);
    pianta.print();
  }
}
