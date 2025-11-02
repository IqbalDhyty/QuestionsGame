package Tree;

public class Game {
    
    public static Node root;
    /*
     * Fungsi utama dari program, menciptakan tree untuk permainan
     */
    public static void treeGame() {

        //CONTOH 
        Node pertanyaan1 = new Node("Apakah Yang Dirimu Pikirkan Adalah Hewan?");

        // asumsinya kalau kanan, artinya pengguna memberi jawaban "yes"
        pertanyaan1.right = buatHewan();

        // kalau kiri pengguna memberi jawaban "No" maka membuat pertanyaan lagi
        Node Sayuran = new Node("Apakah Yang Dirimu Pikirkan Adalah Sayuran?");
        pertanyaan1.left = Sayuran;

        Sayuran.right = buatSayuran();
        Node bahasa = new Node("Apakah Yang Dirimu Pikirkan Adalah Bahasa Pemrograman?");
        Sayuran.left = bahasa;

        bahasa.right = buatBahasa();
        Node universitas = new Node("Apakah Yang Dirimu Pikirkan Adalah Universitas?");
        bahasa.left = universitas;

        universitas.right = buatUniversitas();
        Node mobil = new Node("Apakah Yang Dirimu Pikirkan Adalah Mobil?");
        universitas.left = mobil;

        mobil.right = buatMobil();
        mobil.left = new Node("Maaf, saya masih belum bisa menebak apa yang dirimu pikirkan!");

        root = pertanyaan1;
        
    }

    public static Node buatHewan(){
        //0 (root)
        Node p1 = new Node("Apakah hewan ini hidup di darat?");

        //1
        p1.right = new Node("Apakah hewan ini mamalia? ");
        p1.left = new Node("Apakah hewan ini hidup di laut?");

        //2
        p1.right.right= new Node("Apakah hewan ini dikembang biakkan oleh manusia (ternak/peliharaan)?");
        p1.right.left= new Node("Apakah hewan ini reptil?"); // Jika bukan mamalia, apakah reptil?
        p1.left.right = new Node("Ikan"); // Jawaban
        p1.left.left = new Node("Apakah hewan ini bisa Terbang?");

        //3
        p1.right.right.right = new Node("Apakah hewan ini halal dimakan (oleh Muslim)?"); // Darat, Mamalia, Ternak
        p1.right.right.left = new Node("Apakah hewan ini lebih besar daripada kucing?"); // Darat, Mamalia, Bukan Ternak (Liar/Peliharaan Eksotis)
        p1.right.left.right = new Node("Apakah hewan ini berbisa?"); // Darat, Bukan Mamalia, Reptil
        p1.right.left.left = new Node("Apakah hewan ini bertelur?"); // Darat, Bukan Mamalia, Bukan Reptil (Amfibi/Unggas darat)
        p1.left.left.right = new Node("Apakah ini sejenis burung?"); // Tidak Darat, Terbang
        p1.left.left.left = new Node("Apakah ini serangga?"); // Tidak Darat, Tidak Terbang

        //4
        p1.right.right.right.right = new Node("Apakah hewan ini berkaki empat?"); // Darat, Mamalia, Ternak, Halal
        p1.right.right.right.left = new Node("Apakah hewan ini menggonggong?"); // Darat, Mamalia, Ternak, Tidak Halal
        p1.right.right.left.right = new Node("Apakah ini 'raja hutan'?"); // Darat, Mamalia, Liar, > Kucing
        p1.right.right.left.left = new Node("Apakah hewan ini mengeong?"); // Darat, Mamalia, Liar, <= Kucing
        p1.right.left.right.right = new Node("Ular Kobra"); // Jawaban
        p1.right.left.right.left = new Node("Apakah memiliki tempurung?"); // Darat, Bukan Mamalia, Reptil, Tidak Berbisa
        p1.right.left.left.right = new Node("Apakah hewan ini sering dipotong saat lebaran?"); // Darat, Bukan Mamalia, Bukan Reptil, Bertelur
        p1.right.left.left.left = new Node("Katak"); // Jawaban
        p1.left.left.right.right = new Node("Apakah bisa meniru suara manusia?"); // Tidak Darat, Terbang, Burung
        p1.left.left.right.left = new Node("Kelelawar"); // Jawaban
        p1.left.left.left.right = new Node("Apakah memiliki sayap yang indah?"); // Tidak Darat, Tidak Terbang, Serangga
        p1.left.left.left.left = new Node("Semut"); // Jawaban

        //5
        p1.right.right.right.right.right = new Node("Apakah hewan ini mengembik?"); // Darat, Mamalia, Ternak, Halal, Kaki 4
        p1.right.right.right.right.left = new Node("Kelinci"); // Jawaban
        p1.right.right.right.left.right = new Node("Anjing"); // Jawaban
        p1.right.right.right.left.left = new Node("Babi"); // Jawaban
        p1.right.right.left.right.right = new Node("Singa"); // Jawaban
        p1.right.right.left.right.left = new Node("Harimau"); // Jawaban
        p1.right.right.left.left.right = new Node("Kucing"); // Jawaban
        p1.right.right.left.left.left = new Node("Musang"); // Jawaban
        p1.right.left.right.left.right = new Node("Kura-kura"); // Jawaban
        p1.right.left.right.left.left = new Node("Kadal"); // Jawaban
        p1.right.left.left.right.right = new Node("Ayam"); // Jawaban
        p1.right.left.left.right.left = new Node("Bebek"); // Jawaban
        p1.left.left.right.right.right = new Node("Burung Beo"); // Jawaban
        p1.left.left.right.right.left = new Node("Merpati"); // Jawaban
        p1.left.left.left.right.right = new Node("Kupu-kupu"); // Jawaban
        p1.left.left.left.right.left = new Node("Kecoa"); // Jawaban

        //6
        p1.right.right.right.right.right.right = new Node("Kambing"); // Jawaban
        p1.right.right.right.right.right.left = new Node("Sapi"); // Jawaban
        
        return p1;
    }

