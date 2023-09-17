import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        Integer[] a = new Integer[10];

        for (int i = a.length -1;i>=0 ;i--) {
            a[i] = kbd.nextInt();
            
            
        }Arrays.sort(a);
        for(int i:a) {
            System.out.println(i);
        }
    }
}
