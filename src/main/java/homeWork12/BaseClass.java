package homeWork12;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass {
    static public WebDriver driver;
    @BeforeClass
    public static void setUp() {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");
    }
    @AfterClass
    public static void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
