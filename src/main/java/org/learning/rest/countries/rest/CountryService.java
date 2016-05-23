package org.learning.rest.countries.rest;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.learning.rest.countries.domain.Country;

public class CountryService {

	private static final Logger logger = Logger.getLogger(CountryService.class);
	
	private static CountryService countryService = new CountryService();
	
	private static List<Country> countries = null;
	
	private CountryService()
	{
		countries = init();
	}
	
	public static CountryService getCountryService()
	{
		return countryService;
	}
	
	private List<Country> init()
	{
		File file = new File("/Users/raghava.juvvaji/Documents/workspace-personnel/rest-countries/src/main/resources/countriesV1.json");
		ObjectMapper reader = new ObjectMapper();
		
		try {
			return reader.readValue(file, reader.getTypeFactory().constructCollectionType(List.class, Country.class));
		} catch (JsonParseException e) {
			logger.error("Something wrong with json structure! "+e);
		} catch (JsonMappingException e) {
			logger.error("Something wrong with model class! "+e);
		} catch (IOException e) {
			logger.error("Coud not read file! "+e);
		}
		
		return null;
	}
	
	public static List<Country> getCountries()
	{
		return countries;
	}
}
