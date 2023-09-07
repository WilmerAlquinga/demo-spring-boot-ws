package com.wsalquinga.demoauthsecurityws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoAuthSecurityWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAuthSecurityWsApplication.class, args);
	}

	/*
	@Bean
	CommandLineRunner run(RoleRepository roleRepository, UserRepository userRepository, PasswordEncoder passwordEncoder) {
		return args -> {
			if(roleRepository.findByAuthority("ADMIN").isPresent()) return;
			Role adminRole = roleRepository.save(new Role("Admin"));
			roleRepository.save(new Role("USER"));

			Set<Role> roles = new HashSet<>();
			roles.add(adminRole);

			ApplicationUser user = new ApplicationUser(1L, "admin", passwordEncoder.encode("admin"), roles);

			userRepository.save(user);
		};
	}
	*/

}
