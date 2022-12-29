package ModalClass;

public class Player_ModalClass {
    private int PlayerImg;
    private String PlayerText1;
    private String PlayerText2;

    public Player_ModalClass(int playerImg, String playerText1, String playerText2) {
        PlayerImg = playerImg;
        PlayerText1 = playerText1;
        PlayerText2 = playerText2;
    }

    public int getPlayerImg() {
        return PlayerImg;
    }

    public void setPlayerImg(int playerImg) {
        PlayerImg = playerImg;
    }

    public String getPlayerText1() {
        return PlayerText1;
    }

    public void setPlayerText1(String playerText1) {
        PlayerText1 = playerText1;
    }

    public String getPlayerText2() {
        return PlayerText2;
    }

    public void setPlayerText2(String playerText2) {
        PlayerText2 = playerText2;
    }
}
