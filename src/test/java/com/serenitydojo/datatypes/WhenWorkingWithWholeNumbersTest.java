package com.serenitydojo.datatypes;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class WhenWorkingWithWholeNumbersTest {
    @Test
    public void addingNumbersTogether() {
        int initialYear = 1985;
        int targetYear;
        int timeJump = 30;
        targetYear = initialYear + timeJump;

        // TODO: create a new int variable called timeJump and assign it a value
        //  Next, add this variable to initialYear and assign the result to targetYear, so that targetYear is equal to 2015

        assertThat(targetYear, equalTo(2015));
    }
}
