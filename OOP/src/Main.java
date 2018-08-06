public class Main {

    public static void main(String[] args) {
        //---OOP
     Men  aragon = new Men();
     aragon.sleep();
     aragon.talk();

     //---OOD
     EmailService.getInstance().sendMessage("Very interesting message)");

     //---Task3
        Car [] cart = new Car[3];
        cart[0]=CarFactory.createCar("BMW");
        cart[1]=CarFactory.createCar("Cabriolet");
        cart[2]=CarFactory.createCar("Audi");

    }
}
