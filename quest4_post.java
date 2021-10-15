  
public class quest4_post {
    String text, link;
    int numeroCurtidas, numeroCompartilhamento;
    public quest4_post(tring text, String link){
        this.text = text;
        this.link = link;
    }
    public void Dar_curtida(){
        this.numeroCurtidas+=1;
    }
    public void compartilhar(){
        this.numeroCompartilhamento+=1;
    }
}