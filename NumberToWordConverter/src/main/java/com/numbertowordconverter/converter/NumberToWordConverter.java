package com.numbertowordconverter.converter;
import java.util.ArrayList;
import java.util.List;
import com.numbertowordconverter.util.NameDictionary;
public class NumberToWordConverter implements WordConverter {
	NameDictionary nameDictionary;
	public NumberToWordConverter(){
        nameDictionary=new NameDictionary();
        }
	List<String> finalOutput=new ArrayList<String>();
	public List<String> convert(List<Integer> numbers) {
		// TODO Auto-generated method stub
		
		for(int number:numbers){
			String words="";
			int num=number;
			int remaingDigit=Integer.toString(num).length()%3;
			int parts=Integer.toString(num).length()/3+(remaingDigit!=0?1:0);
			int i=0;
			int[] p=new int[parts];
            while(i<parts){
				p[i]=num%1000;
				num=num/1000;				
				i++;
			}
            --i;
            while(i>=0){
				
				
				if(p[i]/100!=0){
					words=((p[i]%100)==0?words+" "+nameDictionary.getTo_19(p[i]/100)+" hundred":words+" "+nameDictionary.getTo_19(p[i]/100)+" hundred and");
				}
				
				if(p[i]%100<20){
					words= words+" "+nameDictionary.getTo_19(p[i]%100);
					
				}
				else{
					words=words+" "+nameDictionary.getTens((p[i]%100)/10) +" "+ nameDictionary.getTo_19(p[i]%10);	
				
				}
				if(p[i]!=0){
					words=words+" "+nameDictionary.getDenoms(i+1);
				}
				i--;
				
			}		
            finalOutput.add(words);
		}
	
		
		
		
		
		return finalOutput;
	}

}
