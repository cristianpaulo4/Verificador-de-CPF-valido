package cpf;

public class CPF {

    public boolean verificador(String numero) {

        int cpf[];
        cpf = new int[14];
        int multi = 10;
        int soma = 0;
        int resultado;
        String num_cpf = numero;

        int primeiro;
        int segundo;

        for (int i = 0; i < cpf.length; i++) {
            if (i != 3 && i != 7 && i != 11) {
                cpf[i] = Character.getNumericValue(num_cpf.charAt(i));
                if (multi >= 2) {
                    cpf[i] = cpf[i] * multi;
                    multi--;
                    soma += cpf[i];
                }
            }

        }

        resultado = soma % 11;
        resultado = 11 - resultado;

        if (resultado > 9) {
            primeiro = 0;
        } else {
            primeiro = resultado;
        }

        multi = 11;
        soma = 0;

        for (int i = 0; i < cpf.length; i++) {
            if (i != 3 && i != 7 && i != 11) {
                cpf[i] = Character.getNumericValue(num_cpf.charAt(i));
                if (multi > 2) {
                    cpf[i] = cpf[i] * multi;
                    multi--;
                    soma += cpf[i];
                }

            }

        }

        resultado = soma % 11;
        resultado = 11 - resultado;

        if (resultado > 9) {
            segundo = 0;
        } else {
            segundo = resultado;
        }

        int verificador1 = Character.getNumericValue(num_cpf.charAt(12));
        int verificaro2 = Character.getNumericValue(num_cpf.charAt(13));

        return primeiro == verificador1 && segundo == verificaro2;

    }

}
