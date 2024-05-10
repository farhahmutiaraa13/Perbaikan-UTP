package PerbaikanUTP;

//kelas VVIP yang merupakan turunan dari kelas TiketKonser
class VVIP extends TiketKonser {

    // konstructor dari kelas VVIP
    public VVIP() {
        super(11000000);
    }

    public double HargaTiket() {
        return getHarga();
    }

    public String toString() {
        return "UNLIMITED EXPERIENCE";
    }
}
