package logos.project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import logos.project.domain.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	List<User> findByEmail(String email);
}
