package wordCounter.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://wordcounter.net/")
public class WordCounterPage extends PageObject {
    public static final Target INPUT_SENTENCE = Target.the("text box where the phrase is entered")
            .located(By.xpath("//textarea[@class='form-control table-data finalResult textarea_revision processed']"));
    public static final Target COUNTER_WAndC = Target.the("text containing the words counted")
            .located(By.xpath("//h4//span[@class='counted']"));
    public static final Target KEYWORDDENSITYCONSECUTIVE1= Target.the("text containing the words counted")
            .located(By.xpath("//div//a[@class='list-group-item'][1]"));
    public static final Target KEYWORDDENSITYCONSECUTIVE2= Target.the("text containing the words counted")
            .located(By.xpath("//div//a[@class='list-group-item'][2]"));
    public static final Target KEYWORDDENSITYCONSECUTIVE3= Target.the("text containing the words counted")
            .located(By.xpath("//div//a[@class='list-group-item'][3]"));
}
