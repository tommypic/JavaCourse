public class Main {
    public static void main(String args[]) {
        System.out.println("cioa");
        PuntoND[] puntiquadrato = { new PuntoND(1.0, 1.0), new PuntoND(2.0, 1.0), new PuntoND(2.0, 2.0),
                new PuntoND(1.0, 2.0) };
        Poligono quadrato = new Poligono(puntiquadrato);
        System.out.println("il perimetro e' " + quadrato.getperimetro());
        System.out.println("il perimetro e' " + quadrato.getperimetro()); // i valori del poligono non sono salvati
                                                                          // nella classe Poligono, devo rendere privato
                                                                          // non solo il riferimento.
    }
}
