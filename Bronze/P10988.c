// P10988 팰린드롬인지 확인하기 Bronze III

#include <stdio.h>
#include <string.h>

void test(char* word){
    int len = strlen(word);
    for(int i = 0; i<len; i++){
        if(word[i] != word[len-1-i]){
            printf("0");
            return;
        }
    }
    printf("1");
    return;
}
int main(){
    char word[101];
    scanf("%s", word);
    test(word);
    return 0;
}
