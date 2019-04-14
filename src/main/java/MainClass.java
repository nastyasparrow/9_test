import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class MainClass {
    static WebDriver driver;
    static WebDriverWait wait;


    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "D:\\IdeaProjects\\chromedriver.exe");

        driver = new ChromeDriver();
        wait = (new WebDriverWait(driver,5));

        driver.get("https://www.carnext.com/en-be/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15,  TimeUnit.SECONDS);

        MainPage mainPage = new MainPage(driver);
        mainPage.selectMakeModel();




    }
}
