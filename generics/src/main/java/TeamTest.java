public class TeamTest {


    public static void main(String[] args) {

        FootballPlayer ismail = new FootballPlayer("ismail");
        SoccerPlayer nihal = new SoccerPlayer("nihal");
        BaseballPlayer nail = new BaseballPlayer("nail");

        Team<SoccerPlayer> liverpool = new Team("liverpool");
        //liverpool.addPlayer(ismail);
        liverpool.addPlayer(nihal);
        //liverpool.addPlayer(nail);

        liverpool.numberOfPlayers();


    }
}
