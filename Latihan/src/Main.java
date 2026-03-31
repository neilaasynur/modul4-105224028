public class Main {
    public static void main(String[] args) throws Exception {
        MesinKopi mesinLobby = new MesinKopi(); //soal 1

        //soal 5 (testing)
        mesinLobby.isiUlangBahan (15, 100, 100);
        System.out.println("Ketersediaan Cappucciono: " + mesinLobby.cekKetersediaanCappuccino());
        
        MesinKopi mesinPabrik = new MesinKopi();
        System.out.println("Ketersediaan Cappucciono: " + mesinPabrik.cekKetersediaanCappuccino());
    }
}
