package homeWork15;

import config.BaseClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.ResourceBundle;

@RunWith(Parameterized.class)
public class HillelCertificateTest extends BaseClass {
    public static CertificatePage certificatePage;
    public static ResourceBundle bundle;

    @Parameterized.Parameters
    public static Collection options() {
        return Arrays.asList(HillelCertificate.values());
    }

    public HillelCertificateTest(HillelCertificate hillelCertificate) throws InterruptedException {
            bundle = ResourceBundle.getBundle(hillelCertificate.getNumber());
            driver.get("https://certificate.ithillel.ua/");
            certificatePage = PageFactory.initElements(driver, CertificatePage.class);}

    @Test
    public void checkCertificate1() throws InterruptedException {
        certificatePage.checkCertificate(bundle.getString("certificateNumber"));
        if(certificatePage.getCheckMessage().equals("Сертифікат не знайдено")){
            System.out.println(certificatePage.getCheckMessage());
        }else System.out.println("Випускник має унікальний сертифікат");}}
