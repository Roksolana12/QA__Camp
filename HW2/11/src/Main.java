import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        Animals Lione= new Animals(false,"Vasya",3);
        Animals Dog=new Animals(true,"Nick",2);
        Animals Eagle=new Animals(false,"Ira",9);

        System.out.println("Which animal you interesting?(Lione-1,Dog-2,Eagle-3);" );
        int i=scan.nextInt();
        switch (i){
            case 1:
        System.out.println("Lione");
        Lione.print();
        Lione.Say();
        Lione.Go();
        break;
            case 2:
        System.out.println("Dog");
        Dog.print();
        Dog.Say();
        Dog.Go();
        break;
            case 3:
        System.out.println("Eagle");
        Eagle.print();
        Eagle.Say();
        Eagle.Go();
        break;
        default: System.out.println("You enter incorrect value!");
        }

    }
}
