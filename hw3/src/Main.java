import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //---------------------------------------------------------
        System.out.println("---Task1---");
        int [] arr = new int[10];
        for (int i=0; i<arr.length; i++){
            arr[i]=((int)(Math.random()*31)-15);
            System.out.println("Element :" + arr[i]);
        }
        System.out.println("Sort arr++");
        Arrays.sort(arr);
        for(int i =0; i<arr.length; i++){
        System.out.println(arr[i] + " ");
        }
        //----------------------------------------------------------
        System.out.println("---Task2---");
       List animalList = new ArrayList(6);
        animalList.add("Cat");
        animalList.add("Dog");
        animalList.add("Eagle");
        animalList.add("Rabbit");
        animalList.add("Wolf");
        animalList.add("Bear");
        System.out.println(animalList);
        Collections.sort(animalList);
        System.out.println("Sort:");
        System.out.println(animalList);
        //------------------------------------------------------------
        System.out.println("---Task4---");
        //---Task5---------------------------------------------------------
        System.out.println("---Task5---");
         List FList= new ArrayList();
    if (FList.isEmpty()) throw new NullPointerException ("Current collection is empty !!!");
  }

   //---Task3---------------------------------------------------------
    public enum  User {
        DEV("Ira","123"),
        DEV1("Oleg","456"),
        DEV2("Ivan","789"),
        DEV3("Petro","000");

        private  String name;
        private  String pass;

        User (final String name, final String pass){
            this.name=name;
            this.pass=pass;
        }
        /*
   @BeforeTest
   public void startPrint (){
        System.out.println("Start printing user credentials");
    }
    @Test
    public void printUserCredentials (){

    }
    @AfterTest
    public void finishPrint (){
        System.out.println("Finish printing user credentials");
    }*/


}}
