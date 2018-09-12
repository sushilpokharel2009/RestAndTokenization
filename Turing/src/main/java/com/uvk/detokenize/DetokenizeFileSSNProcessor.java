// package com.uvk.detokenize;

// import java.util.ArrayList;
// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Value;

// import com.uvk.tokenProcessor.TokenizeData;
// import com.uvk.tokenProcessor.TuringClientException;
// import com.uvk.tokenProcessor.TuringScope;
// import com.uvk.tokenProcessor.TuringService;

// public class DetokenizeFileSSNProcessor {
	
// 	@Value("${turing.spring.batch.detokenize.delimiter:,}")
// 	public String delimiter;
	
// 	@Autowired
// 	private TuringService turingService;

// 	public List<TokenizeData> process(List<TokenizeData> items) throws TuringClientException {
// 		List<TokenizeData> inputList = new ArrayList<TokenizeData>();
		
// 		for (TokenizeData tokenizeData : items) {
// 			final StringBuilder stringBuilder = new StringBuilder();
// 			String[] values = tokenizeData.getInputData().trim().split(",");
			
// 			List<String> tokOutput = turingService.detokenize(TuringScope.USTAXID, values);
// 			for(String detokSSN : tokOutput) {
// 				stringBuilder.append(detokSSN).append(delimiter);
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
