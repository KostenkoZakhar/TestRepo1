package homeWork18;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageFactoryTest extends BaseClass {
    HillelPage hillelPage;


    @Test (description = "Is course button presented on the page?")

    public void  checkCourseButtonIsPresented(){
        hillelPage = new HillelPage(driver);
        hillelPage.openHillelPage().checkCourseButton();
        Assert.assertEquals("курси",hillelPage.checkCourseButton(),"Course button is not presented on the page");
    }

    @Test (description = "Check 5 random search queries", dependsOnMethods = {"checkCourseButtonIsPresented"},
            dataProvider  = "searchQueryList",dataProviderClass= SearchDataProvider.class)

    public void  checkSearchQuery(SearchQueries searchQueries) throws InterruptedException{
        hillelPage = PageFactory.initElements(driver, HillelPage.class);
        hillelPage.openSearchWindow();
        hillelPage.inputSearchQuery(searchQueries.getQuery());
        System.out.println(hillelPage.getSearchResults());
        hillelPage.openSearchWindow();}
    }




