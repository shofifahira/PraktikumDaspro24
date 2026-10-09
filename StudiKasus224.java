import java.util.Scanner;

public class StudiKasus224 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama mahasiswa: ");
        String nama = input.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        String jenisKegiatan = input.nextLine();

        System.out.print("Jumlah dokumen: ");
        int jumlahDokumen = input.nextInt();

        boolean dokumenLengkap = (jumlahDokumen == 4);
        boolean dapatPenghargaan = false;
        String alasan = "";
        String jenisLower = jenisKegiatan.toLowerCase();

        if (jenisLower.equals("belmawa") || jenisLower.equals("bakorma") || jenisLower.equals("mandiri") || jenisLower.equals("pkm")) {
            System.out.print("Peringkat juara: ");
            int peringkatJuara = input.nextInt();

            if (dokumenLengkap) {
                if (peringkatJuara >= 1 && peringkatJuara <3) {
                    dapatPenghargaan = true;
                    alasan = "Selamat! Anda berhak mendapatkan dana penghargaan.";
                } else {
                    alasan = "Dana penghargaan hanya diberikan kepada peraih Juara 1, 2, atau 3.";
                }
            } else {
                int kurang = 4 - jumlahDokumen;
                alasan = "Dokumen tidak lengkap (kurang " + kurang + "dokumen). Dana penghargaan tidak diberikan.";
            }
            } else if (jenisLower.equals("pkm")) {
                System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
                int statusPKM = input.nextInt();
                boolean isLolosPKM = (statusPKM == 1);

                if (dokumenLengkap) {
                    if (isLolosPKM) {
                        dapatPenghargaan = true;
                        alasan = "Selamat! Tim PKM Anda lolos pendanaan dan berhak mendapatkan dana penghargaan.";
                    } else {
                        alasan = "PKM tidak lolos pendanaan.";
                    }
                } else {
                    int kurang = 4 - jumlahDokumen;
                    alasan = "Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.";    
                }
            } else {
                alasan = "Kegiatan diluar ketentuan (Lainnya) tidak memperoleh dana penghargaan.";
            }
            System.out.println("Status: " + alasan);
        
        }
}

