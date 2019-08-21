$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/AddCustomer.feature");
formatter.feature({
  "name": "Telecome feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Smoke,"
    },
    {
      "name": "@Sanity"
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
  "name": "User click on add customer",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.user_click_on_add_customer()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "add customer flow",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke,"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "user is filling all the fields",
  "rows": [
    {
      "cells": [
        "kunal",
        "kumar",
        "kunalkumar90981@gmailcom",
        "chennai",
        "8608628990"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerSteps.user_is_filling_all_the_fields1(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on submit button.",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.user_click_on_submit_button()"
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
  "name": "User click on add customer",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.user_click_on_add_customer()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "add customer flow",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke,"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "user is filling all the fields.",
  "rows": [
    {
      "cells": [
        "fname",
        "kunal"
      ]
    },
    {
      "cells": [
        "lname",
        "Kumar"
      ]
    },
    {
      "cells": [
        "email",
        "Kumarkunal@gmail.com"
      ]
    },
    {
      "cells": [
        "address",
        "Salem"
      ]
    },
    {
      "cells": [
        "phone",
        "1234567890"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerSteps.user_is_filling_all_the_fields2(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on submit button.",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.user_click_on_submit_button()"
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
  "name": "User click on add customer",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.user_click_on_add_customer()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add customer flow",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke,"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "user is filling details in all the fields",
  "rows": [
    {
      "cells": [
        "Kunal",
        "Kumar",
        "Kumarkunal@gmail.com",
        "Salem",
        "1234567890"
      ]
    },
    {
      "cells": [
        "Pari",
        "parashar",
        "pari001@gmail.com",
        "Thirupur",
        "4567890123"
      ]
    },
    {
      "cells": [
        "Ramesh",
        "Kumar",
        "RameshRaj@gmail.com",
        "Erode",
        "5678901234"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerSteps.user_is_filling_details_in_all_the_fields(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on submit button.",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.user_click_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/AddTariff.feature");
formatter.feature({
  "name": "Tarrif plan",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Smoke,"
    },
    {
      "name": "@Sanity"
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
  "name": "User click on add tarrif",
  "keyword": "And "
});
formatter.match({
  "location": "AddTarrifSteps.user_click_on_add_tarrif()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add Tariff Details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke,"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "user is filling all the fields one dimension list",
  "rows": [
    {
      "cells": [
        "250",
        "150",
        "60",
        "200",
        "1",
        "5",
        "3"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddTarrifSteps.user_is_filling_all_the_fields_one_dimension_list(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on submit",
  "keyword": "And "
});
formatter.match({
  "location": "AddTarrifSteps.user_click_on_submit()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});