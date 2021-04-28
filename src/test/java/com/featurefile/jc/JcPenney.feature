Feature: Jcpenney Shopping Automation Demo

@Smoketest
Scenario: HomePage of JC Penney

Given User Launch The Application
When User Scroll Down To The Outdoor Furniture
Then User click On The Outdoor Furniture

@Sanitytest
Scenario: Dress Mens Shopping

When User Scroll To Select The Dress
Then User Select The Dress And It Navigates To Shopping Page

@Sanitytest
Scenario: Mens Dress Size And Quantity Selection

When User Select The Chest Size Of The Dress
And User Select The Quantity Of The Dress
And User Select The Pant Size
And User Select The Quantity Of The Pant
And User Select The Vest Size Of The Dress
And User Select The Quantity Of Vest
Then User Click On the Add To Cart Button

@Sanitytest
Scenario: Purchase Proceed Page
Then User Proceed To Purchase

@Sanitytest
Scenario: Proceed To Checkout Page

When User Click The Coupon To Get Discount
And User Enter The Coupon Code In the Coupon Text Box
And User Check The Charity Checkbox
Then User Checkout To Payment Page