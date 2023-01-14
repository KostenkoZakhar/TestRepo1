package homework14;

import org.junit.Test;

public class PageFactoryTest extends BaseClass {
    InitialPage initialPage;
    CoachesPage coachesPage;
    @Test
    public void openCoachesPage() throws Exception {
        initialPage = new InitialPage(driver);
        initialPage.openInitialPage().openSchoolDropdown().openCoachesPage();}

    @Test
    public void getListOfCoaches() throws Exception {
        coachesPage = new CoachesPage(driver);
        coachesPage.scrollToListOfCoaches().printCoachesList();
    }
}

