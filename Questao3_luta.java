public class Questao3_luta {
    Quest3_lutador lutador01 = new Quest3_lutador(100, 10, "Ryu");
    Quest3_lutador lutador02 = new Quest3_lutador(100, 12, "Bison");
    lutador01.aplicarGolpe(lutador02);
    lutador01.aplicarGolpe(lutador02);
    lutador01.aplicarGolpe(lutador02);
    System.out.println(lutador02.nome+"---Energia: "+lutador02.energia);
    lutador02.aplicarGolpe(lutador01);
    lutador02.aplicarGolpe(lutador01);
    lutador02.aplicarGolpe(lutador01);
    lutador02.aplicarGolpe(lutador01);
    lutador02.aplicarGolpe(lutador01);
    lutador02.aplicarGolpe(lutador01);
    lutador02.aplicarGolpe(lutador01);
    lutador02.aplicarGolpe(lutador01);
    System.out.println(lutador01.nome+"---Energia: "+lutador01.energia);
}
