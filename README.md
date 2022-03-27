# Java Project 1
*Java Object Oriantation project for University Of Huddersfield By Caleb Bowden*

### Classes
**Main** - The Main class is responsible for the flow of the program it is used to add volunteers, teams, and team leaders. It acts as the backbone, as it provides all the data, and all methods are called here.

**Team** - This class responsibility is to create a team and store the volunteers. The class also sorts volunteers and creates a clean table that can be returned using a method.

**Volunteer** - Volunteers are essential to the program, this class is responsible for all the volunteer methods, this class is used to store volunteers’ data, calculate wages and boxes. There are also get methods which allow us to get data from that volunteer within another class at any time.

**Team Leader** - Because the team leader class is the same as the volunteer class with a few minor changes to the wage calculation and how it returns true for the team leader, its best to inherit the volunteer class this makes it, so you do not have to copy code.

