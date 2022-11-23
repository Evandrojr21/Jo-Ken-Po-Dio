public class Player {
    private String nome;
    private Integer score;

    public Player(String nome) {
        this.nome = nome;
        this.score = 0;
    }
    public void incrementscore(){
        setScore(getScore() + 1);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
    
}
