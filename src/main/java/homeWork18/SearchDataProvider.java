package homeWork18;


import org.testng.annotations.DataProvider;

public class SearchDataProvider {
    @DataProvider
    public static Object[][] searchQueryList() {
        return new Object[][] {
                {SearchQueries.JAVA},
                {SearchQueries.QA},
                {SearchQueries.PYTHON},
                {SearchQueries.PHP},
                {SearchQueries.REACT}};
    }
}
