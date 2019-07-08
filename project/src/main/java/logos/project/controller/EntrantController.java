package logos.project.controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import logos.project.dao.FacultyRepository;
import logos.project.service.EntrantDTOHelper;
import logos.project.service.EntrantService;

@Controller
public class EntrantController {
	
	@Autowired
	EntrantService entrantService;
	
	@Autowired
	FacultyRepository facultyRepository;
	
	@RequestMapping(value = "/addEntrant", method = RequestMethod.POST)
	public ModelAndView createEntrant(
			@RequestParam MultipartFile image, 
			@RequestParam String firstName, 
			@RequestParam String lastName,
			@RequestParam Integer faculty
		//	@RequestParam List<Subjects> subjects
			) throws IOException {		

		System.out.println(faculty);
		entrantService.save(EntrantDTOHelper.createEntity(image, firstName, lastName, facultyRepository.getById(faculty), null));
		
		return new ModelAndView("redirect:/home");
	}

}
