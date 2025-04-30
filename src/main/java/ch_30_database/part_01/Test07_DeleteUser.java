package ch_30_database.part_01;

public class Test07_DeleteUser {
    public static void main(String[] args) {
        DBDelete db = new DBDelete();
        db.connectDB();
        db.removeUser();
        db.closeDB();
    }
}
