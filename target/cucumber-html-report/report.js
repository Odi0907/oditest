$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "Login",
  "description": "In order to perform sucessful login\nAs a user\nI want to enter correct username and password",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.scenarioOutline({
  "name": "In order to verify login to facebook",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user navigates to facebook website",
  "keyword": "Given "
});
formatter.step({
  "name": "user validates the homepage title",
  "keyword": "When "
});
formatter.step({
  "name": "user entered \"\u003cusername\u003e\" username",
  "keyword": "Then "
});
formatter.step({
  "name": "user entered \"\u003cpassword\u003e\" password",
  "keyword": "And "
});
formatter.step({
  "name": "user selected the Age Group",
  "keyword": "And ",
  "rows": [
    {
      "cells": [
        "Age",
        "Location"
      ]
    },
    {
      "cells": [
        "above 18",
        "India"
      ]
    },
    {
      "cells": [
        "below 18",
        "USA"
      ]
    }
  ]
});
formatter.step({
  "name": "user \"\u003cLogintype\u003e\" sucessfully logged in",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "Logintype"
      ]
    },
    {
      "cells": [
        "valid",
        "valid",
        "should"
      ]
    },
    {
      "cells": [
        "invalid",
        "invalid",
        "shouldnot"
      ]
    }
  ]
});
formatter.scenario({
  "name": "In order to verify login to facebook",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to facebook website",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.user_navigatesto_facebook_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates the homepage title",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStep.user_validates_the_homepage_title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user entered \"valid\" username",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.user_entered_valid_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user entered \"valid\" password",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.user_entered_valid_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selected the Age Group",
  "rows": [
    {
      "cells": [
        "Age",
        "Location"
      ]
    },
    {
      "cells": [
        "above 18",
        "India"
      ]
    },
    {
      "cells": [
        "below 18",
        "USA"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.user_selected_the_Age_Group(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user \"should\" sucessfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.user_shouldbe_sucessfully_logged_in(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "In order to verify login to facebook",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to facebook website",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.user_navigatesto_facebook_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates the homepage title",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStep.user_validates_the_homepage_title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user entered \"invalid\" username",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.user_entered_valid_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user entered \"invalid\" password",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.user_entered_valid_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selected the Age Group",
  "rows": [
    {
      "cells": [
        "Age",
        "Location"
      ]
    },
    {
      "cells": [
        "above 18",
        "India"
      ]
    },
    {
      "cells": [
        "below 18",
        "USA"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.user_selected_the_Age_Group(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user \"shouldnot\" sucessfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.user_shouldbe_sucessfully_logged_in(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/prodlogin.feature");
formatter.feature({
  "name": "Login To Production",
  "description": "  In order to perform sucessful login\n  As a user\n  I want to enter correct username and password",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@prod"
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to facebook website",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.user_navigatesto_facebook_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates the homepage title",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStep.user_validates_the_homepage_title()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "In order to verify login to facebook",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@prod"
    }
  ]
});
formatter.step({
  "name": "user entered \"valid\" username",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.user_entered_valid_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user entered \"valid\" password",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.user_entered_valid_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates the capcha",
  "keyword": "And "
});
formatter.match({
  "location": "ProdLoginStep.user_validates_the_capcha()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user \"shouldbe\" sucessfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.user_shouldbe_sucessfully_logged_in(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to facebook website",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.user_navigatesto_facebook_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates the homepage title",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStep.user_validates_the_homepage_title()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "In order to verify login to facebook",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@prod"
    }
  ]
});
formatter.step({
  "name": "user entered \"invalid\" username",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.user_entered_valid_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user entered \"invalid\" password",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.user_entered_valid_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates the capcha",
  "keyword": "And "
});
formatter.match({
  "location": "ProdLoginStep.user_validates_the_capcha()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user \"shouldnot\" sucessfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.user_shouldbe_sucessfully_logged_in(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});