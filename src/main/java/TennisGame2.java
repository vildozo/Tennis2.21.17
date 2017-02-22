
public class TennisGame2 implements TennisGame
{
    private static final int punto40 = 3;
	private static final int punto30 = 2;
	private static final int punto15 = 1;
	private static final int puntoLove = 0;
	public int player1Points = 0;
    public int player2Points = 0;
    
    public String player1LiteralScore = "";
    public String player2LiteralScore = "";


    public TennisGame2() {
    }

    
    public String getScore(){
        String score = "";
        if (player1Points == player2Points && player1Points < 4)
        {
            if (player1Points==puntoLove)
                score = "Love";
            if (player1Points==punto15)
                score = "Fifteen";
            if (player1Points==punto30)
                score = "Thirty";
            score += "-All";
        }
        if (player1Points==player2Points && player1Points>=punto40)
            score = "Deuce";
        
        if (player1Points > puntoLove && player2Points==puntoLove)
        {
            if (player1Points==punto15)
                player1LiteralScore = "Fifteen";
            if (player1Points==punto30)
                player1LiteralScore = "Thirty";
            if (player1Points==punto40)
                player1LiteralScore = "Forty";
            
            player2LiteralScore = "Love";
            score = player1LiteralScore + "-" + player2LiteralScore;
        }
        if (player2Points > puntoLove && player1Points==puntoLove)
        {
            if (player2Points==punto15)
                player2LiteralScore = "Fifteen";
            if (player2Points==punto30)
                player2LiteralScore = "Thirty";
            if (player2Points==punto40)
                player2LiteralScore = "Forty";
            
            player1LiteralScore = "Love";
            score = player1LiteralScore + "-" + player2LiteralScore;
        }
        
        if (player1Points>player2Points && player1Points < 4)
        {
            if (player1Points==punto30)
                player1LiteralScore="Thirty";
            if (player1Points==3)
                player1LiteralScore="Forty";
            if (player2Points==punto15)
                player2LiteralScore="Fifteen";
            if (player2Points==punto30)
                player2LiteralScore="Thirty";
            score = player1LiteralScore + "-" + player2LiteralScore;
        }
        if (player2Points>player1Points && player2Points < 4)
        {
            if (player2Points==punto30)
                player2LiteralScore="Thirty";
            if (player2Points==3)
                player2LiteralScore="Forty";
            if (player1Points==punto15)
                player1LiteralScore="Fifteen";
            if (player1Points==punto30)
                player1LiteralScore="Thirty";
            score = player1LiteralScore + "-" + player2LiteralScore;
        }
        
        if (player1Points > player2Points && player2Points >= punto40)
        {
            score = "Advantage player1";
        }
        
        if (player2Points > player1Points && player1Points >= punto40)
        {
            score = "Advantage player2";
        }
        
        if (player1Points>=4 && player2Points>=puntoLove && (player1Points-player2Points)>=2)
        {
            score = "Win for player1";
        }
        if (player2Points>=4 && player1Points>=puntoLove && (player2Points-player1Points)>=2)
        {
            score = "Win for player2";
        }
        return score;
    }
    
    public void SetP1Score(int number){
        
        for (int i = 0; i < number; i++)
        {
            P1Score();
        }
            
    }
    
    public void SetP2Score(int number){
        
        for (int i = 0; i < number; i++)
        {
            P2Score();
        }
            
    }
    
    public void P1Score(){
        player1Points++;
    }
    
    public void P2Score(){
        player2Points++;
    }

    public void wonPoint(String player) {
        if (player == "player1")
            P1Score();
        else
            P2Score();
    }
}