//package com.uvk.mapper;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.batch.item.file.mapping.FieldSetMapper;
//import org.springframework.batch.item.file.transform.FieldSet;
//import org.springframework.validation.BindException;
//
//import com.uvk.tokenProcessor.TokenizeData;
//
//public class TokenizedDelimiterMapper  implements FieldSetMapper<List<TokenizeData>>{
//	
//	String position;
//	String delimiter;
//	
//	public void setPosition(String position) {
//		this.position = position;
//	}
//	
//	public void setDelimiter(String delimiter) {
//		this.delimiter = delimiter;
//	}
//	
//	public List<TokenizeData> mapFieldSet(FieldSet fieldSet) {
//		int curPosition;
//		StringBuilder stringBuilder = new StringBuilder();
//		String[] allpositions = position.trim().split(",");
//		List<TokenizeData> inputList = new ArrayList<TokenizeData>();
//		TokenizeData tokenizeData = new TokenizeData();
//		String sCurrentLine = fieldSet.toString();
//		String[] cvsRecord = sCurrentLine.split(delimiter);
//		tokenizeData.setRecordDetails(sCurrentLine.replaceAll("\\[|\\]", ""));
//		for (int i = 0; i < allpositions.length; i++) {
//			for (String posi : allpositions) {
//				curPosition = Integer.parseInt(posi);
//				stringBuilder = stringBuilder.append(cvsRecord[curPosition]).append(",");
//			}
//		}
//			
//		if (stringBuilder.toString().endsWith(",")) {
//			String input = stringBuilder.substring(0, stringBuilder.length() - 1);
//			tokenizeData.setInputData(input);
//		}
//		inputList.add(tokenizeData);
//		return inputList;
//	}
//
//	
//}
