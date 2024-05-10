package PerbaikanUTP;

//kelas VIP merupakan turunan dari kelas TiketKonser
class VIP extends TiketKonser {

    // konstructor dari kelas VIP
    public VIP() {
        super(2000000);
    }

    public double HargaTiket() {
        return getHarga();
    }

    public String toString() {
        return "VIP";
    }
}
