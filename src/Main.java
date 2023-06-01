import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so luong mang");
        n = scanner.nextInt();
        float array[] = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhap gia tri phan tử " + i);
            array[i] = scanner.nextFloat();
        }
        countprimes(array);
    }


    public static boolean perfectsquare(float i) {
            double j = Math.sqrt(i);
            if (i == Math.pow(j, 2)) {
                return true;
            }
            return false;
        }
    public  static void countprimes(float array[]){
        int dem=0;
    for (int l=0;l< array.length;l++){
        if (perfectsquare(array[l])){
            dem++;
            System.out.println("các số chính phương là: "+array[l]);
        }
    }
        System.out.println("có "+dem+ " số chính phương");
    }
}