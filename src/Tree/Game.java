package Tree;

public class Game {
    
    /*
     * Fungsi utama dari program, menciptakan tree untuk permainan
     */
    public static void treeGame() {

        //CONTOH 
        Node pertanyaan1 = new Node("Apakah bahasa ini Sering digunakan untuk front-end");

        // asumsinya kalau kanan, artinya pengguna memberi jawaban "yes"
        pertanyaan1.right = new Node("Javascript");

        // kalau kiri pengguna memberi jawaban "No"
        // Kalau ga berakhir di programming language, lanjutkan pertanyaan
        pertanyaan1.left = new Node("Apakah bahasa digunakan untuk pengembangan");


        // TO-DO Lanjutin tree sampai heightnya 4-5, jumlah jawaban terserah
    }
}