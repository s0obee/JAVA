import java.sql.*;
import java.util.ArrayList;

public class jdbcMain {



    public static void main(String[] args) throws SQLException {
       Connection connection = null;
        dbHelper helper = new dbHelper();
        Statement statement = null;
        ResultSet resultSet;

       try{
           connection = helper.getConnection();
           String sql = "delete from javawithmysql.emp where id = ?;";
           PreparedStatement preparedStatement = connection.prepareStatement(sql);
           preparedStatement.setInt(1,1);

           int result = preparedStatement.executeUpdate();
           System.out.println("Kayıt Silindi..: ");

       }catch(SQLException exception){
           helper.showErrorMessage(exception);
       }finally {
           statement.close();
           connection.close();
       }

    }


    public static void selectDemo() throws SQLException {
        Connection connection = null;
        dbHelper helper = new dbHelper();
        Statement statement = null;
        ResultSet resultSet;

        try{
            connection = helper.getConnection();
            statement = connection.createStatement();

            resultSet = statement.executeQuery("select id,name from javawithmysql.emp");

            ArrayList <Employee> employees = new ArrayList<>();
            while (resultSet.next()){
                employees.add(new Employee(
                        resultSet.getInt("id"),
                        resultSet.getString("name")/*,
                       resultSet.getInt("age")*/));
            }
            System.out.println(employees.size());
        }catch(SQLException exception){
            helper.showErrorMessage(exception);
        }finally {
            connection.close();
        }

    }

    // Hoca videoda anlatırken statement yaparak yaptı ama ben de hata verince preparedstatement ile yaptım..:
    public static void insertData() throws SQLException{
        Connection connection = null;
        dbHelper helper = new dbHelper();
        Statement statement = null;
        ResultSet resultSet;

        try{
            connection = helper.getConnection();
            String sql = "insert into javawithmysql.emp (id,name,age) values (?,?,?);";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,1);
            preparedStatement.setString(2,"Yunus");
            preparedStatement.setInt(3,20);
            int result = preparedStatement.executeUpdate();
            System.out.println("Kayıt Eklendi..: ");

        }catch(SQLException exception){
            helper.showErrorMessage(exception);
        }finally {
            statement.close();
            connection.close();
        }
    }

    public void updateData() throws SQLException{
        Connection connection = null;
        dbHelper helper = new dbHelper();
        Statement statement = null;
        ResultSet resultSet;

        try{
            connection = helper.getConnection();
            String sql = "update javawithmysql.emp set name = 'Yunus', age = 21 where id = ?;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,1);

            int result = preparedStatement.executeUpdate();
            System.out.println("Kayıt Güncellendi..: ");

        }catch(SQLException exception){
            helper.showErrorMessage(exception);
        }finally {
            statement.close();
            connection.close();
        }
    }

    public void deleteData() throws SQLException{
        Connection connection = null;
        dbHelper helper = new dbHelper();
        Statement statement = null;
        ResultSet resultSet;

        try{
            connection = helper.getConnection();
            String sql = "delete from javawithmysql.emp where id = ?;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,1);

            int result = preparedStatement.executeUpdate();
            System.out.println("Kayıt Silindi..: ");

        }catch(SQLException exception){
            helper.showErrorMessage(exception);
        }finally {
            statement.close();
            connection.close();
        }
    }
}