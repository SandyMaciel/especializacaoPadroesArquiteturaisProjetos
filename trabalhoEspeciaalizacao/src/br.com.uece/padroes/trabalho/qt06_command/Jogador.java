package qt06_command;

public class Jogador {
    private String nome;

    public Jogador(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Jogador: "+this.nome;
    }
}
