import java.util.Vector;

public class Problem_2
{

    private static Vector<Integer> Fibonacci(int maxTerm)
    {
        int n1 = 1;
        int n2 = 2;
        int n3 = n1 + n2;

        Vector<Integer> sequenceTerms = new Vector<>();
        sequenceTerms.add(n1);
        sequenceTerms.add(n2);


        for(int i = 0; n3 <= maxTerm; i++)
        {
            n3 = n1 + n2;
            sequenceTerms.add(n3);
            n1 = n2;
            n2 = n3;
        }

        return sequenceTerms;
    }

    private static boolean IsEven(int number)
    {
        return number % 2 == 0;
    }

    public static void main(String[] args)
    {
        int sum = 0;

        for(int i : Fibonacci(4000000))
        {
            if(IsEven(i))
            {
                sum += i;
            }
        }

        System.out.print(sum);
    }
}