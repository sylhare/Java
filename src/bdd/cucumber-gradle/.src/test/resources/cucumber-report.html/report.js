$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/resources/features/belly.feature");
formatter.feature({
  "name": "Belly",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "001 - A few cakes in an hour",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
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
  "name": "my belly should growl",
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
formatter.scenario({
  "name": "002 - A few cakes in half an hour",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
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
  "name": "my belly should not growl",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
});