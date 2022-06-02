/**
 * 
 */
package com.roi.hadoop.aqua;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author student
 * 
 */
public class AquaIngestTest {
	private AquaIngest ingest = new AquaIngest();

	@Test
	public void testMeta() {
		String line = "Variable: Aquaculture Production - Total";
		Assert.assertNull(ingest.splitLine(line));
	}

	@Test
	public void testHeader() {
		String line = "Country Name,Sovereign,GEO Region,GEO Subregion,ISO 2 Code,ISO 3 Code,UN Code,Developed,GEO ID,1995,2000,2005";
		Assert.assertNull(ingest.splitLine(line));
	}

	@Test
	public void testNull() {
		String line = "American Samoa,United States of America,Asia + Pacific,South Pacific,AS,ASM,16,0,0,16,NULL,NULL,NULL";
		Assert.assertNull(ingest.splitLine(line));
	}

	@Test
	public void testGood() {
		String line = "Algeria,Algeria,Africa,Northern Africa,DZ,DZA,12,0,0,12,369,351,368";
		Assert.assertNotNull(ingest.splitLine(line));
		Assert.assertEquals("Northern Africa", ingest.splitLine(line)[AquaIngest.Fields.GeoSubregion.ordinal()]);
		Assert.assertEquals("368", ingest.splitLine(line)[AquaIngest.Fields.Tons2005.ordinal()]);
	}
}
