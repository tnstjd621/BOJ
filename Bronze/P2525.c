// P2525 오븐 시계 Bronze III

#include <stdio.h>

int main(){
    int hour, minute, add;
    scanf("%d %d %d", &hour, &minute, &add);
    if(minute + add < 60){
        printf("%d %d", hour, minute+add);
    }
    else{
        int addhour = (minute + add)/60;
        minute = (minute+add)%60;
        if(hour + addhour >= 24){
            hour = (hour + addhour)%24;
        }
        else{
            hour = hour + addhour;
        }
        printf("%d %d", hour, minute);
    }
    return 0;
}