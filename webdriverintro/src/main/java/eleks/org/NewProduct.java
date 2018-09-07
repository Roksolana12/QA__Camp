package eleks.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class NewProduct {

    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//input[@id=\"product-name\"]")
    public WebElement productName;
    @FindBy(how = How.XPATH,using = "//button[@class=\"dropdown-toggle form-control multiselect-dropdown\"]")
    public WebElement productFamilyy;
    @FindBy(how = How.XPATH,using = "//span[text()=\"aaaaa\"]")
    public WebElement productFamily;
    @FindBy(how = How.XPATH,using = "//body[@class=\"cke_editable cke_editable_themed cke_contents_ltr\"]/p")
    public WebElement productDescription;
    @FindBy(how = How.XPATH,using = "//textarea[@id=\"repository\"]")
    public WebElement productRepositoriy;

    public NewProduct(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    public void setProduct(String name){
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        productName.clear();
        productName.sendKeys(name);
       // productFamily.click();
      //  productFamily.click();
        //productDescription.clear();
       // productDescription.sendKeys(descp);

        //productRepositoriy.clear();
       /// productRepositoriy.sendKeys(rep);


    }

}
