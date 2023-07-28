import com.sun.source.tree.ReturnTree;

public class usuario {
    String nome, linguagem ;
    int idade, CPFnumero;
    boolean assinaturaPremium;

    public String getNome(){
     return nome;
    }
    public void setNome(String newNome){
     nome = newNome;
    }
    public int getIdade(){
     return idade;
    }
    public void setIdade(int newIdade) {
     idade = newIdade;
    }
    public boolean getAssinaturaPremium(){
     return assinaturaPremium;
    }
    public void setAssinaturaPremium (boolean newAssinaturaPremium){
      assinaturaPremium = newAssinaturaPremium;
    }
    public String getLinguagemProgramacao(){
     return linguagem;
    }
    public void setLinguagemProgramacao(String newLinguagem){
     linguagem = newLinguagem;

    }
    private int getCPFnumero(){
        return  CPFnumero;
    }
    public void setCPFnumero(int newCPFnumero){
        CPFnumero = newCPFnumero;
    }

    public void usuarioCadastroInformacoes(String nome,int idade,boolean assinaturaPremium,String linguagem,int CPFnumero){
        setNome(nome);
        setIdade(idade);
        setAssinaturaPremium(assinaturaPremium);
        setLinguagemProgramacao(linguagem);
        setCPFnumero(CPFnumero);
    }
}
