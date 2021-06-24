package recursionFibonnaci;

public class Main {
    public static void main(String[] args)
    {
        int val = fibonnaci(20);
        System.out.println(val);
    }

    static int fibonnaci(int n)
    {
        if(n < 0)
        {
            return -1;
        }
        if(n==1||n==0)
        {
            return n;
        }
        return fibonnaci(n-1) + fibonnaci(n-2);
    }
}
