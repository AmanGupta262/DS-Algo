/**
 * Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.
    Input Format :
    3 integers - S, E and W respectively
    Output Format :
    Fahrenheit to Celsius conversion table. One line for every Fahrenheit and Celsius Fahrenheit value. Fahrenheit value and its corresponding Celsius value should be separate by tab ("\t")
 */
public class fahrenheitToCelsius{
    public static void printFahrenheitTable(int start, int end, int step) {
		
		for(; start<=end; start+=step){
            double f = (5.0/9.0) * (start-32);
            System.out.println(start +"\t"+ (int)f);
        }
	}
}