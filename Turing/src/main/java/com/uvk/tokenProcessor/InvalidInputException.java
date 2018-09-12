// package com.uvk.tokenProcessor;

// import com.uvk.token.TuringType;
// //import com.uvk.tokenProcessor.TuringErrors.INVALID_INPUT_ERROR;

// public class InvalidInputException extends TuringClientException {

// 	public InvalidInputException(String text) {
// 		this(text, text);
// 	}

// 	public InvalidInputException(String text, String developerText) {
// 		super(text, developerText);
// 		// TODO Auto-generated constructor stub
// 	}

// 	public InvalidInputException(String text, Throwable ex) {
// 		super(text, ex);
// 		// TODO Auto-generated constructor stub
// 	}

// 	public InvalidInputException(Throwable ex) {
// 		super(ex);
// 		// TODO Auto-generated constructor stub
// 	}
	
// 	public InvalidInputException(TuringType type, TuringOperation operation, String value) {
// 		super("Input: [" + value + "] specified for `" + operation.name() + "` on " + type.name(), INVALID_INPUT_ERROR);
// 		// TODO Auto-generated constructor stub
// 	}
	
// 	public InvalidInputException(TuringScope type, TuringScopeFamily operation, String value) {
// 		super("Input: [" + value + "] specified for `" + operation.name() + "` on " + type.name(), INVALID_INPUT_ERROR);
// 		// TODO Auto-generated constructor stub
// 	}
// }
