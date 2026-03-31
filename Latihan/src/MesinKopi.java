public class MesinKopi {
    double bijiKopi;
    double air;
    double susu;

    //soal 2
    public void isiUlangBahan(double bijiKopi, double air, double susu) {
        this.bijiKopi += bijiKopi;
        this.air += air;
        this.susu += susu;
    }

    //soal 3
    public boolean cekKetersediaanCappuccino() {
        return bijiKopi >= 15 && air >= 50 && susu >= 100;
    }

    //soal 4
    public MesinKopi() {
        this.bijiKopi = 0;
        this.air = 0;
        this.susu = 0;
    }
}