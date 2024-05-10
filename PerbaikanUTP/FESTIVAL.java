package PerbaikanUTP;

//kelas FESTIVAL merupakan turunan dari kelas TiketKonser
class FESTIVAL extends TiketKonser {

    // konstructor dari kelas FESTIVAL
    public FESTIVAL() {
        super(1500000);
    }

    // method yang mengembalikkan harga tiket
    public double HargaTiket() {
        return getHarga();
    }

    // method toString() dioverride dalam kelas FESTIVAL
    @Override
    public String toString() {
        return "FESTIVAL";
    }
}