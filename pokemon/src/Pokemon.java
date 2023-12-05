package src;

/**
 * Pokemon
 */

public class Pokemon {

  protected String name;
  protected PokemonType seme;
  protected int forza;
  protected double vita;

  public Pokemon(String name, PokemonType seme, int forza, Double vita) {
    this.name = name;
    this.seme = seme;
    this.forza = forza;
    this.vita = vita;
  };

  public void print() {
    System.out.println(name + " " + seme + " " + forza + " " + vita);
  }

  public void attacco(Pokemon attaccato) {
    double effectiveness = 1.0;
    if (this.seme == PokemonType.ERBA && attaccato.seme == PokemonType.ACQUA) {
      effectiveness = 1.2;
    }

    if (this.seme == PokemonType.ACQUA && attaccato.seme == PokemonType.FUOCO) {
      effectiveness = 1.2;
    }

    if (this.seme == PokemonType.FUOCO && attaccato.seme == PokemonType.ACQUA) {
      effectiveness = 1.2;
    }
    attaccato.infliggidanno(effectiveness * this.forza);
  }

  public void infliggidanno(double danno) {
    this.vita -= danno;
  }

}
