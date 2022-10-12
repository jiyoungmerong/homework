package gamer;

public class JiYoung extends Member {
    public JiYoung(String name, String studentDepartment, Line line, Tear tear) { // 생성자
        super(name, studentDepartment, line, tear);
    }

    @Override
    public boolean isAccessibleToApplications() {
        return true;
    } // 지원자에 접근 가능하도록

    public void getPlayingGame() {
        System.out.println("지금은 게임 중...");
    }




}
