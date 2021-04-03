package gradeshistogram;

import java.util.List;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;

//imports for chart generation
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 * @author AthinaDavari
 * 
 * The purpose of this class is to visualize a line chart with data from
 * a dataset in a txt file.
 */
public class HistogramGenerator {

	/**
	 * Receives a single dimension Integer array. This array is the dataset that
	 * will be used for the visualization of the line chart. Finally, The chart is
	 * generated with the use of the aforementioned dataset and then presented in
	 * the screen.
	 * 
	 * @param dataValues single dimension integer array
	 */
	public void generateLineChart(Integer[] dataValues) {
		/*
		 * The XYSeriesCollection object is a set XYSeries series (dataset) that can be
		 * visualized in the same chart
		 */
		XYSeriesCollection dataset = new XYSeriesCollection();
		/*
		 * The XYSeries that are loaded in the dataset. There might be many series in
		 * one dataset.
		 */
		XYSeries data = new XYSeries("dataset values");

		/*
		 * Populating the XYSeries data object from the input Integer array values.
		 */
		for (int i = 0; i < dataValues.length; i++) {
			data.add(i, dataValues[i]);
		}

		// add the series to the dataset
		dataset.addSeries(data);

		boolean legend = false; // do not visualize a legend
		boolean tooltips = false; // do not visualize tooltips
		boolean urls = false; // do not visualize urls

		// Declare and initialize a createXYLineChart JFreeChart
		JFreeChart chart = ChartFactory.createXYLineChart("Dataset Visualization", "x axis", "y axis", dataset,
				PlotOrientation.VERTICAL, legend, tooltips, urls);
		
		// paint background  
		chart.setBackgroundPaint(Color.magenta);

		/*
		 * Initialize a frame for visualizing the chart and attach the previously
		 * created chart.
		 */
		ChartFrame frame = new ChartFrame("Dataset Visualization", chart);
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
	public Integer[] readDataset(String fileparam) throws IOException {

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
		Integer[] dataValues = new Integer[list.size()];
		list.toArray(dataValues);

		return dataValues;

	}

	public static void main(String[] args) {
		try {

			HistogramGenerator histogram = new HistogramGenerator();
			Integer[] dataValues = histogram.readDataset(args[0]);
			histogram.generateLineChart(dataValues);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
