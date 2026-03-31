public class User {
    String nama;
    String noHP;
    int saldo;

    public User(){
        saldo = 0;
    }

    public int pengisianDana (int jumlah){
        if (jumlah <= 10000) {
            System.out.println(">> Minimum transaksi adalah Rp10.000! Lakukan pengisian ulang");
            return saldo;
        }
        saldo += jumlah;
        System.out.println(">> Pengisian Dana Berhasil!");
        return saldo;
    }

    public int pelunasanTagihan (int jumlah){
        if (jumlah >= saldo) {
            System.out.println(">> Saldo tidak mencukupi untuk pelunasan tagihan!");
            return saldo;
        } else {
            System.out.println(">> Pelunasan tagihan berhasil!");
            saldo -= jumlah;
            return saldo;
        }
    }
}
