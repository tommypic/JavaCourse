public class Poligono {
  private PuntoND vertici[];

  public Poligono(PuntoND vertici[]) {
    this.vertici = new PuntoND[vertici.length]; // creo un array di puntatori e allego spazio per le righe
    for (int j = 0; j < vertici.length; j++) {
      this.vertici[j] = vertici[j];
    }
  }

  public double getperimetro() {
    double perimetro = 0.0;
    for (int i = 0; i < this.vertici.length; i++) {
      PuntoND a = this.vertici[i];
      PuntoND b = this.vertici[(i + 1) % vertici.length]; // facendo il resto quando arrivo all'ultimo vertice m
      perimetro += b.DistanzaDa(a);

    }
    return perimetro;
  }

}
