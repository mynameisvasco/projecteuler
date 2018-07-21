using System;

namespace Problem_9
{
    class Program
    {
        static void Main(string[] args)
        {
            //a + b + c == 1000
            //a2 + b2 = c2

            for (int a = 0; a < 1000; a++)
            {
                for (int b = 0; b < 1000; b++)
                {
                    for (int c = 0; c < 1000; c++)
                    {
                        if(Math.Pow(a,2) + Math.Pow(b,2) == Math.Pow(c,2) && ((a + b + c == 1000) == true) && ((a < b && b < c ) == true))
                        {
                            Console.WriteLine("a = " + a + " b = " + b + " c = " + c);
                            Console.WriteLine("The product of the values is: "+ a*b*c);
                        }
                    }
                }
            }
        }
    }
}
