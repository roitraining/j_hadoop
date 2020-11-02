/**
 * 
 */
package com.roi.hadoop.aqua;

import java.util.regex.Pattern;

/**
 * @author student
 * 
 */
public class AquaIngest {
	enum Fields {
		CountryName, Sovereign, GeoRegion, GeoSubregion, Iso2Code, Iso3Code, Junk, UNcode, Developed, GeoId, Tons1995, Tons2000, Tons2005;
	}

	private final static Pattern NUMERIC = Pattern.compile("[0-9]+");

	public String[] splitLine(String line) {
		String[] fields = line.split(",");
		if (fields.length != Fields.values().length) {
			return null;
		}
		// if any of the last 3 fields is non-numeric, don't use
		for (int i = fields.length - 3; i < fields.length; ++i) {
			if (NUMERIC.matcher(fields[i]).matches() == false) {
				return null;
			}
		}

		return fields;
	}
}
