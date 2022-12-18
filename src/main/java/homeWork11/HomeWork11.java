package homeWork11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Задача: Написать метод который открывает страницу курса QA Automation на https://ithillel.ua/
// проверить что определенный елемент страницы (на свое усмотрение) отобразился.

    public class HomeWork11 {
static WebDriver driver;
        public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
             driver = new ChromeDriver();
            driver.manage().window().maximize();
            System.out.println("The text of WebElement is: " + findSomeElement());

        }

        static String findSomeElement() throws InterruptedException {
            driver.get("https://ithillel.ua/");
            Thread.sleep(5000);
            return driver.findElement(By.xpath("//p[@class='section-content_descriptor']")).getText();

        }
    }
