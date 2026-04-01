// P2438 별 찍기 - 1 Bronze V

#include <stdio.h>

int main() {
    int num;
    scanf("%d",&num);
    for(int i = 1; i <= num; i++){
        for(int j = 1; j<=i; j++){
            printf("*");
        }
        puts("");
    }
    

    return 0;
}