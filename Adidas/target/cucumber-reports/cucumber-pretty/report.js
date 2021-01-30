$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DemoBlaze.feature");
formatter.feature({
  "line": 1,
  "name": "Demo Blaze automation",
  "description": "",
  "id": "demo-blaze-automation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Navigating through products and add/delete from cart",
  "description": "",
  "id": "demo-blaze-automation;navigating-through-products-and-add/delete-from-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Demo Blaze page is launched showing all products",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Navigate to Laptop and add to cart",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Repeat above step for another product",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Navigate to cart and delete second item",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Click on Place order",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Fill in all details and click Purchase",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Capture logs (purchase ID and amount) and assert purchase amount",
  "keyword": "Then "
});
formatter.match({
  "location": "Cart_Check_Step.demo_Blaze_page_is_launched_showing_all_products()"
});
formatter.result({
  "duration": 11027839500,
  "status": "passed"
});
formatter.match({
  "location": "Cart_Check_Step.navigate_to_Laptop_and_add_to_cart()"
});
formatter.result({
  "duration": 5822371400,
  "status": "passed"
});
formatter.match({
  "location": "Cart_Check_Step.repeat_above_step_for_another_product()"
});
formatter.result({
  "duration": 2574313400,
  "status": "passed"
});
formatter.match({
  "location": "Cart_Check_Step.navigate_to_cart_and_delete_second_item()"
});
formatter.result({
  "duration": 8018857900,
  "status": "passed"
});
formatter.match({
  "location": "Cart_Check_Step.click_on_Place_order()"
});
formatter.result({
  "duration": 3217741900,
  "status": "passed"
});
formatter.match({
  "location": "Cart_Check_Step.fill_in_all_details_and_click_Purchase()"
});
formatter.result({
  "duration": 755139200,
  "status": "passed"
});
formatter.match({
  "location": "Cart_Check_Step.capture_logs_purchase_ID_and_amount_and_assert_purchase_amount()"
});
formatter.result({
  "duration": 125521600,
  "status": "passed"
});
});