
public interface IplayerManager {

    public void registerPlayer(Player player,String fName,String lName,int TC,int birthYear);
    public void uptadePlayer(Player player,String fName, String lName, int TC, int birthYear);
    public void deletePlayer(Player player);

}