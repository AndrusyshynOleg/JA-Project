package logos.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import logos.project.domain.Entrant;


public interface EntrantRepository extends JpaRepository<Entrant, Integer>{

}
