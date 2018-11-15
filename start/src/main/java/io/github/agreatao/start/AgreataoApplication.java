package io.github.agreatao.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = {"io.github.agreatao"})
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {"io.github.agreatao.modules.business.repository"})
@EntityScan("io.github.agreatao.modules.business.repository.entity")
@EnableCaching
public class AgreataoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AgreataoApplication.class, args);
    }

}
