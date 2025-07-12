#Step (login folder) -> step definition (java) login
@ui @Login
Feature: Test login
    Scenario: Test loading login page
        Given I opened chrome browser
            When I go to opencart login page
                Then I see login page

    @Login_OK
    Scenario: Test loading login page 2
        Given I opened chrome browser
        When I go to opencart login page
        Then I see login page
    @Login_NO
    Scenario: Test loading login page 3
        Given I opened chrome browser
        When I go to opencart login page
        Then I see login page