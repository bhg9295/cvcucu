@regression
Feature: JobSearchTest
  As user I want search  Job  Test in cv library
    @sanity
  Scenario Outline: As A user VerifyJobSearchResultUsingDifferentDataSet
    Given I am on  cv-library-uk page
    When I Enter job "<jobTitle>"
    And I enter location  "<location>"
    And I Select distance "<distance>"
    And  I click on more Search Options
    And  I enter salary "<salaryMin>"
    And  I enter  "<salaryMax>"
    And  I select salarytype "<salaryType>"
    And I select jpb type"<jobType>"
    And I click on find jobs button
    Then I verify the "<result>"
    Examples:
      | jobTitle           | location                         | distance  | salaryMin | salaryMax | salaryType | jobType   | result                                      |
      | Tester             | Harrow                           | 5 miles   | 30000     | 500000    | Per annum  | Permanent | Permanent Tester jobs in Harrow on the Hill |
      | Software           | Pitsea, Essex                    | 15 miles  | 35000     | 550000    | Per annum  | Permanent | Permanent Software jobs in Pitsea           |
      | Manager            | Ilford, Greater London           | 2 miles   | 35000     | 550000    | Per annum  | Permanent | Permanent Manager jobs in Ilford            |
      | Bookkeeper         | Bishops Hatfield                 | 10 miles  | 35000     | 550000    | Per annum  | Permanent | Permanent Bookkeeper jobs in Hatfield       |
      | Sales Manager      | Lincoln, Lincolnshire            | 15 miles  | 35000     | 550000    | Per annum  | Permanent | Permanent Sales Manager jobs in Lincoln     |
      | Software Developer | Kingswood, South Gloucestershire | 100 miles | 35000     | 550000    | Per annum  | Permanent | Permanent Software Developer jobs in Kingswood |
