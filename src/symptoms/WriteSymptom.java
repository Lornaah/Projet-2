package symptoms;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

public class WriteSymptom {

	/**
	 * La fonction writeSymptoms permet d'écrire dans le fichier "result.out" la
	 * liste des symptomes associés à leur nombre d'occurrences
	 * 
	 * @param mapSymptoms le dictionnaire contenant les symptômes associés à leur
	 *                    nombre d'occurrences
	 */
	public static void writeSymptoms(Map<String, Integer> mapSymptoms) {
		try {
			FileWriter writer = new FileWriter("result.out");

			writer.write("Symptoms list : ");
			writer.write(System.lineSeparator());

			for (Entry<String, Integer> entrée : mapSymptoms.entrySet()) {
				writer.write(entrée.getKey() + " = " + entrée.getValue());
				writer.write(System.lineSeparator());
			}
			writer.close();

		} catch (IOException exception) {
			System.out.println("Le fichier n'a pas pu être écrit");
			exception.printStackTrace();
		}
	}
}