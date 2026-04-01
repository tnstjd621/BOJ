// P8958 OX퀴즈 Bronze II

#include <iostream>
using namespace std;
int main(){
    int num;
    cin >> num;
    for(int i = 0; i< num; i++){
        string str;
        cin >> str;
        int total = 0, count = 0;
        for(char a:str){
            if(a == 'O'){
                count++;
                total+=count;
            }
            else count = 0;
        }
        cout << total << endl;
    }
}