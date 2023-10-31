package jmaster.io.project2;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
@EnableJpaAuditing  // để sử dụng @CreatedDate,... thì cần phải thêm thằng này
public class Project2Application implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(Project2Application.class, args);
	}

	@Bean
	public LocaleResolver localeResolver() {
		SessionLocaleResolver slr = new SessionLocaleResolver();
		slr.setDefaultLocale(new Locale("en"));
		// "en" thì nó sẽ tự động tìm đấy file message.properties
		return slr;
	}

	// hello?lang=en
	// cái này để nó duyệt request của mình xem mình có request
	// ngôn ngữ khác không.
	// Ở trên mình để là "en", nhưng nếu trên request mình để là
	// hello?lang=vi thì nó sẽ gọi sang messages ngôn ngữ tiếng việt.
	@Bean
	public LocaleChangeInterceptor localeChangeInterceptor() {
		LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
		lci.setParamName("lang");
		return lci;
	}
//	Trong Spring Boot, interceptor là một thành phần của Spring MVC 
//	được sử dụng để kiểm soát các request trước khi chúng được xử lý 
//	bởi các controller và sau khi chúng được xử lý để thực hiện 
//	một số logic xử lý trước hoặc sau khi request được xử lý.

	@Override
	// hàm này có tác dụng gọi hàm LocaleChangeInterceptor trên
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(localeChangeInterceptor());
	}

}
