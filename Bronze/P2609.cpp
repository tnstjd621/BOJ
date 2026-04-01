// P2609 최대공약수와 최소공배수 Bronze I

#include <iostream>
using namespace std;
int GCF(int a, int b){
    int temp;
    if(a < b){
        temp = b;
        b = a;
        a = temp;
    }
    while(b != 0){
        temp = a%b;
        a = b;
        b = temp;
    }
    return a;
}

int main() {
    int a, b;
    cin >> a >> b;
    cout << GCF(a,b) << endl;
    cout << a*b/GCF(a,b);
    return 0;
}