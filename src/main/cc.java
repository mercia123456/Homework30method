package main;

import com.sun.tools.internal.ws.wsdl.document.Import;

import java.sql.*;

public class cc {

    import
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
    public class Mysql {

        //public class GetDataFromTestDd {
        public static void main(String[] args) throws SQLException, ClassNotFoundException {

            String url="jdbc:mysql://localhost:3306/practice?useSSL=false&allowPublicKeyRetrieval=true";
            String user="root";
            String pass="khalid";

            String query="select * from newstudent";

            //registering driver
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                System.out.println("Class not found");
            }

            //establishing connection
            Connection connection= DriverManager.getConnection (url, user, pass);

            //create stmt object which holds statement created by connection class
            Statement stmt= connection.createStatement();

            //store execution of query by statement class in resultset object

            Resultsset = stmt.executeQuery(query);

            //process results
            if (resultSet.)
                resultSet.next();
            String name= resultSet.getString("name");
            System.out.println(name);

            //close
            stmt.close();
            connection.close();
        }

    }

}

}
