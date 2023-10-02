// /* Assignment 2 - Control Tower */
// /* Class name - must be "Assignment2" in order to run */
// import java.util.Scanner;
// import assignment2.Airplane;

// public class Assignment2
// {
//   public static void main(String[] args)
//   {
//     Scanner scan = new Scanner(System.in);
//     System.out.println("Enter the details of the third airplane (call-sign, distance, bearing and altitude):");
//     String callSign= scan.nextLine();
//     double distance= scan.nextDouble();
//     int bearing= scan.nextInt();
//     int alt= scan.nextInt();

//     Airplane plane1 = new Airplane();
//     Airplane plane2 = new Airplane("AAA02", 15.8, 128, 30000);
//     Airplane plane3 = new Airplane(callSign.toUpperCase(), distance, bearing, alt);
//     System.out.println();
//     System.out.println("Initial Positions:");
//     System.out.println("\"Airplane 1\": "+plane1);
//     System.out.println("\"Airplane 2\": "+plane2);
//     System.out.println("\"Airplane 3\": "+plane3);
//     System.out.println();
    
//     System.out.println("Initial Distances:");
//     System.out.println("The distance between Airplane 1 and Airplane 2 is "+plane1.distTo(plane2)+" miles.");
//     System.out.println("The distance between Airplane 1 and Airplane 3 is "+plane1.distTo(plane3)+" miles.");
//     System.out.println("The distance between Airplane 2 and Airplane 3 is "+plane2.distTo(plane3)+" miles.");
//     System.out.println();
    
//     System.out.println("Initial Height Differences:");
//     System.out.println("The difference in height between Airplane 1 and Airplane 2 is "+(Math.abs(plane1.getAlt()-plane2.getAlt()))+" feet.");
//     System.out.println("The difference in height between Airplane 1 and Airplane 3 is "+(Math.abs(plane1.getAlt()-plane3.getAlt()))+" feet.");
//     System.out.println("The difference in height between Airplane 2 and Airplane 3 is "+(Math.abs(plane2.getAlt()-plane3.getAlt()))+" feet.");
    
    
//     plane1.gainAlt();
//     plane1.gainAlt();
//     plane1.gainAlt();
    
//     plane2.loseAlt();
//     plane2.loseAlt();
    
//     plane3.loseAlt();
//     plane3.loseAlt();
//     plane3.loseAlt();
//     plane3.loseAlt();
//     plane1.move(plane2.distTo(plane3), 65);
//     plane2.move(8, 135);
//     plane3.move(5, 55);
    
//     System.out.println();
//     System.out.println("New Positions:");
//     System.out.println("\"Airplane 1\": "+plane1);
//     System.out.println("\"Airplane 2\": "+plane2);
//     System.out.println("\"Airplane 3\": "+plane3);
//     System.out.println();
    
//     System.out.println("New Distances:");
//     System.out.println("The distance between Airplane 1 and Airplane 2 is "+plane1.distTo(plane2)+" miles.");
//     System.out.println("The distance between Airplane 1 and Airplane 3 is "+plane1.distTo(plane3)+" miles.");
//     System.out.println("The distance between Airplane 2 and Airplane 3 is "+plane2.distTo(plane3)+" miles.");
//     System.out.println();
    
//     System.out.println("New Height Differences:");
//     System.out.println("The difference in height between Airplane 1 and Airplane 2 is "+(Math.abs(plane1.getAlt()-plane2.getAlt()))+" feet.");
//     System.out.println("The difference in height between Airplane 1 and Airplane 3 is "+(Math.abs(plane1.getAlt()-plane3.getAlt()))+" feet.");
//     System.out.println("The difference in height between Airplane 2 and Airplane 3 is "+(Math.abs(plane2.getAlt()-plane3.getAlt()))+" feet.");
//   }
// }
