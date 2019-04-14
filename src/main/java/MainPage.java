import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    private By makeSelector = By.xpath("//div[@name='make-filter']");
    private By make = By.xpath("//input[@type='checkbox' and @value='BMW']");
    private By modelSelector = By.xpath("//div[@name='model-filter']");
    private By model = By.xpath("//input[@type='checkbox' and @value='3 Serie']");
    private By searchButton =  By.xpath("//button[contains(text()='SEARCH')]");




    public MainPage selectMakeModel(){
        driver.findElement(makeSelector).click();
        driver.findElement(make).click();
        driver.findElement(modelSelector).click();
        driver.findElement(model).click();
        driver.findElement(searchButton).click();
        return new MainPage(driver);
    }



}
