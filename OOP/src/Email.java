import javafx.util.Builder;
/* Builder for Email with fields:
 mandatory
    String go;
    String subject;
  optional
    String cc;
    String body;
    int priority;
    boolean attachment;
 */
//-------Task 1
public class Email {
    String go;
    String subject;
    String cc;
    String body;
    int priority;
    boolean attachment;

    public Email(Builder builder) {
        this.go =builder.go;
        this.subject =builder.subject;
        this.cc =builder.cc;
        this.body =builder.body;
        this.priority =builder.priority;
        this.attachment=builder.attachment;
    }
    public static  class Builder {
        private  String go;
        private String subject;
        private String cc;
        private String body;
        private int priority;
        private boolean attachment = false;
        public Builder(String go,String subject){
            this.go=go;
            this.subject=subject;
        }
            public Builder sm( String cc){
             this.cc=cc;
             return this;
        }

        public Builder sm1(String body ){
            this.body=body;
            return this;
        }
        public Builder sm2(int priority ){
            this.priority=priority;
            return this;
        }
        public Builder sm3(boolean attachment ){
            attachment = true;
            return this;
        }

    public Email build() {return new Email (this); }

    }

}