     public static Node buatSayuran() {
        // H-0
        Node p2 = new Node("Apakah ini sayuran daun?");

        // H-1
        p2.right = new Node("Apakah sering dimakan mentah (lalapan)?");
        p2.left = new Node("Apakah ini sayuran umbi/akar?");

        // H-2
        p2.right.right = new Node("Apakah bentuknya bulat dan padat?"); // Daun, Mentah
        p2.right.left = new Node("Apakah sering dibuat keripik?"); // Daun, Tidak Mentah
        p2.left.right = new Node("Apakah warnanya oranye?"); // Bukan Daun, Umbi
        p2.left.left = new Node("Apakah ini sayuran buah (secara botani)?"); // Bukan Daun, Bukan Umbi

        // H-3
        p2.right.right.right = new Node("Kol"); // Jawaban
        p2.right.right.left = new Node("Selada"); // Jawaban
        p2.right.left.right = new Node("Bayam"); // Jawaban
        p2.right.left.left = new Node("Kangkung"); // Jawaban
        p2.left.right.right = new Node("Apakah rasanya manis jika direbus?"); // Bukan Daun, Umbi, Oranye
        p2.left.right.left = new Node("Apakah warnanya ungu?"); // Bukan Daun, Umbi, Bukan Oranye
        p2.left.left.right = new Node("Apakah warnanya merah dan sering dibuat saus?"); // Sayuran Buah
        p2.left.left.left = new Node("Apakah sering digunakan dalam masakan Padang?"); // Sayuran Buah

        // H-4
        p2.left.right.right.right = new Node("Apakah baik untuk mata?"); // Umbi, Oranye, Manis
        p2.left.right.right.left = new Node("Kentang"); // Jawaban
        p2.left.right.left.right = new Node("Ubi Ungu"); // Jawaban
        p2.left.right.left.left = new Node("Lobak"); // Jawaban
        p2.left.left.right.right = new Node("Tomat"); // Jawaban
        p2.left.left.right.left = new Node("Cabai Merah"); // Jawaban
        p2.left.left.left.right = new Node("Terong"); // Jawaban
        p2.left.left.left.left = new Node("Timun"); // Jawaban

        // H-5 
        p2.left.right.right.right.right = new Node("Apakah sering dibuat jus?"); // Umbi, Oranye, Manis, Baik u/ mata
        p2.left.right.right.right.left = new Node("Apakah sering jadi hiasan Halloween?"); // Umbi, Oranye, Manis, Tidak baik u/ mata

        // H-6 
        p2.left.right.right.right.right.right = new Node("Wortel"); // Jawaban
        p2.left.right.right.right.right.left = new Node("Ubi Jalar Oranye"); // Jawaban
        p2.left.right.right.right.left.right = new Node("Labu Parang (Pumpkin)"); // Jawaban
        p2.left.right.right.right.left.left = new Node("Jagung"); // Jawaban 

        return p2;
    }

