package tankiSu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class Ratings {

    @FindBy(xpath = "//li[@class='rating-links-grid_item']")
    private WebElement menu;
    private static WebDriver driver;
    public Ratings(WebDriver webDriver)
    {
        this.driver = webDriver;
        PageFactory.initElements(new DefaultElementLocatorFactory(webDriver), this);
    }
    public Ratings ClickRatingsByAchievements()
    {
        menu.click();
        return this;
    }
}
