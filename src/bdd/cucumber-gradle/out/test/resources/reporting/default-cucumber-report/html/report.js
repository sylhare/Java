$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/resources/features/belly.feature");
formatter.feature({
  "name": "Belly",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Belly is empty",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.I_have_an_empty_belly()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "There are 0 \"cucumbers\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.there_are_x_things(int,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "001 - A few cakes in an hour",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have 42 cakes in my belly",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.I_have_cakes_in_my_belly(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I wait 1 hour",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_wait_x_hours(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "My belly should growl",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.Is_belly_growling()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Belly is empty",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.I_have_an_empty_belly()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "There are 0 \"cucumbers\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.there_are_x_things(int,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "002 - Many cakes in an hour",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have 100 cakes in my belly",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.I_have_cakes_in_my_belly(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I wait 0 hour",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_wait_x_hours(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "My belly should not growl",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.Is_belly_not_growling()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "003 - Eating cucumbers",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "There are \u003cstart\u003e \"cucumbers\"",
  "keyword": "Given "
});
formatter.step({
  "name": "I eat \u003ceat\u003e \"cucumbers\"",
  "keyword": "When "
});
formatter.step({
  "name": "I should have \u003cleft\u003e \"cucumbers\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "start",
        "eat",
        "left"
      ]
    },
    {
      "cells": [
        "12",
        "5",
        "7"
      ]
    },
    {
      "cells": [
        "20",
        "5",
        "15"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Belly is empty",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.I_have_an_empty_belly()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "There are 0 \"cucumbers\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.there_are_x_things(int,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "003 - Eating cucumbers",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "There are 12 \"cucumbers\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.there_are_x_things(int,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I eat 5 \"cucumbers\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_eat_x_cucumbers(int,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should have 7 \"cucumbers\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_have_x_cucumbers_left(int,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Belly is empty",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.I_have_an_empty_belly()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "There are 0 \"cucumbers\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.there_are_x_things(int,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "003 - Eating cucumbers",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "There are 20 \"cucumbers\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.there_are_x_things(int,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I eat 5 \"cucumbers\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_eat_x_cucumbers(int,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should have 15 \"cucumbers\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_have_x_cucumbers_left(int,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Belly is empty",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.I_have_an_empty_belly()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "There are 0 \"cucumbers\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.there_are_x_things(int,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "004",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I eat 6 \"cucumbers\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.I_eat_x_cucumbers(int,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I wait 1 hour",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_wait_x_hours(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have 50 cakes in my belly",
  "keyword": "But "
});
formatter.match({
  "location": "Steps.I_have_cakes_in_my_belly(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "My belly should not growl",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.Is_belly_not_growling()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});