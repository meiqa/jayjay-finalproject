\# Final Project



\## Project Information

* Java JDK 21
* Google Chrome
* Gradle



\## Framework \& Tools in this Project

* Cucumber
* Gradle
* Java
* Selenium



\----



\## API Testing



\### API Under Test

https://dummyapi.io/data/v1/



\### Test Scenarios

1. Get User List
2. Get User by ID
3. Create New User
4. Update Existing User
5. Delete Non-Existing User
6. Get List of Tags



\### Test Report Results

1. reports/api-report.html
2. reports/api-report.json



\---



\## Web UI Testing



\### Website Under Test

https://www.demoblaze.com/



\### Test Scenarios

1. Sign Up with Existing User
2. Login with Valid Username and Password
3. Login with Valid Username and Wrong Password
4. Login with Invalid Username and Password
5. Logout Current User
6. Add Product to Cart



\### Test Report Results

1. reports/ui-report.html
2. reports/ui-report.json



\---



\## Run Tests



\### API \& Web UI

./gradlew cucumber



\### API

./gradlew cucumber -Ptags=@api



\### Web UI

./gradlew cucumber -Ptags=@web



\---



\## Author

Mei

