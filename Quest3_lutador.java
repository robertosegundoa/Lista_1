public class Quest3_lutador {
    int energia, forca, receberGolpe;
    String nome;
    public Quest3_lutador(int energia, int forca, String nome) {
        this.energia = energia;
        this.forca = forca;
        this.nome = nome;
    }
    public void aplicarGolpe(Quest3_lutador lutador1){
        lutador1.receberGolpe = this.forca;
        lutador1.reduzirEnergia();
    }
    public void reduzirEnergia(){
       this.energia -= this.receberGolpe;
    }
}
    

