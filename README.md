# Java Project 1
*Java Object Oriantation project for University Of Huddersfield By Caleb Bowden*


### Classes
Main - the main class is responsible for the flow of the program. It is used to add volunteers, team leaders. It acts as the backbone of the program. As it provides all the data and all the methods and classes are called from here.

Team - this class's responsibility is to create a team and store all of the volunteers into that team. The team class also provides methods to collect volunteer data to display team statistics, it also provides methods to sort the team alphabetical,  by wage, by boxes delivered. 

Volunteer - Volunteers are essential to the program. This class is responsible for storing volunteers data and calculating volunteer wages and boxes. It also displays volunteers using the format function within java to display the volunteers neatly.

Team leader - Because the team leader class is basically the same as the volunteer class, we can inherit the methods from the volunteer class. However, team leaders get a 20% increase in the wage.  So we use the override function and the super function to get the wage and then add 20% onto the previous wage. We can also use the override function to display the team leader.

### Methods used
Constructor - A constructor initialises the classes, they are used to add volunteers values when a new volunteer object is created. Each class has a constructor to get the values from previous classes.

![Construco](https://user-images.githubusercontent.com/100306913/161516728-c5264a51-7283-4273-99f1-c656a0f86ec3.PNG)

Update boxes - To update boxes we must add the current value of the boxes to the add box value.

![Capture](https://user-images.githubusercontent.com/100306913/161518104-dab999ac-a3fb-47c9-beb7-68a5403b323e.PNG)

Getting Values - There are a variety of get methods these methods are used to return the value of the specified object.

![getvalues](https://user-images.githubusercontent.com/100306913/161516731-229606cc-f0ca-4006-8688-df3a4965c9d6.PNG)

Storting volunteers - To sort volunteers we get the team ArrayList and use the compare to function which creates 2 new objects of the volunteer and compares both of them together.

![sorting](https://user-images.githubusercontent.com/100306913/161516732-f4b9378d-fcdd-421f-843d-b003485c69c4.PNG)

Team table - The team table loops through all the volunteer objects in the team ArrayList and uses the display method to print out the volunteer once this is done it will then move on to the next volunteer in the ArrayList on a new line.

![table](https://user-images.githubusercontent.com/100306913/161516733-3f0c7b30-a613-4676-aaa1-44cac48e92c0.PNG)

Calculations - The brief specified that a volunteer gets 0.15p for the first 50 boxes and 0.20p for the rest. If the volunteer is a team leader they get a 20% increase. We must first check if the volunteer box amount is equal to or less than 50 if this is true we * the boxes by 0.15p to get the value. If there are more than 50 boxes we take away 50 boxes from the volunteer then we * 0.20p by the rest of the boxes and the * 50 by 0.15 once both of these calculations have been performed we then add them up to get the wage of the volunteer.
![calc1](https://user-images.githubusercontent.com/100306913/161516738-a02abd06-a336-41a5-84a4-7d87cbdbf8d7.PNG)

![calc2](https://user-images.githubusercontent.com/100306913/161516739-1cf0a17e-391e-4325-a391-00741205c31e.PNG)

Display - This method is used to display volunteer data and team leader data In a neat format to then be displayed as a table later on. This method can be overridden to be used in multiple classes.

![display1](https://user-images.githubusercontent.com/100306913/161516735-2d0a1529-6b95-4159-8172-cbdcdcea424c.PNG)

![display2](https://user-images.githubusercontent.com/100306913/161516737-2402064f-8d4c-44dd-b9c1-faacccc96066.PNG)

### Testing phase
During this stage I came across some issues that could occur if the user enters values that are not suitable, anything below 0 is classified as an unsuitable value. To combat this, I created a method within the volunteer class that checks if the value is less than or equal to 0 if this value is unsuitable it will give an error and ask the user to enter this value again. 

![Capture](https://user-images.githubusercontent.com/100306913/161518714-6a27ec5c-de8a-4050-85cf-ec5d45feda18.PNG)

![error](https://user-images.githubusercontent.com/100306913/161519871-8f4ad6cf-5d58-4d32-931e-84819c8e2560.PNG)

![s](https://user-images.githubusercontent.com/100306913/161519869-1ed6b28a-16c7-4224-826e-e985c76f0210.PNG)































![table](https://user-images.githubusercontent.com/100306913/161520956-370b4b62-5055-49ca-86ef-501de10a93be.PNG)
![teamstats](https://user-images.githubusercontent.com/100306913/161520962-4263739d-23d0-4831-9974-3e66bd9a2b1d.PNG)























































