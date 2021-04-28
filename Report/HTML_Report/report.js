$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("JcPenney.feature");
formatter.feature({
  "line": 1,
  "name": "Jcpenney Shopping Automation Demo",
  "description": "",
  "id": "jcpenney-shopping-automation-demo",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "HomePage of JC Penney",
  "description": "",
  "id": "jcpenney-shopping-automation-demo;homepage-of-jc-penney",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User Scroll Down To The Outdoor Furniture",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User click On The Outdoor Furniture",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 6615640700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Scroll_Down_To_The_Outdoor_Furniture()"
});
formatter.result({
  "duration": 204072600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_On_The_Outdoor_Furniture()"
});
formatter.result({
  "duration": 6653948800,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Dress Mens Shopping",
  "description": "",
  "id": "jcpenney-shopping-automation-demo;dress-mens-shopping",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@Sanitytest"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "User Scroll To Select The Dress",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User Select The Dress And It Navigates To Shopping Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Scroll_To_Select_The_Dress()"
});
formatter.result({
  "duration": 1842558301,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Dress_And_It_Navigates_To_Shopping_Page()"
});
formatter.result({
  "duration": 4091983800,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Mens Dress Size And Quantity Selection",
  "description": "",
  "id": "jcpenney-shopping-automation-demo;mens-dress-size-and-quantity-selection",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@Sanitytest"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "User Select The Chest Size Of The Dress",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "User Select The Quantity Of The Dress",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User Select The Pant Size",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User Select The Quantity Of The Pant",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User Select The Vest Size Of The Dress",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User Select The Quantity Of Vest",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User Click On the Add To Cart Button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Chest_Size_Of_The_Dress()"
});
formatter.result({
  "duration": 350258299,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Quantity_Of_The_Dress()"
});
formatter.result({
  "duration": 415523901,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Pant_Size()"
});
formatter.result({
  "duration": 263777200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Quantity_Of_The_Pant()"
});
formatter.result({
  "duration": 181082699,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Vest_Size_Of_The_Dress()"
});
formatter.result({
  "duration": 184565500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Quantity_Of_Vest()"
});
formatter.result({
  "duration": 194256101,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_On_the_Add_To_Cart_Button()"
});
formatter.result({
  "duration": 232563500,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Purchase Proceed Page",
  "description": "",
  "id": "jcpenney-shopping-automation-demo;purchase-proceed-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@Sanitytest"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "User Proceed To Purchase",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Proceed_To_Purchase()"
});
formatter.result({
  "duration": 9639973700,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Proceed To Checkout Page",
  "description": "",
  "id": "jcpenney-shopping-automation-demo;proceed-to-checkout-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 31,
      "name": "@Sanitytest"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "User Click The Coupon To Get Discount",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "User Enter The Coupon Code In the Coupon Text Box",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "User Check The Charity Checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "User Checkout To Payment Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Coupon_To_Get_Discount()"
});
formatter.result({
  "duration": 620500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Coupon_Code_In_the_Coupon_Text_Box()"
});
formatter.result({
  "duration": 326217601,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Check_The_Charity_Checkbox()"
});
formatter.result({
  "duration": 1069627300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Checkout_To_Payment_Page()"
});
formatter.result({
  "duration": 1741081201,
  "status": "passed"
});
});