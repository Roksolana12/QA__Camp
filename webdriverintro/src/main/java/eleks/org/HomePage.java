package eleks.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

     @FindBy (how = How.XPATH,using = "//button[text()='Login']")
    public WebElement logbutton;

public HomePage(WebDriver driver){
    this.driver=driver;
    PageFactory.initElements(driver,this);
}

public SignInPage goToSignInPage (){
    logbutton.click();
    return new SignInPage(driver);
}


}
