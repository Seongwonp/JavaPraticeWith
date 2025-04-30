package ch_30_database.part_01;

public class Test06_UpdateUser {
    public static void main(String[] args) {
        DBUpdate db = new DBUpdate();
        db.connectDB();
        db.modifyUser();
        db.closeDB();
    }
}
