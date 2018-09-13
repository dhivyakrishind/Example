package com.numbertowordconverter.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReaderUtil {
	public List<Integer> readFile(String path){

        FileReader fileReader = null;
        BufferedReader bufferedReader =null;

        List<Integer> fileContentList= new ArrayList<Integer>();

        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            //process the file line by line
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                fileContentList.add(Integer.parseInt(line));
            }
        }catch(FileNotFoundException ex){
            System.out.println("The file can not be found.." + ex.getMessage());
            ex.printStackTrace();
            throw new RuntimeException("file not found");
        }catch(IOException e){
            System.out.println("IOException");
            e.printStackTrace();
            throw new RuntimeException("IOException");
        }finally{
            try {
                if(fileReader != null)
                    fileReader.close();
                if (bufferedReader != null)
                    bufferedReader.close();
            }catch(IOException e){
                System.out.println("Exception while closing the resources ..");
            }
        }
        return fileContentList;
    }
}
