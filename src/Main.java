import java.util.Scanner;

public class Main extends Exception
{

    public static void main(String[] args)
    {
        Main object = new Main();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = keyboard.nextInt();
        try
        {
            object.doStuff(number);

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Program has a problem");
        }


    }
    public void doStuff(int n) throws Exception
    {
        if(n < 0)
            throw new Exception("Negative number");

        System.out.println("number is: " + n);
        System.out.println("Program is successfully executed");
    }
}
