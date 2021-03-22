package com.aws.codestar.projecttemplates.controller;

import org.json.JSONObject;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Tests for {@link UserControllerTest}. Modify the tests in order to support your use case as you build your project.
 */
@DisplayName("Tests for HelloWorldController")
class UserControllerTest {

    private static final String INPUT_NAME = "Dummy Name";
    private static final String INPUT_BUILDING = "Dummy Building";
    private static final String EXPECTED_RESPONSE_VALUE = "SUCCESS AddUser";



    private final UserController controller = new UserController();

    /**
     * Initializing variables before we run the tests.
     * Use @BeforeAll for initializing static variables at the start of the test class execution.
     * Use @BeforeEach for initializing variables before each test is run.
     */
    @BeforeAll
    static void setup() {
        // Use as needed.
    }

    /**
     * De-initializing variables after we run the tests.
     * Use @AfterAll for de-initializing static variables at the end of the test class execution.
     * Use @AfterEach for de-initializing variables at the end of each test.
     */
    @AfterAll
    static void tearDown() {
        // Use as needed.
    }

    /**
     * Basic test to verify the result obtained when calling {@link UserController#AddUser} successfully.

    @Test
    @DisplayName("Basic test for GET request")
    void AddUser() {

        ResponseEntity responseEntity = controller.AddUser(INPUT_NAME,INPUT_BUILDING);

        // Verify the response obtained matches the values we expect.
        JSONObject jsonObjectFromResponse = new JSONObject(responseEntity.getBody().toString());
        assertEquals(EXPECTED_RESPONSE_VALUE, jsonObjectFromResponse.get("Output"));
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
    }
 */

}