    public static Node buatBahasa() {
        // H-0
        Node p3 = new Node("Apakah ini bahasa *statically typed*?");
        
        // H-1
        p3.right = new Node("Apakah dikompilasi ke bytecode (berjalan di VM)?");
        p3.left = new Node("Apakah ini bahasa *dynamically typed*?");

        // H-2
        p3.right.right = new Node("Apakah berjalan di JVM (Java Virtual Machine)?"); // Statically, VM
        p3.right.left = new Node("Apakah populer untuk pengembangan sistem/game?"); // Statically, Not VM (Compiled to native)
        p3.left.right = new Node("Apakah sangat populer untuk Data Science & AI?"); // Dynamically
        p3.left.left = new Node("Apakah ini berjalan utamanya di browser?"); // Dynamically

        // H-3
        p3.right.right.right = new Node("Java"); // Jawaban
        p3.right.right.left = new Node("Apakah ini bahasa dari Microsoft?"); // Statically, VM, Not JVM
        p3.right.left.right = new Node("C++"); // Jawaban
        p3.right.left.left = new Node("Go (Golang)"); // Jawaban
        p3.left.right.right = new Node("Python"); // Jawaban
        p3.left.right.left = new Node("R"); // Jawaban
        p3.left.left.right = new Node("Apakah ini superset dari JavaScript yang menambahkan tipe?"); // Dynamically, Browser
        p3.left.left.left = new Node("Apakah sering digunakan di sisi server (back-end)?"); // Dynamically, Not Browser

        // H-4
        p3.right.right.left.right = new Node("C#"); // Jawaban
        p3.right.right.left.left = new Node("Kotlin"); // Jawaban (Juga bisa JVM, tapi ini untuk membedakan)
        p3.left.left.right.right = new Node("TypeScript"); // Jawaban
        p3.left.left.right.left = new Node("Apakah ini sebuah runtime environment JavaScript?"); // Dynamically, Browser, Bukan Superset
        p3.left.left.left.right = new Node("PHP"); // Jawaban
        p3.left.left.left.left = new Node("Ruby"); // Jawaban
        
        // H-5 
        p3.left.left.right.left.right = new Node("Node.js"); // Jawaban
        p3.left.left.right.left.left = new Node("Apakah ini sebuah framework front-end?"); // Dynamically, Browser, Bukan Superset, Bukan Runtime
        
        // H-6 
        p3.left.left.right.left.left.right = new Node("React.js"); // Jawaban
        p3.left.left.right.left.left.left = new Node("JavaScript (Vanilla)"); // Jawaban

        return p3;
    }

    public static Node buatUniversitas() {
        // H-0
        Node p4 = new Node("Apakah ini Perguruan Tinggi Negeri (PTN)?");

        // H-1
        p4.right = new Node("Apakah berlokasi di Pulau Jawa?");
        p4.left = new Node("Apakah ini Perguruan Tinggi Swasta (PTS)?");

        // H-2
        p4.right.right = new Node("Apakah berlokasi di Jawa Barat?"); // PTN, Jawa
        p4.right.left = new Node("Apakah berlokasi di Sulawesi?"); // PTN, Luar Jawa
        p4.left.right = new Node("Apakah berlokasi di Jakarta?"); // PTS
        p4.left.left = new Node("Apakah berlokasi di Bandung?"); // PTS

        // H-3
        p4.right.right.right = new Node("Apakah berfokus pada teknologi/teknik?"); // PTN, Jabar
        p4.right.right.left = new Node("Apakah berlokasi di Yogyakarta?"); // PTN, Jawa, Bukan Jabar
        p4.right.left.right = new Node("Universitas Hasanuddin (Unhas)"); // Jawaban
        p4.right.left.left = new Node("Universitas Andalas (Unand)"); // Jawaban
        p4.left.right.right = new Node("Apakah terkenal dengan jurusan IT/Komputer?"); // PTS, Jakarta
        p4.left.right.left = new Node("Universitas Trisakti"); // Jawaban
        p4.left.left.right = new Node("Universitas Telkom"); // Jawaban
        p4.left.left.left = new Node("Universitas Parahyangan"); // Jawaban

        // H-4
        p4.right.right.right.right = new Node("Apakah berlokasi di Bandung?"); // PTN, Jabar, Teknik
        p4.right.right.right.left = new Node("Apakah jaket almamaternya kuning?"); // PTN, Jabar, Bukan Teknik
        p4.right.right.left.right = new Node("Universitas Gadjah Mada (UGM)"); // Jawaban
        p4.right.right.left.left = new Node("Universitas Diponegoro (Undip)"); // Jawaban
        p4.left.right.right.right = new Node("Universitas Bina Nusantara (Binus)"); // Jawaban
        p4.left.right.right.left = new Node("Universitas Gunadarma"); // Jawaban
        
        // H-5 
        p4.right.right.right.right.right = new Node("Apakah kampusnya di Ganesha?"); // PTN, Jabar, Teknik, Bandung
        p4.right.right.right.right.left = new Node("Apakah berlokasi di Bogor?"); // PTN, Jabar, Teknik, Bukan Bandung
        p4.right.right.right.left.right = new Node("Universitas Indonesia (UI)"); // Jawaban
        p4.right.right.right.left.left = new Node("Universitas Padjadjaran (Unpad)"); // Jawaban
        
        // H-6 
        p4.right.right.right.right.right.right = new Node("Institut Teknologi Bandung (ITB)"); // Jawaban
        p4.right.right.right.right.right.left = new Node("Universitas Pendidikan Indonesia (UPI)"); // Jawaban
        p4.right.right.right.right.left.right = new Node("Institut Pertanian Bogor (IPB)"); // Jawaban
        p4.right.right.right.right.left.left = new Node("Politeknik Negeri Bandung (Polban)"); // Jawaban

        return p4;
    }

