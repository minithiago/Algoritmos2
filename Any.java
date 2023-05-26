import java.util.HashSet;

public class Any {
    public static void main(String[] args) {
        long numero = 453891206;
        int digitosUnicos = digitsDiferents(numero);
        System.out.println("Numero de digitos diferentes: " + digitosUnicos);
    }

    public static int digitsDiferents(long numero) {
        HashSet<Long> digitos = new HashSet<>();

        while (numero != 0) {
            long digit = numero % 10;
            digitos.add(digit);
            numero /= 10;
        }

        return digitos.size();
    }
}
