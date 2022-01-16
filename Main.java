
import java.util.*;

public class Main {
    public static void main(String[] args) {
        SuperMarket c = new SuperMarket();    //creating object of class SuperMarket
        Scanner sc = new Scanner(System.in);

        int flag, flag1, exi=1;
        String r_name;   //variable to store name of customer
        long c_num = 0;   //variable to store contact number
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<    SuperMarket    >>>>>>>>>>>>>>>>>>>>");
        System.out.print("<<<<<<<<<<<<<<<<<<<<<<<<       Store       >>>>>>>>>>>>>>>>>>>>\n\n");

        //repeat the loop till exi is equal to 1
        while(exi == 1) {
            int cm;
            flag = 1;
            flag1 = 1;

            System.out.print("\n\t\t\tPress 1 for Shopkeeper portal \n\n\t\t\tPress 2 for Customer portal\n\n\t\t\tPress 0 for exit\n\n");
            System.out.print("***********>>>>>>>>***********>>>>>>>>\n");
            System.out.print("\n\t\t\tEnter your choice : ");
            cm = sc.nextInt();
            System.out.print("\n***********>>>>>>>>***********>>>>>>>>");

            switch(cm) {
                //for shopkeeper portal
                case 1 :
                    while(flag==1){
                        int ch;                     // choice for below message
                        System.out.print("\n\n\t\tPress 1 to add a new product \n\n\t\tPress 2 to display all products \n\n\t\tPress 3 to modify existing product\n\n");
                        System.out.print("\t\tPress 4 to delete a particular product from list\n\n\t\tPress 0 to exit\n\n");
                        System.out.print("*********>>>>>***********>>>>>>>>\n");
                        System.out.print("\n\t\tEnter your choice : ");
                        ch = sc.nextInt();
                        System.out.print("\n*********>>>>>***********>>>>>>>>\n");

                        switch(ch){
                            case 1:
                                c.create_product();
                                System.out.print("*********>>>>>***********>>>>>>>>\n");
                                break;

                            case 2:
                                c.display();
                                System.out.print("*********>>>>>***********>>>>>>>>\n");
                                break;

                            case 3:
                                System.out.print("\n\t\t\tEnter ID to modify product Name and its price : ");
                                int id_mod = sc.nextInt();
                                c.modify(id_mod);
                                System.out.print("*********>>>>>***********>>>>>>>>\n");
                                break;

                            case 4:
                                System.out.print("\n\t\t\tEnter ID of product to be deleted : ");
                                int id_del = sc.nextInt();
                                c.delete(id_del);
                                System.out.print("\n\n*********>>>>>***********>>>>>>>>\n");
                                break;

                            case 0:
                                //System.out.print("Exiting...\n");
                                flag = 0;                //   exit from while loop
                                break;

                            default:
                                System.out.print("\t\t\t<<<Invalid choice>>>\n\n");
                                break;
                        }
                    }
                    break;

                //for shopkeeper portal
                case 2:
                    while(flag1==1) {
                        int cd;
                        System.out.print("\n\n\t\t\tPress 1 to buy something\n\n\t\t\tPress 2 for billing\n\n\t\t\tPress 0 to exit\n\n");
                        System.out.print("*********>>>>>***********>>>>>>>>\n");
                        System.out.print("\n\t\t\tEnter your choice : ");
                        cd=sc.nextInt();
                        System.out.print("\n*********>>>>>***********>>>>>>>>\n");

                        switch(cd) {
                            case 1 :
                                c.buy();
                                break;

                            case 2 :
                                System.out.println("\n\t\t\tRecipient's details");
                                sc.nextLine();
                                System.out.print("\n\t\t\tRecipient's name : ");
                                r_name = sc.nextLine();
                                System.out.print("\n\t\t\tRecipient's contact number : ");
                                c_num = sc.nextLong();
                                c.bill(r_name,c_num);
                                break;

                            case 0 :
                                flag1 = 0;                    //   exit from while loop
                                break;

                            default:
                                System.out.print("\t\t\t<<<Wrong choice>>>\n\n");
                                break;
                        }
                    }break;

                case 0 :
                    System.out.print("\n\t\t\tExiting...\n");
                    exi=0;                    //   exit from while loop
                    break;
                default:
                    System.out.print("\t\t\t<<<Wrong choice>>>\n\n");
                    break;
            }
        }
    }
}

