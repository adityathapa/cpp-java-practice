package recursionSumOfDigits;

public class Main {
    public static void main(String[] args)
    {
        System.out.println(sumOfDigits(9999));
    }

    static int sumOfDigits(int n)
    {
        if(n < 0)
        {
            return -1;
        }
        if(n < 1)   //base case
        {
            return 0;
        }
        return n%10 + sumOfDigits(n/10);
    }
}
