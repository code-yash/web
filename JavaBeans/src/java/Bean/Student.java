package Bean;

public class Student implements java.io.Serializable
{
    public Student() 
    {}
    
    private String Name;
    private int Age;
    
    public void setName(String Name) 
    {
        this.Name = Name;
    }
    
    public String getName() 
    {
        return Name;
    }
    
    public int getAge() 
    {
        return Age;
    }

    public void setAge(int Age) 
    {
        this.Age = Age;
    }
}
