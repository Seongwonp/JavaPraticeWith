CREATE TABLE login_history
(
    -- 프라이머리키, 아이디, 성공/실패, 날짜
    no       INT AUTO_INCREMENT PRIMARY KEY, -- 인덱스
    memberId VARCHAR(10) NOT NULL, -- 회원 아이디
    success BOOLEAN NOT NULL, -- 로그인 성공 여부
    createdAt DATETIME DEFAULT CURRENT_TIMESTAMP() NOT NULL, -- 로그인 시도 날짜
    INDEX idx_memberId (memberId), -- 인덱스 적용 ,WHERE 나 ON에 사용하는 컬럼은 인덱스 적용
    CONSTRAINT login_history FOREIGN KEY (memberId) REFERENCES `member` (memberId)
);