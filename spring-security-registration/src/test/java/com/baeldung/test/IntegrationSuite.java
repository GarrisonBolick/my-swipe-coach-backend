package com.baeldung.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.baeldung.test.TokenExpirationIntegrationTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ // @formatter:off
    ChangePasswordIntegrationTest.class,
    DeviceServiceIntegrationTest.class,
    TokenExpirationIntegrationTest.class,
    RegistrationControllerIntegrationTest.class,
    GetLoggedUsersIntegrationTest.class,
    UserServiceIntegrationTest.class,
    UserIntegrationTest.class,
    SpringSecurityRolesIntegrationTest.class,
    LocalizationIntegrationTest.class
})// @formatter:on
public class IntegrationSuite {
  //
}
