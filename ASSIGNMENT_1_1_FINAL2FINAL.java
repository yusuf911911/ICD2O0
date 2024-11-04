/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment_1;
import java.lang.Math;
import java.lang.Integer;
import java.util.Scanner;
/*
Yusuf Ameer 776111
Date: 9/27/24
Course: Grade 10 Comp Sci
Title: Assignment 1 
Description: A program which outputs a series of numbers based on an algorithm.
*/

public class ASSIGNMENT_1 {
/* VARIABLE DICTIONARY:
    double length = length of rectangle inputted by user
    double width = width of rectangle inputted by user
    double area = length multiplied by width
    double radius = radius of circle inputted by user
    double circle_area = pi multiplied by radius squared
    double height = heigth of cylinder inputted by user
    double cylinder_radius = cylinder radius inputted by user
    double surface_area11 = 2 multiplied by pi radius height
    double surface_area12 = 2 multiplied by pi radius squared
    double surface_area = surface_area11 plus surface_area12, equals surface are-
    -a of the cylinder
    double volume = volume of the cylinder
    double L = pendulum length, in meters
    double g = gravity, is equal to 9.8
    double ooo = the length of the pendulum divided by gravity
    double r = pi multiplied by 2
    double oror = the square root of ooo multiplied by 2 pi
    */
    
    
    /**
     * @param args the command line arguments
     */

// you always need this, call it whatever class you want.

                // however, the name of the class should be the same as the

                // filename (in this case, myClass.java)

    public static void main(String [] args) {

         // ALL of your remaining code goes here

         //Welcome page
         Scanner sc = new Scanner(System.in); //introduces scanner system
         Scanner sce = new Scanner(System.in); //introduces scanner system
         System.out.println("Welcome to calculator!" );
         
         //Area of rectangle
         double length; //defines length as a double
         double width; //defines width as a double
         double area; //defines area as a double
         //lets user know what is being calculated
         System.out.printf("I am now going to calculate your rectangles area" );
         //asks user for length of rectangle
         System.out.printf("\n Please enter your rectangle's length:" ); 
         length = sc.nextDouble(); //defines length as next input
         //asks user for width of rectangle
         System.out.printf("Please enter your rectangle's width:" ); 
         width = sc.nextDouble(); //defines width as next input
         area=length*width; //defines area 
         //prints the rectangle's area with 2 decimal points
         System.out.printf("Your rectangle's area is: %.2f", area ); 
         
         //Area of a circle
         //lets user know what is being calculated
         System.out.printf("\n I am now going to calculate your circles area" );
         Scanner esc = new Scanner(System.in); //introduces scanner system
         double radius; //defines radius as an integer
         double circle_area; //defines circle_area as a double
         //asks user for circle radius
         System.out.print("\n Please enter your circle's radius:" ); 
         radius = sc.nextDouble(); //defines radius as next input
         //multiplies to define circle_area 
         circle_area=(int) (radius*radius)*(3.1415926535); 
         //prints the circle's area with 2 decimal points
         System.out.printf("Your circle's area is: %.2f", circle_area ); 
         
         //Surface area and volume of a cylinder
         //surface area
         //lets user know what is being calculated
         System.out.printf("\n I am now going to calculate your cylinder's surface area" );
         double height; //defines height as an integer
         double cylinder_radius; //defines cylinder_radius as an integer
         double surface_area11; //defines surface_area11 as a double
         double surface_area12; //defines surface_area 12 as a double
         double surface_area; //defines surface_area as a double
         //asks user for the cylinder's height
         System.out.println("\nPlease enter your cylinder's height:" ); 
         height = sc.nextDouble(); //defines height as next input
         //asks user for the cylinder's radius
         System.out.println("Please enter your cylinder's radius:" ); 
         cylinder_radius = sc.nextDouble(); //defines cylinder_radius as next input
         //defines surface_area11
         surface_area11 = 2*(2*3.1415926535*cylinder_radius*height); 
         surface_area12 = 2*(3.1415926535*cylinder_radius); //defines surface_area12
         surface_area = surface_area11 + surface_area12; //defines surface_area
         //prints surface area with 2 decimal points
         System.out.printf("\nYour cylinder's surface area is: %.2f", surface_area ); 
         //volume
         //lets user know what is being calculated
         System.out.printf("\n I am now going to calculate your cylinders volume" );
         double volume; //defines volume as a double
         volume = 3.1415926535*cylinder_radius*cylinder_radius*height; //defines volume
         //prints volume with 2 decimal points
         System.out.printf("\nYour cylinder's volume is: %.2f", volume );  
       
         //Pendulum period
         //lets user know what is being calculated
         System.out.printf("\n I am now going to calculate your pendulums speed" );
         double L; //defiens L as a double
         double g; //Defines g as an integer
         double ooo; //defines ooo as an integer
         double r; //defines r as an integer
         double oror; //defines oror as an integer
         g = 9.8; //defines variable g
         //asks user for pendulum length
         System.out.print("\nPlease enter your pendulum's length, in meters:" );
         L = sc.nextDouble(); //defines L as next input
         r = 6.28318530718; //difines r
         ooo = L/g; //defines ooo
         oror = Math.sqrt(ooo)*(6.28318530718); //defines oror
         //prints the time one swing on the pendulum would take
         System.out.printf("One swing on your pendulum would take: %.2f ", oror ); 
    }
}