// P1037 약수 Bronze I

#include <stdio.h>
void swap(int *x, int *y){
    int temp = *x;
    *x = *y;
    *y = temp;
}
void sort(int arr[], int num){
    int i, j, min_index;
    for(i = 0; i<num-1; i++){
        min_index = i;
        for(j = i+1; j<num; j++){
            if(arr[j]<arr[min_index]){
                min_index = j;
            }
        }
        if(min_index != i){
            swap(&arr[min_index], &arr[i]);
        }
    }
}
int main(){
    int num;
    scanf("%d", &num);
    int factors[num];
    for(int i = 0; i<num; i++){
        scanf("%d", &factors[i]);
    }
    sort(factors,num);
    printf("%d", factors[0]*factors[num-1]);
    return 0;
}

