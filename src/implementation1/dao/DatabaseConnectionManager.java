package implementation1.dao;

public class DatabaseConnectionManager {

    private static DatabaseConnectionManager databaseConnectionManager;

    public static DatabaseConnectionManager getManagerInstance(){
        if(databaseConnectionManager==null){
            return new DatabaseConnectionManager();
        }
        return databaseConnectionManager;
    }

    public void getConnection(){
    }

    public void getConnectionObject(){}

    public void disconnect(){}



}
