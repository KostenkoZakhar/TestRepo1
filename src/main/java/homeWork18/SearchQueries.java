package homeWork18;

public enum SearchQueries {
    JAVA("JAVA"),
    PYTHON("PYTHON"),
    QA("QA"),
    PHP("PHP"),
    REACT("REACT");

    private final String query;

    SearchQueries(String searchQuery) {
        this.query = searchQuery;
    }

    public String getQuery() {
        return query;
    }
}
