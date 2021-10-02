package symptoms;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

public class WriteSymptom {

	/**
	 * La fonction writeSymptoms permet d'�crire dans le fichier "result.out" la
	 * liste des symptomes associ�s � leur nombre d'occurrences
	 * 
	 * @param mapSymptoms le dictionnaire contenant les sympt�mes associ�s � leur
	 *                    nombre d'occurrences
	 */
	public static void writeSymptoms(Map<String, Integer> mapSymptoms) {
		try {
			FileWriter writer = new FileWriter("result.out");

			writer.write("Symptoms list : ");
			writer.write(System.lineSeparator());

			for (Entry<String, Integer> entr�e : mapSymptoms.entrySet()) {
				writer.write(entr�e.getKey() + " = " + entr�e.getValue());
				writer.write(System.lineSeparator());
			}
			writer.close();

		} catch (IOException exception) {
			System.out.println("Le fichier n'a pas pu �tre �crit");
			exception.printStackTrace();
		}
	}
}