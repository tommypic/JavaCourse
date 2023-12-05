public class PuntoND {
    private double[] cooridinate;

    public PuntoND(double... cooridinate) {
        this.cooridinate = new double[cooridinate.length];
        for (int i = 0; i < cooridinate.length; i++) {
            this.cooridinate[i] = cooridinate[i];
        }
    }

    public double getaxis(int dim) {
        return this.cooridinate[dim - 1];
    }

    public int getdim() {
        return this.cooridinate.length;
    }

    public double DistanzaDa(PuntoND a) {
        double acc = 0.0;
        for (int i = 1; i <= this.getdim(); i++) {
            acc += Math.pow(this.getaxis(i) - a.getaxis(i), 2);
        }
        return Math.sqrt(acc);
    }

}
