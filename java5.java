import java.util.Scanner;

class java5 {
    public static void main(String[] args){
    Scanner kbd = new Scanner(System.in);

            int w = kbd.nextInt();
            int h = kbd.nextInt();

            if(w > h) {
                if(w > h){
                    System.out.println("False");
                }else{
                    System.out.println("True");
                }
            }
            else{
                if(w == h){
                    System.out.println("True");
                }else{
                    System.out.println("False");
                }
            }
        
     }
        
}
