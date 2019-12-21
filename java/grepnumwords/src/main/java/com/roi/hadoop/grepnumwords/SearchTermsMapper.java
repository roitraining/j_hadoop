package com.roi.hadoop.grepnumwords;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class SearchTermsMapper extends Mapper<Object, Text, Text, IntWritable> {

	private final static Pattern NON_LETTERS = Pattern.compile("[^a-zA-Z]");
	private final static String SPACE = " ";
	private final static String SPACES = " +";

	private String[] searchTerms = null;

	public static Set<String> findWords(String line) {
		line = NON_LETTERS.matcher(line).replaceAll(SPACE);
		line = line.toLowerCase(); // case-insensitive
		String[] words = line.trim().split(SPACES);
		// for search efficiency, use a Set
		Set<String> wordSet = new HashSet<String>();
		for (String word : words) {
			wordSet.add(word);
		}
		return wordSet;
	}

	@Override
	public void map(Object ignoredKey, Text value, Context context)
			throws IOException, InterruptedException {
		// search for the words
		Set<String> words = findWords(value.toString());
		for (String term : getSearchTerms(context)) {
			if (words.contains(term)) {
				// word \t count
				context.write(new Text(term), new IntWritable(words.size()));
			}
		}
	}

	private String[] getSearchTerms(Context context) {
		// set up searchTerms if this is the first time around
		if (searchTerms == null) {
			searchTerms = context.getConfiguration().getStrings("searchTerms");
		}
		return searchTerms;
	}

}
