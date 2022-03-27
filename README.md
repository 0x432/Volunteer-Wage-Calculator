# Java Project 1
*Java Object Oriantation project for University Of Huddersfield By Caleb Bowden*

## Main Class
The main class performs as the backbone of the program, its purpose is to create volunteers, Team leaders, Teams and to also print out team statistics and sorted tables. However, none of the calculations are conducted here and are instead done within other classes related to sed classes purpose. The class acts as the structure / flow of the program.

This line of code creates a team Object named T.

![Capture](https://user-images.githubusercontent.com/100306913/160282515-fa115311-89ce-4365-92d0-03695536b57e.PNG)

To create a team leader and add them to the team we need to called the addvolunteer method within the teamc class, we also need to created a new team leader object which is basically the same as the volunteer class. 

![Capture](https://user-images.githubusercontent.com/100306913/160282621-728c0a36-71ea-4d3d-9c96-7c8219a874f8.PNG)

this is to create a new volunteer which follows the same principles as the team leader class.

![Capture](https://user-images.githubusercontent.com/100306913/160282822-77a83a4b-11c5-4c73-9132-8da1ee881d61.PNG)

To print out the volunteers in a clean table we must call the getTable method which is located within the team class we can call this method which will return a table in which we can print out for the user to see.

![Capture](https://user-images.githubusercontent.com/100306913/160282916-a2969445-595c-40bf-a178-20ded9c8d4e4.PNG)

For the program to sort these volunteers we must call the sort methods they are 3 methods sort by wage, sort by boxes delivered and sort alphabetically. we can call these methods then use the getTable method above to print the sorted table out.

![Capture](https://user-images.githubusercontent.com/100306913/160283020-af2a437f-6422-4d64-8590-01e53ec1298f.PNG)
![Capsture](https://user-images.githubusercontent.com/100306913/160283021-439f1de5-08f2-475a-93c7-8bbd3a19a1e6.PNG)
![Captussre](https://user-images.githubusercontent.com/100306913/160283022-3f305cf5-38b4-4ac5-b32d-4d4a876a8e55.PNG)

Once all the data has been sorted and printed it will be usefull to get statistics of the team to do this we call the getStats method which reutrns satistics of the team.

![Capture](https://user-images.githubusercontent.com/100306913/160283368-9c761d46-c70e-471a-ab98-74c6a10e06c2.PNG)

## Volunteer Class
Volunteers are essiential to the program, this class is responsible for all the volunteer methods, this class is used to store volunteeres data, caluclate wages and to calculate boxes. There are also get methods which allow us to get data from that volunteer within another class at anytime.

This is were volunteer data is stored and the data format it needs.

![VolunterValues](https://user-images.githubusercontent.com/100306913/160255615-10eb4bfd-988d-4ecf-a9d5-b3b010030c27.png)


A volunteer constructor is designed to get the data required check for errors and then stores these values in the volunteer class

![volunteerconstrutor](https://user-images.githubusercontent.com/100306913/160255773-978fdd1d-0716-4e12-afb7-31fc9746dc86.png)

To make sure that only sesntible values are proesesed a check is performed to check if the value is equal to 0 or less than 0. If the value is the program will do a system exit and output and error.

![volchecnum](https://user-images.githubusercontent.com/100306913/160256545-9cd58132-42fb-4922-ad1f-021ae8bb1001.png)

If the user has entered boxes to add to the volunteers total boxes the method update boxes is called which will add the previous boxes value t![Capture](https://user-images.githubusercontent.com/100306913/160283330-131ae86f-daef-4bd7-bcda-3a9f4a51fba0.PNG)
o the value of the added boxes.

![Capture](https://user-images.githubusercontent.com/100306913/160256665-302de961-1e5b-408d-8dba-735068d8f921.PNG)

A volunteer gets paid 0.15p for there first 50 boxes and then 0.20p for the rest. However if the volunteer is a team leader they get 20% ontop of this. the getWage method performs the required calculations to do this. Using a if statment we can check if the value of the boxes is less than or equal to 50 if this is true the required calculation is performed is false a different calculation will be preforemed then the wage will be retured to be used later.

Volunteer getWage | Team leader getWage 
--- | --- 
![Capture](https://user-images.githubusercontent.com/100306913/160257030-47969d86-f284-49c6-964e-ad6fcd284e4f.PNG) | ![Capture](https://user-images.githubusercontent.com/100306913/160257137-fd6f0fb1-3055-4802-b7c2-1ee1bd9b847e.PNG)

An important function of any class is to return values that have been stored within the class these methods can be used in other classes in the program to use. This makes it easier to get values that are needed. 

![Capture](https://user-images.githubusercontent.com/100306913/160257283-02052c66-9e33-4b97-b225-9600cb6fcc9c.PNG)

## Team Leader Class
Because the Team leader classes is basically identical to the volunteer class we can inherit the volunteer class within the team leader class. This means that when a new team leader is created the construcutor will ask for the same values as the volunter contructor and use super() for encapsualation. The only difference between these 2 classes is the getTL method which reutirns * because they are a team leader and the getWage method which needs to add an extra 20% onto there wage because they are a team leader.

![Capture](https://user-images.githubusercontent.com/100306913/160257601-f8a5103a-4eed-4242-89de-eb87a1308995.PNG)



## Team Class
This class is respensibe for sorting and creating team.

This creates an array list which stores all the volunteers.

![Capture](https://user-images.githubusercontent.com/100306913/160284451-58412bf3-b4a2-45a7-99a5-2a5a4cdc964d.PNG)

To make sure that wages are in a readable currency format, we create a currency format object to get the local instance. this rounds number to 2 decimal place and adds the local currency symbol.

![Capture](https://user-images.githubusercontent.com/100306913/160284498-30ca7585-8437-4975-8306-fe696d21bdb2.PNG)

When a new team is created from the main page we use a contructor to create a new arraylist to add the volunteers.
d
![Capture](https://user-images.githubusercontent.com/100306913/160284705-bd262275-ab2c-4464-9616-940f694356c8.PNG)
