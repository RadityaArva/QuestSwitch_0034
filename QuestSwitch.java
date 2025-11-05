import java.util.Scanner;

public class QuestSwitch {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double nilaiSd, nilaiPbo, nilaiBd, nilaiAlgo, nilaiRpl, rataRata, totalNilai;
        String grade, mataKuliah;

        System.out.println("Masukan Nilai Anda");
        System.out.println("==================");
        System.out.println("Masukan Nilai Struktur Data :");
        nilaiSd = console.nextDouble();
        System.out.println("Masukan Nilai Pemrogramman Berorientasi Objek :");
        nilaiPbo = console.nextDouble();
        System.out.println("Masukan Nilai Basis Data :");
        nilaiBd = console.nextDouble();
        System.out.println("Masukan Nilai Algoritma :");
        nilaiAlgo = console.nextDouble();
        System.out.println("Masukan Nilai Rekayasa Perangkat Lunak :");
        nilaiRpl = console.nextDouble();

        totalNilai = nilaiSd + nilaiPbo + nilaiBd + nilaiAlgo + nilaiRpl;
        rataRata = totalNilai / 5;

        System.out.println("Total Nilai dan Rata-Rata Anda :");
        System.out.println("================================");
        System.out.println("Total Nilai :" +totalNilai);
        System.out.println("Total Rata-Rata :" +rataRata);

        console.close();
    }
    
}