import java.text.MessageFormat;
import java.util.Scanner;

public class pro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("plz give cel : ");
  float cel = input.nextFloat();
  float fer = (cel * 9/5) + 32 ;

        System.out.println(" tempreature to fer converting : " + fer);


    }
}



