
Feature: As a user I want to successfully fully onboard
	@Android
	Scenario: As a user I should see the ‘Check your email’ screen
		Given user launches the app successfully (and the introductory screen displays)
		And user taps on ‘Get Started’
		And ‘I accept the Terms of Service’ is selected
		And when ‘What’s your email address’ screen displays
		When user adds an "email" of a valid format and taps on Continue
		Then check your email screen displays

