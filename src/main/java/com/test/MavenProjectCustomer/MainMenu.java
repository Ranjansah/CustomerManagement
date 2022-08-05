package com.test.MavenProjectCustomer;


import java.util.*;

public class MainMenu {
    public static void main(String[] args) {
    	//adding values to ArrayList
        List<Customer> customerList=new ArrayList<>();
        customerList.add(new Customer(1,"Durga",10000,20));
        customerList.add(new Customer(2,"Bibek",20000,21));
        customerList.add(new Customer(3,"Chandan",30000,22));
        customerList.add(new Customer(4,"Aditi",40000,23));
        customerList.add(new Customer(5,"Elvis",50000,29));
        customerList.add(new Customer(6,"Firoz",60000,26));
        customerList.add(new Customer(7,"Ganesh",70000,25));
        customerList.add(new Customer(8,"Hari",80000,28));
        customerList.add(new Customer(9,"Ishwor",90000,35));
        customerList.add(new Customer(10,"Jeevan",100000,54));
        CustomerList customerList1 = new CustomerList(customerList);
        System.out.println("Please Enter the value of key as 1 or 2");
        System.out.println("1.To view All Customers name in Ascending Order");
        System.out.println("2.To Update PurchaseAmount");
        System.out.println("If you enter Key Other than 1. and 2. then Invalid choice will be Displayed");
        System.out.println("Best of Luck!!");
        System.out.println("Enter key");
        Scanner s=new Scanner(System.in);
        int key=s.nextInt();
         //switch case
        switch (key){
            
            case 1: //Press 1,It will display all the record in Ascending order based on their Names
            	customerList1.sort();
            	customerList1.display();
                break;
            case 2: //Press 2,It  will update the Customer PurchaseAmount if Id is present in record else it will pass the message Invalid id
                System.out.println("Enter Customer id");
                int id = s.nextInt();
                System.out.println("Enter Customer updated PurchaseAmount");
                int purchaseAmount = s.nextInt();
                if(customerList1.update(id,purchaseAmount)){
                	customerList1.display();
                }
                else{
                    System.out.println("Sorrt Invalid id provided");
                    
                }
                break;
            
                default:
                	System.out.println("Sorry Invalid choice!!!");
                break;
        }
    }
}
