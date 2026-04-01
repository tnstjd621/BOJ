// P2675 문자열 반복 Bronze II

#include <iostream>
#include <string>
using namespace std;
int main(){
    int times, num;
    string str;
    cin >> times;
    for(int i =0; i<times; i++){
        cin >> num >> str;
        for(int j = 0; j<str.length();j++){
            for(int k = 0; k < num; k++) cout << str[j];
        }
        cout << endl;
    }
    return 0;
}
