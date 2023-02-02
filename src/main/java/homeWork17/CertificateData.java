package homeWork17;

import org.testng.annotations.DataProvider;

public class CertificateData {
    @DataProvider
    public static Object[][] certificatesList() {
        return new Object[][] {{HillelCertificate.INVALID_1},
                {HillelCertificate.VALID_4},
                {HillelCertificate.INVALID_2},
                {HillelCertificate.INVALID_3}};
    }
}
