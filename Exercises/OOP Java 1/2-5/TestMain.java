public class TestMain 
{
    public static void main(String[] args)
    {
        Customer c1 = new Customer(88, "Tan Ah Teck", 'm');
        System.out.println(c1);
        System.out.println("id is: " + c1.getID());
        System.out.println("name is: " + c1.getName());
        System.out.println("gender is: " + c1.getGender());

        Account a1 = new Account(101, c1, 888.88);
        System.out.println(a1);
  
        a1.setBalance(1000.0);
        System.out.println(a1);
        System.out.println("id is: " + a1.getID());
        System.out.println("customer is: " + a1.getCustomer());
        System.out.println("balance is: " + a1.getBalance());
        System.out.println("customer's name is: " + a1.getCustomerName());
        a1.deposit(1000.0);
        System.out.println(a1);
        a1.withdraw(1500.0);
        System.out.println(a1);
        a1.withdraw(1000.0);
    }
}
