import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    /*
     * -------------------------------------------------------------
     * Aluno: Samuel Martins de Melo
     * Curso: Engenharia de Software
     * Instituição: UNIFAN
     * Professor: Brenno Pimenta
     * Data: Dezembro de 2025
     * -------------------------------------------------------------
     */
    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println("        Quiz de Conhecimento Minecraft   ");
        System.out.println("=========================================");


        Questao q1 = new Questao();
        q1.pergunta = "1. Qual é o minério mais comum encontrado no mundo do Minecraft?";
        q1.opcaoA = "A) Diamante";
        q1.opcaoB = "B) Ferro";
        q1.opcaoC = "C) Carvão";
        q1.opcaoD = "D) Ouro";
        q1.opcaoE = "E) Lápis-Lazúli";
        q1.correta = "C";

        q1.escrevaQuestao();
        String resp1 = q1.leiaResposta();
        q1.isCorreta(resp1);


        Questao q2 = new Questao();
        q2.pergunta = "2. Qual mob passivo dropa carne de porco crua e pode ser selado?";
        q2.opcaoA = "A) Vaca";
        q2.opcaoB = "B) Ovelha";
        q2.opcaoC = "C) Galinha";
        q2.opcaoD = "D) Porco";
        q2.opcaoE = "E) Cavalo";
        q2.correta = "D";

        q2.escrevaQuestao();
        String resp2 = q2.leiaResposta();
        q2.isCorreta(resp2);


        Questao q3 = new Questao();
        q3.pergunta = "3. Qual ferramenta é necessária para minerar Diamante (Diamond)?";
        q3.opcaoA = "A) Picareta de Pedra";
        q3.opcaoB = "B) Picareta de Ouro";
        q3.opcaoC = "C) Picareta de Madeira";
        q3.opcaoD = "D) Picareta de Ferro ou superior";
        q3.opcaoE = "E) Pá de Diamante";
        q3.correta = "D";

        q3.escrevaQuestao();
        String resp3 = q3.leiaResposta();
        q3.isCorreta(resp3);


        Questao q4 = new Questao();
        q4.pergunta = "4. Qual a dimensão (dimension) que o jogador pode acessar usando um portal de Obsidiana e Pederneira?";
        q4.opcaoA = "A) The End";
        q4.opcaoB = "B) O Submundo (Nether)";
        q4.opcaoC = "C) A Éter (Aether)";
        q4.opcaoD = "D) O Vazio (Void)";
        q4.opcaoE = "E) A Lua";
        q4.correta = "B";

        q4.escrevaQuestao();
        String resp4 = q4.leiaResposta();
        q4.isCorreta(resp4);


        Questao q5 = new Questao();
        q5.pergunta = "5. Qual o chefe final (boss) que é invocado no The End?";
        q5.opcaoA = "A) Wither";
        q5.opcaoB = "B) Elder Guardian";
        q5.opcaoC = "C) Ender Dragon";
        q5.opcaoD = "D) Warden";
        q5.opcaoE = "E) Iron Golem";
        q5.correta = "C";

        q5.escrevaQuestao();
        String resp5 = q5.leiaResposta();
        q5.isCorreta(resp5);


        Questao q6 = new Questao();
        q6.pergunta = "6. Quantos blocos de Madeira (logs) são necessários para criar uma Mesa de Trabalho (Crafting Table)?";
        q6.opcaoA = "A) 1";
        q6.opcaoB = "B) 2";
        q6.opcaoC = "C) 3";
        q6.opcaoD = "D) 4";
        q6.opcaoE = "E) 5";
        q6.correta = "A";

        q6.escrevaQuestao();
        String resp6 = q6.leiaResposta();
        q6.isCorreta(resp6);


        Questao q7 = new Questao();
        q7.pergunta = "7. Qual item é necessário para navegar em um barco na água?";
        q7.opcaoA = "A) Remo";
        q7.opcaoB = "B) Vela";
        q7.opcaoC = "C) Nada, o barco se move sozinho";
        q7.opcaoD = "D) O barco é movido com as teclas de movimento (WASD/setas)";
        q7.opcaoE = "E) Combustível";
        q7.correta = "D";

        q7.escrevaQuestao();
        String resp7 = q7.leiaResposta();
        q7.isCorreta(resp7);


        Questao q8 = new Questao();
        q8.pergunta = "8. Qual mob explode ao se aproximar do jogador?";
        q8.opcaoA = "A) Zumbi";
        q8.opcaoB = "B) Esqueleto";
        q8.opcaoC = "C) Creeper";
        q8.opcaoD = "D) Enderman";
        q8.opcaoE = "E) Aranha";
        q8.correta = "C";

        q8.escrevaQuestao();
        String resp8 = q8.leiaResposta();
        q8.isCorreta(resp8);


        Questao q9 = new Questao();
        q9.pergunta = "9. Qual o nome do bloco usado para criar Golems de Ferro (Iron Golems)?";
        q9.opcaoA = "A) Bloco de Ferro";
        q9.opcaoB = "B) Bloco de Diamante";
        q9.opcaoC = "C) Bloco de Ouro";
        q9.opcaoD = "D) Bloco de Pedra";
        q9.opcaoE = "E) Bloco de Cobre";
        q9.correta = "A";

        q9.escrevaQuestao();
        String resp9 = q9.leiaResposta();
        q9.isCorreta(resp9);


        Questao q10 = new Questao();
        q10.pergunta = "10. Qual a cor do portal para a dimensão The End?";
        q10.opcaoA = "A) Azul-Claro";
        q10.opcaoB = "B) Verde-Limão";
        q10.opcaoC = "C) Branco/Roxo-Claro";
        q10.opcaoD = "D) Preto/Estrelado";
        q10.opcaoE = "E) Laranja/Vermelho";
        q10.correta = "D";

        q10.escrevaQuestao();
        String resp10 = q10.leiaResposta();
        q10.isCorreta(resp10);


        Questao q11 = new Questao();
        q11.pergunta = "11. Qual a melhor fonte de experiência (XP) no início do jogo?";
        q11.opcaoA = "A) Minerar Diamante";
        q11.opcaoB = "B) Coletar Madeira";
        q11.opcaoC = "C) Matar Mobs hostis durante a noite";
        q11.opcaoD = "D) Pescar";
        q11.opcaoE = "E) Plantações";
        q11.correta = "C";

        q11.escrevaQuestao();
        String resp11 = q11.leiaResposta();
        q11.isCorreta(resp11);


        Questao q12 = new Questao();
        q12.pergunta = "12. Qual o ingrediente principal para fazer uma Poção de Força (Potion of Strength)?";
        q12.opcaoA = "A) Fungo do Nether (Nether Wart)";
        q12.opcaoB = "B) Pó de Blaze (Blaze Powder)";
        q12.opcaoC = "C) Olho de Aranha Fermentado";
        q12.opcaoD = "D) Lágrima de Ghast";
        q12.opcaoE = "E) Açúcar";
        q12.correta = "B";

        q12.escrevaQuestao();
        String resp12 = q12.leiaResposta();
        q12.isCorreta(resp12);


        Questao q13 = new Questao();
        q13.pergunta = "13. Qual o bloco que permite ao jogador armazenar itens de forma segura e com maior capacidade?";
        q13.opcaoA = "A) Fornalha (Furnace)";
        q13.opcaoB = "B) Baú (Chest)";
        q13.opcaoC = "C) Barril (Barrel)";
        q13.opcaoD = "D) Shulker Box";
        q13.opcaoE = "E) Dispensador (Dispenser)";
        q13.correta = "D";

        q13.escrevaQuestao();
        String resp13 = q13.leiaResposta();
        q13.isCorreta(resp13);


        Questao q14 = new Questao();
        q14.pergunta = "14. Qual item é usado para domar um cavalo?";
        q14.opcaoA = "A) Cenoura Dourada";
        q14.opcaoB = "B) Maçã Dourada";
        q14.opcaoC = "C) Selim (Saddle)";
        q14.opcaoD = "D) Armadura de Cavalo";
        q14.opcaoE = "E) Trigo";
        q14.correta = "C";

        q14.escrevaQuestao();
        String resp14 = q14.leiaResposta();
        q14.isCorreta(resp14);


        Questao q15 = new Questao();
        q15.pergunta = "15. Qual é o item que permite ao jogador planar após derrotar o Ender Dragon?";
        q15.opcaoA = "A) Asa de Morcego";
        q15.opcaoB = "B) Pena Mágica";
        q15.opcaoC = "C) Elytra";
        q15.opcaoD = "D) Firework Rocket";
        q15.opcaoE = "E) Asa de Fênix";
        q15.correta = "C";

        q15.escrevaQuestao();
        String resp15 = q15.leiaResposta();
        q15.isCorreta(resp15);


        System.out.println("=========================================");
        System.out.println("            Quiz Finalizado! ");
        System.out.println("=========================================");
    }
}