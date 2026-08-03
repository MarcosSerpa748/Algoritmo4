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

        for (int i = 0;i <= segundaPalavra.length()-1;i++){

            char letra = segundaPalavra.charAt(i);
            String letraConvertida = String.valueOf(letra);

            if (!primeiraPalavra.contains(letraConvertida) && primeiraPalavra.length() != segundaPalavra.length()){
                resultado = false;
                break;
            }

        }
        return resultado;
    }

}
