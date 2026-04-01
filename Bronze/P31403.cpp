// P31403 A + B - C Bronze IV

#include <iostream>
#include <cstring>
using namespace std;
int main(){
    int a, b, c;
    cin >> a>>b>>c;
    cout << a+b-c << endl;
    string str = to_string(a) + to_string(b);
    c = stoi(str)-c;
    cout << c;
    return 0;
}