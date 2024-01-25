import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRunner extends Setup {
    Dashboard dashboard;
    @Test
    public void show(){
        dashboard = new Dashboard(driver);
        Assert.assertTrue(dashboard.headerLogo.isDisplayed());

    }
}
