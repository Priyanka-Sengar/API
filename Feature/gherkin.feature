Feature: Verify the different GET operation using Rest-Assured

Scenario: Verify one author of the post
Given I perform GET operation for "/post"
And  I perform GET for the post number "1"
Then I should see the author name as "Priyanka s"
