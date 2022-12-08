package tankiSu;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class HowtToSurvivePage {
    @FindBy(xpath = "//a[@id='spotting_concealment']")
    private WebElement title;
    private static WebDriver driver;
    public HowtToSurvivePage(WebDriver webDriver)
    {
        this.driver = webDriver;
        PageFactory.initElements(new DefaultElementLocatorFactory(webDriver), this);
    }
    public HowtToSurvivePage ScrollingToArticle()
    {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", title);
        return this;
    }
    public static String actual(By locator) {
        return driver.findElements(locator).get(30).getText();
    }
}
