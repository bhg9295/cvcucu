package uk.co.library.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;

public class JobSearchSteps {
    @Given("I am on  cv-library-uk page")
    public void iAmOnCvLibraryUkPage() throws InterruptedException {
      new HomePage().acceptIFrameAlert();
    }

    @When("I Enter job {string}")
    public void iEnterJob(String jobTitle) {
        new  HomePage().enterJobTitle(jobTitle);
    }

    @And("I enter location  {string}")
    public void iEnterLocation(String location ) {
        new  HomePage().enterTheLocation(location);
    }

    @And("I Select distance {string}")
    public void iSelectDistance(String distance) {
        new  HomePage().selectTheDistance(distance);
    }

    @And("I click on more Search Options")
    public void iClickOnMoreSearchOptions() {
        new  HomePage().clickOnTheSearchOptionLink();
    }

    @And("I enter salary {string}")
    public void iEnterSalary(String salaryMin) {
        new  HomePage().enterTheMinimumSalary(salaryMin);
    }

    @And("I enter  {string}")
    public void iEnter(String salaryMax) {
        new  HomePage().enterTheMaximumSalary(salaryMax);
    }

    @And("I select salarytype {string}")
    public void iSelectSalarytype(String salaryType) {
        new    HomePage().salaryTypeSelect(salaryType);
    }

    @And("I select jpb type{string}")
    public void iSelectJpbType(String jobType) {
        new   HomePage().jobTypeSelect(jobType);
    }

    @And("I click on find jobs button")
    public void iClickOnFindJobsButton() {
        new    HomePage().clickOnTheFindBtn();
    }

    @Then("I verify the {string}")
    public void iVerifyThe(String result) {
        new ResultPage().verifyTheResults(result);
    }
}