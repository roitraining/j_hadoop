/**
 * 
 */
package com.roi.hadoop.grepnumwords;

import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author student
 * 
 */
public class SearchTermsMapperTest {

	@Test
	public void testFindWords() {
		String input = "Hello, are    .      you          there, Mom?";
		Set<String> words = SearchTermsMapper.findWords(input);
		Assert.assertEquals(5, words.size());
		Assert.assertTrue(words.contains("hello"));
		Assert.assertTrue(words.contains("are"));
		Assert.assertTrue(words.contains("you"));
		Assert.assertTrue(words.contains("there"));
		Assert.assertTrue(words.contains("mom"));
	}

}
