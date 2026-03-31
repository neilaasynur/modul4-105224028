import java.util.Scanner;
public class DuitKu {
    public static void main(String[] args) throws Exception {
        Scanner input =  new Scanner (System.in);
        
        User user1 = new User();
        System.out.print("Masukkan Nama: ");
        user1.nama = input.nextLine();  
        System.out.print("Nomor HP: ");
        user1.noHP = input.nextLine();

        System.out.println("===== Pelanggan Baru Terdaftar =====");
        System.out.println("Nama: " + user1.nama);
        System.out.println("Nomor HP: " + user1.noHP);
        System.out.println("Saldo: Rp" + user1.saldo);

        while (true) {
            System.out.print("\n===== MENU DuitKu =====\n1. Pengisian Dana\n2. Pelunasan Tagihan\n3. Keluar\nPilih menu: ");
            int pilihan = input.nextInt();
            int saldo;
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jumlah pengisian dana: ");
                    int jumlah = input.nextInt();
                    saldo = user1.pengisianDana(jumlah);
                    System.out.println("Saldo Anda saat ini: Rp" + saldo);
                    break;
                case 2:
                    System.out.print("Masukkan jumlah pelunasan tagihan: ");
                    int jumlahTagihan = input.nextInt();
                    saldo = user1.pelunasanTagihan(jumlahTagihan);
                    System.out.println("Saldo Anda saat ini: Rp" + saldo);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
