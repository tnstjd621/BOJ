// P3003 킹, 퀸, 룩, 비숍, 나이트, 폰 Bronze V

#include <stdio.h>
int main(){
    int chess[6];
    for(int i = 0; i<6;i++){
        scanf("%d", &chess[i]);
    }
    printf("%d ", 1-chess[0]);
    printf("%d ", 1-chess[1]);
    printf("%d ", 2-chess[2]);
    printf("%d ", 2-chess[3]);
    printf("%d ", 2-chess[4]);
    printf("%d ", 8-chess[5]);
    return 0;
}