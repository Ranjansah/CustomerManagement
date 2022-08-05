package com.test.MavenProjectCustomer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class CustomerList {
	private List<Customer> customerList;                

    public CustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
    
    public void display(){
        int i=1;
        for(Customer employee:this.customerList){
            System.out.println("Customer"+i+" ::: id: "+employee.getId()+" name: "+employee.getName()+" purchaseAmount: "+employee.getPurchaseAmount()+" age: "+employee.getAge());
            i++;
        }
    }
    
    public void sort(){
        Collections.sort(this.customerList, Collections.reverseOrder(new Comparator<Customer>() { 
            @Override
            public int compare(Customer customer1, Customer customer2) {
                return customer2.getName().compareTo(customer1.getName());
            }
        }));
    }
  
    public boolean update(int id, int purchaseAmount) {
        boolean flag=false;
        for(Customer customer:this.customerList){
            if(customer.getId()==id){
                flag=true;
                customer.setPurchaseAmount(purchaseAmount);
            }
        }
        return flag;
    }

}

