package org.learning.rest.countries.rest;

import java.util.List;

import org.learning.rest.countries.domain.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/rest")
public class CountryRest {
	
	@RequestMapping(method=RequestMethod.GET,path="/all")
	public List<Country> getCountries()
	{
		return CountryService.getCountries();
	}
}
