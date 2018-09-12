package com.uvk.token;

import java.util.List;
import java.util.Observable;
import java.util.concurrent.Future;

import com.uvk.tokenProcessor.TuringClientException;
import com.uvk.tokenProcessor.TuringElement;
import com.uvk.tokenProcessor.TuringScope;

public interface TuringService {
	
	String TURING_V30 = "3.0";
	String TURING_V21 = "2.1";
	
//	tokenize
	
    String tokenize(TuringType type, String value) throws TuringClientException;
    
    String tokenize(String  type, String value) throws TuringClientException;
    
	
	String[] tokenize(TuringType type, String... values) throws TuringClientException;
	
	
	Future<String> tokenizeAsync(TuringType type, String value) throws TuringClientException;
	
	Future<List<String>> tokenizeAsync(TuringType type, String... values) throws TuringClientException;
	
	Observable<String> tokenizeObservable(TuringType type, String value) throws TuringClientException;
	
	Observable<List<String>> tokenizeObservable(TuringType type, String... values) throws TuringClientException;
	
	
//	detokenize
	
	String detokenize(TuringType type, String value) throws TuringClientException;
	
	String detokenize(String type, String value) throws TuringClientException;
	
	String[] detokenize(TuringType type, String... values) throws TuringClientException;
	
	Future<String> detokenizeAsync(TuringType type, String value) throws TuringClientException;
	
	Future<List<String>> detokenizeAsync(TuringType type, String... values) throws TuringClientException;
	
	Observable<String> detokenizeObservable(TuringType type, String value) throws TuringClientException;
	
	Observable<List<String>> detokenizeObservable(TuringType type, String... values) throws TuringClientException;
	
//	encrypt
	String encrypt(TuringType type, String value) throws TuringClientException;
	
	String encrypt(String type, String value) throws TuringClientException;
	
	String[] encrypt(TuringType type, String... values) throws TuringClientException;
	
	Future<String> encryptAsync(TuringType type, String value) throws TuringClientException;
	
	Observable<String> encryptObservable(TuringType type, String value) throws TuringClientException;
	
	Observable<List<String>> encryptObservable(TuringType type, String... values) throws TuringClientException;
	
	
	
	
//	decrypt
	String decrypt(TuringType type, String value) throws TuringClientException;
	
	String decrypt(String type, String value) throws TuringClientException;
	
	String[] decrypt(TuringType type, String... values) throws TuringClientException;
	
	Future<String> decryptAsync(TuringType type, String value) throws TuringClientException;
	
	Observable<String> decryptObservable(TuringType type, String value) throws TuringClientException;
	
	Observable<List<String>> decryptObservable(TuringType type, String... values) throws TuringClientException;

	String swapToken(String fromFieldType, String type, String value) throws TuringClientException;
	
	String swapToken(String fromFieldType, TuringType type, String value) throws TuringClientException;
	
	String[] swapTokens(String fromFieldType, TuringType type, String... values) throws TuringClientException;

	Future<List<String>> swapTokensFuture(String fromFieldType, TuringType type, String... values) throws TuringClientException;

	Observable<List<String>> swapTokensObservable(String fromFieldType, TuringType type, String... values) throws TuringClientException;
	
	TuringClientConfig getClientConfig();
	
	

}
