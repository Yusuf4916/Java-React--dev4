public class PlayerManager implements IplayerManager{

    @Override
    public void registerPlayer(Player player, String fName, String lName, int TC, int birthYear) {
        player.setAll(fName, lName, TC, birthYear);
        System.out.println("Player Register : "+player.getFName()+" "+player.getLName());
    }

    @Override
    public void uptadePlayer(Player player,String fName, String lName, int TC, int birthYear) {
        System.out.println(player.getFName()+"'s new name is "+fName);
        player.setAll(fName, lName, TC, birthYear);
        
    }

    @Override
    public void deletePlayer(Player player) {
        System.out.println(player.getFName()+"'s deleted! ");
    }




    
}
