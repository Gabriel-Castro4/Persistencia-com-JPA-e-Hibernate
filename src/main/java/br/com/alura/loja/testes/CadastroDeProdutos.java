package br.com.alura.loja.testes;

import io.github.cdimascio.dotenv.Dotenv;
import br.com.alura.loja.modelo.Produto;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;


public class CadastroDeProdutos {

    public static void main(String[] args) {

        /*-----------------------------------------------------------------------------------*/
        //Está área serve para o código carregar as informações do banco de dados sem expor dados sensíveis
        //Carrega o .env
        Dotenv dotenv = Dotenv.configure()
                .directory("./")
                .ignoreIfMissing()
                .load();

        // Lê as variáveis do .env
        String url = dotenv.get("DB_URL");
        String user = dotenv.get("DB_USER");
        String password = dotenv.get("DB_PASSWORD");

        //PASSA as credenciais no segundo parâmetro
        Map<String, String> props = new HashMap<>();
        props.put("javax.persistence.jdbc.url", url);
        props.put("javax.persistence.jdbc.user", user);
        props.put("javax.persistence.jdbc.password", password);
        /*-----------------------------------------------------------------------------------*/

        //Criando novo produto
        Produto celular = new Produto();
        celular.setNome("Iphone");
        celular.setDescricao("Perfeito para trabalho de mídias sociais");
        celular.setPreco(new BigDecimal(7000));

        //A interface EntityManager para funcionar, assim como toda interface, precisa ser implementada através de uma classe que á possua, por isso estamos importando a classe EntityManagerFactory, e para criar um EntityManagerFactory, precisamos passar como parâmetro = Persistence.createEntityManagerFactory(" ") e o nome passado no parâmetro "Persistence.createEntityManagerFactory(" ")" deve ser o nome do banco de dados que vamos acessar através da "<persistence-unit name="loja"" lá no persistence.xml
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("loja", props);
        //Essa interface é a responsável por criar a interação com o banco de dados através do JPA
        EntityManager em = factory.createEntityManager();
        /*Aqui ele está fazendo um INSERT do objeto no Banco de Dados*/
        em.getTransaction().begin();
        em.persist(celular);
        em.getTransaction().commit();
        em.close();
    }

}
