using System;

namespace Problem_7
{
    class Program
    {
        static bool isPrime(int n)
        {
            for (int i = 2; i < n; i++)
            {
                if (n % i == 0)
                {
                    return false;
                }
            }

            return true;
        }

        static void Main(string[] args)
        {
            int currentPrimePosition = 0;
            int desiredPrimePosition = 10001;
            int number = 2;

            while (currentPrimePosition < desiredPrimePosition)
            {
                if (isPrime(number) == true)
                {
                    currentPrimePosition += 1;
                    Console.WriteLine(number + " is the " + currentPrimePosition + " prime number ");
                }

                number += 1;
            }
        }
    }
}
