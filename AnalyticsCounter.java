package symptoms;

import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class AnalyticsCounter {

	/*
	 * R�organiser class G�n�rer un jar pour lancer le projet sans IDE -> ex�cutable
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
