package eleks.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    private WebDriver driver;
    public MainPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(how = How.XPATH,using = "//a[text()=\"ADMINISTRATION\"]")
    public WebElement AdminTab;

    public  AdminTabb GoToAdminTab(){
        AdminTab.click();
        return new AdminTabb(driver);
    }


}
