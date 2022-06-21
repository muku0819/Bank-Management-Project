package org.project2;
import java.util.*;
public class Bank {
	int accno;
	String name;
	int balance=1000;
    public long finalBalance;
	public Bank(int accno, String name, int balance) {
		super();
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}
	public int getAccno() {
		return accno;
	}
	
	public String getName() {
		return name;
	}
	public int getBalance() {
		return balance;
	}
	
	
	 public void deposits(int deposit){
	     this.balance = deposit + this.balance;
	    }

	    public void withdrawels(int withdrawel){

	        this.balance =  this.balance - withdrawel;
	    }

		@Override
		public String toString() {
			return "Customer [accno=" + accno + ", name=" + name + ", balance=" + balance + "]";
		}
}
