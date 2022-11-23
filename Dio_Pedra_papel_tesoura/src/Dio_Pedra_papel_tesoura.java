
import java.util.Scanner;

public class Dio_Pedra_papel_tesoura {
    
    public static JokenPo startgame(){
        
        System.out.println("******** Jo-Ken-Po ********\n");
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe seu nome: ");
        String playername = scan.next().toUpperCase();
        
        Player user = new Player(playername);
        Player IA = new Player("IA");
        
        System.out.println(playername + " ,informe quantos rounds você quer jogar: ");
        int rounds = scan.nextInt();
        
        return new JokenPo(user, IA, rounds);
    }
    
    public static void main(String[] args) {
       JokenPo jokenPo = startgame();
       jokenPo.toPlay();
       jokenPo.showFinalResult();
    }
    
}
