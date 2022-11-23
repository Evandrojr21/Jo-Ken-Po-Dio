
import java.util.Random;
import java.util.Scanner;

public record JokenPo (Player user, Player IA,int rounds){
    
    public void toPlay(){
        System.out.println("******** SEJA BEM-VINDO(A), "+user.getNome()+" ********\n");
        
        for(int i= 1; i <= rounds; i ++){
        int choiceUser = choiceUser();
        
        if(choiceUser < 1 || choiceUser > 3){
            System.out.println("\nJOGADA INVÁLIDA!! (1,2,3): ");
            System.out.println("\tPONTO PARA "+IA.getNome()+"\n");
            IA.incrementscore();
            continue;
            }
        
        int choiceIA = choiceIA();
        System.out.println("\n" + choiceUser + " X "+ choiceIA);
        
        int result = choiceUser - choiceIA;
        
        winnerround(result);
        
        } 
    }
    
    public void showFinalResult(){
        System.out.println("\n*****************************************************\n");
        
        Integer finalScoreUser = user.getScore();
        Integer finalScoreIA = IA.getScore();
        
        System.out.println("\n\tPLACAR FINAL: "+ user.getNome()+" "+ user.getScore()+" X "+ IA.getScore()+" "+ IA.getNome()); 
        
        if(finalScoreUser == finalScoreIA){
            System.out.println("\t\t\tEMPATE!!"); 
        }else{if(finalScoreUser == finalScoreIA){
            String finalWinner = (finalScoreIA > finalScoreUser) ? IA.getNome() : user.getNome();
            
            System.out.println("\t\tVENCEDOR = "+ finalWinner.toUpperCase());        
        }
        System.out.println("\n*****************************************************\n");
        }
    }
    private void winnerround(int result){
        
        String winnerRound;
        
        if(result == 0){
            winnerRound = "EMPATE";} 
        else {
            if(result == -1 || result == 2){
                IA().incrementscore();
                winnerRound = user.getNome();
                
            }else{
                user.incrementscore();
                winnerRound = user.getNome();
            }
        }
        System.out.println("\nVencedor do round: "+winnerRound+"\n");        
    }
   
            
    private int choiceIA(){
        Random random = new Random();
        return random.nextInt(3)+1;
    }
    private int choiceUser(){
        Scanner scam = new Scanner(System.in);
        System.out.println("1 - PEDRA ");
        System.out.println("2 - PAPEL ");
        System.out.println("3 - TESOURA ");
        
        System.out.println("Informe sua jogada: ");
        
        return scam.nextInt();
    }
}
