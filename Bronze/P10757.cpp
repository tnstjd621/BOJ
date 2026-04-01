// P10757 큰 수 A+B Bronze V

#include <iostream>
#include <string>
using namespace std;
int main()
{
  string n1,n2,res,ans;
  cin >> n1 >> n2;
  int car=0;  // 올림수
  int onesize=n1.size();
  int twosize=n2.size();
  while(onesize>0||twosize>0)
  {
    int nn1=0;
    if(onesize>0)
    {
      nn1=n1[--onesize]-'0';
    }
    int nn2=0;
    if(twosize>0)
    {
      nn2=n2[--twosize]-'0';
    }
    int cur=nn1+nn2+car;  
    car=cur/10;
    cur%=10;
    char ccar=cur+'0';
    res+=ccar;
  }
  if(car>0)
  {
    res+=car+'0';
  }
  for(int i=res.length()-1;i>=0;i--)
  {
    cout << res[i];
  }
}