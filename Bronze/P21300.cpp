// P21300 Bottle Return Bronze V

#include <stdio.h>

int main() {
    int sum = 0;
    int temp;
    for(int i = 0; i < 6; i++){
        scanf("%d", &temp);
        sum += temp;
    }
    printf("%d", sum*5);
    return 0;
}