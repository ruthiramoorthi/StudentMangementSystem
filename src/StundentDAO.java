import java.sql.*;

public class StundentDAO {
    public void addstudent(Student student) throws Exception{
        Connection con = DBconnection.getConnection();
        PreparedStatement stmt = con.prepareStatement("insert into students(name,age,grade) values(?,?,?)");
        stmt.setString(1,student.getName());
        stmt.setInt(2,student.getAge());
        stmt.setString(3, student.getGrade());
        stmt.executeUpdate();
        con.close();
    }
    public void viewStudents()throws Exception {
        Connection con = DBconnection.getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from students");
        while (rs.next()) {
            System.out.println(rs.getString(1) + " | " + rs.getInt(2) + " | " + rs.getString(3));
        }
    }
    public void deleteStudent(int id) throws Exception{
            Connection con = DBconnection.getConnection();
            PreparedStatement stmt = con.prepareStatement("delete from students where id=?");
            stmt.setInt(1,id);
            stmt.executeUpdate();
            con.close();
        }

}
