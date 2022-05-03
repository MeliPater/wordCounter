package wordCounter.stepdefinitions;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import wordCounter.questions.*;
import wordCounter.tasks.OpenUp;
import wordCounter.tasks.PutIn;

public class StepDefinitionsWordCounter {
    @Before
    public void setStage() { OnStage.setTheStage(new OnlineCast());}
    @Given("access to the WordCounter page")
    public void access_to_the_word_counter_page() {
        OnStage.theActorCalled("UserStandard").wasAbleTo(OpenUp.thePage());
    }
    @When("insert the sentence {string}")
    public void insert_the_sentence(String sentence) {
        OnStage.theActorInTheSpotlight().attemptsTo(PutIn.textBox(sentence));
    }
    @Then("the number of words must be {string}")
    public void theNumberOfWordsMustBe(String arg) throws InterruptedException{
        Thread.sleep(500);
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CheckWord.toThe(arg)));
    }
    @Then("the number of characters must be {string}")
    public void theNumberOfCharactersMustBe(String arg) throws InterruptedException{
        Thread.sleep(500);
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CheckCharacters.toThe(arg)));
    }
    @Then("the most repeated first word must be {string}")
    public void theMostRepeatedFirstWordMustBe(String arg1) throws InterruptedException{
        Thread.sleep(500);
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CheckKeywordDensityFirst.toThe(arg1)));
    }
    @Then("the second most repeated word must be {string}")
    public void theSecondMostRepeatedWordMustBe(String arg2) throws InterruptedException{
        Thread.sleep(500);
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CheckKeywordDensitySecond.toThe(arg2)));
    }
    @Then("the third most repeated word must be {string}")
    public void theThirdMostRepeatedWordMustBe(String arg3) throws InterruptedException{
        Thread.sleep(500);
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CheckKeywordDensityThird.toThe(arg3)));
    }
}
