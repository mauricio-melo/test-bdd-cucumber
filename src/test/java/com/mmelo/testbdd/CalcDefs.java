package com.mmelo.testbdd;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import io.restassured.response.Response;
import org.junit.Ignore;
import org.springframework.http.HttpStatus;

import static com.mmelo.testbdd.CalculatorController.CALCULATOR_ENDPOINT;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

@Ignore
public class CalcDefs extends BaseIntegrationTest {

    int value1 = 0;
    int value2 = 0;
    int response = 0;

    @Dado("os valores sejam {int} e {int}")
    public void dadoQueOsValoresSejam(final int value1, final int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    @Quando("o cliente chama o endpoint da {string}")
    public void theClientCallsSub(final String operation) {
        final Response response = given()
                .param("a", this.value1)
                .param("b", this.value2)
                .when()
                .get(URL + CALCULATOR_ENDPOINT + "/" + operation)
                .andReturn();

        if (response.getStatusCode() == HttpStatus.OK.value()) {
            this.response = Integer.parseInt(response.getBody().asString());
        }
    }

    @Entao("o retorno deve ser {int}")
    public void theClientReceivesAnswerAs(final int result) {
        assertEquals(result, response);
    }

}
