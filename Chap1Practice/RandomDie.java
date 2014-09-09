import java.util.Random;

public class RandomDie
{
    public static void main(String[] args)
    {
        Random die = new Random();
        int randnum = die.nextInt(6);
        System.out.println(randnum + 1);
   
    }
}
