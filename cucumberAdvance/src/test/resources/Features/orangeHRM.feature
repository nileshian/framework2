#Please visit https://opensource-demo.orangehrmlive.com/index.php/dashboard

Feature: Test Orange HRM website
#in below two scenario Step 1 is common, use background for same 

Scenario 1:

Step 1:login using userid: Admin and Password: admin123
Step 2: Goto admin> user Managment > users > Verify "User Role" column is present
Step 3: Search for user bhavana and priyanka using "data table"
Step 4: logout and close browser


Scenario 2:

Step 1:login using userid: Admin and Password: admin123
Step 2: Goto Leave> My Leave > Verify "Employee Name" column is present
Step 3: logout and close browser



