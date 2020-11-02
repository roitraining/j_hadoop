/**
 * 
 */
package com.roi.hadoop.wordcount;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author student
 * 
 */
public class WordMapperTest {

	@Test
	public void testFindWords() {
		String input = "Hello, are    .      you          there, Mom?";
		String[] words = WordMapper.findWords(input);
		Assert.assertEquals(5, words.length);
		Assert.assertEquals("Hello", words[0]);
		Assert.assertEquals("are", words[1]);
		Assert.assertEquals("you", words[2]);
		Assert.assertEquals("there", words[3]);
		Assert.assertEquals("Mom", words[4]);
	}

}
