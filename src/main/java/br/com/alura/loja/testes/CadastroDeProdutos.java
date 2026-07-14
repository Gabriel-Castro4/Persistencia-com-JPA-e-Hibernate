package br.com.alura.loja.testes;

import br.com.alura.loja.dao.ProdutoDao;
import br.com.alura.loja.util.JPAUtil;
import br.com.alura.loja.modelo.Produto;
import javax.persistence.*;
import java.math.BigDecimal;

public class CadastroDeProdutos {

    public static void main(String[] args) {

        //Criando novo produto
        Produto celular = new Produto();
        celular.setNome("Iphone");
        celular.setDescricao("Perfeito para trabalho de mídias sociais");
        celular.setPreco(new BigDecimal(7000));

        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDao dao = new ProdutoDao(em);

        /*Aqui ele está fazendo um INSERT do objeto no Banco de Dados*/
        em.getTransaction().begin();
        dao.cadastrar(celular);
        em.getTransaction().commit();
        em.close();
    }

}
