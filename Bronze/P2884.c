// P2884 알람 시계 Bronze III

#include <stdio.h>

int main(){
    int hour, minute;
    scanf("%d %d", &hour, &minute);
    if(minute - 45 >= 0){
        printf("%d %d", hour, minute-45);
    }
    else{
        if(hour == 0)
            hour = 23;
        else
            hour--;
        printf("%d %d", hour, minute+15);
    }
    return 0;
}