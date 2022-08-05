import java.util.ArrayList;

public class Team<T> {

    private String name;
    private ArrayList<T> players = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if (players.contains(player)){
            System.out.println("This player" + player + " is already in the team");
            return false;
        }else{
            players.add(player);
            System.out.println("This player" + player + " is added to the team");
            return true;
        }
    }

    public int numberOfPlayers(){
        return players.size();
    }
}