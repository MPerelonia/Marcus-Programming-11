import java.util.Scanner;

public class Random {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int random = (int)Math.random()*100; //0 and 1 .456545654567, 45.65
        int choice = Integer.parseInt(scan.next());
                System.out.println(choice);
    }
}
