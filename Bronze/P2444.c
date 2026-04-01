// P2444 별 찍기 - 3 Bronze III

#include <stdio.h>
int main(){
    int star = 1, num;
    scanf("%d", &num);
    
    for(int i = 1; i<=num; i++){
        for(int j = 1; j<= num-i;j++){
            printf(" ");
        }
        for(int s = 1; s <= star; s++){
            printf("*");
        }
        puts("");
        star+=2;
    }
    star -= 4;
    for(int i = 1; i <num; i++){
        for(int j = 1; j<=i; j++){
            printf(" ");
        }
        for(int s = 1; s <= star; s++){
            printf("*");
        }
        puts("");
        star-=2;
    }
}