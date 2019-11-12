$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Uma-Hari/eclipse-workspace/Cucumber/src/test/java/Loginfeature/Login.feature");
formatter.feature({
  "line": 1,
  "name": "This is my New Project",
  "description": "",
  "id": "this-is-my-new-project",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "The User enter into Facebook with the help of login and password",
  "description": "",
  "id": "this-is-my-new-project;the-user-enter-into-facebook-with-the-help-of-login-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "the user is in facebook page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "the user enters the login and password in the text box",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "the user clicks the login button",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "the user enter into facebook page and verify the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionClass.the_user_is_in_facebook_page()"
});
formatter.result({
  "duration": 22189589700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionClass.the_user_enters_the_login_and_password_in_the_text_box()"
});
formatter.result({
  "duration": 1072154600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionClass.the_user_clicks_the_login_button()"
});
formatter.result({
  "duration": 2683968600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionClass.the_user_enter_into_facebook_page_and_verify_the_home_page()"
});
formatter.result({
  "duration": 39961600,
  "status": "passed"
});
});