public class Segitiga extends  BangunDatar{
    private double tinggi;
    private double alas;

    public Segitiga(double tinggi, double alas) {
        this.tinggi = tinggi;
        this.alas = alas;
        hitungLuas();
        hitungKeliling();
    }

    public void hitungLuas(){
        double luas = (this.alas*this.tinggi)/2;
        setLuas(luas);
    }

    public void hitungKeliling(){
        double keliling = this.alas + this.tinggi + 1;
        setKeliling(keliling);

    }
}
