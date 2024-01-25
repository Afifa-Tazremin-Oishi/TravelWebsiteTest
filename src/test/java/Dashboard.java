import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
    @FindBy(className = "header_logo")
    WebElement headerLogo;

    public Dashboard(WebDriver driver){
        PageFactory.initElements(driver,this);

    }
}
