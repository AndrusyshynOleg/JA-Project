package logos.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import logos.project.domain.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty, Integer>{

}
