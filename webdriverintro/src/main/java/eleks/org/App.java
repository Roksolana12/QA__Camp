package eleks.org;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.internal.TestResult;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;



public class App
{
    public static void main( String[] args ){}

        @Test
        public static void Test1() {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");
            DesiredCapabilities capabilities=DesiredCapabilities.chrome();
            capabilities.setCapability(ChromeOptions.CAPABILITY,options);
            WebDriver driver = new ChromeDriver(options);
            driver.get("http://eds_university.eleks.com/login");

            WebElement buttonc = ((ChromeDriver)driver).findElement(By.xpath("//button[text()=\"Login\"]"));
            buttonc.click();
            WebElement mail = ((ChromeDriver)driver).findElement(By.id("email"));
            mail.sendKeys("roksolanakravchyshyn121@gmail.com");
            WebElement pass = ((ChromeDriver)driver).findElement(By.id("userPassword"));
            pass.sendKeys("kFd0Sr#eZ#+");
            WebElement signIn = ((ChromeDriver)driver).findElement(By.xpath("//button[text()=\"Sign in\"]"));
            signIn.click();

           // driver.close();

        }


    @Test
   // @Issue("U-1")
   // @Step
   // @Description("Sign In")
   // @Feature("---")

    public static void Test2() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://eds_university.eleks.com/login");

        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = homePage.goToSignInPage();
        signInPage.fillInForm("roksolanakravchyshyn121@gmail.com", "kFd0Sr#eZ#+");
        MainPage mainPage = signInPage.goToMainPage();

    }



    @Test
    public void Test3 () throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.get("http://eds_university.eleks.com/login");

        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = homePage.goToSignInPage();
        signInPage.fillInForm("roksolanakravchyshyn121@gmail.com", "kFd0Sr#eZ#+");
        MainPage mainPage = signInPage.goToMainPage();
        AdminTabb adminTabb = mainPage.GoToAdminTab();
        NewProduct newProduct = adminTabb.addNewProduct();
        newProduct.setProduct("Productyk1");
        //Screenshot
       // File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(scrFile, new File("d:\\screenshot.png"));
       // Actions action= new Actions(driver);
       /// action.moveToElement();
        Assert.assertEquals(newProduct.productName,"Productyk1");
      //  Assert.assertEquals(newProduct.productDescription,"hfvfvfdk");
       // Assert.assertEquals(newProduct.productRepositoriy,"hhfruhfkjdfj");

    }
@AfterClass
    public void AfterClass(){
   // driver.quite();
}

}
