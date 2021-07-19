public class Book
{
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;
    
    public Book(String name, Author[] authors, double price)
    {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }
    
    public Book(String name, Author[] authors, double price, int qty)
    {
        this(name,authors,price);
        this.qty = qty;
    }

    public String getName()
    {
        return name;
    }

    public Author[] getAuthors()
    {
        return authors;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public int getQty()
    {
        return qty;
    }

    public void setQty(int qty)
    {
        this.qty = qty;
    }

    public String toString()
    {
        String a = authors[0].toString();
        for(int i = 1; i < authors.length; i++)
        {
            a = a + ", " + authors[i].toString();
        }
        return "Book[" + "name=" + name + ", authors={" + a + "}, price=" + price + ", qty=" + qty + ']';
    }

    public String getAuthorNames()
    {
        String anames = authors[0].getName();
        for(int i = 1; i < authors.length; i++)
        {
            anames = anames + ", " + authors[i].getName();
        }
        return anames;
    }
}
