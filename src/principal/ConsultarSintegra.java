package principal;

import java.io.FileWriter;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import entities.Empresa;
import entities.EmpresaConsulta;

public class ConsultarSintegra {    
    public static void main(String[] args) throws Exception {

        String token = new String("########-####-####-####-############"); // Para realizar a consulta é necessário um Token
        String cnpj = new String("06990590000123");                        // CNPJ a ser consultado (no caso o da Google)
        
        // URL
        String url = new String("https://www.sintegraws.com.br/api/v1/execute-api.php?token=" + token + "&cnpj=" + cnpj + "&plugin=ST");

        // HTTP
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(url))
            .build();
        
        HttpResponse<String> response = client
            .send(request, BodyHandlers.ofString());

        // Resposta em Json
        String json = response.body();
        
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        // Converte Json para Objeto Java
        EmpresaConsulta empresaConsulta = gson.fromJson(json, EmpresaConsulta.class);
        Empresa empresa = new Empresa(empresaConsulta);

        // Cria o arquivo Json referente a consulta
        FileWriter writer = new FileWriter(empresaConsulta.nome_empresarial() + ".json");
        writer.write(gson.toJson(empresa));
        writer.close();

        System.out.println(empresa);
    }
}
