
import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;

public class Animals{
    public boolean isPet ;
    public String nickname ;
    public int age;

    public Animals(boolean isPet,String nickname, int age){
        this.isPet=isPet;
        this.nickname=nickname;
        this.age=age;
    }
    public int Go ( ){
        Scanner scan= new Scanner(System.in);
        System.out.println("Steps need to go:" );
        int step=scan.nextInt();
        return step;
    }

    public String Say(){
        Scanner scan= new Scanner(System.in);
        System.out.println("What this animals say:");
       String say= scan.nextLine();
        return say;
    }
    public  void print() {

        System.out.println("Is Animal a Pet:" +  isPet );
        System.out.println("Animal nickname:" +  nickname );
        System.out.println("Animal age:" +  age );

    }
}
