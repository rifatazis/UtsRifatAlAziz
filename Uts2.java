import java.util.Arrays;
import java.util.Scanner;

public class Uts2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("daftar angka yang sama beserta jumlahnya ");

        Arrays.sort(arr);
        int x = arr[0];
        int jumlah = 1;

        for (int i = 1; i <arr.length; i++) {
            if (arr[i] == x) {
                jumlah++;
            } else {
                if (jumlah > 1) {
                    System.out.println(x + " ada " + jumlah);
                }
                x = arr[i];
                jumlah = 1;
            }
        }

        if (jumlah > 1) {
            System.out.println(x + " ada " + jumlah);
        }
    }
}