package org.learning.rest.countries.domain;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class Country 
{
 
	private String name;
	
	private String nativeName;
	
	@JsonProperty("topLevelDomain")
	private List<String> tld;
	
	@JsonProperty("alpha2Code")
	private String cca2;
	
	@JsonProperty("alpha3Code")
	private String cca3;
	
	@JsonProperty("currencies")
	private List<String> currency;
	
	@JsonProperty("callingCodes")
	private List<String> callingCode;
	
	private String capital;
	
	private List<String> altSpellings;
	
	private String relevance;
	
	private String region;
	
	private String subRegion;
	
	private List<String> language;
	
	@JsonProperty("languages")
	private List<String> langaugeCodes;
	
	private Long population;
	
	private List<Integer> latlng;
	
    private String demonym;
    
    private List<String> borders;
    
    private Long area;
    
    private double gini;
    
    private List<String> timeZones;
    
    private CountryTranslations countryTranslations;
    
    
}
