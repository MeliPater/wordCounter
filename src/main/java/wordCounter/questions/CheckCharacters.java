package wordCounter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import wordCounter.userinterface.WordCounterPage;

public class CheckCharacters implements Question<Boolean>  {
    private String arg;
    public CheckCharacters(String arg){this.arg = arg;}
    public static CheckCharacters toThe(String arg) {return new CheckCharacters(arg); }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String TextCharacters= actor.asksFor(Text.of(WordCounterPage.COUNTER_WAndC).asString());
        String[] partsTextCharacters = TextCharacters.split(" ");

        if(partsTextCharacters[2].equals(arg)) result = true;
        else{result = false;System.out.println("ERROR DESCRIPTION :"+"\n"+"Number of characters Expected: "+ arg + ", Found: " +  partsTextCharacters[2]);}
        return result;
    }
}
