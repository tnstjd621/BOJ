// P10871 X보다 작은 수 Bronze V

#include <iostream>
using namespace std;
int main(){
    int n, m;
    cin >> n >> m;
    int arr[n];
    for(int i = 0 ;i <n; i++){
        cin >> arr[i];
    }
    for(int i = 0; i<n; i++){
        if(arr[i] < m) cout << arr[i] << " ";
    }
    return 0;
}