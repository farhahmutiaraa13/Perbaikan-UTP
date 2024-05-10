package PerbaikanUTP;

abstract class TiketKonser implements HargaTiket {
    private double harga;

    // Constructor
    public TiketKonser(double harga) {
        this.harga = harga;
    }

    @Override
    public double getHarga() {
        return harga;
    }
}