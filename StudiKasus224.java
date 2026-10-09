import java.util.Scanner;

public class StudiKasus224 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nama mahasiswa: ");
        String nama = input.nextLine();

        System.out.println("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        String jenisKegiatan = input.nextLine();

        System.out.print("Jumlah dokumen: ");
        int jumlahDokumen = input.nextInt();

        boolean dokumenLengkap = (jumlahDokumen == 4);
        boolean dapatPenghargaan = false;
        String alasan = "";
        String jenisLower = jenisKegiatan.toLowerCase();
        
    }
}
