//Marcos Lozano Mendez
//September 3, 2015
//CSE 2
//Cyclometer: counts the number of rotations of the wheel and the minutes
//elasped for each trip

public class Cyclometer{
    public static void main(String[] args){
     //input variables
     int trip1Count = 1561; //number of rotations of the wheel during trip 1
     int trip2Count = 9037; //number of rotations of the wheel during trip 2
     int secsTrip1 = 480; //seconds in trip 1
     int secsTrip2 = 3220; //seconds in trip 2
     
     //intermediate variables and output data
     double wheelDiameter = 27; //Diameter of wheel
     double PI = 3.14159; //6 digits of pi
     double feetperMile = 5280; //conversion from feet to miles
     double inchesperFoot = 12; //conversion from inches to feet
     double secondsperMinute = 60; //conversion from seconds to minutes
     double distanceTrip1, distanceTrip2, totalDistance; //total distance for each trip
     
     //prints
     System.out.println("Trip 1 took " + (secsTrip1/secondsperMinute) + " and had " + trip1Count + " counts");
     System.out.println("Trip 2 took " + (secsTrip2/secondsperMinute) + " and had " + trip2Count + " counts");
     
     //calculations: calculates the distance of each trip 
     distanceTrip1 = trip1Count * wheelDiameter * PI / inchesperFoot / feetperMile; //answer is in miles
     distanceTrip2 = trip2Count * wheelDiameter * PI / inchesperFoot / feetperMile;
     totalDistance = distanceTrip1 + distanceTrip2;
     
     //output data
     System.out.println("Trip 1 was " + distanceTrip1 + " miles");
     System.out.println("Trip 2 was " + distanceTrip2 + " miles");
     System.out.println("The total distance was " + totalDistance + " miles");
     
        
    }//end of main method
}//end of class