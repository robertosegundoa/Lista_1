public class quest4_post_facebook {
    
    public static void main(String[] args){
        quest4_post vegan = new quest4_post("'coma mais vegetais!'," "https://www.instagram.com");
        vegan.Dar_curtida();
        vegan.Dar_curtida();
        vegan.Dar_curtida();
        System.out.println("Quantidade de curtidas: "+vegan.numeroCurtidas);
        vegan.compartilhar();
        vegan.compartilhar();
        System.out.println("Quantidade de compartilhamentos: "+vegan.numeroCompartilhamento);
    }
}

