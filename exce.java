import java.util.Scanner;

public class exce {
    public static void main(String[] args) {
        try{
            Scanner kbd = new Scanner(System.in);
            int a = kbd.nextInt();
            int b = kbd.nextInt();
            try{

                int c = kbd.nextInt();
                int x = (int) Math.sqrt(b);

                int i = a+x/c;
                System.out.print(i);
            }catch (Exception e){
                System.out.println("Divided by zero.");
            }
        }catch  (Exception e){
            System.out.println("Input is not invalid.");
        }
    }

    
}