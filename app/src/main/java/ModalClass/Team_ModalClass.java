package ModalClass;

public class Team_ModalClass {
    private int TeamImg;
    private String TeamText1;
    private String TeamText2;
    private String TeamColor;

    public Team_ModalClass(int teamImg, String teamText1, String teamText2, String teamColor) {
        TeamImg = teamImg;
        TeamText1 = teamText1;
        TeamText2 = teamText2;
        TeamColor = teamColor;
    }

    public int getTeamImg() {
        return TeamImg;
    }

    public void setTeamImg(int teamImg) {
        TeamImg = teamImg;
    }

    public String getTeamText1() {
        return TeamText1;
    }

    public void setTeamText1(String teamText1) {
        TeamText1 = teamText1;
    }

    public String getTeamText2() {
        return TeamText2;
    }

    public void setTeamText2(String teamText2) {
        TeamText2 = teamText2;
    }

    public String getTeamColor() {
        return TeamColor;
    }

    public void setTeamColor(String teamColor) {
        TeamColor = teamColor;
    }
}
