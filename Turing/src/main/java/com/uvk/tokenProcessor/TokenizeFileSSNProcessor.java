// package com.uvk.tokenProcessor;

// import java.util.ArrayList;
// import java.util.List;

// import org.springframework.batch.item.ItemProcessor;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Value;

// public class TokenizeFileSSNProcessor implements ItemProcessor<List<TokenizeData>, List<TokenizeData>>{
	
// 	@Value("${turing.spring.batch.detokenize.delimiter:,}")
// 	public String delimiter;
	
// 	@Autowired
// 	private TuringService turingService;

// 	public List<TokenizeData> process(List<TokenizeData> items) throws TuringClientException {
// 		List<TokenizeData> inputList = new ArrayList<TokenizeData>();
		
// 		for (TokenizeData tokenizeData : items) {
// 			final StringBuilder stringBuilder = new StringBuilder();
// 			String[] values = tokenizeData.getInputData().trim().split(",");
			
// 			List<String> tokOutput = turingService.tokenize(TuringScope.USTAXID, values);
// 			for(String tokSSN : tokOutput) {
// 				stringBuilder.append(tokSSN).append(delimiter);
// 			}
			
// 			if (stringBuilder.toString().endsWith(delimiter)) {
// 				String output = stringBuilder.substring(0, stringBuilder.length() - 1);
// 				tokenizeData.setOutputData(output);
// 			}
// 			inputList.add(tokenizeData);
// 		}
// 		return inputList;
// 	}

// }


