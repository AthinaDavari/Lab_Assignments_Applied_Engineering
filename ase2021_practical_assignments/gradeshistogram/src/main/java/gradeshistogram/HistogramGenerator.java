package gradeshistogram;

import java.util.List;
import java.io.*;
import java.util.ArrayList;
import java.io.IOException;

//imports for chart generation
import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.statistics.HistogramDataset;

/**
 * @author AthinaDavari
 * 
 * The purpose of this class is to visualize a histogram chart with data
 * from a dataset in a txt file.
 */
public class HistogramGenerator {

	/**
	 * Receives a single dimension Integer array. This array is the dataset that
	 * will be used for the visualization of the histogram chart. Finally, The chart
	 * is generated with the use of the aforementioned dataset and then presented in
	 * the screen.
	 * 
	 * @param dataValues single dimension integer array
	 */
	public void generateHistogramChart(double[] dataValues) {

		/*
		 * The Histogram object creates a new (empty) dataset with the type of
		 * HistogramType.FREQUENCY.
		 */
		HistogramDataset dataset = new HistogramDataset();

		// find the max value in the double array with the data for histogram
		double maxValue = -1;
		for (double d : dataValues) {
			maxValue = Math.max(maxValue, d);
		}

		/*
		 * add the series to the dataset with the specified number of bins, one bin for
		 * each number smaller than the bigger number on the dataset.
		 */
		dataset.addSeries("Frequency", dataValues, (int) Math.ceil(maxValue));

		// Declare and initialize a Histogram JFreeChart
		JFreeChart histogram = ChartFactory.createHistogram("Histogram", "Data", "Frequency", dataset);

		// paint background
		histogram.setBackgroundPaint(Color.magenta);

		/*
		 * Initialize a frame for visualizing the chart and attach the previously
		 * created histogram.
		 */
		ChartFrame frame = new ChartFrame("Histogam", histogram);
		frame.pack();

		// makes the previously created frame visible
		frame.setVisible(true);
	}

	/**
	 * Receives a String which represents the name of the txt file we want to read
	 * or the url in which we can find that file. Reads the dataset for a file and
	 * returns it in a single dimension Integer array.
	 * 
	 * @param fileparam String
	 * 
	 * @return a dataset in a single dimension Integer array
	 */
	public double[] readDataset(String fileparam) throws IOException {

		File file = new File(fileparam); // creates a new file instance
		FileReader fr = new FileReader(file); // reads the file
		BufferedReader br = new BufferedReader(fr); // creates a buffering character input stream
		String line;

		// add every value of the file in an array list
		List<Integer> list = new ArrayList<Integer>();
		while ((line = br.readLine()) != null) {
			list.add(Integer.parseInt(line));
		}

		fr.close(); // closes the stream and release the resources

		// a single dimension Integer list to a single dimension Integer array
		double[] dataValues = list.stream().mapToDouble(i -> i).toArray();

		return dataValues;

	}

	public static void main(String[] args) {
		try {

			HistogramGenerator histogram = new HistogramGenerator();
			double[] dataValues = histogram.readDataset(args[0]);
			histogram.generateHistogramChart(dataValues);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
