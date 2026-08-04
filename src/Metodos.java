public class Metodos {

    public static Boolean verificarAnaclico(String primeiraPalavra, String segundaPalavra){
        String palavraInvertida = "";
        for (int i = segundaPalavra.length()-1;i >= 0;i--){

            char letra = segundaPalavra.charAt(i);
            String letraConvertida = String.valueOf(letra);
            palavraInvertida = palavraInvertida.concat(letraConvertida);
        }

        if (palavraInvertida.equalsIgnoreCase(primeiraPalavra)){
            return true;
        }else{
            return false;
        }


    }

    public static Boolean verificarAnagrama(String primeiraPalavra,String segundaPalavra){
        Boolean resultado = true;
        String palavraMinimizada1 = primeiraPalavra.toLowerCase();
        String palavraMinimizada2 = segundaPalavra.toLowerCase();

        if (palavraMinimizada1.length() != palavraMinimizada2.length()){
            resultado = false;
        }else{
            for (int i = 0;i <= palavraMinimizada1.length()-1;i++){

                char letra2 = palavraMinimizada2.charAt(i);
                String letraConvertida2 = String.valueOf(letra2);
                char letra1 = palavraMinimizada1.charAt(i);
                String letraConvertida1 = String.valueOf(letra1);

                if (!palavraMinimizada1.contains(letraConvertida2) || !palavraMinimizada2.contains(letraConvertida1)){
                    resultado = false;
                    break;
                }
            }
        }

        return resultado;
    }

}
