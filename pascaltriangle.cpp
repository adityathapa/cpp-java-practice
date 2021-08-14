#include<iostream>

using namespace std;
int main()
{   
    int factorial(int x);
    int pnc(int n, int r);

    int row;
    cin>>row;

    for(int i=0; i<row; i++)
    {
        for(int j=0; j<=i; j++)
        {
            cout<<pnc(i,j)<<" ";
        }
        cout<<"\n";
    }
}

int factorial(int x)
{
    if(x==1 || x==0)
        return 1;
    else
     return factorial(x-1)*x;
}

int pnc(int n, int r)
{
    return factorial(n)/(factorial(n-r)*factorial(r));
}

