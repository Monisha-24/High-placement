/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro1;
import java.util.Scanner;
/**
 *
 * @author welcome
 */
public class project2 {

    /**
     *
     * @param args
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the no. of students placed in CSE: ");
        int cse = sc.nextInt();

        System.out.print("Enter the no. of students placed in ECE: ");
        int ece = sc.nextInt();

        System.out.print("Enter the no. of students placed in MECH: ");
        int mech = sc.nextInt();

        sc.close();
      
        if (cse < 0 || ece < 0 || mech < 0)
        {
            System.out.println("Input is Invalid");          
        }
       // If all values are equal, print message and exit
        else
        {        
            if (cse == ece && ece == mech && mech==cse)
            {
                System.out.println("None of the department has got the highest placement");        
            }
            //System.out.println("Highest Placement:");
             // First, check if any two values are equal and greater than the third
            else if (cse == ece && cse > mech)
            {
                System.out.println("Highest Placement:");
                System.out.println("CSE");
                System.out.println("ECE");
            }
            else if (cse == mech && cse > ece)
            {
                System.out.println("Highest Placement:");
                System.out.println("CSE");
                System.out.println("MECH");
            }
            else if (ece == mech && ece > cse)
            {
                System.out.println("Highest Placement:");
                System.out.println("ECE");
                System.out.println("MECH");
            }
            // Now, if we reached here, all values are distinct
            // Check if one value is greater than both
            else if (cse > ece && cse > mech)
            {
                System.out.println("Highest Placement:");
                System.out.println("CSE");
            }
            else if (ece > mech)
            {
                System.out.println("Highest Placement:");
                System.out.println("ECE");
            }
            else
            {
                System.out.println("Highest Placement:");
                System.out.println("MECH");
            }
        }
   }
    }
