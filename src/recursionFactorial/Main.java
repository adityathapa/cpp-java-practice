package recursionFactorial;

public class Main {

    public static void main(String[] args) {
        int fac = factorial(10);
        System.out.println("\b \n" +fac);
    }

    static int factorial(int n)
    {
        if(n<0)
        {
            return -1;
        }
        if(n==1 || n == 0)
        {
            return 1;
        }
        int fac = n * factorial(n-1);
        System.out.print(n+"*");
        return fac;
    }
}
