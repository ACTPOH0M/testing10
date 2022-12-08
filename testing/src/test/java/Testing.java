import tankiSu.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Testing {


    private  static  final  String resultTest1 ="Обнаружение и маскировка";
    private  static  final  String resultTest2 ="ВЧЕРА";
    By titleResultTest1 = By.xpath("//h2");
    By titleResultTest2 = By.xpath("//span[@class='filter-nav_option']");
    WebDriver webDriver = new ChromeDriver();
    @Test
    public void FindInformationAboutDetectionAndMasking()
    {
            new HomePage(webDriver)
                    .openPage()
                    .ClickMainMenuSecondButton()
                    .ClickMenuBurgerFromSecondButton();

            new NewcomersGuidePage(webDriver)
                    .ClickMenu();

            new HowtToSurvivePage(webDriver)
                    .ScrollingToArticle();

        assertEquals(HowtToSurvivePage.actual(titleResultTest1),resultTest1 );
    }

    @Test
    public void FindRatingYesterday()
    {
        new HomePage(webDriver)
                .openPage()
                .ClickMainMenuFirstButton()
                .ClickMenuBurgerFromFirstButton();

        new Ratings(webDriver).ClickRatingsByAchievements();

        new Achievements(webDriver).ChangeOptions().ClickToChangeOptions();

        assertEquals(Achievements.actual(titleResultTest2),resultTest2 );
    }

}
