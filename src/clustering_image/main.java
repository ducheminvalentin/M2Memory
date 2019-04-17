package clustering_image;

import java.io.IOException;


public class main {

	public static void main(String[] args) throws IOException {

		
		AlgorithmeClustering algo1 = new AlgorithmeClustering();
		String image = "resources/red-circle-30x30-hi.png";
		algo1.getRGBValue(image); //Lien de l'image à traiter 
		algo1.generateCluster(80); //Nombre de clusters souhaités
		algo1.iteratorCluster(100); //Nombre d'itération
		algo1.setRGBValue(image);
		
	}
}