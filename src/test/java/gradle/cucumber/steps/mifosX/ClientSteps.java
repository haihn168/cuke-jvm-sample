package gradle.cucumber.steps.mifosX;

import businessLayer.mifosX.Client;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

public class ClientSteps {
    @Given("^I create a new client \"([^\"]*)\", \"([^\"]*)\"$")
    public void I_create_a_new_client_(String firstName, String lastName) throws Throwable {
        Client client = new Client();
        client.createClient(firstName,lastName);
    }
}