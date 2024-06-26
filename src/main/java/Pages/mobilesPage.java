package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class mobilesPage {

    WebDriver driver;
    
    @FindBy(xpath = "//img[@class=\"_2puWtW _3a3qyb\" and @alt=\"Mobiles\"]")
    private WebElement mobilesImage;
    
    

    public mobilesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Method to click on the mobiles image
    public void getMobilesImage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(mobilesImage)).click();
    }
    
    // Method to verify if the mobiles image is clickable
    public boolean isMobilesImageClickable() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            wait.until(ExpectedConditions.elementToBeClickable(mobilesImage));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
