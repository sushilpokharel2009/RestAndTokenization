// package com.uvk.tokenProcessor;

// import java.io.Serializable;

// import org.apache.commons.lang.builder.ToStringBuilder;
// import org.apache.commons.lang.builder.EqualsBuilder;

// public class TuringErrorInfo implements Serializable{
// 	private String id;
// 	private String text;
// 	private String developerText;
	
	
// 	public TuringErrorInfo(String id, String text, String developerText) {
		
// 		this.id = id;
// 		this.text = text;
// 		this.developerText = developerText;
// 	}


// 	public String getId() {
// 		return id;
// 	}


// //	public void setId(String id) {
// //		this.id = id;
// //	}


// 	public String getText() {
// 		return text;
// 	}


// //	public void setText(String text) {
// //		this.text = text;
// //	}


// 	public String getDeveloperText() {
// 		return developerText;
// 	}


// //	public void setDeveloperText(String developerText) {
// //		this.developerText = developerText;
// //	}
	
// 	public String toJsonString() {
// 		StringBuilder stringBuilder = new StringBuilder();
// 		stringBuilder.append("{")
// 			.append("\"id\":"").append(id).append("\",")
// 			.append("\"text\":"").append(text).append("\",")
// 			.append("\"developerText\":"").append(developerText).append("\",")
// 			.append("}");
		
// 		return stringBuilder.toString();
// 	}
	
// 	@Override
// 	public String toString() {
// 		return ToStringBuilder.reflectionToString(this);
// 	}
// }
