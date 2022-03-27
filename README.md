## Delivery-Tracking-System-Covid
*Java Object Oriantation project for University Of Huddersfield By Caleb Bowden*

### Main Class
The main class performs as the backbone of the program, its purpose is to create volunteers, Team leaders, Teams and to also print out team statistics and sorted tables. However, none of the calculations are conducted here and are instead done within other classes related to sed classes purpose. The class acts as the structure / flow of the program.

This like of code creates a team Object named T.

![Capture](https://user-images.githubusercontent.com/100306913/160282515-fa115311-89ce-4365-92d0-03695536b57e.PNG)





### Volunteer Class
Volunteers are essiential to the program, this class is responsible for all the volunteer methods, this class is used to store volunteeres data, caluclate wages and to calculate boxes. There are also get methods which allow us to get data from that volunteer within another class at anytime.

This is were volunteer data is stored and the data format it needs.

![VolunterValues](https://user-images.githubusercontent.com/100306913/160255615-10eb4bfd-988d-4ecf-a9d5-b3b010030c27.png)


A volunteer constructor is designed to get the data required check for errors and then stores these values in the volunteer class

![volunteerconstrutor](https://user-images.githubusercontent.com/100306913/160255773-978fdd1d-0716-4e12-afb7-31fc9746dc86.png)

To make sure that only sesntible values are proesesed a check is performed to check if the value is equal to 0 or less than 0. If the value is the program will do a system exit and output and error.

![volchecnum](https://user-images.githubusercontent.com/100306913/160256545-9cd58132-42fb-4922-ad1f-021ae8bb1001.png)

If the user has entered boxes to add to the volunteers total boxes the method update boxes is called which will add the previous boxes value to the value of the added boxes.

![Capture](https://user-images.githubusercontent.com/100306913/160256665-302de961-1e5b-408d-8dba-735068d8f921.PNG)

A volunteer gets paid 0.15p for there first 50 boxes and then 0.20p for the rest. However if the volunteer is a team leader they get 20% ontop of this. the getWage method performs the required calculations to do this. Using a if statment we can check if the value of the boxes is less than or equal to 50 if this is true the required calculation is performed is false a different calculation will be preforemed then the wage will be retured to be used later.

Volunteer getWage | Team leader getWage 
--- | --- 
![Capture](https://user-images.githubusercontent.com/100306913/160257030-47969d86-f284-49c6-964e-ad6fcd284e4f.PNG) | ![Capture](https://user-images.githubusercontent.com/100306913/160257137-fd6f0fb1-3055-4802-b7c2-1ee1bd9b847e.PNG)

An important function of any class is to return values that have been stored within the class these methods can be used in other classes in the program to use. This makes it easier to get values that are needed. 

![Capture](https://user-images.githubusercontent.com/100306913/160257283-02052c66-9e33-4b97-b225-9600cb6fcc9c.PNG)

### Team Leader Class
Because the Team leader classes is basically identical to the volunteer class we can inherit the volunteer class within the team leader class. This means that when a new team leader is created the construcutor will ask for the same values as the volunter contructor and use super() for encapsualation. The only difference between these 2 classes is the getTL method which reutirns * because they are a team leader and the getWage method which needs to add an extra 20% onto there wage because they are a team leader.

![Capture](https://user-images.githubusercontent.com/100306913/160257601-f8a5103a-4eed-4242-89de-eb87a1308995.PNG)



### Team Class

