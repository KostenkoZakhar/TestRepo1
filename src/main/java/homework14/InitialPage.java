package homework14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InitialPage {
    private final WebDriver driver;
    @FindBy(xpath = "//button[@data-dropdown-trigger='aboutSchool']")
    private WebElement schoolButton;
    @FindBy(xpath = "//a[@href='https://dnipro.ithillel.ua/coaches' and contains (@class,'site-nav-dropdown_link')]")
    private WebElement linkToCoachesPage;

    public InitialPage(WebDriver driver) {
        this.driver = driver;
    }

    public InitialPage openInitialPage() {
        driver.get("https://dnipro.ithillel.ua/");
        PageFactory.initElements(driver, this);
        return this;
    }

    public InitialPage openSchoolDropdown() {
        schoolButton.click();
        return this;
    }
    public void openCoachesPage() {
        linkToCoachesPage.click();
    }

//    public CoachesPage openCoachesPage() {
//        linkToCoachesPage.click();
//        return new CoachesPage(driver);
//    }
}
