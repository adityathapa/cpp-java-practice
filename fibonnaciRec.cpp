#include<iostream>

using namespace std;

int main()
{
    int factorial(int n);

    cout<<factorial(5);
}

int factorial(int n)
{
    if(n==1)
        return 1;

    else
       return factorial(n-1)*n;
}
