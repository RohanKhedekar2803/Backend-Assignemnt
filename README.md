## I have created Executable jar of above application download the jar run it on local machine and you are free to access the application
<br>
### Steps to Deploy application locally

<br>
1. Click on below link (it will redirect you to google drive when i have uploaded my application jar file)
   https://drive.google.com/file/d/1yTihmdcLfmay4NtLAOn6-xeHmaoO6G3p/view
<br>
2. Click on download button (PLEASE WAIT FOR 1 MINUTE it can take upto a minute depending on internert speed)
<br>
3. Click on download anyway (PLEASE WAIT FOR 2 MINUTES it can take upto a 2 minutes depending on internert speed)
<br>
4. open command prompt in downloads folder or whereever you have downloaded jar file
   Execute this command --> java -jar RohanKhedekarAssignment.jar
<br>
Application will start and you will see console logs on command prompt :)
---------------------------------------------------------------------------------------------------------------------------------------------------------------


### ALL API Endpoints

Register API URL --> http://localhost:8081/home/register <br>
Login API URL --> http://localhost:8081/home/authenticate <br>
Greets API URL --> http://localhost:8081/home/hello <br>

Extra API for Role Based Authentication   <br>
Extra API URL --> http://localhost:8081/home/adminhello <br>

---------------------------------------------------------------------------------------------------------------------------------------------------------------

Steps to access/Test application <br>
USE POSTMAN to test API's <br>

### 1.Register <br>

method - POST <br>
endpoint - http://localhost:8081/home/register <br>
request body - { <br>
    "username" : "rohan" , <br>
    "password" : "rohan123" , <br>
    "email" : "rohankhedekar2803@gmail.com" <br>
    "role" : "user" <br>
   
} <br>
request body data type-json (raw) <br>

NOTE- IF username or email is used multiple times you wont get expected output as both email & username has to be unique <br>
expected output -
{ <br>
    "token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJyb2hhbkREcmV3RHNzYWRRc1NkIiwiaWF0IjoxNzA1NzQwNDg1LCJleHAiOjE3MDU3NzY0ODV9.0AaX1yZx1LcvDjOQdaR6u7spAA-k9lvCtb6vhpQ-GiI"(Uniqueu Token) <br>
} <br>

---------------------------------------------------------------------------------------------------------------------------------------------------------------
### 2. Greeting Endpoint <br>
   
mnethod - GET <br>
endpoint - http://localhost:8081/home/hello <br>
Headers - <br>
Authorization = Bearer {JWT Token} <br>
NOTE : Copy token generated in register endpoint and paste on place on {JWT Token} <br>
<br>
expected output -Hello from GreenStitch <br>
 
---------------------------------------------------------------------------------------------------------------------------------------------------------------
### 3.Login <br>

method - POST <br>
endpoint - http://localhost:8081/home/authenticate <br>
request body - { <br>
    "username" : "rohan" , <br>
    "password" : "rohan123" <br>
} <br>
request body data type-json (raw) <br>

NOTE- IF username or password is incorrect you wont get expected output as both has to be unique <br>
expected output - <br>
{ <br>
    "token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJyb2hhbkREcmV3RHNzYWRRc1NkIiwiaWF0IjoxNzA1NzQwNDg1LCJleHAiOjE3MDU3NzY0ODV9.0AaX1yZx1LcvDjOQdaR6u7spAA-k9lvCtb6vhpQ-GiI" <br>
} <br>

---------------------------------------------------------------------------------------------------------------------------------------------------------------
### 4. Autrhorization Endpoint <br>
   
mnethod - GET <br>
endpoint - http://localhost:8081/home/adminhello <br>
Headers - <br>
Authorization = Bearer {JWT Token} <br>
NOTE : This Endpoint will not work for user role please change role to admin while regestering and try to access via jewt token generated by admin <br>
<br>
expected output - Role Based Authorization Example :) <br>

----------------------------------------------------------------------------------------------------------------------------------------------------------------

## Changes Done --> <br>
1. Used MySQL inbstead of H2 as H2 is not production ready database hence used MySQL I have created AWS RDS instance for this to showcase my AWS knowledge <br>
2. I have created Role based Authentication so admin hello is not accessible for normal user (I have kept this role feild nullable & by default user ) <br>
3. Username & Email has to be Unique for every user while registering <br>
