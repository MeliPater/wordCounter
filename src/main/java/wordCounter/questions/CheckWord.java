package wordCounter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import wordCounter.userinterface.WordCounterPage;

public class CheckWord implements Question<Boolean>  {
    private String arg;
    public CheckWord(String arg){this.arg = arg;}
    public static CheckWord toThe(String arg) {return new CheckWord(arg); }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String TextWord = actor.asksFor(Text.of(WordCounterPage.COUNTER_WAndC).asString());
        String[] partsTextWord = TextWord.split(" ");

        if(partsTextWord[0].equals(arg)) result = true;
        else{result = false;System.out.println("ERROR DESCRIPTION :"+"\n"+"Number of words expected: "+ arg + ", Found: " +  partsTextWord[0]);}
        return result;
    }
}
