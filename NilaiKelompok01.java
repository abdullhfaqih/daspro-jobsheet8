import java.util.Scanner;

public class NilaiKelompok01 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int nilai;
    float totalNilai, rataNilai;

    // Menambahkan dua variabel
    float maxRata = 0;
    int kelompokTerbaik = 0;

    int i = 1;
    while (i <= 6) {
      System.out.println("Kelompk " + i);

      totalNilai = 0;
      for (int j = 1; j <= 5; j++) {
        System.out.print("Nilai dari kelompok penilai " + j + ": ");
        nilai = input.nextInt();
        totalNilai += nilai;
      }

      // Lalu menambahkan logika setelah menghitung rataNilai:
      rataNilai = totalNilai / 5;
      if (rataNilai > maxRata) {
        maxRata = rataNilai;
        kelompokTerbaik = i;
      }

      System.out.println("Kelompok" + i + ": niali rata-rata = " + rataNilai);
      i++;
    }
    System.out.println("Kelompok dengan nilai rata-rata tertinggi adalah kelompok " + kelompokTerbaik);
    input.close();
  }
}