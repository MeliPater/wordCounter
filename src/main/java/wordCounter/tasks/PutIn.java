package wordCounter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import wordCounter.userinterface.WordCounterPage;

public class PutIn implements Task {
    private String sentence;
    public PutIn(String sentence){this.sentence = sentence;}
    public static PutIn textBox(String Sentence) {return Tasks.instrumented(PutIn.class, Sentence);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(sentence).into(WordCounterPage.INPUT_SENTENCE));
    }
}
