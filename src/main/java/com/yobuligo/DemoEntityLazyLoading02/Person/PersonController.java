package com.yobuligo.DemoEntityLazyLoading02.Person;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yobuligo.DemoEntityLazyLoading02.Car.Car;

@RequestMapping("/api")
@RestController
public class PersonController {

	@Autowired
	IPersonRepository personRepository;

	/*
	 * @GetMapping("/createPersons") public Iterable<Person> createPerson() {
	 * ArrayList<Car> cars = new ArrayList();
	 * 
	 * Car car = new Car(); car.setName("BMW"); cars.add(car); car = new Car();
	 * car.setName("VW"); cars.add(car);
	 * 
	 * Person person = new Person(); person.setCars(cars);
	 * person.setFirstname("Max"); person.setLastname("Müller");
	 * 
	 * personRepository.save(person);
	 * 
	 * return personRepository.findAll(); }
	 */

	@GetMapping("/persons")
	public Optional<Person> getPerson() {
		Long id = Long.valueOf(1);
		return personRepository.findById(id);
		// return personRepository.findAll();
	}

}
