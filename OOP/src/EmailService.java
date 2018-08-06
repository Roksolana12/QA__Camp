//----TASK 2
//Singleton for  email sending service

public class EmailService {
    private static EmailService INSTANCE = new EmailService();

    private EmailService() {}
    public  static EmailService getInstance (){
        return INSTANCE;
    }
    public void sendMessage (String message){
        System.out.println("Message:" + message);
    }
}
