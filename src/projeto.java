
public class projeto {
    float numeroHash;
    int numeroVisualizacaoProjeto;
    String nomeProjeto, linguagemProjeto;
    public int getNumeroVizualizacaoProjeto(){
        return numeroVisualizacaoProjeto;
    }
    public void setNumeroVizualizacaoProjeto(int newNumeroVisualizao){
        numeroVisualizacaoProjeto = newNumeroVisualizao;
    }
    public String getNomeProjeto(){
        return nomeProjeto;
    }
    public void setLinguagenProjeto( String newLinguagemProjeto){
        linguagemProjeto =  newLinguagemProjeto;
    }
    public String getlinguagemProjeto(){
        return linguagemProjeto;
    }
    public void setNomeProjeto( String newNomeProjeto){
        nomeProjeto =  newNomeProjeto;
    }
    private float getNumeroHash(){
        return numeroHash;
    }
    public void setProjetoHash( float newNumeroHash){
        numeroHash = newNumeroHash;
    }
    public void cadastroNovoProjeto(float numeroHash, String linguagemProjeto, int numeroVisualizacaoProjeto, String nomeProjeto ){
        setNomeProjeto(nomeProjeto);
        setNumeroVizualizacaoProjeto(numeroVisualizacaoProjeto);
        setLinguagenProjeto(linguagemProjeto);
        setProjetoHash(numeroHash);
    }
}
