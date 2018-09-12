// package com.uvk.tokenProcessor;

// public class TuringClientException extends RuntimeException {
	
// 	private String text;
// 	private String developerText;
	
	
// 	public TuringClientException(String text) {
// 		this(text, "");
// 	}
	
// 	public TuringClientException(String text, String developerText) {
// 		this.text = text;
// 		this.developerText = developerText;
// 	}
	
// 	public TuringClientException(String text, Throwable ex) {
// 		super(ex);
// 		this.text = text;
// 		this.developerText = developerText;
// 	}
	
// 	public TuringClientException(Throwable ex) {
// 		super(ex);
// 		this.text = (ex !=null) ? ex.getMessage() : "";
// 		if(ex !=null) {
// 			Throwable cause = (ex.getCause() != null) ? ex.getCause() : ex;
// 			this.developerText = cause.getClass().getName() + ": " + cause.getMessage();
// 		}
		
// 	}
	
// 	public String getText() {
// 		return text;
// 	}
	
// 	public String getDeveloperText() {
// 		return developerText;
// 	}
	
// 	@Override
// 	public String getMessage() {
// 		return this.toString();
// 	}

// 	@Override
// 	public String toString() {
// 		return this.getClass().getSimpleName() + "{" + "text='" + text + '\'' + ", developerText='" + developerText
// 				+ '\'' + '}';
// 	}
	
// }
	
