package com.rohith.spring.springcore.property;

import java.util.Properties;

public class Languages {

	private Properties countryAndLangs;

	public Properties getCountryAndLangs() {
		return countryAndLangs;
	}

	public void setCountryAndLangs(Properties countryAndLangs) {
		this.countryAndLangs = countryAndLangs;
	}

	@Override
	public String toString() {
		return "Languages [countryAndLangs=" + countryAndLangs + "]";
	}

}
