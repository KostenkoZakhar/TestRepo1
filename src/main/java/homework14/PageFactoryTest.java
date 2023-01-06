package homework14;

import org.junit.Test;

public class PageFactoryTest extends BaseClass {

    @Test
    public void getListOfCoaches() throws Exception {
        CoachesPage coachesPage = new InitialPage(driver)
                .openInitialPage()
                .openSchoolDropdown()
                .openCoachesPage()
                .scrollToListOfCoaches()
                .printCoachesList();
    }
}

