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

    public static boolean verificarAnagrama(String primeiraPalavra,String segundaPalavra){
        boolean resultado = true;

        if (primeiraPalavra.length() != segundaPalavra.length()){
            resultado = false;
        }else{
            for (int i = 0;i <= segundaPalavra.length()-1;i++){

                char letra = segundaPalavra.charAt(i);
                String letraConvertida = String.valueOf(letra);
                System.out.println("Não deu certo");

                if (!(primeiraPalavra.contains(letraConvertida))){
                    resultado = false;
                    System.out.println("Não existe essa letra na segunda palavra");
                    break;
                }

            }
        }

        return resultado;
    }

}
