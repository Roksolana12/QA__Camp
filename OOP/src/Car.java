public abstract class Car {
    public abstract int getPrice ();
    public String getMarka () {
        return "Unknown" ; }
}
//public
 class Cabriolet extends Car {
    private int price;
    protected Cabriolet (int price){this.price=price;}
    public int getPrice() {
        return price;
    }
    public String getMarka(){return  "Cabriolet"; }
}
//public
class BMW extends Car {
    private int price;
    protected BMW (int price){this.price=price;}
    public int getPrice() {
        return price;
    }
    public String getMarka(){return  "BMW"; }
}
//public
class Audi extends Car {
    private int price;
    protected Audi (int price){this.price=price;}
    public int getPrice() {
        return price;
    }
    public String getMarka(){return  "Audi"; }
}
//public
class CarFactory {
    public static Car createCar (String what){
        if (what.equals("Cabriolet")) {return new Cabriolet(200000);}
        else if (what.equals("BMW")) {return new BMW(250000); }
        else if (what.equals("Audi")) {return  new Audi(190000);}
        else return new Audi(180000);
    }
}
