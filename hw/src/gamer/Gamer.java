package gamer;

public class Gamer extends Member {
    public Gamer(String name, String studentDepartment, Line line, Tear tear) { // 게임하는 사람 생성자
        super(name, studentDepartment, line, tear);
    }

    @Override
    public boolean isAccessibleToApplications() {
        return false;
    } // 지원자에 접근 할 수 없도록 false

}
