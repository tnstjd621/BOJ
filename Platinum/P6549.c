// P6549 히스토그램에서 가장 큰 직사각형 Platinum IV

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#define MAX_SIZE 1000000

typedef struct _Node {
	long long int index;
	struct _Node *next;
} Node;

typedef struct _Stack{
	Node *top;
} Stack;

Stack createStack();
void push(Stack *stack, long long int index);
long long int pop(Stack *stack);
long long int peek(Stack *stack);
bool isEmpty(Stack *stack);

long long int N;
long long int Heights[MAX_SIZE+10];
long long int MaxArea;

void getArea(long long int width, long long int height){
	long long int area = width * height;
	if(MaxArea < area)
		MaxArea = area;
}

// Modify this main function
int main() {
	long long int i;
	Stack stack = createStack();
	// Read the bar heights in the histogram
	scanf("%lld", &N);
    while(N != 0){
        for (i = 1; i <= N; i ++) scanf("%lld", &Heights[i]);
	

	Heights[0] = 0;
    Heights[N+1] = 0;
	MaxArea = 0;
	for(i = 0; i <= N+1; i++){
		while(!isEmpty(&stack) && Heights[peek(&stack)] > Heights[i]){
            long long int height = Heights[pop(&stack)];
			getArea(i - peek(&stack)-1, height);
		}
		push(&stack, i);
	}
	while(!isEmpty(&stack)){
			getArea(i - peek(&stack)-1, Heights[pop(&stack)]);
	}
	printf("%lld\n", MaxArea);
scanf("%lld", &N);
    }
	
	return 0;
}

Stack createStack(){
	Stack newStack;
	newStack.top = NULL;
	return newStack;
}

void push(Stack *stack, long long int index){
	Node* newNode = (Node*)malloc(sizeof(Node));
	newNode->index = index;
	newNode->next = stack->top;
	stack->top = newNode;
}

long long int pop(Stack *stack){
	if(isEmpty(stack)) return -1;
	long long int popped = stack->top->index;
    Node *temp = stack->top;
	stack->top = stack->top->next;
    free(temp);
	return popped;
}

long long int peek(Stack *stack){
	if(isEmpty(stack))
		return -1;
	return stack->top->index;
}

bool isEmpty(Stack *stack){
	return stack->top == NULL;
}