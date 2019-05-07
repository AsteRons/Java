package com.luv2code.aopdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component
public class AccountDAO {

	
	private String name;
	private String serviceCode;
	
	// add a new method: findAccounts()
	
	public List<Account> findAccounts(boolean tripWire){
		
		
		// for academic purpose ... simulate an exception
		
		if( tripWire) {
			
			throw new RuntimeException("Exception: findAccounts");
		}
		
		
		List<Account> myAccount = new ArrayList<>();
		
		// create sample accounts
		Account temp1 = new Account("John", "Silver");
		Account temp2 = new Account("Tom", "Platinium");		
		Account temp3 = new Account("Luca", "Gold");				
		
		
		// add them to our accounts list
		myAccount.add(temp1);
		myAccount.add(temp2);
		myAccount.add(temp3);
		
		
		return myAccount;
	}
	 
	
	
	
	public void addAccount(Account theAccount, boolean vipFlag)
	{
	
		System.out.println(getClass() + ": Doing my db work: adding an account");
	
	}
	
	
	public boolean doWord()
	{
		System.out.println(getClass() + ": doWork()");
		
		return false;
	}


	public String getName() {
		System.out.println(getClass() + ": in getName()");
		return name;
	}


	public void setName(String name) {
		System.out.println(getClass() + ": in setName()");
		this.name = name;
	}


	public String getServiceCode() {
		System.out.println(getClass() + ": in getServiceCode()");
		return serviceCode;
	}


	public void setServiceCode(String serviceCode) {
		System.out.println(getClass() + ": in setServiceCode()");
		this.serviceCode = serviceCode;
	}

}
