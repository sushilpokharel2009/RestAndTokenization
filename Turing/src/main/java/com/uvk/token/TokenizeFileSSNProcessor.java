// package com.uvk.token;

// import java.util.ArrayList;
// import java.util.List;

// import org.apache.commons.lang.StringUtils;
// import org.springframework.batch.item.ItemProcessor;

// import com.uvk.tokenProcessor.TokenizeData;
// import com.uvk.tokenProcessor.TuringClientException;
// import com.uvk.tokenProcessor.TuringScope;
// import com.uvk.tokenProcessor.TuringService;

// public class TokenizeFileSSNProcessor implements ItemProcessor<List<TokenizeData>, List<TokenizeData>>{

// 	String tokenizeSSN = null;
// 	String comma = ",";
// 	TuringService turingService;
	
// 	public TokenizeFileSSNProcessor() {
// 		this(new TuringServiceImpl());
// 	}
	
// 	public TokenizeFileSSNProcessor(TuringService turingService) {
// 		this.turingService = turingService;
// 	}

// 	public List<TokenizeData> process(List<TokenizeData> item) throws TuringClientException {
// 		List<TokenizeData> inputList = new ArrayList<TokenizeData>();
// 		StringBuilder stringBuilder = new StringBuilder();
// 		for (TokenizeData tokenizeData : item) {
// 			String[] inputSSN = tokenizeData.getInputData().trim().split(",");
// 			for (String numberSSN : inputSSN) {
// 				if (StringUtils.isNotBlank(numberSSN)) {
// 					tokenizeSSN = turingService.tokenize(TuringType.SSN, numberSSN) + comma;
// 					stringBuilder.append(tokenizeSSN);
// 				}
// 			}

			
			
// 			if (stringBuilder.toString().endsWith(",")) {
// 				String output = stringBuilder.substring(0, stringBuilder.length() - 1);
// 				tokenizeData.setOutputData(output);
// 			}
// 			inputList.add(tokenizeData);
// 		}
// 		return inputList;
	
	
// 	}
	
// }
