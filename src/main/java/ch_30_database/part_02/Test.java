package ch_30_database.part_02;
/*
   작업 목표 : part 1 작업에 디자인 패턴을 적용.
   최대한 스프링 부트와 유사하게 작업할 것.
   테스트 코드 작성할 것

   1) 데이터베이스 관련 클래스를 DTO, DAO, 데이터베이스를 연결을 담당하는 클래스를 분리.

   2) MVC 디자인패턴을 적용. (스프링 부트에서 사용)
   Controller : 사용자 입력, 출력 처리
   Service : 비지니스 로직 담당. Controller 와 DAO 연결
   DAO : 데이터베이스 연동 처리. (SQL 수행)

   3) try with resource 사용해서 자동으로 close() 처리.

   1. 클래스
   1) Controller
   UserController : 사용자 입력, 출력 처리

   2) Service
   UserService : 비지니스 로직 담당하는 인터페이스. Controller 와 DAO 연결.
   UserServiceImpl : UserService 인터페이스를 구현한 클래스.

   3) DAO
   UserDTO : 데이터를 담을 DTO Data Translate Object 클래스
   UserDAO : 데이터베이스 작업을 담당할 메서드를 선언할 DAO Data Access Object 인터페이스
   UserDAOImpl : UserDAO 인터페이스를 구현한 클래스.
   인터페이스의 구현체로 데이터베이스 작업을 하면, 데이터베이스가 변경이 되더라도 구현체만 다시 만들면 됨.
   DBConnection : 데이터베이스 연결 처리

   2. 데이터베이스 항목
    사용자 Id, 문자열, primary key : userId
    사용자 이름 : name
    나이 정수 : age
    직업 문자열 : job

   3. DAO에 필요한 메서드
   1) 회원 정보 입력
   boolean insertUser(UserDTO);
   2) 전체 회원 조회
   List<UserDTO> selectUsers();
   3) 특정 회원 조회
   UserDTO selectUser(String userId);
   4) 회원 정보 수정 - 아이디는 수정 불가, 나머지 항목은 수정 가능
   boolean updateUser(UserDTO user);
   5) 회원 정보 삭제
   boolean deleteUser(String userId);
    */

public class Test {

}
