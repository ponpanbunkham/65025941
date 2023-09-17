import java.util.Scanner;

class oop {
    public String name;
    public double cash;
    public oop(){}
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String[] r = new String[n];
        double[] c = new double[n];
        for (int i=0;i<n;i++){
            r[i] = s.next();
            c[i] = s.nextDouble();
        }
        double sum = 0.0;
        for (int i=0;i<n;i++){
            sum += c[i];
        }
        int max_i = 0;
        int min_i = 0;
        double max = Integer.MIN_VALUE;
        double min = Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            if(c[i] > max) {
                max = c[i];
                max_i = i;
            }
            if(c[i] < min){
                min = c[i];
                min_i = i;
            }
        }
        System.out.printf("%.2f\n", sum/r.length);
        System.out.printf("%.2f\n", sum);
        System.out.println(r[max_i]);
        System.out.println(r[min_i]);
        s.close();
        
    }
}
    