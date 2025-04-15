$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Cancellation.feature");
formatter.feature({
  "name": "to valid the cancellation Functionalities",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To valid the cancellation in Booking.com",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user need to Book the application",
  "keyword": "Given "
});
formatter.match({
  "location": "CancellationStep.the_user_need_to_Book_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user now Select the Hotel",
  "keyword": "When "
});
formatter.match({
  "location": "CancellationStep.the_user_now_Select_the_Hotel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user need to reserve the Hotel and fill all details",
  "keyword": "And "
});
formatter.match({
  "location": "CancellationStep.the_user_need_to_reserve_the_Hotel_and_fill_all_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user Confirm the booking",
  "keyword": "And "
});
formatter.match({
  "location": "CancellationStep.the_user_Confirm_the_booking()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click the cancellation btn",
  "keyword": "And "
});
formatter.match({
  "location": "CancellationStep.the_user_click_the_cancellation_btn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user receive the cancellation Message or email",
  "keyword": "Then "
});
formatter.match({
  "location": "CancellationStep.the_user_receive_the_cancellation_Message_or_email()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "error_message": "cucumber.runtime.CucumberException: When a hook declares an argument it must be of type io.cucumber.core.api.Scenario. public void org.stepdefinition.Hooks.after(gherkin.ast.Scenario) throws java.io.IOException\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:58)\r\n\tat cucumber.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:16)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:50)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:50)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:144)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:174)\r\n\tat org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:93)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:40)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:529)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:757)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:452)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\r\n",
  "status": "failed"
});
});