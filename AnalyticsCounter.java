
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {

		List<String> symptoms = ReadSymptomDataFromFile.GetSymptoms("symptoms.txt");
		symptoms.sort(Comparator.naturalOrder());

		Map<String, Integer> symptomsValeurs = associationSymptomsValeur(symptoms);

		List<String> symptomsAlpha = distinctSymptoms(symptoms);

		FileWriter writer = new FileWriter("result.out");
		writer.write("Symptoms list : ");
		writer.write(System.lineSeparator());

		for (String alpha : symptomsAlpha) {
			writer.write(alpha + " = " + symptomsValeurs.get(alpha));
			writer.write(System.lineSeparator());
		}

		writer.close();

	}

	public static Map<String, Integer> associationSymptomsValeur(List<String> listSymptoms) {
		Map<String, Integer> result = new HashMap<String, Integer>();

		for (String key : listSymptoms) {
			if (!result.containsKey(key)) {
				result.put(key, 1);
			} else {
				Integer valeur = result.get(key);
				valeur++;
				result.put(key, valeur);
			}
		}

		return result;
	}

	public static List<String> distinctSymptoms(List<String> listSymptoms) {
		List<String> result = new ArrayList<String>();

		for (String symptoms : listSymptoms) {
			if (!result.contains(symptoms)) {
				result.add(symptoms);
			}
		}
		return result;
	}
}
