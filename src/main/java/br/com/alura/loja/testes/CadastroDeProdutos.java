package br.com.alura.loja.testes;

import br.com.alura.loja.dao.ProdutoDao;
import br.com.alura.loja.modelo.Categoria;
import br.com.alura.loja.util.JPAUtil;
import br.com.alura.loja.modelo.Produto;
import javax.persistence.*;
import java.math.BigDecimal;

public class CadastroDeProdutos {

    public static void main(String[] args) {

        //Criando novo produto
        Produto celular = new Produto("iPhone 5000", "Perfeito para trabalho de mídias sociais", new BigDecimal(7000), Categoria.CELULARES);

        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDao dao = new ProdutoDao(em);

        /*Aqui ele está fazendo um INSERT do objeto no Banco de Dados*/
        em.getTransaction().begin();
        dao.cadastrar(celular);
        em.getTransaction().commit();
        em.close();
    }

}
