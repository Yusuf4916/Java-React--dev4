public interface IOffer {
    public void registerOffer(Offer offer,Game game,String oName,double oDiscount);
    public void uptadeOffer(Offer offer,Game game,String oName,double oDiscount);
    public void deleteOffer(Offer offer);
}
