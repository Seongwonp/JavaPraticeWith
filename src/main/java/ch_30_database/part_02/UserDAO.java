package ch_30_database.part_02;
import java.util.*;

public interface UserDAO {
    List<UserDTO> selectUsers();
    UserDTO selectUser(String userId);
    boolean insertUser(UserDTO user);
    boolean selectDuplicateId(String userId);
    boolean updateUser(UserDTO user);
    boolean deleteUser(String userId);

}
