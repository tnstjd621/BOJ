// P2753 윤년 Bronze V

#include <stdio.h>

int main(){
    int year, flag = 0;
    scanf("%d", &year);
    if(year % 4 == 0){
        flag = 1;
        if(year % 100 == 0)
            flag = 0;
        if(year % 400 == 0)
            flag = 1;
    }
    printf("%d", flag);
    return 0;
}