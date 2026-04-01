// P2588 곱셈 Bronze III

#include <stdio.h>

int main() {
    int mul, num;
    scanf("%d %d", &mul, &num);
    int test = num;
    while(test > 0){
        printf("%d\n", mul*(test%10));
        test/=10;
    }
    printf("%d", mul*num);
    
    return 0;
}