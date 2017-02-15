#ifndef LIST_H
#define LIST_H

class List{
private:

	typedef struct node {
		int data;
		node* next;
	}* nodePtr;

	nodePtr head;
	nodePtr curr;
	nodePtr tmp;

public: // This is where the functions go
	List();
	void AddNode(int addData);
	void DeleteNode(int delData);
	void PrintList();
};

#endif /* LIST_H */