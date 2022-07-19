Feature: Feature to test functionality of google
		@CapGemini
    Scenario: Check google search with Chrome
      Given user is on google page
      When user searches for search
      Then user closes the browser

		@Accenture
    Scenario: Check google search with Mozilla
      Given user is on google page
      When user searches for search
      Then user closes the browser