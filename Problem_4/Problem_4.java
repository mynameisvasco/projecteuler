import java.util.Collections;
import java.util.Vector;

public class Problem_4
{
    private static Boolean IsPalindromic(int number)
    {

        String numberString = Integer.toString(number);

        if(numberString.length() % 2 == 0)
        {
            int firstNumberPart = Integer.parseInt(numberString.substring(0, numberString.length() / 2));
            int lastNumberPart = Integer.parseInt(numberString.substring((numberString.length() + 1 ) / 2, numberString.length()));

            int lastNumberPartReversed = 0;

            if(firstNumberPart % 10 == 0 && firstNumberPart != lastNumberPart)
            {
                firstNumberPart = firstNumberPart/10;
            }

            while(lastNumberPart != 0)
            {
                lastNumberPartReversed = lastNumberPartReversed * 10;
                lastNumberPartReversed = lastNumberPartReversed + lastNumberPart%10;
                lastNumberPart = lastNumberPart/10;
            }

            return firstNumberPart == lastNumberPartReversed;
        }
        else if(numberString.length() % 2 != 0 && numberString.length() > 1)
        {
            int firstNumberPart = Integer.parseInt(numberString.substring(0,numberString.length() / 2));
            int lastNumberPart = Integer.parseInt(numberString.substring((numberString.length() + 2 ) / 2, numberString.length()));

            int lastNumberPartReversed = 0;

            if(firstNumberPart % 10 == 0 && firstNumberPart != lastNumberPart)
            {
                firstNumberPart = firstNumberPart/10;
            }

            while(lastNumberPart != 0)
            {
                lastNumberPartReversed = lastNumberPartReversed * 10;
                lastNumberPartReversed = lastNumberPartReversed + lastNumberPart%10;
                lastNumberPart = lastNumberPart/10;
            }


            return firstNumberPart == lastNumberPartReversed;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args)
    {
        Vector<Integer> palindromics = new Vector<>();

        for(int x = 100; x <= 999; x++)
        {
            for(int y = 100; y <= 999; y++)
            {
                if(IsPalindromic(x*y))
                {
                    System.out.println(x + "*" + y + "*" + " = " + x * y  + " --> is palindromic ");
                    palindromics.add(x*y);
                }
            }
        }

        Collections.sort(palindromics);
        System.out.println(palindromics.lastElement());

    }
}