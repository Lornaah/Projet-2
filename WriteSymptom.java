package symptoms;

import java.io.FileWriter;
import java.util.Map;
import java.util.Map.Entry;

public class WriteSymptom {

	public static void writeSymptoms(Map<String, Integer> mapSymptoms) throws Exception {
		/* throws Exception = Thomas va me tuer donc � changer plus tard */

		FileWriter writer = new FileWriter("result.out");
		writer.write("Symptoms list : ");
		writer.write(System.lineSeparator());

		for (Entry<String, Integer> entr�e : mapSymptoms.entrySet()) {
			writer.write(entr�e.getKey() + " = " + entr�e.getValue());
			writer.write(System.lineSeparator());

		}

		writer.close();
	}
}
