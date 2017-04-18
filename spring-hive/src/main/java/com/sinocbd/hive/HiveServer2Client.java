package com.sinocbd.hive;

/**
 * Created by kuzoncby on 1/12/17.
 */
public class HiveServer2Client {
    public void hive() throws ClassNotFoundException {
        Class.forName("org.apache.hive.jdbc.HiveDriver");
        try {
            Connection con = DriverManager.getConnection("jdbc:hive2://hadoop:10000/logdb", "hadoop", "");
            PreparedStatement sta = con.prepareStatement("select cast(date as date) from ccp group bycast(date as date)");
            ResultSet result = sta.executeQuery();
            while (result.next()) {
                System.out.println(result.getDate(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

