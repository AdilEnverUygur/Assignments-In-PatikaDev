
Feature: From End-to-End payment module, test automation homework will be done
              by using chrome browser with java language in Selenium.

  @Purchase
  Scenario: User should be able to go End-to-End payment module,You do not to fill the payment screen.
    Given Go to the dashboard page
    When  Go to the Go to Clothing--> Accessories--> Women's Underwear-->Knee High Socks.
    Then  Need to verify the opened product is black
    And   Click the Add to Cart button.
    And   Click the View Cart button.
    And   Click on the Confirm Cart button.
    And   Click the Continue without registration button.
    And   Go to the mail screen
    And   The address screen appears.After creating an address,the payment screen comes up.
    And   Need to verify you are in the correct screen

