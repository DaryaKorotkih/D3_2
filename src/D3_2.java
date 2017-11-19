
import java.util.Scanner;
public class D3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//==========================================================================
        System.out.println("Enter your name.");
        String name = in.next();

        System.out.println("Enter your age.");
        int age = in.nextInt();

        String ads = in.nextLine(); //Consume newline left-over

        System.out.println("Enter your city");
        String adrs = in.nextLine();

        System.out.println("Enter your favorite hobby");
        String hobb = in.nextLine();
  //============================================================================
        System.out.println(" \nEnter your favorite number");
        int num = in.nextInt();

        System.out.println("A person named "+name+" lives in the city "+adrs+"\nThis person "+age+" years and he loves to engage in "+hobb);
        System.out.println((char) 27 + "[31m\n\nThanks for the information provided,\n and now we will blow up your house " + (char)27 + "[0m");

        System.out.println();









    }
}
