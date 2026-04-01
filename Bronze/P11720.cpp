// P11720 숫자의 합 Bronze IV

#include <iostream>
using namespace std;
int main(){
    int num, temp, total = 0;
    string str;
    cin >> num >> str;
    for(int i =0; i< num; i++){
        temp = str.at(i) - '0';
        total += temp;
    }
    cout << total;
    return 0;
}
