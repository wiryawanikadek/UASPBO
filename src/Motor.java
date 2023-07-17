// Class Motor yang merupakan subclass dari Kendaraan
class Motor extends Kendaraan {
    private double hargaSewaPerHari;

    public Motor(String merk, String tipe, double hargaSewaPerHari) {
        super(merk, tipe);
        this.hargaSewaPerHari = hargaSewaPerHari;
    }

    public double getHargaSewaPerHari() {
        return hargaSewaPerHari;
    }

    @Override
    public double hitungBiayaSewa(int lamaSewa) {
        return hargaSewaPerHari * lamaSewa;
    }
}
