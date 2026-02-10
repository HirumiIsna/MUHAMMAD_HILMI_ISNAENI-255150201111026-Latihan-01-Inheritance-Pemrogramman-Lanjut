public class App {
    public static void main(String[] args) {
        bujurSangkar persegi = new bujurSangkar("Persegi", 5.0);
        persegi.info();
        persegi.luas();

        Lingkaran lingkaran = new Lingkaran("Lingkaran", 7.0);
        lingkaran.info();
        lingkaran.luas();
    }
}