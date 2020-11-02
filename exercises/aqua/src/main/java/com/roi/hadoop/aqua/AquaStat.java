/**
 * 
 */
package com.roi.hadoop.aqua;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;

/**
 * @author student
 * 
 */
public class AquaStat implements Writable, Comparable<AquaStat> {

	private String country;
	private int previousProduction, currentProduction;
	private double growthRate;

	public AquaStat(String country, int previousProduction,
			int currentProduction) {
		super();
		this.country = country;
		this.previousProduction = previousProduction;
		this.currentProduction = currentProduction;
		if (previousProduction > 0) {
			growthRate = (currentProduction - previousProduction)
					/ (double) previousProduction;
		} else {
			growthRate = 0;
		}
	}

	public AquaStat() {
		this("", 0, 0);
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPreviousProduction() {
		return previousProduction;
	}

	public void setPreviousProduction(int previousProduction) {
		this.previousProduction = previousProduction;
	}

	public int getCurrentProduction() {
		return currentProduction;
	}

	public void setCurrentProduction(int currentProduction) {
		this.currentProduction = currentProduction;
	}

	public double getGrowthRate() {
		return growthRate;
	}

	public void setGrowthRate(double growthRate) {
		this.growthRate = growthRate;
	}

	@Override
	public void readFields(DataInput in) throws IOException {
		Text t = new Text();
		t.readFields(in);
		country = t.toString();
		IntWritable f = new IntWritable();
		f.readFields(in);
		previousProduction = f.get();
		f.readFields(in);
		currentProduction = f.get();
		DoubleWritable d = new DoubleWritable();
		d.readFields(in);
		growthRate = d.get();
	}

	@Override
	public void write(DataOutput out) throws IOException {
		new Text(country).write(out);
		new IntWritable(previousProduction).write(out);
		new IntWritable(currentProduction).write(out);
		new DoubleWritable(growthRate).write(out);
	}

	@Override
	public int compareTo(AquaStat other) {
		if (!country.equals(other.country)) {
			return country.compareTo(other.country);
		}
		if (previousProduction != other.previousProduction) {
			return (previousProduction - other.previousProduction);
		}
		if (currentProduction != other.currentProduction) {
			return (currentProduction - other.currentProduction);
		}
		if (growthRate < other.growthRate) {
			return -1;
		} else if (growthRate > other.growthRate) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || !o.getClass().equals(this.getClass())) {
			return false;
		}
		AquaStat other = (AquaStat) o;
		return (this.country.equals(other.country)
				&& this.previousProduction == other.previousProduction
				&& this.currentProduction == other.currentProduction && this.growthRate == other.growthRate);
	}

	@Override
	public int hashCode() {
		return country.hashCode();
	}

	@Override
	public String toString() {
		return country + ": " + previousProduction + " to " + currentProduction
				+ " growthRate=" + growthRate;
	}
}
