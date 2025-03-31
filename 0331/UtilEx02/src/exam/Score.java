package exam;

public class Score {
    private int hakbun;
    private String name;
    private int koreanScore;
    private int englishScore;
    private int mathScore;

    public Score(int hakbun, String name, int koreanScore, int englishScore, int mathScore) {
        this.hakbun = hakbun;
        this.name = name;
        this.koreanScore = koreanScore;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }

    public int getHakbun() {
        return hakbun;
    }

    public String getName() {
        return name;
    }

    public int getKoreanScore() {
        return koreanScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public int getMathScore() {
        return mathScore;
    }
}
