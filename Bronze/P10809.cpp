// P10809 알파벳 찾기 Bronze II

#include <iostream>
using namespace std;
int main(){
    char alpha[26] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    string str;
    cin >> str;
    for(int i = 0; i<26; i++){
        bool flag = true;
        for(int j = 0; j<str.length(); j++){
            if(alpha[i] == str.at(j)) {
                cout << j << " ";
                flag = false;
                break;
            }
        }
        if(flag) cout << -1 << " ";
    }
    return 0;
}