/*
OUTPUT

<<<<<<<<<<<<<<<<<<<<<<<<    SuperMarket    >>>>>>>>>>>>>>>>>>>>
<<<<<<<<<<<<<<<<<<<<<<<<       Store       >>>>>>>>>>>>>>>>>>>>


			Press 1 for Shopkeeper portal

			Press 2 for Customer portal

			Press 0 for exit

***********>>>>>>>>***********>>>>>>>>

			Enter your choice : 1

***********>>>>>>>>***********>>>>>>>>

		Press 1 to add a new product

		Press 2 to display all products

		Press 3 to modify existing product

		Press 4 to delete a particular product from list

		Press 0 to exit

*********>>>>>***********>>>>>>>>

		Enter your choice : 1

*********>>>>>***********>>>>>>>>

			Enter product ID : 111
			Enter the name of the product : IODEX
			Enter the price of the product : 140
			Enter quantity of the product : 10

			Product inserted...!!

*********>>>>>***********>>>>>>>>


		Press 1 to add a new product

		Press 2 to display all products

		Press 3 to modify existing product

		Press 4 to delete a particular product from list

		Press 0 to exit

*********>>>>>***********>>>>>>>>

		Enter your choice : 1

*********>>>>>***********>>>>>>>>

			Enter product ID : 112
			Enter the name of the product : DETTOL
			Enter the price of the product : 135
			Enter quantity of the product : 60

			Product inserted...!!

*********>>>>>***********>>>>>>>>


		Press 1 to add a new product

		Press 2 to display all products

		Press 3 to modify existing product

		Press 4 to delete a particular product from list

		Press 0 to exit

*********>>>>>***********>>>>>>>>

		Enter your choice : 1

*********>>>>>***********>>>>>>>>

			Enter product ID : 113
			Enter the name of the product : PANTEEN
			Enter the price of the product : 140
			Enter quantity of the product : 18

			Product inserted...!!

*********>>>>>***********>>>>>>>>


		Press 1 to add a new product

		Press 2 to display all products

		Press 3 to modify existing product

		Press 4 to delete a particular product from list

		Press 0 to exit

*********>>>>>***********>>>>>>>>

		Enter your choice : 1

*********>>>>>***********>>>>>>>>

			Enter product ID : 114
			Enter the name of the product : 5STAR
			Enter the price of the product : 20
			Enter quantity of the product : 100

			Product inserted...!!

*********>>>>>***********>>>>>>>>


		Press 1 to add a new product

		Press 2 to display all products

		Press 3 to modify existing product

		Press 4 to delete a particular product from list

		Press 0 to exit

*********>>>>>***********>>>>>>>>

		Enter your choice : 1

*********>>>>>***********>>>>>>>>

			Enter product ID : 115
			Enter the name of the product : INDICA
			Enter the price of the product : 48
			Enter quantity of the product : 40

			Product inserted...!!

*********>>>>>***********>>>>>>>>


		Press 1 to add a new product

		Press 2 to display all products

		Press 3 to modify existing product

		Press 4 to delete a particular product from list

		Press 0 to exit

*********>>>>>***********>>>>>>>>

		Enter your choice : 1

*********>>>>>***********>>>>>>>>

			Enter product ID : 116
			Enter the name of the product : LAYS
			Enter the price of the product : 20
			Enter quantity of the product : 200

			Product inserted...!!

*********>>>>>***********>>>>>>>>


		Press 1 to add a new product

		Press 2 to display all products

		Press 3 to modify existing product

		Press 4 to delete a particular product from list

		Press 0 to exit

*********>>>>>***********>>>>>>>>

		Enter your choice : 1

*********>>>>>***********>>>>>>>>

			Enter product ID : 117
			Enter the name of the product : COLGATE
			Enter the price of the product : 55
			Enter quantity of the product : 40

			Product inserted...!!

*********>>>>>***********>>>>>>>>


		Press 1 to add a new product

		Press 2 to display all products

		Press 3 to modify existing product

		Press 4 to delete a particular product from list

		Press 0 to exit

*********>>>>>***********>>>>>>>>

		Enter your choice : 1

*********>>>>>***********>>>>>>>>

			Enter product ID : 118
			Enter the name of the product : BOOST
			Enter the price of the product : 200
			Enter quantity of the product : 5

			Product inserted...!!

*********>>>>>***********>>>>>>>>


		Press 1 to add a new product

		Press 2 to display all products

		Press 3 to modify existing product

		Press 4 to delete a particular product from list

		Press 0 to exit

*********>>>>>***********>>>>>>>>

		Enter your choice : 2

*********>>>>>***********>>>>>>>>


			---------------------------------------------------- Product list --------------------------------------------------

			Product ID					Product name						Price					Quantity

			1. 111     					IODEX								140.0					10
			2. 112     					DETTOL								135.0					60
			3. 113     					PANTEEN								140.0					18
			4. 114     					5STAR								20.0					100
			5. 115     					INDICA								48.0					40
			6. 116     					LAYS								20.0					200
			7. 117     					COLGATE								55.0					40
			8. 118     					BOOST								200.0					5


*********>>>>>***********>>>>>>>>


		Press 1 to add a new product

		Press 2 to display all products

		Press 3 to modify existing product

		Press 4 to delete a particular product from list

		Press 0 to exit

*********>>>>>***********>>>>>>>>

		Enter your choice : 3

*********>>>>>***********>>>>>>>>

			Enter ID to modify product Name and its price : 115
			Product found!!
			Current name of product is INDICA
			Current Price of product is 48.0
			Current quantity of product is 40

			Enter the new price : 55
			Enter new quantity : 45

			*** Details modified!! ***

*********>>>>>***********>>>>>>>>


		Press 1 to add a new product

		Press 2 to display all products

		Press 3 to modify existing product

		Press 4 to delete a particular product from list

		Press 0 to exit

*********>>>>>***********>>>>>>>>

		Enter your choice : 4

*********>>>>>***********>>>>>>>>

			Enter ID of product to be deleted : 117
			Deletion done successfully!!



*********>>>>>***********>>>>>>>>


		Press 1 to add a new product

		Press 2 to display all products

		Press 3 to modify existing product

		Press 4 to delete a particular product from list

		Press 0 to exit

*********>>>>>***********>>>>>>>>

		Enter your choice : 2

*********>>>>>***********>>>>>>>>


			---------------------------------------------------- Product list --------------------------------------------------

			Product ID					Product name						Price					Quantity

			1. 111     					IODEX								140.0					10
			2. 112     					DETTOL								135.0					60
			3. 113     					PANTEEN								140.0					18
			4. 114     					5STAR								20.0					100
			5. 115     					INDICA								55.0					45
			6. 116     					LAYS								20.0					200
			7. 118     					BOOST								200.0					5


*********>>>>>***********>>>>>>>>


		Press 1 to add a new product

		Press 2 to display all products

		Press 3 to modify existing product

		Press 4 to delete a particular product from list

		Press 0 to exit

*********>>>>>***********>>>>>>>>

		Enter your choice : 0

*********>>>>>***********>>>>>>>>

			Press 1 for Shopkeeper portal

			Press 2 for Customer portal

			Press 0 for exit

***********>>>>>>>>***********>>>>>>>>

			Enter your choice : 2

***********>>>>>>>>***********>>>>>>>>

			Press 1 to buy something

			Press 2 for billing

			Press 0 to exit

*********>>>>>***********>>>>>>>>

			Enter your choice : 1

*********>>>>>***********>>>>>>>>


			---------------------------------------------------- Product list --------------------------------------------------

			Product ID					Product name						Price					Quantity

			1. 111     					IODEX								140.0					10
			2. 112     					DETTOL								135.0					60
			3. 113     					PANTEEN								140.0					18
			4. 114     					5STAR								20.0					100
			5. 115     					INDICA								55.0					45
			6. 116     					LAYS								20.0					200
			7. 118     					BOOST								200.0					5


			Enter id of product you want to buy : 111

			Enter the quantity : 30
			Only 10 items are available...

			10 items of IODEX added to your cart!!

			***************


			Press 1 to buy another product or press 0 to stop : 1

			Enter id of product you want to buy : 115

			Enter the quantity : 25

			25 items of INDICA added to your cart!!

			***************


			Press 1 to buy another product or press 0 to stop : 1

			Enter id of product you want to buy : 118

			Enter the quantity : 5

			5 items of BOOST added to your cart!!

			***************


			Press 1 to buy another product or press 0 to stop : 0



			Press 1 to buy something

			Press 2 for billing

			Press 0 to exit

*********>>>>>***********>>>>>>>>

			Enter your choice : 2

*********>>>>>***********>>>>>>>>

			Recipient's details

			Recipient's name : RITA

			Recipient's contact number : 9939993091


			**********CASH RECEIPT**********

			Recipient's name : RITA
			Recipient's contact number : 9939993091
			Date and time : 02-01-2022  18:44:02

			---------------------------------------------------------------------------------------------------------------------


			Product ID					Product name				Rate					Quantity					Cost

			1.118						BOOST						200.0						5						1000.0
			2.115						INDICA						55.0						25						1375.0
			3.111						IODEX						140.0						10						1400.0


			Total cost : 3775.0

			*****THANK YOU!!*****

************>>>>>>>***********>>>>>>>>>


			Press 1 to buy something

			Press 2 for billing

			Press 0 to exit

*********>>>>>***********>>>>>>>>

			Enter your choice : 0

*********>>>>>***********>>>>>>>>

			Press 1 for Shopkeeper portal

			Press 2 for Customer portal

			Press 0 for exit

***********>>>>>>>>***********>>>>>>>>

			Enter your choice : 0

***********>>>>>>>>***********>>>>>>>>
			Exiting...

Process finished with exit code 0
 */