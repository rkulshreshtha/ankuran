package com.ankuran;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ankuran")
@EnableAutoConfiguration
public class AnkuranApplication {

	@RequestMapping("/")
	ResponseEntity<Object> get() {
		return new ResponseEntity<Object>("Hello World Get!", HttpStatus.OK);
	}
	
	@GetMapping("/test/{id}")
	ResponseEntity<Object> test(@PathVariable String id) {
		return new ResponseEntity<Object>("Hello World Get Test " + id + "!", HttpStatus.ALREADY_REPORTED);
	}
	
	@PostMapping("/post")
	ResponseEntity<Object> create(@RequestBody String id) {
		return new ResponseEntity<Object>("Hello World Create " + id + "!", HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete/{id}")
	ResponseEntity<Object> delete(@PathVariable String id) {
		return new ResponseEntity<Object>("Hello World Delete " + id + "!", HttpStatus.NOT_MODIFIED);
	}
	
	@PutMapping("put/{id}")
	ResponseEntity<Object> put(@PathVariable String id, @RequestBody String test) {
		return new ResponseEntity<Object>("Hello World Put " + id + " body " + test + "!", HttpStatus.MOVED_PERMANENTLY);
	}

	public static void main(String[] args) {
		SpringApplication.run(AnkuranApplication.class, args);
	}
}
