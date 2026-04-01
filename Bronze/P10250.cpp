// P10250 ACM호텔 Bronze III

#include <iostream>

using namespace std;

int main()
{
    int t,h,w,n;
    cin>>t;
    for(int i=0;i<t;i++){
        scanf("%d %d %d",&h,&w,&n);
        if(n%h==0)
            printf("%d%02d",h,n/h);
        else
            printf("%d%02d",n%h,n/h+1);
        puts("");
    }
    return 0;
}