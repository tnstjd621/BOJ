// P25314 코딩은 체육과목 입니다 Bronze V

#include <stdio.h>

int main() {
    int num, repeat;
    scanf("%d", &num);
    repeat = num/4;
    for(int i = 0; i < repeat; i++){
        printf("long ");
    }
    printf("int");
    

    return 0;
}