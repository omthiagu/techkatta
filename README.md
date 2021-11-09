# TechnicalKatta01
**Option 1:**  Build a web app which has two pages, The first page shows a list of fields (three fields) to enter user input data as shown in the picture, upon submit of form via “Next” button, the data should be saved to a database (or to a local file) via a POST RESTful web service call. The “Next” button click would also take the user to second page. Using Retrieve button user should be able to retrieve the data saved in the database (or from the local file) via a GET REST Web Service Call and present it in the same page or in a new page.



# Technologies and Tools Used:
1. JDK 1.8
2. Apache Maven
3. Jersey 2.29
4. Java
6. HTML 5
7. Bootstrap
8. JQuery
9. Ajax
10. Eclipse Version: 2021-09 (4.21.0)
11. Jetty Version: 8.1.14.v20131031
12. Chrome Browser
13. Mac OS Version 11.6 (20G165)


# Implementation Details:
1. FirstPage:
            > endUser has to input all the 3 fields (firstName, cityName, dateOfJoining)
            > Validation done using JQuery to only enable "Next" button if all the 3 fields data has been input by the endUser.
            > Send request to the RESTful web service.
            > RESTful web service stores the data in the file(user.json).
            > Server Return response 200 (Success Code) to the Client.
            > Only if response is Success then invoke Second Page.
            
2. Second Page:
            > endUser has to click "Retrieve" button.
            > Send request to the RESTful web service.
            > RESTful web service read the user data from the file(user.json) used as a storage.
            > Server Return the response data with 200 (Success Code) to the Client.
            > All the 3 fields in the Page gets data loaded accordingly.
            
            
                
# Project Screenshots For Reference:

<img width="2560" alt="Screen Shot 2021-11-08 at 10 32 45 PM" src="https://user-images.githubusercontent.com/26824747/140874089-706905ec-3a4a-417c-8091-feee7db89a3c.png">

<img width="2560" alt="Screen Shot 2021-11-08 at 10 33 13 PM" src="https://user-images.githubusercontent.com/26824747/140874163-8e2a34cc-097f-4eba-821a-503af9e6d92f.png">

<img width="2560" alt="Screen Shot 2021-11-08 at 10 33 23 PM" src="https://user-images.githubusercontent.com/26824747/140874178-20c4cbff-6a95-4ed3-9933-80a1d94808c9.png">

<img width="2560" alt="Screen Shot 2021-11-08 at 10 33 34 PM" src="https://user-images.githubusercontent.com/26824747/140874192-66c593d2-2afd-4bdf-994b-96e4fd41e30b.png">

