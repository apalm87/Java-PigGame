import java.util.Scanner;
 
class PigGame {
 public static void main(String[] args) {
   System.out.println("Pig Game");
   Scanner keyboard = new Scanner(System.in);
  
   PigPlayer you = new PigPlayer();
   PigPlayer computer = new PigPlayer();
  
  
   do{
     String choice;
     System.out.println("Your Turn: " );
 
     do
     {   //Player's turn
         System.out.println("(R)oll or (S)top: ");
         choice = keyboard.next();
         //Stop if they don't choose R
         if(!choice.equalsIgnoreCase("R")){
           break;
         }
         you.roll();  
         System.out.println(you);
     }while(you.getDieValue() > 1);
 
     you.stop();
     if(you.getScore() >= 100){
       break;
     }
     //Computer's turn
     System.out.println("Computer's Rolls");
     do{
         computer.roll();
         System.out.println(computer);
     }while(computer.getTurnTotal() < 15 && computer.getDieValue() > 1  && computer.getScore() + computer.getTurnTotal() < 100);
     computer.stop();
 
 
   }while(computer.getScore() < 100 && you.getScore() < 100);
 
   if (you.getScore() > computer.getScore()){
      System.out.println("You win!");
   }
   else
   {
      System.out.println("You lose!");
   }
 
 }
}
