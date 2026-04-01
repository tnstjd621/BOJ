// P2562 최댓값 Bronze III

#include <iostream>
using namespace std;
int main(){
    int arr[9], max = -1, index;
    for(int i = 0; i<9; i++){
        cin >> arr[i];
    }
    for(int i =0; i<9; i++){
        if(max < arr[i]){
            index = i;
            max = arr[i];
        }
    }
    cout << max << endl;
    cout << index+1;
    
    
    
    return 0;
}