import java.util.List;

import com.numbertowordconverter.converter.NumberToWordConverter;
import com.numbertowordconverter.converter.WordConverter;
import com.numbertowordconverter.util.FileReaderUtil;

public class Main {
	private static final String filePath = "src/main/resources/input.txt";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  FileReaderUtil fileContent=new FileReaderUtil();
          WordConverter wordConverter=new NumberToWordConverter();
          List<String> outputs=wordConverter.convert(fileContent.readFile(filePath));
          for(String result:outputs){
        	  System.out.println(result);
          }
	}

}
