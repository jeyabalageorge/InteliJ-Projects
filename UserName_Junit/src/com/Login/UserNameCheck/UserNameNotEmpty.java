package com.Login.UserNameCheck;
import org.junit.*;
import java.util.Scanner;
import java.lang.annotation.*;
import java.lang.Boolean;

import static java.lang.System.*;
import static org.junit.Assert.*;

/**
 * Created by Jeyabala on 12/11/2015.
 */
public class UserNameNotEmpty {

    /*public void FInit() {
        String VUname = "J4amie";
        System.out.println("Enter the Username:");
        //Scanner SUname = new Scanner()
        System.out.println(VUname);
        FUnameNotEmpty(VUname);
        System.out.println("-----------------------");
        FUnameMorefive(VUname);
        System.out.println("-----------------------");
        FUnameHasNum(VUname);
    }
*/

    @Test
    public void FUnameNotEmpty()
    {
        String VUname = "J4amie";
        //assertEquals("Is Equal",VUname,"J4amie");
        assertNotNull(VUname);

        //if (VUname == "") System.out.println("User Name is Empty ");
        //else {System.out.println("User Name is NOT Empty ");}

    }

    @Test
    public void FUnameMorefive() {
        String VUname1 = "J4amie";
        int Strlength;
        Strlength = VUname1.length();
        assertTrue (Strlength >=5);
        /*if (Strlength>=5)
        out.println("The Username has 5 or more characters:(No of Characters printed here:)"+ Strlength);
        else
        {
            out.println("The Username is Less than 5 characters: It has ONLY :" + Strlength + "letters");}
        */
    }
    @Test
    public void FUnameHasNum() {
        String VUname = "Jamie";
        char c;
        int i, Strlength;
        Boolean presentNUM = false;
        Strlength = VUname.length();
        for (i = 0; i < Strlength; i++) {
            c = VUname.charAt(i);
            assertFalse(c > 48 && c<58);
            presentNUM = true;
            /*if (c > 48 && c < 58) {
                System.out.println("There is a Number:" + c);
                presentNUM = true;
            }
            */
        }

        if (presentNUM == false) {
            out.println("The Username has NO number!!!");

        }

    }
}
