public class Lingkaran extends bidangDuaDimensi {
    //atribut
    private double radius;

    //constructor
    public Lingkaran(String nama, double radius){
        super(nama);
        this.radius = radius;
    }

    //method untuk luas overriding
    @Override
    public void luas(){
        System.out.println("Luas Lingkaran = " + (3.14 * radius * radius));
    }
}