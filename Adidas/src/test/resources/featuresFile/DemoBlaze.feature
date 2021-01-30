Feature: Demo Blaze automation

Scenario: Navigating through products and add/delete from cart
    Given Demo Blaze page is launched showing all products
    When Navigate to Laptop and add to cart
    When Repeat above step for another product
    When Navigate to cart and delete second item
    When Click on Place order
    When Fill in all details and click Purchase
    Then Capture logs (purchase ID and amount) and assert purchase amount
	