package homeWork12;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterForm extends BaseClass{

    private final By fullName = By.xpath("//input[contains(@placeholder, 'Full Name')]");
    private final By email = By.xpath("//input[contains(@placeholder, 'name@example.com')]");
    private final By currentAddress = By.xpath("//textarea[contains(@placeholder, 'Current Address')]");
    private final By permanentAddress = By.xpath("//textarea[contains(@id, 'permanentAddress')]");

    @Test
    public void inputFullName() {
        WebElement fullNameField = driver.findElement(fullName);
        fullNameField.sendKeys("UserName");
        if ("UserName".equals(fullNameField.getAttribute("value"))) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
    @Test
    public void inputEmail() {
        WebElement emailField = driver.findElement(email);
        emailField.sendKeys("test@gmail.com");
        if ("test@gmail.com".equals(emailField.getAttribute("value"))) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

    }
    @Test
    public void inputCurrentAddress() {
        WebElement currentAddressField = driver.findElement(currentAddress);
        currentAddressField.sendKeys("Vinnytsia");
        if ("Vinnytsia".equals(currentAddressField.getAttribute("value"))) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

    }
    @Test
    public void inputPermanentAddress() {
        WebElement permanentAddressField = driver.findElement(permanentAddress);
        permanentAddressField.sendKeys("Ukraine");
        if ("Ukraine".equals(permanentAddressField.getAttribute("value"))) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

    }

}
