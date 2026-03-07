import java.sql.*;

public class JDBC {
    private static final String URL="jdbc:mysql://localhost:3306/new";
    private static final String USER="user-raj";
    private static final String PASSWORD="password";
    static void main() {
//        Connection conn = null;
//        try {
//            conn = DriverManager.getConnection(URL, USER, PASSWORD);
//            System.out.println("DataBase is Connected");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                conn.close();
//                System.out.println("DataBase is Disconnected");
//            } catch (SQLException e) {
//                throw new RuntimeException(e);
//            }
//        }
//       --------- all above code is reduce to this ----------
        try(Connection conn=DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("DataBase is Connected");
//            insertstudents(conn,"raj jaiswal","raj@gmail.com");
            selectstudents(conn);
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
    private static void insertstudents(Connection conn, String name,String email){
        String sql="INSERT INTO students(name,email) VALUES ('"+name+"','"+email+"')";
        try (Statement stmt=conn.createStatement()){
            int rows=stmt.executeUpdate(sql);
            System.out.println("inserted : "+ rows);
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
    private static void selectstudents(Connection conn){
        String sql="SELECT * FROM students";
        try (Statement stmt=conn.createStatement()){
           ResultSet resultSet= stmt.executeQuery(sql);
            System.out.println("Students List : ");
            while (resultSet.next()){
                int id= resultSet.getInt("id");
                String name=resultSet.getNString("name");
                String email=resultSet.getNString("email");
                System.out.println("id :"+id+" "+"name: "+name+" "+"email: "+email);
            }
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}



