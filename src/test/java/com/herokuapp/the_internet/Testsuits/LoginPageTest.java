package com.herokuapp.the_internet.Testsuits;

import com.herokuapp.the_internet.pages.Login;
import com.herokuapp.the_internet.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    Login login = new Login();

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        login.username("tomsmith");
        login.password("SuperSecretPassword!");
        login.login();
        String expectedresult = "Secure Area";
        String actualresult = login.message();
        Assert.assertEquals(actualresult, expectedresult, "");
    }

    @Test
    public void verifyTheUsernameErrorMessage() {
        login.username("tomsmith1");
        login.password("SuperSecretPassword");
        login.login();
        String expectedresult = "Your username is invalid!\n" +
                "×";
        String actualresult = login.usernameerrorMessage();
        Assert.assertEquals(actualresult, expectedresult, "");
    }
@Test
    public void verifyThePasswordErrorMessage() {
        login.username("tomsmith");
        login.password("SuperSecretPassword");
        login.login();
        String expectedresult = "Your password is invalid!\n" +
"×";
        String actualresult = login.usernameerrorMessage();
        System.out.println(actualresult);
        Assert.assertEquals(actualresult, expectedresult, "");
    }
}
