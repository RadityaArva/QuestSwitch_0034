import java.util.Scanner;

public class QuestSwitch {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double nilaiSd, nilaiPbo, nilaiBd, nilaiAlgo, nilaiRpl, rataRata, totalNilai;
        String grade, mataKuliah, status;

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
        rataRata = (totalNilai / 5) / 25;

        System.out.println("Total Nilai dan Rata-Rata Anda :");
        System.out.println("================================");
        System.out.println("Total Nilai :" +totalNilai);
        System.out.println("Total (IPK skala 4) Anda Adalah :" +rataRata);

        if (rataRata >= 3.75) {
            grade = "A (Sangat Baik)";
        } else if (rataRata >= 3.50) {
            grade = "AB (Baik Sekali)";
        } else if (rataRata >= 3.00) {
            grade = "B (Baik)";
        } else if (rataRata >= 2.50) {
            grade = "BC (Cukup)";
        } else {
            grade = "C (Kurang)";
        }

        System.out.println("Predikat Akademi Anda Adalah =" +grade);

        if(grade.startsWith("A") || grade.startsWith("AB")){
            System.out.println("Selamat anda dinyatakan lolos untuk menjadi Asisten Dosen");
            System.out.println("========================================================");

            console.nextLine();

            System.out.println("Silahkan pilih mata kuliah untuk menjadi Asisten Dosen");
            System.out.println("1. Struktur Data");
            System.out.println("2. Pbo");
            System.out.println("3. Basis Data");
            System.out.println("4. Algoritma");
            System.out.println("5. Rekayasa Perangkat Lunak");

            int pilihan = console.nextInt();

            switch (pilihan) {
                case 1:
                    mataKuliah = "Struktur Data";
                    break;
                case 2:
                    mataKuliah = "Pemrogramman Berbasi Objek";
                    break;
                case 3:
                    mataKuliah = "Basis Data";
                    break;
                case 4:
                    mataKuliah = "Algoritma";
                    break;
                case 5:
                    mataKuliah = "Rekayasa Perangkat Lunak";
                    break;
            
                default:
                    System.out.println("Pilihan Invalid");
                    break;
            }
        }

        console.close();
    }
    
}