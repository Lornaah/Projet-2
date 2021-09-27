package symptoms;

import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class AnalyticsCounter {

	/*
	 * Réorganiser class Générer un jar pour lancer le projet sans IDE -> exécutable
	 */

	public SortedMap<String, Integer> associationSymptomsValeur(List<String> listSymptoms) {
		SortedMap<String, Integer> result = new TreeMap<String, Integer>();

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

}
