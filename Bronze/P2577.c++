// P2577 숫자의 개수 Bronze II

#include <iostream>
using namespace std;
int main(){
    int a, b, c;
    cin >> a >> b >> c;
    int num = a*b*c;
    
    string str = to_string(num);
    int digitCount[10] = {0};
    for(char ch:str){
        int digit = ch-'0';
        digitCount[digit]++;
    }
    for(int i = 0; i<10; i++){
        cout << digitCount[i] <<endl;
    }
    return 0;
}