public class Game {

    private String gName;
    private double gPrice;

    public void setGName(String gName) {
        this.gName = gName;
    }
    public void setGPrice(double gPrice) {
        this.gPrice = gPrice;
    }

    
    public String getGName() {
        return this.gName;
    }

    public void setAll(String gName,double gPrice) {
        this.gName = gName;
        this.gPrice=gPrice;
    }

    public double getGPrice() {
        return this.gPrice;
    }

    public boolean isgBuy(PlayerCheckManager playerCheckManager,Player player)
    {
        return playerCheckManager.playerCheck(player);
    }
    public void setgPrice(double gPrice)
    {
        this.gPrice=gPrice;
    }
    
}
