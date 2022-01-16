public class node {
    int ID;                     //product ID
    String product_name;        //product name
    double product_price;       //product price
    int quantity;               //quantity of product
    node next;                  //node to point next product details

    //constructor of node class for initialization
    node(int ID,String product_name,double product_price,int quantity){
        this.ID = ID;
        this.product_name = product_name;
        this.product_price = product_price;
        this.quantity = quantity;
        next = null;
    }
}
