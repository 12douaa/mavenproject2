
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         /* Write your code here */ 
  Scanner scan = new Scanner(System.in); 
  
  //welcome
  System.out.println("Welcome. What is your name?");
  String name = scan.nextLine();
  System.out.println("Hello " +name+"." + " Are you ready to crack the code?"); 
  String userAnswer = scan.nextLine(); 
  userAnswer = userAnswer.toUpperCase(); 
  
  //phase 1// 
  
  if(userAnswer.equals("YES")){
  System.out.println("PHASE 1"); 
  System.out.println("Enter a string:"); 
  String s1 = scan.nextLine(); 
  if(s1.length()<=3){ 
    System.out.println("Correct!");
    System.out.println("PHASE 2"); 
    System.out.println("Enter a number:");
    
    //phase 2// 
    
    int userInputNumber2 = scan.nextInt(); 
    if(userInputNumber2==19||(userInputNumber2>=35 &&userInputNumber2<78)){ 
      System.out.println("Correct!"); System.out.println("PHASE 3"); System.out.println("Enter a number:");
      
      //phase 3// 
      
      int userInputNumber3 = scan.nextInt();
    if(userInputNumber3 > 0 &&(userInputNumber3%2==0||userInputNumber3 %1==1)){ 
    System.out.println("Correct!");
    System.out.println("You have cracked the code!");
        }else{ 
     System.out.println("Sorry, that was incorrect!\nBetter luck next time!"); 
          
    }
  }else{ 
   System.out.println("Sorry, that was incorrect!\nBetter luck next time!");
   } 
    
  } else{ 
     System.out.println("Sorry, that was incorrect!\nBetter luck next time!"); 
    } 
   }
    }
    
}
