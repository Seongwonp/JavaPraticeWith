package ch_30_database.part_01;

public class Test05_selectUser {
    public static void main(String[] args) {
        DBSelect db = new DBSelect();
        db.connectDB();
        db.printUsers();
        db.printSearchUser();
        db.closeDB();
    }
}
