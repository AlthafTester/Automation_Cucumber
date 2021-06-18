Feature: Dress Purchase In Automation Practice Website

Scenario: Home Page
Given : user Launch The Application
Then : user Click On The Signin Button And It Navigate To The Signin Page

Scenario: Signin Page
When : user Enter The "test2506@gmail.com" In Email Address Field
And : user Enter The "althaf$$$" in Password Field
Then : user Click On The SignIn Button And It Navigate To The Dress Selection Field

Scenario: Dress Selection
When : user Use The Mouse And Mouseover To The Women Section
Then : user Click On the Tshirt Icon And It Navigate TO The Sub Categories Page

Scenario: Sub Categories Page
When : user Scroll Down To See Varieties Of Dress
Then : user Click On The Quick View Options On the Dress That User Liked and It Navigate To The Customize Page

Scenario: Customize Page
When : user Enter The Quantity Of Dress In Quantity Field
And : user On The Plus Button To Increase Quantity Of Dress
And : user Select The Size Of The Dress In Size Dropdown
And : user Click On The Blue Colour Button For Choosing Colour
And : user Click On The Thumb Icon To See Complete Image Of Dress
Then : User Click On The Add To Cart Button And It Navigate To The Proceed To Check Out PopUp

Scenario: Proceed To Checkout
Then : user Click On The Proceed To Checkout And It Navigate To The Shopping Cart Summary Page

Scenario: Shopping Cart Summary 
When : user Click On The Plus Button To Increase Quantity Of Dress
And : user Scroll Down To The Bottom Of The Page
Then : user Click On The Proceed To Checkout Button And It Move To The Delivery Address Page

Scenario: Delivery Address
When : user Scroll Down To The Bottom Of The Page
And : User Click On The Proceed To Checkout Button And It Navigate To The Shipping Page

Scenario: Shipping Page
When : user Click On The Read The Terms Of Service Icon And It Open Small Popup
And : user Click On The Cross Icon To Close That Window
And : user Click On The Radio Button To Accept Condition
And : user Scroll Down To The Bottom Of Page
Then : user Click On Proceed To Checkout Button And It Navigate To The Choose Payment Page

Scenario: Choose Payment Page
When : user Scroll Down To The Bottom Of The Page
Then : user Click On The Pay By Check Button And It Navigate To The Check Payment Page

Scenario: Check Payment 
When : user Scroll Down To The Bottom Of The Page
Then : user Click On I Confirm My Order Button And It Navigates To The Order Confirmation Page

Scenario: Order Confirmation Page
When : user Scroll Down To The See Details Of Order
Then : user Take Screenshot Of That Page