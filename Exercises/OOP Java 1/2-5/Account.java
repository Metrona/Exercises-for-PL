public class Account
{
    int id;
    Customer customer;
    double balance = 0.0;

    public Account(int id, Customer customer, double balance)
    {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer)
    {
        this.id = id;
        this.customer = customer;
    }

    public int getID()
    {
        return id;
    }

    public Customer getCustomer()
    {
        return customer;
    }

    public double getBalance() 
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public String toString()
    {
        return customer.toString() + " balance = $" + (double) Math.round(balance*100)/100;
    }

    public String getCustomerName()
    {
        return customer.getName();
    }

    public Account deposit(double amount)
    {
        Account test1 = new Account(id, customer, balance += amount);
        return test1;
    }

    public Account withdraw(double amount)
    {
        Account test2 = new Account(id, customer, balance);
        if(balance >= amount)
        {
            balance -= amount;
            return test2;
        }
        else
        {
            System.out.println("amount withdrawn exceeds the current balance");
            return test2;
        }
    }
}
