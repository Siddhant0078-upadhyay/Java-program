class MymainEmployee{
    public MymainEmployee(){
        id =45;
        name ="Rohit Sharma";
    }
     public MymainEmployee(String n, int i){
        id =i;
        name =n;
    }
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
class Constructors{
    public static void main(String[] args) {
        MymainEmployee sid = new MymainEmployee("Virat kholi" ,18);
        MymainEmployee sidd = new MymainEmployee();
        System.out.println(sid.getname());
        System.out.println(sid.getid());
        System.out.println(sidd.getname());
        System.out.println(sidd.getid());
    }
}