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
public String getname(){
   return name; }
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
     sid.setid(50);
        System.out.println(sid.getname());
        System.out.println(sid.getid());
        System.out.println(sidd.getname());
        System.out.println(sidd.getid());
        /* Setter ka use constructor me set initial value ko change karne ke liye hota hai. Agar hum kisi set value
        ko change karna hai tab hum iska use karte hai.*/
    }
}