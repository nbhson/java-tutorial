# Java throws and throw

## What Is an Exception in Java?

`An exception` is a problem that arises during the execution of a program. When an Exception occurs the normal flow of the program is disrupted and the program/Application terminates abnormally, which is not recommended, therefore, these exceptions are to be handled.

## Why Exception Occurs?

An exception can occur for many different reasons. Following are some scenarios where an exception occurs.
- A user has entered an invalid data.
- A file that needs to be opened cannot be found.
- A network connection has been lost in the middle of communications or the JVM has run out of memory.

> Some of these exceptions are caused by user error, others by programmer error, and others by physical resources that have failed in some manner.

## Java Custom Exception

`Custom Exception` đề cập đến việc tạo ngoại lệ của riêng bạn để tùy chỉnh một ngoại lệ theo nhu cầu. Các ngoại lệ tùy chỉnh có nguồn gốc từ lớp `Exception`.

## Need of Java Custom Exceptions
> - To categorize the exceptions based on the different types of errors in your project.
> - To allow application-level exception handling.

## Create a Custom Exception in Java

### Syntax

You just need to extend the predefined Exception class to create your own Exception. **These are considered to be checked exceptions.**

```java
class MyException extends Exception {
}
```

### Rules to Create Custom Exception
- Tất cả các trường hợp ngoại lệ phải là con của Throwable.
- If you want to write a checked exception that is automatically enforced by the `Handle` or `Declare` Rule, you need to extend the `Exception` class.
- If you want to write a `runtime` exception, you need to extend the `RuntimeException` class.

### Java Custom Exception Example - Case Handle or Declare Rule

```java
package list;

public class Main {
	public static void main(String args[]) {
		CheckingAccount c = new CheckingAccount();
		System.out.println("Depositing $500...");
		c.deposit(500.00);

		try { // question - different between Exception & Runtime
			System.out.println("\nWithdrawing $100...");
			c.withdraw(100.00);
			System.out.println("\nWithdrawing $600...");
			c.withdraw(600.00);
		} catch (InsufficientFundsException e) {
			System.out.println("Sorry, but you are short $" + e.getAmount());
			e.printStackTrace();
		}
	}

}

class CheckingAccount {
	private double balance;

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) throws InsufficientFundsException {
		if (amount <= balance) {
			balance -= amount;
		} else {
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
		}
	}
}

class InsufficientFundsException extends Exception {
	private double amount;

	public InsufficientFundsException(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}
}
```

### Java Custom Exception Example - Case Extending Runtime Exception

```java
package com.tutorialspoint;

public class BankDemo {

   public static void main(String [] args) {
      CheckingAccount c = new CheckingAccount(101); // question - different between Exception & Runtime
      System.out.println("Depositing $500...");
      c.deposit(500.00);
      
      System.out.println("\nWithdrawing $100...");
      c.withdraw(100.00);
      System.out.println("\nWithdrawing $600...");
      c.withdraw(600.00);

   }
}

class CheckingAccount {
   private double balance;
   private int number;
   
   public CheckingAccount(int number) {
      this.number = number;
   }
   
   public void deposit(double amount) {
      balance += amount;
   }
   
   public void withdraw(double amount) {
      if(amount <= balance) {
         balance -= amount;
      }else {
         double needs = amount - balance;
         throw new InsufficientFundsException(needs);
      }
   }
   
   public double getBalance() {
      return balance;
   }
   
   public int getNumber() {
      return number;
   }
}

class InsufficientFundsException extends RuntimeException {
   private double amount;
   
   public InsufficientFundsException(double amount) {
      this.amount = amount;
   }
   
   public double getAmount() {
      return amount;
   }
}
```