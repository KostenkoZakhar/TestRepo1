package homeWork13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectModel {
    WebDriver driver;
    private final By courseTitle = By.xpath("//div[@class='course-descriptor_heading']");
    private final By courseRate = By.xpath("//span[@class='course-rating_average']");
    private final By courseDescription = By.xpath("//p[@class='profession-bar_descr']");

    public PageObjectModel(WebDriver driver) {
        this.driver = driver;
    }


    public void getCourseTitle(){
        System.out.println(driver.findElement(courseTitle).getText());
    }
    public void getCourseRate(){
        System.out.println(driver.findElement(courseRate).getText());
    }
    public void getCourseDescription() throws InterruptedException {
        WebElement element = driver.findElement(courseDescription);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",element);
        Thread.sleep(500);
        System.out.println(driver.findElement(courseDescription).getText());
    }
}
