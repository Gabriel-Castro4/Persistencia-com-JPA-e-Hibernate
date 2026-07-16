package br.com.alura.loja.testes;

import br.com.alura.loja.dao.CategoriaDao;
import br.com.alura.loja.dao.ProdutoDao;
import br.com.alura.loja.modelo.Categoria;
import br.com.alura.loja.util.JPAUtil;
import br.com.alura.loja.modelo.Produto;
import javax.persistence.*;
import java.math.BigDecimal;

public class CadastroDeProdutos {

    public static void main(String[] args) {

        //Criando novo produto
        Categoria celulares = new Categoria("CELULARES");
        Produto celular = new Produto("iPhone 5000", "Perfeito para trabalho de mídias sociais", new BigDecimal(7000), celulares);

        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDao produtoDao = new ProdutoDao(em);
        CategoriaDao categoriaDao = new CategoriaDao(em);

        /*Aqui ele está fazendo um INSERT do objeto no Banco de Dados*/
        em.getTransaction().begin();

        categoriaDao.cadastrar(celulares);
        produtoDao.cadastrar(celular);

        em.getTransaction().commit();
        em.close();
    }

}
