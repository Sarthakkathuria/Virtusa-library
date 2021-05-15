package io.library.starter.LibraryController;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {
	
	@Autowired
	private LogService logService;
	
	@RequestMapping("/getBooks")
	public List<LogModel> getAllLog(){
		return logService.getBooks();
	}
	
	@RequestMapping("/getByType?id={genre}")
	public LogModel getTopic(@PathVariable String genre) {
		return logService.getByType(genre);
	}
	@RequestMapping(method=RequestMethod.POST, value = "/saveBook")
	public void addBook(@RequestBody LogModel model) {
		logService.addBook(model);
	}
	//update
	@RequestMapping(method=RequestMethod.PUT, value = "/editBook/id={id}")
	public String editBook(@RequestBody LogModel model,@PathVariable String id) {
		logService.editBook(model, id);
		return "Updated Succesfully";
	}
	//delete
	@RequestMapping(method=RequestMethod.DELETE, value = "/deleteBook/id={id}")
	public String deleteBook(@PathVariable String id) {
		logService.deleteBook(id);
		return "Deleted Succesfully";
	}
}

