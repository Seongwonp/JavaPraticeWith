package ch_30_database.part_01;

public class Test04_InsertUser {
    public static void main(String[] args) {

        DBInsert db = new DBInsert();
        db.connectDB();
        db.addUser();
        db.closeDB();
    }
}
