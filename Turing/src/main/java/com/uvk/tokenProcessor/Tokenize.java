package com.uvk.tokenProcessor;

import java.util.ArrayList;
import java.util.List;

public class Tokenize {
	private static TokenizeFileSSNProcessor obj = new TokenizeFileSSNProcessor();

	public static String tokinize(String accountNumber) {
		
		TokenizeData tokenizeData = new TokenizeData();
		tokenizeData.setInputData(accountNumber);
		tokenizeData.setRecordDetails("RecordingDetails");
		
		List<TokenizeData> inputList = new ArrayList<TokenizeData>();
		
		inputList.add(tokenizeData);
		
		List<TokenizeData> outputList = obj.process(inputList);
		
		TokenizeData outObject = outputList.get(0);
		
		return outObject.getOutputData();
	}

}
