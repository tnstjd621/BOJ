// P1978 소수 찾기 Bronze II

#include <iostream>
#include <cmath>
using namespace std;
int prime(int temp){
    if(temp == 1){
        return 0;
    }
    else{
        for(int i = 2; i <= sqrt(temp); i++){
            if(temp%i == 0){
                return 0;
            }
        }
        return 1;
    }
}

int main(){
    int num, count = 0, temp;
    cin >> num;
    for(int i = 0; i < num; i++){
        cin >> temp;
        if(prime(temp)){
            count++;
        }
    }
    cout << count;
    
    return 0;
}