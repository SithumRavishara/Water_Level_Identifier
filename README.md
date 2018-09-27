# Water_Level_Identifier
This is a Simple Water Level Identification Software for Tank.This Included Few More Options for Indicate Water Level.  Alarm and SMS Sender and Displays  Every takein Option For according WaterLevel.
In this System Water level observer is the Method overriding class for each separate Sms,display,alarm classes.
water level observable class is likw as a control unit of this system.So the class  make an array in water level observer type and assign every class type object for values as for each element.
Then main method call each object of all the classes, and passing water level value in each calling time.
In the next Step observable calss update the water level if current water level not even to past one.So on every class update it as a overriding method.
