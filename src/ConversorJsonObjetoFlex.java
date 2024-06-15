import br.com.alura.modelos.Pessoa;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConversorJsonObjetoFlex {

    public static void main(String[] args) {

        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"cidade\":\"Brasília\"}";

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println("Objeto br.com.alura.modelos.Pessoa: " + pessoa);
    }
}
