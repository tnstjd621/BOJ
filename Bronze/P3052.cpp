// P3052 나머지 Bronze II

#include <iostream>
using namespace std;
int main(){
    int arr[10], size = 0, rem[10];
    for(int i = 0; i < 10; i++){
        cin >> arr[i];
    }
    for(int i = 0; i < 10; i++){
        bool flag = true;
        for(int j = 0; j < size; j++){
            if(arr[i]%42 == rem[j]) flag = false;
        }
        if(flag){
            rem[size++] = arr[i]%42;
        }
    }
    cout << size;
    return 0;
}