import java.sql.*;

public class Preparedstatement {
    public static void main(String[] args) {
        try {
            // Moved these inside main
            final String url = "jdbc:mysql://localhost:3306/data";
            final String user = "student";
            final String password = "mysql@ckp";

            Connection con = DriverManager.getConnection(url, user, password);

            // Insert query
            String query = "INSERT INTO student VALUES (?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, 124);
            pst.setString(2, "DEVANSH KAPADIA");
            pst.setLong(3, 901123456L);
            pst.executeUpdate();

            // Update query
            String Updatequery = "UPDATE student SET name = ?, phone = ? WHERE enroll = ?";
            PreparedStatement upst = con.prepareStatement(Updatequery);
            upst.setString(1, "DEVANSH P KAPADIA");
            upst.setLong(2, 9010000000L);
            upst.setInt(3, 124);
            upst.executeUpdate();

            // Closing
            pst.close();
            upst.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
