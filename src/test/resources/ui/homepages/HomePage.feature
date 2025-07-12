#Step (login folder) -> step definition (java) login
@ui @Login
Feature: Test login
    Scenario: Test loading login page122
        Given I opened chrome browser
            When I go to opencart login page
                Then I see login page

    @Login_OK @regression @smoke
    Scenario: Test loading login page 222
        Given I opened chrome browser
        When I go to opencart login page
        Then I see login page
    @Login_NO
    Scenario: Test loading login page 322
        Given I opened chrome browser
        When I go to opencart login page
        Then I see login page