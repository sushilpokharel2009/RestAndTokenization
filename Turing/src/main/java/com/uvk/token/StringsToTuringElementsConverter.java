// package com.uvk.token;

// import java.util.ArrayList;
// import java.util.List;

// import org.apache.commons.lang.ArrayUtils;

// import com.uvk.tokenProcessor.TuringElement;
// import com.uvk.tokenProcessor.TuringScope;
// import com.uvk.tokenProcessor.TuringScopeFamily;

// public class StringsToTuringElementsConverter {

// 	public TuringElement[] convertValuesToTuringElementArray(TuringScopeFamily operation, TuringScope type, String[] inputValueString) {
// 		if(type == null || (ArrayUtils.getLength(inputValueString) <=0)) {
// 			return new TuringElement[0];
// 		}
		
// 		TuringElementBuilder  turingElementBuilder  = new TuringElementBuilder ();
// 		TuringElement[] turingElement = new TuringElement[ArrayUtils.getLength(inputValueString)];{
			
// 		}
// 		for (int index = 0; index < inputValueString.length; index++){
// 			turingElements[index] = new turingElementBuilder.createTuringElement(operation, type, inputValueString[index]);
// 		}	
		
// 		return turingElement;
		
// 	}
// 	public List<TuringElement> convertValuesToTuringElements(TuringScopeFamily operation, TuringScope type, String[] inputValuesString){
// 		if (type == null || (ArrayUtils.getLength(inputValuesString) <= 0)) {
// 			return new ArrayList<TuringElement>();
// 		}
// 		TuringElementBuilder turingElementBuilder new TuringElementBuilder();
// 		List<TuringElement> turingElements = new ArrayList<TuringElement>(ArrayUtils.getLength(inputValuesString));
// 		for (int index = 0; index < inputValuesString.length; index++) {
// 			turingElements.add(turingElementBuilder.createTuringElement(operation, type, inputValuesString[index]));
// 		}
		
		
		
		
		
		
// 		return turingElements;
// 	}
// }
