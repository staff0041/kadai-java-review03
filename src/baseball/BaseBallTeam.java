package baseball;

public class BaseBallTeam {

    private String name;
    private int win;
    private int lose;
    private int draw;

    public BaseBallTeam() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public double getRate() {
        return (double) win / (win + lose);
    }

    public void report() {
        System.out.println(name + " の2022年の成績は " + win + "勝 " + lose + "敗 " + draw + "分、勝率は " + getRate() + "です。");
    }
}