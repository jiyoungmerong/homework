package gamer;

import static gamer.Tear.BRONZE;

public abstract class Member {
    private String name; // 이름
    private String studentDepartment; // 학과
    private Line line; // 라인
    private Tear tear; // 티어


    public Member(String name, String studentDepartment, Line line, Tear tear) {
        if(name == null || name.length() < 1) // 이름이 비어있을 때
            throw new IllegalArgumentException("이름 넣어서 보내세요");

        else if(tear.equals(BRONZE)) // 티어가 브론즈일 때
            throw new IllegalArgumentException("브론즈는 같이 못 해요");

        this.name = name;
        this.studentDepartment = studentDepartment;
        this.line = line;
        this.tear = tear;
    } // 생성자

    public String getName() { // 이름 데이터 읽어오기
        return name;
    } // 이름 가져오기

    public String getStudentDepartment() { // 학과 데이터 읽어오기
        return studentDepartment;
    } // 학번 가져오기

    public Line getLine() { // 라인 데이터 읽어오기
        return line;
    } // 라인 가져오기

    public Tear getTear() { // 티어 데이터 읽어오기
        return tear;
    } // 티어 가져오기



    public abstract boolean isAccessibleToApplications();


}
