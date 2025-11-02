import java.util.*;
import Tree.Game;
import Tree.Node;

public class Main {
    public static void main(String[] args) {
        Scanner asd = new Scanner(System.in);

        boolean mainLagi = true;

        System.out.println("=== SELAMAT DATANG DI PERMAINAN TEBAK-TEBAK PIKIRAN ===");

        while (mainLagi) {
            System.out.println("\nPilih kategori tebakan yang ingin kamu mainkan:");
            System.out.println("1. Hewan");
            System.out.println("2. Sayuran");
            System.out.println("3. Bahasa Pemrograman");
            System.out.println("4. Universitas");
            System.out.println("5. Mobil");
            System.out.println("6. Campuran (acak dari semua)");
            System.out.print("Pilihanmu nomor berapa? (1-6): ");

            int pilihan = Integer.parseInt(asd.nextLine().trim());
            

            // Buat pohon sesuai kategori yang dipilih
            switch (pilihan) {
                case 1 -> {
                    System.out.println("\n[Kategori: Hewan]");
                    Game.root = Game.buatHewan();
                }
                case 2 -> {
                    System.out.println("\n[Kategori: Sayuran]");
                    Game.root = Game.buatSayuran();
                }
                case 3 -> {
                    System.out.println("\n[Kategori: Bahasa Pemrograman]");
                    Game.root = Game.buatBahasa();
                }
                case 4 -> {
                    System.out.println("\n[Kategori: Universitas]");
                    Game.root = Game.buatUniversitas();
                }
                case 5 -> {
                    System.out.println("\n[Kategori: Mobil]");
                    Game.root = Game.buatMobil();
                }
                default -> {
                    System.out.println("\nJawabanmu tidak ada di pilihan --> DEFAULT: Pilihan 6");
                    System.out.println("\n[Kategori: Campuran]");
                    Game.treeGame(); // gabungan semua kategori
                }
            }

            System.out.println("Jawab setiap pertanyaan dengan 'ya' atau 'no'.");
            System.out.println("-----------------------------------------------------------");

            Node current = Game.root;

            // Gameplay tebak-tebakan
            while (true) {
                while (!current.checkLeaf()) {
                    System.out.println(current.answer);
                    System.out.print("Jawaban (ya/no): ");
                    String jawab = asd.nextLine().trim().toLowerCase();

                    if (jawab.equals("ya") || jawab.equals("y") || jawab.equals("yes")) {
                        current = current.right;
                    } else if (jawab.equals("tidak") || jawab.equals("no") || jawab.equals("n")) {
                        current = current.left;
                    } else {
                        System.out.println("Maaf saya tidak mengerti, jawab hanya 'ya' atau 'no'!");
                    }
                }

                // Sudah di leaf → tampilkan hasil tebakan
                System.out.println("\n>> Tebakan saya: " + current.answer + " <<");
                System.out.println("-----------------------------------------------------------");
                System.out.print("Apakah kamu ingin bermain lagi dalam kategori yang sama? (ya/no): ");
                String ulang = asd.nextLine().trim().toLowerCase();

                if (ulang.equals("ya") || ulang.equals("y") || ulang.equals("yes")) {
                    current = Game.root; // reset ulang tree
                } else {
                    break;
                }
            }

            System.out.print("\nApakah kamu ingin kembali ke menu utama? (ya/no): ");
            String menu = asd.nextLine().trim().toLowerCase();
            if (!(menu.equals("ya") || menu.equals("y") || menu.equals("yes"))) {
                mainLagi = false;
            }
        }

        System.out.println("\nTerima kasih sudah bermain dengan saya! Sampai jumpa lagi di permainan selanjutnya..");
        asd.close();
    }
}
