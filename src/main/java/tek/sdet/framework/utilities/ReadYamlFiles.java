package tek.sdet.framework.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;

import org.yaml.snakeyaml.Yaml;

public class ReadYamlFiles {
	/* SINGLETON design pattern:
	 * - private static instance reference to this class
	 * - make the constructor private
	 * - method to return instance and check if the instance is not created
	 * one but if there is an instance available then just return that one 
	 */
	private static ReadYamlFiles readYamlFiles;
	private HashMap propertyMap;  //doesn't not do anything with the Singleton design pattern
	
	private ReadYamlFiles(String filepath) throws FileNotFoundException {
		FileInputStream fileInputStream = FileUtility.getFileInputStream(filepath);
		Yaml yaml = new Yaml();
		this.propertyMap = yaml.load(fileInputStream);
	}
	
	public static ReadYamlFiles getInstance(String filePath) throws FileNotFoundException {
		if(readYamlFiles == null) 
			readYamlFiles = new ReadYamlFiles(filePath);
		return readYamlFiles;
	}
	
	public HashMap getYamlProperty(String key) {
		return(HashMap) this.propertyMap.get(key);
	}
	
}
