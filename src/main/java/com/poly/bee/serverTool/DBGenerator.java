package com.poly.bee.serverTool;

import com.poly.bee.server.entity.Account;
import com.poly.bee.server.entity.Category;
import com.poly.bee.server.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(
        basePackages = "com.poly.bee.server.repository"
)
public class DBGenerator implements CommandLineRunner {

    private final boolean IS_RELEASE = false;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {

        Category category = new Category();
        category.setCode("CA0001");
        category.setName("Thời trang");
        category.setId(categoryRepository.save(category).getId());

        Category category1 = new Category();
        category1.setCode("CA0002");
        category1.setName("Chạy bộ");
        category1.setId(categoryRepository.save(category1).getId());

        Category category2 = new Category();
        category2.setCode("CA0003");
        category2.setName("Đá bóng");
        category2.setId(categoryRepository.save(category2).getId());

    }

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(DBGenerator.class);
        ctx.close();
    }

}
