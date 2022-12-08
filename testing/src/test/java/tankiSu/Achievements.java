package tankiSu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

import java.util.List;

public class Achievements {

    @FindBy(xpath = "//div[@class='filter-nav_item js-tb-filter-block']")
    private WebElement menuOptions;
    @FindBy(xpath = "//li[@class='filter-nav_list-item']")
    private List<WebElement> options;
    private static WebDriver driver;
    public Achievements(WebDriver webDriver)
    {
        this.driver = webDriver;
        PageFactory.initElements(new DefaultElementLocatorFactory(webDriver), this);
    }
    public Achievements ChangeOptions()
    {
        Actions action = new Actions(driver);
        action.moveToElement(menuOptions);
        action.perform();
        return this;
    }
    public Achievements ClickToChangeOptions ()
    {
        options.get(1).click();
        return this;
    }

    public static String actual(By locator) {

        return driver.findElement(locator).getText();
    }

}
