package homeWork18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HillelPage {
    private final WebDriver driver;
    @FindBy(xpath = "//button[@data-dropdown-trigger='coursesMenu']")
    private WebElement courseButton;
    @FindBy(xpath = "//input[@class='search-field_input']")
    private WebElement searchInputField;
    @FindBy(xpath = "//p[@class='search-panel_message -error']")
    private WebElement noSearchResultsFound;

    public HillelPage(WebDriver driver) {
        this.driver = driver;
    }

    public HillelPage openHillelPage() {
        driver.get("https://ithillel.ua/");
        PageFactory.initElements(driver, this);
        return this;
    }

    public String checkCourseButton(){return courseButton.getText();}

    public void openSearchWindow(){courseButton.click();}

    public void inputSearchQuery(String searchInputField) throws InterruptedException {
        this.searchInputField.sendKeys(searchInputField);
        Thread.sleep(4000);
        this.searchInputField.clear();
    }

    public List<WebElement> getSearchResults() {
        List<WebElement> searchResults= driver.findElements(By.xpath("//div[@class='courses-nav ']/ul[@class='course-list']/li[@class='course-list_item']"));
        for (WebElement l : searchResults) {
            System.out.println(l.getText());
            System.out.println("        ");
        } return searchResults;
    }
}

