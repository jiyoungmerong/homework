package gamer;


import java.util.Random;

public enum Line {
    MID,
    TOP,
    SUPP,
    ADC,
    JG;
    public static Line getRandom() { // 라인 랜덤 배정 메소드
        return values()[(int) (Math.random() * values().length)];
    }
}
