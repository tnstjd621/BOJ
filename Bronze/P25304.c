// P25304 영수증 Bronze IV

#include <stdio.h>

int main() {
    int total, num, sum = 0;
    scanf("%d", &total);
    scanf("%d", &num);
    for(int i = 0; i < num; i++){
        int a, b;
        scanf("%d %d", &a, &b);
        sum += a*b;
    }
    if(total == sum){
        printf("Yes");
    }
    else{
        printf("No");
    }

    return 0;
}