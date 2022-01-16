public class StackUsingLinkedlist {
    // Create Stack Using Linked list

    // A linked list node
    private class node_s{    //node class for stack
        node data;			// Node pointer data
        node_s link;			// reference variable Node type
    }

    node_s top;

    // Constructor to initialize variables
    StackUsingLinkedlist () {
        this.top = null;
    }

    //method to add data to stack
    public void push (node x) {
        // create new node temp
        node_s temp = new node_s ();

        // check if stack is null
        if (temp == null) {
            return;
        }

        // initialize data into temp data field
        temp.data = x;

        // put top reference into temp link
        temp.link = top;

        // update top reference
        top = temp;
    }

    //  check if the stack is empty or not
    public boolean isEmpty () {
        return top == null;
    }


    // pop top element from the stack
    public node pop ()	{	// remove elements at beginning
        // check for stack underflow
        if (top == null) {
            node t = null;
            return t;
        }

        else {
            // update the top pointer to point to the next node
            node temp = top.data;
            top = (top).link;
            return temp;
        }
    }
}