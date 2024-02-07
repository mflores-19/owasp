# OWASP Juice Shop
This is a practicing automation project. The project was developed with Selenium with Java, following POM Structure. It also uses TestNG to run the test cases.
Java Faker, Data Providers and hard-coded information was used to fill the requirements.
This fake site was automated to do different actions.

**TC_001 - User registration (RegisterTest):** This test loads the site and the it goes to registration page. All required fields are filled with valid information obtained from Java Faker. When user clicks on "Register" button the registration completes successfully.

**TC_002 - Login (LoginTest):** This test loads the site and then it goes to registration page. All required fields are filled with valid information obtained from Data Providers. Then the automation goes to login page and it logs in successfully with previous information.

**TC_003 - Add new address (AddressTest):** This test loads the site and then it goes to registration page. All required fields are filled with valid hard-coded information. Then it logs in successfully and adds a new address with information obtained from Java Faker.

**TC_004 - Add payment method (PaymentTest):** This test loads the site and then it goes to registration page. All required fields are filled with valid hard-coded information. Then it logs in successfully and adds a new payment option with information obtained from Java Faker.


