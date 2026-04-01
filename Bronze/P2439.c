// P2439 별 찍기 - 2 Bronze IV

#include <stdio.h>

int main(){
	int num;
	scanf("%d", &num);
	for(int i = 1; i <= num; i++){
		for(int space = num-i; space > 0; space--){
			printf(" "); 
		}
		for(int star = i; star>0; star--){
			printf("*");
		}
		puts("");
	}
}