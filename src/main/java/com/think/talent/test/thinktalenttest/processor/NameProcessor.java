package com.think.talent.test.thinktalenttest.processor;
public class NameProcessor {

    public String getNameToDisplay(String firstName, String middleName, String lastName){


        if(firstName != null && !"".equals(firstName)) firstName=firstName.substring(0,1).toUpperCase()+" ";
        if(middleName != null && !"".equals(middleName)) middleName=middleName.substring(0,1).toUpperCase()+" ";
        if(lastName != null && !"".equals(lastName)) lastName=lastName.toUpperCase();

        if(middleName != null || !"".equals(middleName)) {
            return firstName+middleName+lastName;
        }else{
            return firstName+lastName;
        }
    }
}
