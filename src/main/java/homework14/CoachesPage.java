package homework14;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CoachesPage {
    private final WebDriver driver;
    @FindBy(xpath = "//a[@href='https://dnipro.ithillel.ua/coaches' and contains (@class,'site-nav-dropdown_link')]")
    private WebElement linkToCoachesPage;
    public CoachesPage(WebDriver driver) {
        this.driver = driver;
    }

    public CoachesPage openInitialPage() {
        driver.get("https://dnipro.ithillel.ua/coaches");
        PageFactory.initElements(driver, this);
        return this;
    }


    public CoachesPage scrollToListOfCoaches() throws InterruptedException {
        WebElement firstCoachCard = driver.findElement(By.xpath("//input[@id='input-email-mailing']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", firstCoachCard);
        Thread.sleep(2000);
        return this;
    }

    public CoachesPage printCoachesList() {
        List<WebElement> coachesList = driver.findElements(By.xpath("//ul[@class='block-coaches_list']/li"));
        for (WebElement l : coachesList) {
            System.out.println(l.getText());
            System.out.println("        ");
        }
        return this;
    }
}
