//package com.uvk.mapper;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.batch.item.file.mapping.FieldSetMapper;
//import org.springframework.batch.item.file.transform.FieldSet;
//
//import com.uvk.tokenProcessor.TokenizeData;
//import com.uvk.tokenProcessor.TuringClientException;
//import com.uvk.tokenProcessor.TuringScope;
//
//public class TokenizedMapper implements FieldSetMapper<List<TokenizeData>>{
//
//	String position;
//	
//	public void setPosition(String position) {
//		this.position = position;
//	}
//	
//	public List<TokenizeData> mapFieldSet(FieldSet fieldSet) {
//		StringBuilder stringBuilder = new StringBuilder();
//		String[] allpositions = position.trim().split(",");
//		List<TokenizeData> inputList = new ArrayList<TokenizeData>();
//		TokenizeData tokenizeData = new TokenizeData();
//		tokenizeData.setRecordDetails(fieldSet.toString().replaceAll("\\[|\\]", ""));
//		for (String posi : allpositions) {
//		String[]	 delimitedPosition = posi.split("-");
//		stringBuilder.append(fieldSet.toString().substring(Integer.parseInt(delimitedPosition[0]),
//				Integer.parseInt(delimitedPosition[1])) + ",");
//				
//		}
//		if (stringBuilder.toString().endsWith(",")) {
//			String input = stringBuilder.substring(0, stringBuilder.length() - 1);
//			tokenizeData.setInputData(input);
//		}
//		inputList.add(tokenizeData);
//		return inputList;
//	}
//}
