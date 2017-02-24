
public class TennisGame2 implements TennisGame
{
	private static final int puntoLove = 0;
	private static final int punto15 = 1;
	private static final int punto30 = 2;
	private static final int punto40 = 3;
    private static final int gamePoint = 4;
	public int player1Points = 0;
    public int player2Points = 0;
    public String literalScore="";
    


    public TennisGame2() {
    }

    public String convertPointsToLiteral(int points)
    {
    	if (points==puntoLove)
            return "Love";
        if (points==punto15)
        	return "Fifteen";
        if (points==punto30)
        	return "Thirty";
        if (points==punto40)
        	return "Forty";
        return"";
    }
    
    public String getScore(){
    	
        tiedScore();
        returnScoreLowerGamePoint();
        advantageForPlayer();
        playerWinsGame();
        return literalScore;
        
    }

	public void tiedScore() {
		if (player1Points == player2Points && player1Points < punto40)
			literalScore=   convertPointsToLiteral(player1Points) + "-All";  
        if (player1Points==player2Points && player1Points>=punto40)
        	literalScore=   "Deuce";
	}

	public void returnScoreLowerGamePoint() {
		if (player1Points>player2Points && player1Points < gamePoint)     
			literalScore=  convertPointsToLiteral(player1Points) + "-" + convertPointsToLiteral(player2Points);
        if (player2Points>player1Points && player2Points < gamePoint)
        	literalScore=  convertPointsToLiteral(player1Points) + "-" + convertPointsToLiteral(player2Points);
	}

	public void advantageForPlayer() {
		if (player1Points > player2Points && player2Points >= punto40 && (player1Points - player2Points == 1) )
			literalScore= "Advantage player1";    
        if (player2Points > player1Points && player1Points >= punto40 && (player2Points - player1Points == 1))
        	literalScore= "Advantage player2";
	}

	public void playerWinsGame() {
		if (player1Points>=gamePoint && player2Points>=puntoLove && ((player1Points-player2Points)>=2))
            literalScore= "Win for player1";
        if (player2Points>=gamePoint && player1Points>=puntoLove && (player2Points-player1Points)>=2)
        	literalScore= "Win for player2";
        	
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