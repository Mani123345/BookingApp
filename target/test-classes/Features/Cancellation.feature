Feature: to valid the cancellation Functionalities
Background:
Given The user need to Book the application

Scenario: To validate the cancellation functionality in Booking.com by valid Details

When The user now Select the Hotel 
And the user need to reserve the Hotel and fill all details"valid"
And The user Confirm the booking  
Then The user receive the email"cancelled"

@smoke
Scenario: To validate the cancellation functionality in Booking.com by invalid Details

When The user now Select the Hotel 
And the user need to reserve the Hotel and fill all details"invalid"
Then The user receive the Error Message


