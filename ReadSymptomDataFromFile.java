
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadSymptomDataFromFile {

	public static List<String> GetSymptoms(String nomFichier) {
		ArrayList<String> result = new ArrayList<String>();

		if (nomFichier != null) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader(nomFichier));
				String line = reader.readLine();

				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

}