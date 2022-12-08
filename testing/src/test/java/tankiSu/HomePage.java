package tankiSu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

import java.util.List;

public class HomePage {
    private static WebDriver driver;
    private static final String url = "https://tanki.su";
    @FindBy(xpath = "//span[@class='nav-submenu_arrow js-mainmenu-arrow']")
    private List<WebElement> menuButton;
    @FindBy(xpath = "//a[@class='nav-detail_link js-portal-menu-link-text']")
    private List<WebElement> menuBurger;

    public HomePage(WebDriver webDriver)
    {
        this.driver = webDriver;
        PageFactory.initElements(new DefaultElementLocatorFactory(webDriver), this);
    }
    public HomePage openPage()
    {
        driver.get(url);
        return this;
    }
    public HomePage ClickMainMenuSecondButton()
    {
        menuButton.get(1).click();
        return this;
    }
    public HomePage ClickMainMenuFirstButton()
    {
        menuButton.get(0).click();
        return this;
    }
    public HomePage ClickMenuBurgerFromSecondButton()
    {
        menuBurger.get(5).click();
        return this;
    }
    public HomePage ClickMenuBurgerFromFirstButton()
    {
        menuBurger.get(3).click();
        return this;
    }
}
