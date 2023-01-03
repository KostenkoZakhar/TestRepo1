package homeWork13;

import PomTraining.MainPage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass {
    static WebDriver driver;
    static PageObjectModel pageObjectModel;
    @BeforeClass
    public static void setUp() {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ithillel.ua/courses/java-basic");
        pageObjectModel = new PageObjectModel(driver);
    }
    @AfterClass
    public static void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
