package br.com.alura.loja.util;

import io.github.cdimascio.dotenv.Dotenv;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashMap;
import java.util.Map;

public class JPAUtil {

    private static final EntityManagerFactory FACTORY =
            Persistence.createEntityManagerFactory("loja", getProps());

    private static Map<String, String> getProps() {  // ← MÉTODO ADICIONADO (SÓ PARA PEGAR AS PROPS)
        Dotenv dotenv = Dotenv.configure()
                .directory("./")
                .ignoreIfMissing()
                .load();

        String url = dotenv.get("DB_URL");
        String user = dotenv.get("DB_USER");
        String password = dotenv.get("DB_PASSWORD");

        Map<String, String> props = new HashMap<>();
        props.put("javax.persistence.jdbc.url", url);
        props.put("javax.persistence.jdbc.user", user);
        props.put("javax.persistence.jdbc.password", password);
        return props;
    }

    public static EntityManager getEntityManager() {
        return FACTORY.createEntityManager();
    }

}