import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class SuperMarket {
    StackUsingLinkedlist stack = new StackUsingLinkedlist();   //class object to store the product bought by customer
    Stack<Integer> stk = new Stack<>();                        //inbuilt function stack to store quantity of product
    node head;                                                 //node to point the product

    Scanner sc = new Scanner (System.in);
    int ID;
    String product_name;
    Double product_price;
    int quantity;

    //-------------------------------------------------------------------

    //method to accept the details of product
    void create_product() {
        System.out.print("\n\t\t\tEnter product ID : ");
        ID = sc.nextInt();

        sc.nextLine();
        System.out.print("\t\t\tEnter the name of the product : ");
        product_name = sc.nextLine();

        System.out.print("\t\t\tEnter the price of the product : ");
        product_price = sc.nextDouble();

        System.out.print("\t\t\tEnter quantity of the product : ");
        quantity = sc.nextInt();

        node new_node = new node(ID,product_name,product_price,quantity);    //to store the details of product in node

        //for first node
        if(head == null){
            head = new_node;
        }

        //for every succeeding node after first node
        else{
            node temp = head;   //store the value of head node in some temp node

            while(temp.next != null){
                temp = temp.next;   //incrementing temp till last node
            }
            new_node.next = temp.next;
            temp.next = new_node; //linking new node at tail with list
        }
        System.out.println("\n\t\t\tProduct inserted...!!\n");
    }


    //------------------------------------------------------------------------


    //method to display the detail of product
    int display(){
        int c = 0;    //counter to count the total product
        node current = head;   //Node current will point to head as pointer

        //if there is no list formed
        if(head == null) {
            System.out.println("Sorry!! Stock unavailable...");
            return 0 ;
        }

        //if list is available
        System.out.println("\n\n\t\t\t---------------------------------------------------- Product list --------------------------------------------------\n");
        System.out.println("\t\t\tProduct ID\t\t\t\t\tProduct name\t\t\t\t\t\tPrice\t\t\t\t\tQuantity\n");

        while(current != null) {
            //Prints each node data
            System.out.print("\t\t\t"+ (c+1) + ". " + current.ID + "     \t\t\t\t\t" + current.product_name + "\t\t\t\t\t\t\t\t" + current.product_price + "\t\t\t\t\t" + current.quantity);
            System.out.println();
            c++;
            current = current.next;      // incrementing pointer to next node
        }
        System.out.println("\n");
        return c;
    }


    //--------------------------------------------------------------------------


    //method to delete a product from list
    void delete(int val){
        node curr = head;   //pointing to current node to delete
        node prev = head;   //pointing to node which is previous to delete

        //if there is no list in existence
        if(head == null) {
            System.out.println("\t\t\tProduct ID : "+val+" is invalid!!");
            return;
        }

        //Deletion of 1st product
        if(val == head.ID)
            head = head.next;

        //Deletion of  other Account
        else{
            while(curr != null && curr.ID != val){
                //continue the loop till we reach the node to be deleted
                prev = curr;
                curr = curr.next;
            }

            //if product is not present in the list
            if(curr == null){
                System.out.println("\t\t\tProduct ID : "+val+" not found...!!");
                return;
            }

            prev.next = curr.next;   //linking prev node to next
            curr.next = null;   //setting next node to current as null
        }

       System.out.println("\t\t\tDeletion done successfully!!\n");
    }


    //------------------------------------------------------------------------------


    //method to modify the product details
    void modify(int id){
        int flag = 0;
        node curr = head;   //pointer to point current node

        //if list is empty, return
        if(head == null){
            System.out.println("\t\t\tSorry...No stock available to modify!!");
            return;
        }

        //continue the loop till the current node does not get null
        while(curr != null){
            if(curr.ID == id){   //searching for ID to be modified
                System.out.println("\t\t\tProduct found!!");
                System.out.println("\t\t\tCurrent name of product is " + curr.product_name);
                System.out.println("\t\t\tCurrent Price of product is " + curr.product_price);
                System.out.println("\t\t\tCurrent quantity of product is " + curr.quantity);

                System.out.print("\n\t\t\tEnter the new price : ");
                curr.product_price = sc.nextDouble();   //read the new price in the product price variable

                System.out.print("\t\t\tEnter new quantity : ");
                curr.quantity = sc.nextInt();   //read the new value of quantity in quantity variable

                flag = 1;   //set flag if modifications are done
                System.out.println("\n\t\t\t*** Details modified!! ***\n");
                break;
            }
            curr = curr.next;   //incrementing pointer curr
        }

        if(flag == 0)   //product not found
            System.out.println("\t\t\tID number :"+id+" is invalid!!");
    }


    //------------------------------------------------------------------


    //method to add the products to buy from customer end
    void buy(){
        int id, i = 0;

        //if stock is unavailable
        if(head == null) {
            System.out.println("\n\t\t\t<<<< Stock not available to buy !! >>>>\n\n");
        }

        else{
            int count = display();           //to store the no. of product available
            do{
                node curr = head;
                int quant;              //quant to store quantity of product
                System.out.print("\t\t\tEnter id of product you want to buy : ");
                id = sc.nextInt();
                int pos = 0;   //to store position of product in list
                pos = search(id);   //get the position of product and check if product is available or not

                if(pos <= count){     //item is available in store or not
                    while(curr.ID != id){
                        curr = curr.next;
                    }

                    if(curr.quantity <= 0){   //if quantity is zero
                        System.out.println("\t\t\tSorry this product is out of stock");
                        System.out.print("\n\t\t\tPress 1 to buy another product else press 0 : ");
                        int j = sc.nextInt();
                        if(j == 1)
                            continue;
                        else
                            break;
                    }

                    else{   //if product is available
                        System.out.print("\n\t\t\tEnter the quantity : ");
                        quant = sc.nextInt();

                        //if quantity entered by customer is greater than available quantity
                        if(quant > curr.quantity) {
                            System.out.println("\t\t\tOnly " + (curr.quantity) + " items are available...");
                            quant = curr.quantity;   //store the available quantity in quant
                        }

                        curr.quantity = curr.quantity - quant;   //store 0 in quantity variable of current product
                        stack.push(curr);   //push product bought by customer in stack
                        stk.push(quant);   //push quantity bought by customer in stk

                        System.out.println("\n\t\t\t" + quant + " items of " + curr.product_name + " added to your cart!!");
                    }
                }
                else
                    System.out.println("\n\t\t\t<<<<<<<<<Product not available>>>>>>>>\n");

                System.out.println("\n\t\t\t***************\n");
                System.out.print("\n\t\t\tPress 1 to buy another product or press 0 to stop : ");
                i = sc.nextInt();
                System.out.println();
            }while(i == 1);   //repeat loop till i is equal to 1
        }
    }

//-----------------------------------------------------------------------------

    //method to search product in list
    int search(int id) {
        int count = 1;   //set counter to 1
        node p = head;   //point node p to first node

        //continue the loop till we reach the last node
        while(p != null) {
            //if product found, then break
            if(p.ID == id)
                break;
            //increment counter and node
            else
                count++;
            p = p.next;
        }
        return count;
    }

//----------------------------------------------------------------------------

    //method to print the bill
    void bill(String rec_name, long con_num){
        //to display current date and time using inbuilt method
        LocalDateTime myDate = LocalDateTime.now(); //to get the instance of current LocalDateTime class
        DateTimeFormatter myformatobj = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss");   //format to display date and time
        String dnt = myDate.format(myformatobj);   //storing it in some string variable

        double cost, total = 0;
        int coun = 1;   //counter to display serial no.
        node ptr;   //node ptr to point the bought products
        int amt;   //variable to store the bought quantity

        //displaying the details of customer and the products bought
        System.out.println("\n\n\t\t\t**********CASH RECEIPT**********");
        System.out.println("\n\t\t\tRecipient's name : " + rec_name);
        System.out.println("\t\t\tRecipient's contact number : " + con_num);
        System.out.println("\t\t\tDate and time : " + dnt);
        System.out.println("\n\t\t\t---------------------------------------------------------------------------------------------------------------------\n");
        System.out.println("\n\t\t\tProduct ID\t\t\t\t\tProduct name\t\t\t\tRate\t\t\t\t\tQuantity\t\t\t\t\tCost\n");

        //repeat the loop till stack does not get empty
        while(!stack.isEmpty()) {
            ptr = stack.pop();   //get the node at top in stack where product is stored
            amt = stk.pop();   //get quantity from stk
            cost = ptr.product_price * amt;   //calculating the cost of particular product
            total = total + cost;   //calculating the total cost of product
            System.out.println("\t\t\t"+ coun + "." + ptr.ID + "\t\t\t\t\t\t" +ptr.product_name + "\t\t\t\t\t\t" + ptr.product_price + "\t\t\t\t\t\t" + amt + "\t\t\t\t\t\t" + cost);
            coun++;   //incrementing the counter
        }

        System.out.println("\n\n\t\t\tTotal cost : " + total);
        System.out.println("\n\t\t\t*****THANK YOU!!*****");
        System.out.println("\n************>>>>>>>***********>>>>>>>>>");
    }
}