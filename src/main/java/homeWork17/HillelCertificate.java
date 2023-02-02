package homeWork17;

public enum HillelCertificate {
    INVALID_1("50986521",false),
    VALID_4("43790917",true),
    INVALID_2("87634501",false),
    INVALID_3("32128620",false);

    private final String certificateNumber;
    private final boolean result;

    public boolean isResult() {
        return result;
    }

    HillelCertificate(String number, boolean result) {
        this.certificateNumber = number;
        this.result = result;
    }

    public String getNumber() {
        return certificateNumber;
    }
}

