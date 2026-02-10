public class bujurSangkar extends bidangDuaDimensi{
    //atribut
    private double sisi;

    //constructor
    public bujurSangkar(String nama, double sisi){
        super(nama);
        this.sisi = sisi;
    }

    //method untuk luas overriding
    @Override
    public void luas(){
        System.out.println("Luas Bujur Sangkar = " + (sisi * sisi));
    }
}
