package eleks.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminTabb {

    private WebDriver driver;

    public AdminTabb(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
        WebDriverWait waite = new WebDriverWait(driver,10);
     //   waite.until(ExpectedConditions.visibilityOf());
    }

    @FindBy(how = How.XPATH,using = "//span[@class=\"btn gds-btn-icon gds-add-entity-icon\"]")
    public WebElement addProduct;


//add NewProduct
    public NewProduct addNewProduct(){
        addProduct.click();
        return new NewProduct(driver);

    }

}
