package ch_31_collection.part_02_vector;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<BoardDTO>boardDTOList = new Vector<>();

        //Board 객체를 저장
        boardDTOList.add(new BoardDTO("제목1", "내용1", "글쓴이1"));
        boardDTOList.add(new BoardDTO("제목2", "내용2", "글쓴이2"));
        boardDTOList.add(new BoardDTO("제목3", "내용3", "글쓴이3"));
        boardDTOList.add(new BoardDTO("제목4", "내용4", "글쓴이4"));
        boardDTOList.add(new BoardDTO("제목5", "내용5", "글쓴이5"));

        //for문으로 제목, 내용, 글쓴이 출력
        System.out.println("제목  | 내용  | 글쓴이");
        for(int i=0; i<boardDTOList.size(); i++){
            BoardDTO boardDTO = boardDTOList.get(i);
            System.out.println(boardDTO.getSubject() + " | "
                    + boardDTO.getContent() + " | " + boardDTO.getWriter());
        }
        System.out.println();

        boardDTOList.remove(2); //제목 3 삭제
        boardDTOList.remove(2); //제목 4 삭제

        //for-each문으로 제목, 내용, 글쓴이 출력
        System.out.println("for-each 문으로 제목, 내용, 글쓴이 출력");
        System.out.println("제목  | 내용  | 글쓴이 ");
        for(BoardDTO boardDTO : boardDTOList){
            System.out.println(boardDTO.getSubject() + " | "
                    + boardDTO.getContent() + " | " + boardDTO.getWriter());
        }



    }
}
