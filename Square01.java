import java.util.Scanner;

public class Square01 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("masukkan nilai n = ");
    int n = input.nextInt();

    for (int outer = 1; outer <= n; outer++) {
      for (int i = 1; i <= n; i++) {
        System.out.print("*");
      }
      System.out.println();
    }
    input.close();
  }
}
