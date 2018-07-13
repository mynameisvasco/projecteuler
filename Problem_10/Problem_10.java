public class Problem_10{

    private static Boolean isPrime(int x)
    {

        for(int n = 1; n <= x; n++)
        {
            if(x % n == 0 && n != 1 && n != x)
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args)
    {

        long primeSum = 0;

        for(int i = 2; i < 2000000; i++)
        {
            //All even numbers
            if((Math.abs(i % 10) == 2) || (Math.abs(i % 10) == 4) || (Math.abs(i % 10) == 6) || (Math.abs(i % 10) == 8) || (Math.abs(i % 10) == 0))
            {
                continue;
            }

            if(isPrime(i))
            {
                primeSum += i;
                System.out.println(i);
            }


        }

        //Add 2 because 2 was taken away from even number checker
        primeSum += 2;
        System.out.print(primeSum);
    }

}