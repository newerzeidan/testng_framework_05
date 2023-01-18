package testng_knowledge;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_Priority_and_Dependency {

    @Test()
    public void login(){
        Assert.fail();
        System.out.println("This is login");
    }

    @Test(dependsOnMethods = "login")
    public void logout(){
        System.out.println("This is logout");
    }

    @Test(dependsOnMethods = "logout")
    public void forgotPassword(){
        System.out.println("This is forgot password");
    }

    @Test(dependsOnMethods = "forgotPassword")
    public void invalidLogin(){
        System.out.println("This is invalid login");
    }
}