package com.herokuapp.the_internet.pages;

import com.herokuapp.the_internet.utility.Utility;
import org.openqa.selenium.By;

public class Login extends Utility {
    By usernameLink=By.xpath("//input[@id='username']");
    By passwordLink=By.xpath("//input[@id='password']");
    By LoginLink=By.xpath("//i[contains(text(),'Login')]");
    By securemessageLink=By.xpath("//body/div[2]/div[1]/div[1]/h2[1]");
    By usernameerrorMsg=By.id("flash");
    By passwordErrorMsg=By.id("flash");
    public void username(String textUsername){
        sendTextToElement(usernameLink,textUsername);
    }
    public void password(String textpassword){
        sendTextToElement(passwordLink,textpassword);
    }
    public void login(){
        clickOnElement(LoginLink);
    }
    public String message(){
        return getTextFromElement(securemessageLink);
    }
    public String usernameerrorMessage(){
        return getTextFromElement(usernameerrorMsg);
    }
    public String passworderrorMessage(){
        return getTextFromElement(passwordErrorMsg);
    }
}
