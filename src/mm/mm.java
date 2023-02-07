package mm;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class mm {
    public static WebDriver driver;
    public void launcher() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hanifi Nacarli\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions cr = new ChromeOptions();
        cr.addArguments("--incognito");
        driver = new ChromeDriver(cr);
        driver.manage().window().maximize();
    }



    public static void main(String[] args){
        mm script = new mm();
        script.launcher();
    }
}

