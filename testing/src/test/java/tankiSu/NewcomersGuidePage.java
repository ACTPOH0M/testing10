package tankiSu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

import java.util.List;

public class NewcomersGuidePage {
    private static WebDriver driver;
    @FindBy(xpath = "//a[@class='newcomers-menu_link']")
    private List<WebElement> menu;

    public NewcomersGuidePage(WebDriver webDriver)
    {
        this.driver = webDriver;
        PageFactory.initElements(new DefaultElementLocatorFactory(webDriver), this);
    }
    public NewcomersGuidePage ClickMenu()
    {
        menu.get(2).click();
        return this;
    }
}
