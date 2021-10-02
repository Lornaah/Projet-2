package symptoms;

import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class AnalyticsCounter {

	/**
	 * La fonction associationSymptomsValeur permet de construire un
	 * {@link SortedMap} associant les symptômes à leur nombre d'occurrence à partir
	 * d'une {@link List}
	 * 
	 * @param listSymptoms est la liste créée à partir du fichier texte lu
	 * @return la Map associant les symptômes à leur nombre d'occurrence
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