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
		curr -> next = n
	}
}
