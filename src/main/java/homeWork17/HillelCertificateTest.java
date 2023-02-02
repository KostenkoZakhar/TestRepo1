package homeWork17;

import config.BaseClass;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;

public class HillelCertificateTest extends BaseClass {
    public static CertificatePage certificatePage;

    @Test(dataProvider  = "certificatesList",dataProviderClass=CertificateData.class)

    public void checkCertificate1(HillelCertificate hillelCertificate) throws InterruptedException {
        driver.get("https://certificate.ithillel.ua/");
        certificatePage = PageFactory.initElements(driver, CertificatePage.class);
        certificatePage.inputCertificateNumber(hillelCertificate.getNumber());
        if (hillelCertificate.isResult()){
            System.out.println("Випускник має унікальний сертифікат");
        }else System.out.println(certificatePage.getCheckMessage());}
}

