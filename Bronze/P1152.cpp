// P1152 단어의 개수 Bronze II

#include <iostream>
using namespace std;
int main(){
    string str;
    getline(cin,str);
    int count = 0;
    bool inWord = false;
    for(char a : str){
        if(a != ' '){
            if(!inWord){
                count ++;
                inWord = true;
            }
        }
        else inWord = false;
    }
    cout << count;
    return 0;
}