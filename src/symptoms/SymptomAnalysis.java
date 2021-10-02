package symptoms;

import java.util.List;
import java.util.Map;

public class SymptomAnalysis {

	public static void main(String args[]) {

		List<String> symptoms = ReadSymptomDataFromFile.getSymptoms("symptoms.txt");

		AnalyticsCounter counter = new AnalyticsCounter();

		Map<String, Integer> symptomsValeurs = counter.associationSymptomsValeur(symptoms);

		WriteSymptom.writeSymptoms(symptomsValeurs);
	}
}
