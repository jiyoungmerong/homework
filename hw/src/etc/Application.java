package etc;
import gamer.Member;

public class Application {
    private String applicant; // 지원자

    private String record; // 기록지(op.gg)

    public Application(String applicant, String record) { // 생성자
        this.applicant = applicant;
        this.record = record;
    }

    public String getApplicant(Member member){ // 지원한 사람은 나만 볼 수 있게
        if(member.isAccessibleToApplications() == true){
            return this.applicant;
        }
        throw new IllegalArgumentException("당신은 허지영이 아닙니다.");
    }

    public String getRecord(Member member){ // 기록은 모두 볼 수 있게
        return this.record;
    } // 기록은 모두가 볼 수 있게
}