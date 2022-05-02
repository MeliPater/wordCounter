package wordCounter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import wordCounter.userinterface.WordCounterPage;

public class CheckKeywordDensityThird implements Question<Boolean> {
    private String arg1;
    public CheckKeywordDensityThird(String arg1) { this.arg1 = arg1;}
    public static CheckKeywordDensityThird toThe(String arg1) { return new CheckKeywordDensityThird(arg1);}
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String TextKeyDensity = actor.asksFor(Text.of(WordCounterPage.KEYWORDDENSITYCONSECUTIVE3).asString());
        String[] partsTextKeyDensity = TextKeyDensity.split("\n");
        String a  = (partsTextKeyDensity[1].replace(" ","")).toUpperCase();
        if(a.equals(arg1.toUpperCase())) result = true;
        else{result = false;System.out.println("ERROR DESCRIPTION :"+"\n"+"Third Keyword Density "+"Expected: "+ arg1.toUpperCase() + ", Found: " + a);}
        return result;
    }
}
