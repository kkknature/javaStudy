package exam;

import java.util.ArrayList;

public class ScoreExample {
    public static void main(String[] args) {

        Score score1 = new Score(1, "홍길동", 100, 100, 100);
        Score score2 = new Score(2, "박문수", 80, 80, 90);
        Score score3 = new Score(3, "임꺽정", 60, 100, 80);
        Score score4 = new Score(4, "장길산", 90, 70, 80);
        Score score5 = new Score(5, "이몽룡", 70, 90, 70);

        ArrayList<Score> scores = new ArrayList<>();
        scores.add(score1);
        scores.add(score2);
        scores.add(score3);
        scores.add(score4);
        scores.add(score5);

        System.out.print("학번\t");
        System.out.print("이름\t");
        System.out.print("국어\t");
        System.out.print("영어\t");
        System.out.print("수학\t");
        System.out.print("총점\t");
        System.out.print("평균\t");
        System.out.println();

        for (Score score : scores) {
            int allScore = (score.getKoreanScore() + score.getEnglishScore() + score.getMathScore());
            int avgScore = allScore / 3;
            System.out.print(score.getHakbun() + "\t");
            System.out.print(score.getName() + "\t");
            System.out.print(score.getKoreanScore() + "\t");
            System.out.print(score.getEnglishScore() + "\t");
            System.out.print(score.getMathScore() + "\t");
            System.out.print(allScore + "\t");
            System.out.print(avgScore + "\t");
            System.out.println();
        }
    }
}
