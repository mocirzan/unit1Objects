public class ConcatDemo
{
   public static void main(String[] args)
   {
      String animal1 = "quick brown fox ";
      String animal2 = " lazy dog";
      String article = " the ";
      String action = " jumps over ";
      /* Your work goes here */
      //String message = animal1 +" "+ animal2 +" "+ article +" "+ action;
      String message = animal1;
      message = message.concat(action + article + animal2);
      
     
      System.out.println(message);
   }
}