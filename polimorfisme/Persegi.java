package polimorfisme;

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }
    @Override
    public  double keliling() {
        return this.sisi * this.sisi;
    }

    @Override
    public double luas() {
        return 4 * this.sisi;
    }
}
