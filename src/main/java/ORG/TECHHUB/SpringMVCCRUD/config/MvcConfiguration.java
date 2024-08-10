package ORG.TECHHUB.SpringMVCCRUD.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
//@ComponentScan(basePackages ={"ORG.TECHHUB.SpringMVCCRUD.controller", "ORG.TECHHUB.SpringMVCCRUD.model","ORG.TECHHUB.SpringMVCCRUD.service","ORG.TECHHUB.SpringMVCCRUD.repository"})
//@ComponentScan(basePackages = {"com.logicbig.example.client", "com.logicbig.example.service"})
@ComponentScan(basePackages="ORG.TECHHUB.SpringMVCCRUD")
@EnableWebMvc
public class MvcConfiguration extends WebMvcConfigurerAdapter{

	@Bean
	public ViewResolver getViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
	@Bean(name="dataSource")
	public DriverManagerDataSource getdataSource()
	{
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306/spring");
		dataSource.setUsername("root");  
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setPassword("0808");
        return dataSource;
				
	}
	@Bean(name="template")
	public JdbcTemplate gettemplate()
	{
		JdbcTemplate template=new JdbcTemplate();
		template.setDataSource(getdataSource());
		return template;
	} 
	
}
