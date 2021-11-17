package mis.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;



@Configuration
@EnableAutoConfiguration
@EnableWebSecurity
public class MyConfig extends WebSecurityConfigurerAdapter {
	
	
	@Bean
    public UserDetailsService userDetailsService() {
        return new UserDetailsServiceImpl();
    }
     
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
     
   
 
    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//            .antMatchers("/new").hasAnyAuthority("ADMIN", "CREATOR")
//            .antMatchers("/admin/**").hasAnyAuthority("ADMIN", "EDITOR")
//            .antMatchers("/delete/**").hasAuthority("ADMIN")
//            .antMatchers("/**").permitAll()
//            .anyRequest().authenticated()
//            .and()
//            .formLogin()
//            .loginPage("/signin").permitAll()
//            .and()
//            .logout().permitAll()
//            .and()
//            .exceptionHandling().accessDeniedPage("/403")
//            ;
        
        http.authorizeRequests().antMatchers("/admin/**").hasAuthority("ADMIN").antMatchers("/user/**").hasAuthority("USER")
		.antMatchers("/**").permitAll().and().formLogin()
		.loginPage("/signin")
		.defaultSuccessUrl("/home")				
		.and().csrf().disable();
    }
}
