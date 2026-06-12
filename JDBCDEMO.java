import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class JDBCDEMO {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/mydb" ;
        String username = "root" ;
        String password ="siddhant123";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(Exception e){
        System.out.println(e);
        }
        try{
            Connection conn = DriverManager.getConnection(url,username,password);
            System.out.println("Connected to MYSQL successfully ! ");
            Statement statement = conn.createStatement();
            String query =" select*from students";
            statement.executeQuery(query);
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                int id= resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                double marks = resultSet.getDouble("marks");
                System.out.println("ID:"+id);
                System.out.println("NAME:"+name);
                System.out.println("MARKS:"+marks);
                System.out.println("AGE:"+age);
                
            }
            conn.close();
        }
        catch(SQLException e){
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }
}
