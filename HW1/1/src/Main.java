import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("---Task 4---");
        System.out.println("Roksolana Kravchyshyn!");
        System.out.println("---Task 5---");
        System.out.println("Enter int  a:");
        Scanner scan =new Scanner(System.in);
        int a=scan.nextInt();
        if (a<10) System.out.println("Variable is less the 10: a=" + a) ;
        else System.out.println("Variable is more than 10: a=" + a);
        System.out.println("---Task 6---");
        String name= "Roksolana";
        for (int i=0; i<name.length();i++){
            System.out.println(name.charAt(i));
        }
        System.out.println("---Task 7---");
        int k=0;
        while (k<name.length()){
            System.out.println(name.charAt(k));
            k++;
        }
    }
}
