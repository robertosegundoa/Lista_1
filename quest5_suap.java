public class quest5_suap {

    public static void main(String[] args){
        quest5_discente Roberto = new quest5_discente("Roberto Santos Nascimento", "071.727.335-09");
        Roberto.n1 = 10.00;
        Roberto.n2 = 10.00;
        Roberto.n3 = 10.00;
        double media;
        media = Roberto.Media_discente();
        System.out.println("Media do aluno "+Roberto.nome+": "+media);
        Roberto.n2 = 0;
        media = Roberto.Media_discente();
        System.out.println("Media do aluno "+Roberto.nome+": "+media);
    }
}
    

