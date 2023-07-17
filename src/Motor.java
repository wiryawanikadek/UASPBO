// Class Motor yang merupakan subclass dari Kendaraan
class Motor extends Kendaraan { // Variabel instans untuk menyimpan harga sewa per hari motor

    private double hargaSewaPerHari;

    public Motor(String merk, String tipe, double hargaSewaPerHari) {
        super(merk, tipe); // Memanggil constructor dari class induk (Kendaraan) dengan parameter merk dan tipe
        this.hargaSewaPerHari = hargaSewaPerHari; // Menginisialisasi nilai variabel hargaSewaPerHari dengan parameter hargaSewaPerHari
    }

    public double getHargaSewaPerHari() { // Metode getter untuk mengembalikan nilai variabel hargaSewaPerHari
        return hargaSewaPerHari;
    }

    @Override
    public double hitungBiayaSewa(int lamaSewa) { // Metode override untuk mengimplementasikan metode abstract dari class induk (Kendaraan)
        return hargaSewaPerHari * lamaSewa; // Mengembalikan hasil perkalian antara harga sewa per hari dan lama sewa

    }
}
