Feature: To validate the Booking Functionality
Background: 
Given The user need to Book the application


Scenario: To validate the Booking functionality in Booking.com by valid Details

When The user now Select the Hotel 
And the user need to reserve the Hotel and fill all details"valid"
And The user Confirm the booking 
And The user click the cancellation btn 
Then The user receive the email"booked"