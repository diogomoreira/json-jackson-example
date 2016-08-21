package br.edu.ifpb.padroes.json;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by diogomoreira on 20/08/16.
 */
public class Loader {

    private static File jsonFile = new File("./pessoa.json");

    public static void main(String[] args) throws IOException {
        /*
        Escrevendo em um arquivo JSON
         */
        ObjectMapper mapper = new ObjectMapper();
        Pessoa pessoa = new Pessoa();
        pessoa.setId(1);
        pessoa.setNome("Diogo");
        pessoa.setCpf("11111111111");
        IEndereco end = new Endereco();
        end.setRua("Rua Etc, 360");
        end.setBairro("Etc");
        end.setCidade("Cajazeiras");
        end.setEstado("Paraiba");
        end.setCep("58900000");
        pessoa.setEndereco(end);

        List<Pessoa> pessoas = new LinkedList<>();
        pessoas.add(pessoa);

        mapper.writeValue(jsonFile, pessoas);

        /*
        Recuperando a partir de um arquivo JSON
         */
        List<Pessoa> pessoasFromJson = mapper.readValue(jsonFile, new TypeReference<List<Pessoa>>() {});
        for (Pessoa pessoa1 : pessoasFromJson) {
            System.out.println(pessoa1);
        }
    }
}
