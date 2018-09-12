package com.uvk.token;

import java.util.List;

import com.uvk.tokenProcessor.TuringClientException;
import com.uvk.tokenProcessor.TuringElement;
import com.uvk.tokenProcessor.TuringScope;
import com.uvk.tokenProcessor.TuringScopeFamily;

public interface TuringV3ApiInvoker {
	List<TuringElement> post(TuringScopeFamily operation, TuringScope type, List<TuringElement>values) throws TuringClientException;
	
	List<TuringElement> post(String fromFieldType, TuringScopeFamily operation, TuringScope type, List<TuringElement>values) throws TuringClientException;

}
