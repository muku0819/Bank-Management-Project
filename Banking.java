package org.project2;
import java.util.LinkedList;
import java.util.Scanner;
public class Banking {
	public static void main(String[] args) 
    {
		 Scanner sc = new Scanner(System.in); 
		 Bank obj1=new Bank(101,"sandip",1000);
		 Bank obj2=new Bank(102,"amit",25000);
		 Bank obj3=new Bank(103,"kiran",1500);
		 Bank obj4=new Bank(104,"sunil",20000);
			LinkedList<Bank> list=new LinkedList<Bank>();
			list.add(obj1);
			list.add(obj2);
			list.add(obj3);
			list.add(obj4);
        int ch;
        do {  
            System.out.println("\n ***Banking System Application***");  
            System.out.println("1. Display all account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit ");  
            System.out.println("Enter your choice: "); 
            ch = sc.nextInt();  
            switch (ch) {  
                case 1: // Display all Details
                	for(Bank data:list){
                      System.out.println(data.getAccno()+"\t"+data.getName()+"\t"+data.getBalance());    
                	}
               	   break;           	
                case 2: // Searching account details by Account number
	                	 System.out.print("Enter Account no to display: ");
	                     int rec=sc.nextInt();
	                     for(Bank data:list){
	                         if(data.getAccno()==(rec)){
	                         System.out.println(data.getAccno()+"\t"+data.getName()+"\t"+data.getBalance());
	                         }
	                     }
                         break;
                case 3:
                	System.out.print("Enter Account no: ");
                	int sa= sc.nextInt();
                	for (int i = 0; i < list.size(); i++) {
        	            if (list.get(i).getAccno() == sa) {
                	System.out.println("Enter the amount to be deposited");
                    int deposits = sc.nextInt();
                    System.out.println("Your Previous Details");
                    System.out.println(list.get(i).getAccno()+"\t"+list.get(i).getName()+"\t"+list.get(i).getBalance());
                    list.get(i).deposits(deposits);
                    System.out.println("Deposit of amount Rs." + deposits + " is successful ");
                    System.out.println("Your final amount Rs" + list.get(i).getBalance() + " :)");
                    System.out.println(" Details after deposited");
                    System.out.println(list.get(i).getAccno()+"\t"+list.get(i).getName()+"\t"+list.get(i).getBalance());
        	            }
                	}
                    break;
                case 4:
                	int total;
                	System.out.print("Enter Account no: ");
               	    sa= sc.nextInt();
                	for (int i = 0; i < list.size(); i++)
                	{
        	            if (list.get(i).getAccno() == sa) 
        	            {
                	 System.out.println("Enter the amount you want to withdraw: ");  
                	 int withdrawels = sc.nextInt();
                	 if (list.get(i).getBalance() > 1000 && list.get(i).getBalance()>=withdrawels) { 
         	            total = list.get(i).getBalance() - withdrawels;
         	            if(total>1000) {
         	            	System.out.println("Before transaction");
         	            	System.out.println(list.get(i).getAccno()+"\t"+list.get(i).getName()+"\t"+list.get(i).getBalance());
         	            	 list.get(i).withdrawels(withdrawels);
         	            	System.out.println("Withdrawel of amount Rs." + withdrawels + " is successful\n");
                            System.out.println("Your final amount Rs" + list.get(i).getBalance() + " :)");
                            System.out.println("After transaction");
                            System.out.println(list.get(i).getAccno()+"\t"+list.get(i).getName()+"\t"+list.get(i).getBalance());
                            break;
         	            }
         	            else {
         	            	System.out.println("Before transaction");
         	            	System.out.println(list.get(i).getAccno()+"\t"+list.get(i).getName()+"\t"+list.get(i).getBalance());
         	             System.out.println("Your final amount Rs"+total+" will get lesser than minimum amount(Rs 1000) :(");
         	              System.out.println(" Sorry, your balance is insufficient to allow withdraw ");
         	             System.out.println("After transaction");
                           System.out.println(list.get(i).getAccno()+"\t"+list.get(i).getName()+"\t"+list.get(i).getBalance());
         	            	
         	            }
         	        } else { 
         	        	System.out.println("Your Details");
     	            	System.out.println(list.get(i).getAccno()+"\t"+list.get(i).getName()+"\t"+list.get(i).getBalance());
         	            System.out.println("Transaction failed...!! Sorry, your balance is insufficient to allow withdrawal" ); 
         	           
         	        }  
        	            }
                	}
                  
                    break;
        	        case 5:  
	                        System.out.println("See you soon...");  
	                        break; 
                
                	}
                    
        }while (ch != 5);
        
    }
}


