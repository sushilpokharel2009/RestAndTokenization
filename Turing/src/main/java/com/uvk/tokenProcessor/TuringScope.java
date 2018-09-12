// package com.uvk.tokenProcessor;


// import com.uvk.token.TuringType;

// public enum TuringScope {
// 	USTAXID, USTAXIDPARTIAL, GLOBALTAXID, PAN, ACCT, PARTNERACCT, NONUSBAN, PLCC, CBGMACCTID, CBGMCUSTID, CBCOSTCOCUSTID, CBBPACCTID, CBBPCUSTID, BAN;

// 	public static TuringScope fromString(String type) {
// 		try {
// 			return TuringScope.valueOf(type);
			
// 		}catch (IllegalArgumentException e) {
// 			throw new InvalidInputException(e);
// 		}
// 	}
// 	public static boolean isPci(TuringScope scope) {
// 		return PAN == scope || PARTNERACCT == scope;
// 	}
	
// 	public static TuringScope from(TuringType type) {
// 		switch (type) {
// 		case SSN  :
// 			return TuringScope.USTAXID;
			
// 		case SSN_PARTIAL  :
// 			return TuringScope.USTAXIDPARTIAL;
// 		case SIN :
// 			return TuringScope.GLOBALTAXID;
			
// 		case PAN :
// 			return TuringScope.PAN;
			
// 		case ACCT :
// 			return TuringScope.ACCT;
			
// 		case PARTNERACCT :
// 			return TuringScope.PARTNERACCT;
			
// 		case NONUSBAN :
// 			return TuringScope.NONUSBAN;
			
// 		case PLCC :
// 			return TuringScope.PLCC;
			
// 		case CBGMACCTID :
// 			return TuringScope.CBGMACCTID;
			
// 		case CBGMCUSTID :
// 			return TuringScope.CBGMCUSTID;
			
// 		case CBCOSTCOCUSTID :
// 			return TuringScope.CBCOSTCOCUSTID;
			
// 		case CBBPACCTID :
// 			return TuringScope.CBBPACCTID;
		
// 		case CBBPCUSTID :
// 			return TuringScope.CBBPCUSTID;
// 		default :
// 			throw new InvalidInputException("Invalid Turing Scope " + scope);
// 		}
		
// 		}

// }
