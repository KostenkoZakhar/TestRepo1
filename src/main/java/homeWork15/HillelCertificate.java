package homeWork15;

public enum HillelCertificate {
    INVALID_1("50986521"),
    VALID_4("43790917"),
    INVALID_2("87634501"),
    INVALID_3("32128620");

    private final String certificateNumber;

    HillelCertificate(String number) {
        this.certificateNumber = number;
    }

    public String getNumber() {
        return certificateNumber;
    }
}
