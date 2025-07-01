public class MInhasPreferidas {

    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 9){
            System.out.println(audio.getNome() + " é considerado sucesso absoluto!");
        }
        else{
            System.out.println(audio.getNome() + " também é um dos que o pessoal está curtindo!");
        }
    }
}
