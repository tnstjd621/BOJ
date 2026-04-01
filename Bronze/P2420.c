// P2420 사파리월드 Bronze V

#include <stdio.h>
#include <stdlib.h>
int main(){
    long long a,b;
    scanf("%lld %lld", &a, &b);
    long long c = a-b;
    if(c<0){
        c*=-1;
    }
    printf("%lld", c);
}