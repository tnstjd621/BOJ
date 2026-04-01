// P27866 문자와 문자열 Bronze V

#include <iostream>
using namespace std;
int main(){
    string str;
    cin >> str;
    int num;
    cin >> num;
    cout << str.at(num-1);
    return 0;
}