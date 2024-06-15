import br.com.alura.modelos.Pessoa;
import com.google.gson.Gson;

public class ConversorJsonObjeto {

    public static void main(String[] args) {

        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"idade\":20,\"cidade\":\"Brasília\"}";

        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println("Objeto br.com.alura.modelos.Pessoa: " + pessoa);
    }
}