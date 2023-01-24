# Java Part 1 - Home Tasks
## Task 1 - Check if an array is sorted ascending
Write a program that reads an array of int's and checks if the array is sorted ascending (from smallest to largest number).
Input data format
The first line contains the size of an array.
The second line contains elements of the array separated by spaces.
Output data format
Only a single value: true or false.
Sample Input 1:
4
1 2 3 4
Sample Output 1:
True
Sample Input 2:
4
1 2 3 0
Sample Output 2:
false

## Task 2 - Reverse String

Write 3 implementations (or more) for reversing string.
Input:
String stringToRevers = "I'm going to go to school today morning."
Output:
".gninrom yadot loohcs ot og ot gniog m'I"

## Task 3 - Change identities
There is a class Person that has two fields: name and age. Your task is to implement the method changeIdentities. It should swap all information (age and name) between two persons p1 and p2.
It is known that objects p1 and p2 can't be null.
``` java
class Person {
  String name;
  int age;
}

class MakingChanges {
  public static void changeIdentities(Person p1, Person p2) {
      // write your code here

  }
}
```

## Task 4 - Account Service (Interfaces)
Imagine an interface AccountService that is designed for keeping track of accounts and balances.
It has two abstract methods:
findAccountByOwnerId(long id) takes user id and returns this user account or null in case no account was found;
countAccountsWithBalanceGreaterThan(long balance) returns the number of accounts with a balance exceeding the provided number.
There are also two classes: Account and User, each of them having several fields. The owner field of the Account class is an object of the User type. You can find the details in the provided template.
Your task is to create an AccountServiceImpl class that implements the AccountService interface and its two methods.
It should have a constructor that takes an Account array which will be used for searching when either of the methods is called.
For example, to find an account by the user id we need to go through all the accounts from this array and compare these accounts owners id with the given id.
Here's an example of how these methods will be called:
``` java
Account[] accounts = ...
AccountService service = new AccountServiceImpl(accounts);
service.findAccountByOwnerId(10L); // returns an account where owner id is 10
```
Note: do not make classes and the interface public.
Template:
``` java
interface AccountService {
  /**
   * It finds an account by owner id
   * @param id owner unique identifier
   * @return account or null
   */
  Account findAccountByOwnerId(long id);
  /**
   * It count the number of account with balance > the given value
   * @param value
   * @return the number of accounts
   */
  long countAccountsWithBalanceGreaterThan(long value);
}

// Declare and implement your AccountServiceImpl here

class Account {

  private long id;
  private long balance;
  private User owner;

  public Account(long id, long balance, User owner) {
      this.id = id;
      this.balance = balance;
      this.owner = owner;
  }

  public long getId() {
      return id;
  }

  public long getBalance() {
      return balance;
  }

  public User getOwner() {
      return owner;
  }
}

class User {

  private long id;
  private String firstName;
  private String lastName;

  public User(long id, String firstName, String lastName) {
      this.id = id;
      this.firstName = firstName;
      this.lastName = lastName;
  }

  public long getId() {
      return id;
  }

  public String getFirstName() {
      return firstName;
  }

  public String getLastName() {
      return lastName;
  }
}

```