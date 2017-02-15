#include <cstdlib>
#include <iostream>

#include "List.h"

using namespace std;

List::List(){
	head = NULL;
	curr = NULL;
	tmp = NULL;
};

void List::AddNode(int addData) {
	nodePtr n = new node;
	n->next = NULL;
	n->data = addData;

	if(head != NULL) {
		curr = head;
		while(curr->next != NULL) {
			curr = curr ->next; //traverse down the list
		}
		curr -> next = n;
	}
	else
	{
		head = n;
	}
}

void List::DeleteNode(int delData){
	node delPtr = NULL;
	tmp = head;
	curr = head;
	while(curr != NULL && curr->data != delData){ //traverse list till end or found node
		tmp = curr;
		curr = curr->next;
	}
	if(curr = NULL){
		cout << delData <<' was not in the list.' <<endl;
	} else{
		delPtr = curr;
		curr = curr->next;
		tmp->next = curr;
		delete delPtr;
		cout << "The value " << delData << " was deleted." << endl;
	}
}
