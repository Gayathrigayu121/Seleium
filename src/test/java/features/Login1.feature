Feature: Leaftaps login functionality

Scenario: Test with positive credential

Given open chrome
Given load applica url 'http://leaftaps.com/opentaps/control/login'
Given entr username 'Demosalesmanager'
Given entr pwd 'crmsfa'
When click login
Then homepage displayed


#Scenario: Test with negative credential

#Given open chrome
#Given load applica url 
#Given entr username Demosalesmanager
#Given entr pwd crmsfa
#When click login
#But error displayed