public class offerManger implements IOffer{


    @Override
    public void registerOffer(Offer offer, Game game, String oName, double oDiscount) {
        offer.setAll(oName, oDiscount);
        System.out.println(game.getGName()+" game price "+game.getGPrice());
        System.out.println(offer.getOName()+"campaign offers "+offer.getODiscount()+"% discount");
        game.setgPrice(game.getGPrice()*((100-oDiscount)/100));
        System.out.println(game.getGName()+" Game new price : "+game.getGPrice());
    }

    @Override
    public void uptadeOffer(Offer offer, Game game, String oName, double oDiscount) {
        System.out.println(offer.getOName()+" campaign now has new name "+oName+" and its percentage is "+oDiscount+"%");
        offer.setAll(oName, oDiscount);
        game.setgPrice(game.getGPrice()*((100-oDiscount)/100));
        System.out.println(game.getGName()+" game new price "+game.getGPrice());
        
    }

    @Override
    public void deleteOffer(Offer offer) {
        System.out.println(offer.getOName()+"' deleted! ");
        
    }
}