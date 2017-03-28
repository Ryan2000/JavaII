import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.bean.BeanToCsv;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;

public class Main {

	public static void main(String[] args) {

		Optional<File> file = FilePicker.pickFile();

		if (file.isPresent()) {
			File f = file.get();
			
			try(CSVReader csvReader = new CSVReader(new FileReader(f))){
				
		        HeaderColumnNameMappingStrategy<ContactsBean> strategy = new HeaderColumnNameMappingStrategy<>();
		        strategy.setType(ContactsBean.class);
		        CsvToBean<ContactsBean> csvToBean = new CsvToBean<>();  
		        
		        List<ContactsBean> contactsBeanList = csvToBean.parse(strategy, csvReader);
		        for (ContactsBean contactsBean  : contactsBeanList) {
		        	System.out.println(contactsBean);
		        	}
		        
		        System.out.println("Writing to destination file...");
		        
		        //Create a CSVWriter
                try(CSVWriter csvWriter = new CSVWriter(new FileWriter(new File("Destination.csv")))){
                    //Create a BeanToCsv object. This maps the properties
                    //in ContactBean.java to the columns in a CSV file
                    BeanToCsv<ContactsBean> beanToCsv = new BeanToCsv<>();
                    
                    //Write the file
                    beanToCsv.write(strategy, csvWriter, contactsBeanList);
                }
				
			} catch (IOException e) {
				e.printStackTrace();
			}

		} else {
			
			
		}
		
	}
	
}
			

		

	

