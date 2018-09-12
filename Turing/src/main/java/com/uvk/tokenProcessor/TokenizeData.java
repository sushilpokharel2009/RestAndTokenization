// package com.uvk.tokenProcessor;

// import java.io.Serializable;

// public class TokenizeData implements Serializable{

// 	private String recordDetails;
// 	private String inputData;
// 	private String outputData;
	
	
// 	public String getRecordDetails() {
// 		return recordDetails;
// 	}
// 	public void setRecordDetails(String recordDetails) {
// 		this.recordDetails = recordDetails;
// 	}
// 	public String getInputData() {
// 		return inputData;
// 	}
// 	public void setInputData(String inputData) {
// 		this.inputData = inputData;
// 	}
// 	public String getOutputData() {
// 		return outputData;
// 	}
// 	public void setOutputData(String outputData) {
// 		this.outputData = outputData;
// 	}
	
// 	@Override
// 	public boolean equals(Object object) {
// 		if (this == object) {
// 			return true;
// 		}
// 		if (!(object instanceof TokenizeData)) {
// 			return false;
// 		}
// 		TokenizeData tokenizeData = (TokenizeData) object;
// 		return this.recordDetails.equals(tokenizeData.recordDetails) && this.inputData.equals(tokenizeData.inputData) && this.outputData.equals(tokenizeData.outputData);
// 	}
	
	
// 	@Override
// 	public int hashCode() {
// 		int hashCode = 1;
// 		hashCode = hashCode * 37 + this.recordDetails.hashCode();
// 		hashCode = hashCode * 37 + this.inputData.hashCode();
// 		hashCode = hashCode * 37 + this.outputData.hashCode();
// 		return hashCode;
		
// 	}
// 	@Override
// 	public String toString() {
// 		return "TokenizeData [recordDetails=" + recordDetails + '\'' + ", inputData='" + inputData + '\''
// 				+ ", outputData='" + outputData + '\'' + '}';
// 	}
	
	
// }
