package io.library.starter.LibraryController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogService {
	
	//for database
	@Autowired
	private LogRepository logRepository;
	// new Array list because List is immutable 
	
	public List<LogModel> getBooks(){
		List<LogModel> logs = new ArrayList<>();
		logRepository.findAll().forEach(logs::add);
		return logs;
	}
	
	public LogModel getByType(String genre) {
		return logRepository.findOne(genre);
	}

	public void addBook(LogModel model) {
		// TODO Auto-generated method stub
		logRepository.save(model);
		
	}

	public void editBook(LogModel model,String id) {
		
		logRepository.save(model);
		}

	public void deleteBook(String id) {
		logRepository.delete(id);
		
	} 
}
