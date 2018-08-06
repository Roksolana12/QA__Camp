/* Create class Men  inherit him from Human*/
public class Men extends Human implements iTalk {

    @Override
    public void talk() {
    System.out.println("I talk");
    }

    @Override
    public void sleep (){
        System.out.println("I sleep one more time");
    }
}
