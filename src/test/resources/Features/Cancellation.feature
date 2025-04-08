Feature: to valid the cancellation Functionalities

Scenario: To valid the cancellation in Booking.com
Given The user need to Book the application
When The user now Select the Hotel 
And the user need to reserve the Hotel and fill all details
And The user Confirm the booking 
And The user click the cancellation btn 
Then The user receive the cancellation Message or email