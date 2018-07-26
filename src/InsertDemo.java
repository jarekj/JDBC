import java.sql.*;

public class InsertDemo {
    private static final String JDBC_DRIVER = "org.postgresql.Driver";
    private static final String JDBC_ADDRESS = "jdbc:postgresql://localhost:5432/emp";
    private static final String USERNAME = "postgres";
    private static final String PASS = "";

    static Connection conn = null;
    static Statement stmt = null;

    public static void main(String[] args) {
        try{
            Class.forName(JDBC_DRIVER);

            conn = DriverManager.getConnection(JDBC_ADDRESS, USERNAME, PASS);
            stmt = conn.createStatement();
            String sqlQuery = "INSERT INTO employees (firstname, lastname, age) values('Andrzej', 'Bakun', 1)";
            stmt.execute(sqlQuery);


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
