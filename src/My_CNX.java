import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nash
 */
public class My_CNX {
	Connection conn;
    public static Connection getConnection()
    {
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/repair", "root", "");
            return conn;
        } catch (SQLException ex) {
            Logger.getLogger(" Get Connection -> " + My_CNX.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
}
