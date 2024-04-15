Feature:  Google search

  Scenario: simple google search
    Given Google page open in browser
    When the search phase "Harry Potter" is enterd
    Then result shown