
public class TennisGame2 implements TennisGame
{
	private static final int puntoLove = 0;
	private static final int punto15 = 1;
	private static final int punto30 = 2;
	private static final int punto40 = 3;
    private static final int gamePoint = 4;
	public int player1Points = 0;
    public int player2Points = 0;
    
    public String player1LiteralScore = "";
    public String player2LiteralScore = "";


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
        String score = "";
        if (player1Points == player2Points && player1Points < gamePoint)
        	score= convertPointsToLiteral(player1Points) + "-All";  
        if (player1Points==player2Points && player1Points>=punto40)
            score = "Deuce";
        if (player1Points > puntoLove && player2Points==puntoLove)
        	score = convertPointsToLiteral(player1Points) + "Love"; 
        if (player2Points > puntoLove && player1Points==puntoLove)
        	score =  "Love" + convertPointsToLiteral(player2Points); 
        if (player1Points>player2Points && player1Points < gamePoint)     
            score = convertPointsToLiteral(player1Points) + "-" + convertPointsToLiteral(player2Points);
        if (player2Points>player1Points && player2Points < gamePoint)
        	score = convertPointsToLiteral(player1Points) + "-" + convertPointsToLiteral(player2Points);
        if (player1Points > player2Points && player2Points >= punto40)
            score = "Advantage player1";    
        if (player2Points > player1Points && player1Points >= punto40)
            score = "Advantage player2";
        if (player1Points>=4 && player2Points>=puntoLove && (player1Points-player2Points)>=2)
            score = "Win for player1";
        if (player2Points>=4 && player1Points>=puntoLove && (player2Points-player1Points)>=2)
            score = "Win for player2";
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