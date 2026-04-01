// P1546 평균 Bronze I

#include <iostream>
using namespace std;

int main() {
    double nums[1001], n;
    cin >> n;
    for(int i = 0; i < n; i++){
        cin >> nums[i];
    }
    double max = -1;
    for(int i = 0; i<n; i++){
        if(nums[i] > max) max = nums[i];
    }
    for(int i = 0; i < n; i++){
        nums[i] = nums[i]/max*100;
    }
    double average = 0;
    for(int i = 0; i< n; i++){
        average += nums[i];
    }
    cout << average/n;
    return 0;
}