import java.sql.*;

public class SelectDemo {
    private static final String JDBC_DRIVER = "org.postgresql.Driver";
    private static final String JDBC_ADDRESS = "jdbc:postgresql://localhost:5432/emp";
    private static final String USERNAME = "postgres";
    private static final String PASS = "";

    static Connection conn = null;
    static Statement stmt = null;

    public static void main(String[] args) {
        try {
            //utworzenie instancji sterownika
            Class.forName(JDBC_DRIVER);

            //Nawizanie polaczenia
            conn = DriverManager.getConnection(JDBC_ADDRESS, USERNAME, PASS);

            //Tworzenia zapytania
            stmt = conn.createStatement();
            String sqlQuery = "SELECT * FROM employees;";
            ResultSet rs = stmt.executeQuery(sqlQuery);

            while(rs.next()){
                int id = rs.getInt("id");
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("firstname");
                int age = rs.getInt("age");

                StringBuilder sb = new StringBuilder("Id: ").append(id)
                        .append(" firstname: ").append(firstname)
                        .append(" lastname: ").append(lastname)
                        .append(" age: ").append(age);
                System.out.println(sb.toString());
            }
            rs.close();
            stmt.close();
            conn.close();
        }
        catch(SQLException sqlException){
            sqlException.printStackTrace();
        }

        catch (Exception e){
            e.getMessage();
        }
        finally {
            if(stmt != null){
                try{
                    stmt.close();
                }
                catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if(conn != null){
                try{
                    conn.close();
                }
                catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }

    }
}
