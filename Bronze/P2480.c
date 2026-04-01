// P2480 주사위 세개 Bronze IV

#include <stdio.h>
#include <stdlib.h>
#include <time.h>
int main(){
    srand(time(NULL));
    int a,b,c,point;
    scanf("%d %d %d", &a,&b,&c);
    if(a == b && b == c){
        point = 10000 + 1000*a;
    }
    else if(a == b){
        point = 1000 + 100*a;
    }
    else if(b == c){
        point = 1000 + 100*b;
    }
    else if(a == c){
        point = 1000 + 100*a;
    }
    else{
        int max = -1;
        if(a > max){
            max = a;
        }
        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        point = 100*max;
    }
    printf("%d", point);
    
    return 0;
}