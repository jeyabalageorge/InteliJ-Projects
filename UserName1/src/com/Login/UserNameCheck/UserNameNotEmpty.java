package com.Login.UserNameCheck;

import java.util.Scanner;

/**
 * Created by Jeyabala on 12/11/2015.
 */
public class UserNameNotEmpty {

    public static void main(String[] Uname) {
        String VUname="J4amie";
        System.out.println("Enter the Username:");
        //Scanner SUname = new Scanner()
        System.out.println(VUname);
        FUnameNotEmpty(VUname);
        System.out.println("-----------------------");
        FUnameMorefive(VUname);
        System.out.println("-----------------------");
        FUnameHasNum(VUname);

    }
    public static void FUnameNotEmpty(String VUname)
    {
        if (VUname == "") System.out.println("User Name is Empty ");
        else {System.out.println("User Name is NOT Empty ");}
    }

    public static void FUnameMorefive(String VUname) {
        int Strlength;
        Strlength = VUname.length();
        if (Strlength>=5)
        System.out.println("The Username has 5 or more characters:(No of Characters printed here:)"+ Strlength);
        else
        {System.out.println("The Username is Less than 5 characters: It has ONLY :" + Strlength + "letters");}
    }

    public static void FUnameHasNum(String VUname){
        char c;
        int i,Strlength;
        Boolean presentNUM=false;
        Strlength = VUname.length();
        for(i=0;i<Strlength;i++){
            c=VUname.charAt(i);
            if (c>48 && c<58)
            {
            System.out.println("There is a Number:"+ c);
                presentNUM= true;
            }
                    }

        if (presentNUM==false){
            System.out.println("The Username has NO number!!!");

        }

    }
}
