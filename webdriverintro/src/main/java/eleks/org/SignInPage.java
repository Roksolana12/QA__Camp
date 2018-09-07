package eleks.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
    private WebDriver driver;


    @FindBy(how = How.ID, using = "email")
    public WebElement mail;


    @FindBy(how = How.ID, using = "userPassword")
    public WebElement pass;

    @FindBy (how = How.XPATH,using = "//button[text()=\'Sign in\']")
    public WebElement signInButton;



    public SignInPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    public void fillInForm(String email, String password){
        mail.clear();
        mail.sendKeys(email);
        pass.clear();
        pass.sendKeys(password);

    }
   public MainPage goToMainPage (){
        signInButton.click();
        return new MainPage(driver);
    }
}
