
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


/**
 *
 * @author LOOMY
 */
public class mysql_connect 
{
    Connection conn = null;
    public static Connection ConnectDb()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/online_shopping","root","dinga");
            JOptionPane.showMessageDialog(null, "connected");
            return conn;
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}
