package ch_30_database.part_01;

public class Test03_CreateTable {
    public static void main(String[] args) {
        String tableName = "tUser";
        String sql = "CREATE TABLE " + tableName + " " +
                "(userId VARCHAR(100) PRIMARY KEY, " +
                "name VARCHAR(100), " +
                "age INT, " + "job VARCHAR(100));";

        DBCreate db = new DBCreate();
        db.connectDB();
        db.createTable(tableName, sql);
        db.closeDB();


    }
}
