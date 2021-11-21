/**
 * program
 */
public class program {

    public static void main(String[] args) {
        Player player = new Player();
        Offer offer = new Offer();
        Game game = new Game();
        PlayerCheckManager playerCheckManager = new PlayerCheckManager();
        PlayerManager playerManager = new PlayerManager();
        offerManger offerManger = new offerManger();
        if (game.isgBuy(playerCheckManager, player)) {
            System.out.println("Login successful!!");
            /*
             * playerManager.deletePlayer(player); playerManager.uptadePlayer(player,
             * "Yusuf", "Balık", 1556, 465651);
             */
            playerManager.registerPlayer(player, "Yusuf", "Balık", 1556, 465651);
            game.setAll("WOLFTEAM", 50);
            offerManger.registerOffer(offer, game, "Premium ", 20);
            /*
             * offerManger.deleteOffer(offer); offerManger.uptadeOffer(offer, game, "oName",
             * 5);
             */
        }
        else
        {
            System.out.println("Login unsuccessful!!");
        }

    }
}