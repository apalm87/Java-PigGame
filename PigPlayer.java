import java.util.Random;
 
class PigPlayer{
   private Random generator = new Random();
   private int score;
   private int turnTotal;
   private int die;
 
   public PigPlayer(){
     score = 0;
     turnTotal = 0;
     die = 1;
   }
 
   public void roll(){
     die = generator.nextInt(6)+1;
     turnTotal += die;
     if(die == 1){
       turnTotal = 0;
     }
   }
 
   public void stop(){
       score += turnTotal;
       turnTotal = 0;
   }
 
   public String toString(){
     return "Die Value: " + die +
            "  Turn Total: " + turnTotal +
            "  Score: " + score;
   }
 
   public int getDieValue(){
     return die;
   }
  
   public int getTurnTotal(){
     return turnTotal;
   }

   public int getScore(){
     return score;
   }
}
