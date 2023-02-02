package homeWork17;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CertificatePage {
    @FindBy(xpath = "//input[@type='text' and contains (@name,'certificate')]")
    WebElement inputField;
    @FindBy(xpath = "//button[@type='submit' and contains (@class,'btn btn-submit -submit certificate-check_submit')]")
    WebElement checkButton;
    @FindBy(xpath = "//p[@class='certificate-check_message']")
    WebElement checkMessage;

        public void inputCertificateNumber(String inputField) throws InterruptedException {
            this.inputField.sendKeys(inputField);
            checkButton.click();
            Thread.sleep(3000);}

    public String getCheckMessage(){
            return checkMessage.getText();
        }
}

