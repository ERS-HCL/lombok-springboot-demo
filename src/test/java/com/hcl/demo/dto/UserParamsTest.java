package com.hcl.demo.dto;

import com.hcl.demo.exception.UserNotFoundException;
import com.hcl.demo.service.UserService;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class UserParamsTest {

    private UserService userService = new UserService();

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    @Parameters(source = TestDataProvider.class)
    public void find_user_by_id(Integer id, Class<? extends Exception> expectedException , String name) throws UserNotFoundException {

        //setup expected exception
        if (expectedException != null) {
            thrown.expect(expectedException);
            thrown.expectMessage("ID not provided!");
        }

        assertEquals(name, userService.findById(id).getName());
    }

    // Sample test provider for parameterized tests
    public static class TestDataProvider {

        public static Object[] provideBasicData() {
            return new Object[] {
                    new Object[] { 1, null, "Jack" }
            };
        }

        public static Object[] provideEdgeCaseData() {
            return new Object[] {
                    new Object[] { null, UserNotFoundException.class, "N/A" }
            };
        }
    }
}
