$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AmazonTest.feature");
formatter.feature({
  "line": 1,
  "name": "Testing Amazon website",
  "description": "",
  "id": "testing-amazon-website",
  "keyword": "Feature"
});
formatter.before({
  "duration": 18339546800,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#\t@Scenario1"
    },
    {
      "line": 4,
      "value": "#\tScenario: As a Web user I want to launch �www.amazon.com� page and validate page header"
    },
    {
      "line": 5,
      "value": "#\t    Given Web user navigate to the URL"
    },
    {
      "line": 6,
      "value": "#    \tWhen Web user check for the page header"
    },
    {
      "line": 7,
      "value": "#    \tThen Web user validate the page header is \"Amazon\""
    }
  ],
  "line": 10,
  "name": "As a Web user I click on login link and Provide incorrect username and validate error.",
  "description": "",
  "id": "testing-amazon-website;as-a-web-user-i-click-on-login-link-and-provide-incorrect-username-and-validate-error.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@Scenario2"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "Web user navigate to the URL",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "Web user type incorrect user name \"incorrect@abc.com\" and password \"12345\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "The error message should be \"We cannot find an account with that email address\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsBase.navigateURL()"
});
formatter.result({
  "duration": 5963357400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "incorrect@abc.com",
      "offset": 35
    },
    {
      "val": "12345",
      "offset": 68
    }
  ],
  "location": "StepsBase.failedLoginWithIncorrectUsername(String,String)"
});
formatter.result({
  "duration": 7028535900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "We cannot find an account with that email address",
      "offset": 29
    }
  ],
  "location": "StepsBase.validateError(String)"
});
formatter.result({
  "duration": 454998100,
  "status": "passed"
});
formatter.after({
  "duration": 18818800,
  "status": "passed"
});
});