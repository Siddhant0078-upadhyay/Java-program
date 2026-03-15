class MyEmployee{
    private int id;
    private String name;
    public void setname(String n)
{
    this.name = n;
}
public String getname()
{
   return name; 
}
public void setid(int x)
{
   this.id=x;
}
public int getid()
{
  return id;
}
}
public class Getter_Setter {
    public static void main(String[] args) {
        MyEmployee sid = new MyEmployee();
        sid.setname("Siddhant");
        sid.setid(64);
        System.out.println(sid.getname());
         System.out.println(sid.getid());
    }
    
}
 