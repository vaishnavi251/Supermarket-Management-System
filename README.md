# Supermarket-Management-System
Real time application of supermarket management and billing system using data structures in java.
This application basically consists of 2 portals : 
1. Shopkeeper portal
2. Customer portal

Both the portals are handled by the manager of the supermarket in the below mentioned way : 

Shopkeeper portal : Under this portal, the manager can add, modify and delete the details of the products available in the store. This detail won't be displayed to the customer. Basically this details will be under the access of shopkeeper itself and will be kept limited to himself.

Customer portal : Under this portal, the shopkeeper will give customer the access to buy the products and bill them accordingly. Customer will be made available with a list of products available in the store, where he can choose the product id and the quantity he wants. If the quantity asked by the customer is more than the available quantity in the store then a messege will pop up on screen which says that "only x no. of items are available for the chosen product", and will deduct the number of items of particular product taken by customer in the shopkeeper end as well as customer end for all the possible cases automatically. Once the products to be bought by customer are finalized, manager can move to billing section. Billing section takes the details of customer and bills the bought products.

All these portals are synced, changes made in any portal will be reflected everywhere.
