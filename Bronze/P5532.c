// P5532 방학 숙제 Bronze IV

#include <stdio.h>
int main(){
    int days, math, english, mpage, epage, work;
    scanf("%d %d %d %d %d", &days, &math, &english, &mpage, &epage);
    if(math/mpage > english/epage){
        if(math%mpage > 0)
            work = math/mpage + 1;
        else
            work = math/mpage;
    }
    else{
        if(english%epage > 0)
            work = english/epage + 1;
        else
            work = english/epage;
    }
    printf("%d", days-work);
}