    public static Node buatMobil() {
        // H-0
        Node p5 = new Node("Apakah merek ini berasal dari Asia?");

        // H-1
        p5.right = new Node("Apakah dari Jepang?");
        p5.left = new Node("Apakah merek ini dari Eropa?");
        
        // H-2
        p5.right.right = new Node("Apakah terkenal dengan mobil keluarga (MPV) seperti Avanza/Innova?"); // Asia, Jepang
        p5.right.left = new Node("Apakah dari Korea Selatan?"); // Asia, Bukan Jepang
        p5.left.right = new Node("Apakah dari Jerman?"); // Eropa
        p5.left.left = new Node("Apakah ini mobil listrik murni (EV)?"); // Eropa, Bukan Jerman

        // H-3
        p5.right.right.right = new Node("Toyota"); // Jawaban
        p5.right.right.left = new Node("Apakah terkenal dengan motornya juga?"); // Asia, Jepang, Bukan Toyota
        p5.right.left.right = new Node("Hyundai"); // Jawaban
        p5.right.left.left = new Node("Wuling"); // Jawaban (China)
        p5.left.right.right = new Node("Apakah ini merek mobil mewah/premium?"); // Eropa, Jerman
        p5.left.right.left = new Node("Volkswagen (VW)"); // Jawaban
        p5.left.left.right = new Node("Tesla"); // Jawaban
        p5.left.left.left = new Node("Apakah dari Italia?"); // Eropa, Bukan Jerman, Bukan EV

        // H-4
        p5.right.right.left.right = new Node("Honda"); // Jawaban
        p5.right.right.left.left = new Node("Suzuki"); // Jawaban
        p5.left.right.right.right = new Node("Apakah logonya bintang tiga?"); // Eropa, Jerman, Mewah
        p5.left.right.right.left = new Node("Apakah logonya empat cincin?"); // Eropa, Jerman, Mewah
        p5.left.left.left.right = new Node("Apakah logonya kuda jingkrak?"); // Eropa, Italia
        p5.left.left.left.left = new Node("Apakah dari Inggris?"); // Eropa, Bukan Jerman/Italia/EV

        // H-5 
        p5.left.right.right.right.right = new Node("Mercedes-Benz"); // Jawaban
        p5.left.right.right.right.left = new Node("Apakah terkenal dengan 'kidney grille'?"); // Eropa, Jerman, Mewah, Bukan Bintang
        p5.left.right.right.left.right = new Node("Audi"); // Jawaban
        p5.left.right.right.left.left = new Node("Apakah terkenal dengan model 911?"); // Eropa, Jerman, Mewah, Bukan Cincin
        p5.left.left.left.right.right = new Node("Ferrari"); // Jawaban
        p5.left.left.left.right.left = new Node("Lamborghini"); // Jawaban
        p5.left.left.left.left.right = new Node("Rolls-Royce"); // Jawaban
        p5.left.left.left.left.left = new Node("Jaguar"); // Jawaban

        // H-6 
        p5.left.right.right.right.left.right = new Node("BMW"); // Jawaban
        p5.left.right.right.right.left.left = new Node("Alpina"); // Jawaban (Tuner BMW, tapi bisa dianggap merek)
        p5.left.right.right.left.left.right = new Node("Porsche"); // Jawaban
        p5.left.right.right.left.left.left = new Node("RUF"); // Jawaban (Tuner Porsche)


        return p5;
    }
}   
