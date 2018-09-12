// package com.uvk.tokenProcessor;

// import java.util.List;
// //import java.util.Observable;
// import java.util.concurrent.Future;
// import rx.Observable;


// import com.uvk.token.TuringType;

// public interface TuringService {
	
// 	String tokenize(String type, String value) throws TuringClientException;
	
// 	List<String> tokenize(TuringScope type, String... values) throws TuringClientException;
	
// 	List<TuringElement> tokenize(TuringScope type, List<TuringElement> values) throws TuringClientException;
	
// 	Future<List<String>> tokenizeFuture(TuringScope type, String... values) throws TuringClientException;
	
// 	Future<List<TuringElement>> tokenizeFuture(TuringScope type, List<TuringElement> values) throws TuringClientException;
	
// 	Observable<List<String>> tokenizeObservable(TuringScope type, String... values) throws TuringClientException;
	
// 	Observable<List<TuringElement>> tokenizeObservable(TuringScope type, List<TuringElement> values) throws TuringClientException;
	
// 	String detokenize(String type, String value) throws TuringClientException;
	
// 	List<String> detokenize(TuringScope type, String... values) throws TuringClientException;
	
// 	List<TuringElement> detokenize(TuringScope type, List<TuringElement> values) throws TuringClientException;
	
// 	Future<List<String>> detokenizeFuture(TuringScope type, String... values) throws TuringClientException;
	
// 	Future<List<TuringElement>> detokenizeFuture(TuringScope type, List<TuringElement> values) throws TuringClientException;
	
// 	Observable<List<String>> detokenizeObservable(TuringScope type, String... values) throws TuringClientException;
	
// 	Observable<List<TuringElement>> detokenizeObservable(TuringScope type, List<TuringElement> values) throws TuringClientException;
	
// 	String swaptokenize(String type, String value) throws TuringClientException;
	
// 	List <String> swapTokens(TuringScope type, String... values) throws TuringClientException;
	
// 	List<TuringElement> swapTokens(TuringScope type, List<TuringElement> values) throws TuringClientException;
	
// 	Future<List<String>> swapTokensFuture(TuringScope type, String... values) throws TuringClientException;
	
// 	Future<List<TuringElement>> swapTokensFuture(TuringScope type, List<TuringElement> values) throws TuringClientException;
	
// 	Observable<List<String>> swapTokensObservable(TuringScope type, String... values) throws TuringClientException;
	
// 	Observable<List<TuringElement>> swapTokensObservable(TuringScope type, List<TuringElement> values) throws TuringClientException;
	
// 	String swaptoken(String fromFieldType, String type, String value) throws TuringClientException;
	
// 	List <String> swapTokens(String fromFieldType, TuringScope type, String... values) throws TuringClientException;
	
// 	List<TuringElement> swapTokens(String fromFieldType, TuringScope type, List<TuringElement> values) throws TuringClientException;
	
// 	Future<List<String>> swapTokensFuture(String fromFieldType, TuringScope type, String... values) throws TuringClientException;
	
// 	Future<List<TuringElement>> swapTokensFuture(String fromFieldType, TuringScope type, List<TuringElement> values) throws TuringClientException;
	
// 	Observable<List<String>> swapTokensObservable(String fromFieldType, TuringScope type, String... values) throws TuringClientException;
	
// 	Observable<List<TuringElement>> swapTokensObservable(String fromFieldType, TuringScope type, List<TuringElement> values) throws TuringClientException;
	

	

// }
