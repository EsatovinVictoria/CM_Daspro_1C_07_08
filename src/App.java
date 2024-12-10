import java.util.Scanner;

public class App {

    static void tampilData(String stok[][]) {
        System.out.println("==== DATA INVENTORI BARANG ====");
        System.out.printf("%-14s %-14s %-14s %-15s\n",
                    "No", "Nama item", "Kategori", "Stok");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < stok.length; i++) {
            for (int j = 0; j < stok[i].length; j++) {
                System.out.printf("%-15s", stok[i][j]);
            }
            System.out.println();
        }
        
    }


    static void tambahtStokData(String[][] stok, Scanner sc) {

        System.out.print("Masukkan nomor item : ");
        int nomorItem = sc.nextInt();
        

        if (nomorItem > 0 && nomorItem <= stok.length) {
            System.out.print("Masukkan jumlah stok yang ingin ditambahkan : ");
            int jmlStokTambahan = sc.nextInt();
            if (jmlStokTambahan > 0) {
                int stokTerkini = Integer.valueOf(stok[nomorItem - 1][3]);
                stok[nomorItem - 1][3] = Integer.toString(stokTerkini + jmlStokTambahan);
                System.out.println("Stok " + stok[nomorItem-1][1] + " berhasil ditambahkan. Jumlah stok sekarang : " + stok[nomorItem-1][3]);
            } else {
                System.out.println("Inputan invalid! Jumlah stok harus lebih dari 0.");
            }
        } else {
            System.out.println("Item tidak ditemukan.");
        }
    }



    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
    
        String[][] stok = {
                {"1", "Kopi hitam", "Minuman", "10"},
                {"2", "Cappucino", "Minuman", "5"},
                {"3", "Teh tarik", "Minuman", "8"}};

        while (true) { 
            System.out.println("==== MENU INVENTORI ====");
            System.out.println("1. Tampilkan item yang ada");
            System.out.println("2. Tambah stok untuk item yang ada");
            System.out.println("3. Tambah item baru");
            System.out.println("4. Keluar");
            System.out.print("Masukkan menu : ");
            int menu = sc.nextInt();

            sc.nextLine();

            if (menu == 1) {
                tampilData(stok);
            } else if (menu == 2) {
                tambahtStokData(stok, sc);
            } else if (menu == 3) {

            } else if (menu == 4) {
                System.out.println("Keluar Program Inventori, TERIMKASIH");
                break;
            }
        }
                
    }

}
