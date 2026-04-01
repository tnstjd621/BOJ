//P10818 최소, 최대 Bronze III

#include <iostream>
using namespace std;
int main(){
    int num, min = 1000000, max = -1000000;
    cin >> num;
    int arr[num];
    for(int i = 0; i< num; i++){
        cin >> arr[i];
    }
    for(int i = 0; i< num; i++){
        if(arr[i] > max) max = arr[i];
        if(arr[i] < min) min = arr[i];
    }
    cout << min << endl << max;
    
    return 0;
}