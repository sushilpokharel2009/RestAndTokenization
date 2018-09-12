package com.uvk.token;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Future;

import com.uvk.tokenProcessor.TuringClientException;
import com.uvk.tokenProcessor.TuringElement;
import com.uvk.tokenProcessor.TuringScope;
import com.uvk.tokenProcessor.TuringService;

public class TuringServiceImpl implements TuringService {
	
	private TuringApiInvoker turingApiInvoker;
	private TuringV3ApiInvoker turingV3ApiInvoker;
	private StringsToTuringElementsConverter stringsToTuringElementsConverter;
	private TuringElementsToStringsConverter turingElementsToStringsConverter;
	private TuringValidator validator;
	private ConcurrentServiceInvoker<TuringType, TuringOperation> concurrentServiceInvoker;
	private ConcurrentServiceInvoker<TuringScope, TuringScopeFamily> currentV3Invoker;
	private TuringClientConfig clientConfig;
	private TuringClientUtils turingClientUtils;
	
	
	private static final String OPERATION_NOT_SUPPORTED = "%s operation is not supported for Turing %s";
	private static Map<String, Set<TuringOperation>> supportedOperations = new HashMap<String, Set<TuringOperation>>();
	
	static {
		supportedOperations.put(TURING_V21, new HashSet<TuringOperation>(Arrays.asList(tokenize, detokenize, encrypt, decrypt)));
		supportedOperations.put(TURING_V30, new HashSet<TuringOperation>(Arrays.asList(tokenize, detokenize, swaptokens)));
	}
	
	public TuringServiceImpl() {
		this(new TuringValidator(new SystemPropertyBasedTuringClientConfig()),
				new TuringClientCreator(new SystemPropertyBasedTuringClientConfig()),
				new HystrixPropertyConfigure(new SystemPropertyBasedTuringClientConfig()),
				new SystemPropertyBasedTuringClientConfig());
	}
	
	public TuringServiceImpl(TuringClientConfig ClientConfig) {
		this(new TuringValidator(clientConfig), new TuringClientCreator(clientConfig),
				new HystrixPropertyConfigure(clientConfig), clientConfig);
	}
	
	public TuringServiceImpl(TuringApiInvoker turingApiInvoker) {
		this TuringApiInvoker = turingApiInvoker;
		stringsToTuringElementsConvertor = new StringsToTuringElementsConvertor();
		turingElementsToStringsConvertor = new TuringElementsToStringsConvertor();
		this.clientConfig = new SystemPropertyBasedTuringClientConfig();
		setOtherProperties(new HystrixPropertyConfigure(clientConfig), new TuringValidator(clientConfig));
	}
	
	public TuringServiceImpl(TuringApiInvoker turingApiInvoker, TuringClientConfig config) {
		this.clientConfig = config;
		this turingApiInvoker = turingApiInvoker;
		stringsToTuringElementsConvertor = new StringsToTuringElementsConvertor();
		turingElementsToStringsConvertor = new TuringElementsToStringsConvertor();
		setOtherProperties(new HystrixPropertyConfigure(clientConfig), new TuringValidator(clientConfig));
			
	}
	
	public TuringServiceImpl(TuringV3ApiInvoker turingV3ApiInvoker) {
		this.turingV3ApiInvoker = turingV3ApiInvoker;
		stringsToTuringElementsConvertor = new StringsToTuringElementsConvertor();
		turingElementsToStringsConvertor = new TuringElementsToStringsConvertor();
		this.clientConfig = new SystemPropertyBasedTuringClientConfig();
		setOtherProperties(new HystrixPropertyConfigure(clientConfig), new TuringValidator(clientConfig));
	}
	
	TuringServiceImpl(TuringValidator validator, ClientCreator clientCreator, ProperyConfigurer configurer, TuringClientConfig clientConfig){
		this.clientConfig = clientConfig;
		setOtherProperties(configurer, validator);
		if(clientConfig.isTuringV3orLater()) {
			this.turingV3ApiInvoker = new TuringApiInvokerImpl(validator, clientCreator, null,clientConfig);
		}else {
			this.turingApiInvoker = new TuringApiInvokerImpl(validator, clientCreator, null,clientConfig);
		}
	}
	
	
	
	
	
	
	
	

//	public String tokenize(String type, String value) throws TuringClientException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public List<String> tokenize(TuringScope type, String... values) throws TuringClientException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public List<TuringElement> tokenize(TuringScope type, List<TuringElement> values) throws TuringClientException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public Future<List<String>> tokenizeFuture(TuringScope type, String... values) throws TuringClientException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public Future<List<TuringElement>> tokenizeFuture(TuringScope type, List<TuringElement> values)
//			throws TuringClientException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public String detokenize(String type, String value) throws TuringClientException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public List<String> detokenize(TuringScope type, String... values) throws TuringClientException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public List<TuringElement> detokenize(TuringScope type, List<TuringElement> values) throws TuringClientException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public Future<List<String>> detokenizeFuture(TuringScope type, String... values) throws TuringClientException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public Future<List<TuringElement>> detokenizeFuture(TuringScope type, List<TuringElement> values)
//			throws TuringClientException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public String swaptokenize(String type, String value) throws TuringClientException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public List<String> swapTokens(TuringScope type, String... values) throws TuringClientException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public List<TuringElement> swapTokens(TuringScope type, List<TuringElement> values) throws TuringClientException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public Future<List<String>> swapTokensFuture(TuringScope type, String... values) throws TuringClientException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public Future<List<TuringElement>> swapTokensFuture(TuringScope type, List<TuringElement> values)
//			throws TuringClientException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public String swaptoken(String fromFieldType, String type, String value) throws TuringClientException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public List<String> swapTokens(String fromFieldType, TuringScope type, String... values)
//			throws TuringClientException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public List<TuringElement> swapTokens(String fromFieldType, TuringScope type, List<TuringElement> values)
//			throws TuringClientException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public Future<List<String>> swapTokensFuture(String fromFieldType, TuringScope type, String... values)
//			throws TuringClientException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public Future<List<TuringElement>> swapTokensFuture(String fromFieldType, TuringScope type,
//			List<TuringElement> values) throws TuringClientException {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
