// P2920 음계 Bronze II

#include <iostream>
using namespace std;
int main(){
    int arr[8];
    for(int i =0; i<8; i++){
        cin >> arr[i];
    }
    bool flag = true;
    if(arr[0] < arr[1]){
        for(int i = 1; i< 8; i++){
            if(arr[i] < arr[i-1]) flag = false;
        }
        if(flag) cout << "ascending";
        else cout << "mixed";
    }
    if(arr[0] > arr[1]){
        for(int i = 1; i< 8; i++){
            if(arr[i] > arr[i-1]) flag = false;
        }
        if(flag) cout << "descending";
        else cout << "mixed";
    }
    return 0;
}