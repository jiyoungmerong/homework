package main;
import java.util.Random;
import etc.Application;
import gamer.*;

import static gamer.Line.getRandom;

public class Main {
    public static void main(String[] args) {
        // 나 생성
        JiYoung jiyoung = new JiYoung("허지영", "IT", Line.SUPP, Tear.PLATINUM);

        jiyoung.getPlayingGame(); // 메소드 출력

        // 내 이름과 티어 출력
        System.out.println("내 이름 : " + jiyoung.getName() + ", 라인은 : " + jiyoung.getLine() + ", 티어는 : " + Tear.PLATINUM);

        // 같이 게임하는 사람 생성
        Gamer gamer1 = new Gamer("천성우", "IT", Line.JG, Tear.GOLD);
        Gamer gamer2 = new Gamer("송새봄", "IT", Line.TOP, Tear.SILVER);
        Gamer gamer3 = new Gamer("임우찬", "IT", Line.MID, Tear.GOLD);
        Gamer gamer4 = new Gamer("최정의", "IT", Line.ADC, Tear.SILVER);

        // 사람들 정보 출력
        System.out.println("이름 : " + gamer1.getName() + ", 라인은 : " + gamer1.getLine() +  ", 티어는 : " + gamer1.getTear());
        System.out.println("이름 : " + gamer2.getName() + ", 라인은 : " + gamer2.getLine() +  ", 티어는 : " + gamer2.getTear());
        System.out.println("이름 : " + gamer3.getName() + ", 라인은 : " + gamer3.getLine() +  ", 티어는 : " + gamer3.getTear());
        System.out.println("이름 : " + gamer4.getName() + ", 라인은 : " + gamer4.getLine() +  ", 티어는 : " + gamer4.getTear());

        // 이름 입력 안 한 사람 생성
        // Gamer gamer5 = new Gamer("", "IT", Line.SUPP, Tear.GOLD);

        // 이름 입력 안 한 사람 정보 출력
        // System.out.println("이름 : " + gamer5.getName() + ", 라인은 : " + gamer5.getLine() +  ", 티어는 : " + gamer5.getTear());

        // 티어가 브론즈인 사람 생성
        // Gamer gamer6 = new Gamer("박신영", "IT", Line.MID, Tear.BRONZE);

        // 티어가 브론즈인 사람 정보 출력
        // System.out.println("이름 : " + gamer6.getName() + ", 라인은 : " + gamer6.getLine() +  ", 티어는 : " + gamer6.getTear());

        // 지원자 생성
        Application application = new Application("지원자 1", "기록지");

        // 내가 지원자에 접근
        System.out.println("허지영이 지원자 접근 : " + application.getApplicant(jiyoung));

        // 내가 지원자의 기록에 접근
        System.out.println("허지영이 지원자 기록지 : " + application.getRecord(jiyoung) + " 접근 가능");

        // 같이 게임하는 사람이 지원자에 접근
        // System.out.println("접근 : " + application.getApplicant(gamer1));

        // 같이 게임하는 사람이 기록에 접근
        System.out.println("팀원이 지원자 기록지 : " + application.getRecord(gamer1) + " 접근 가능");

        System.out.println("당신의 라인은 " + getRandom() + "입니다.");

    }
}
