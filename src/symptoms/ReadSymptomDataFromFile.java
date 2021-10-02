package symptoms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadSymptomDataFromFile {

	/**
	 * getSymptoms permet d'obtenir sous la forme d'une {@link List} de
	 * {@link String} l'ensemble des symptômes présents dans le fichier fourni
	 * 
	 * @param nomFichier le nom du fichier à analyser
	 * @return la liste des symptômes
	 */
	public static List<String> getSymptoms(String nomFichier) {
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