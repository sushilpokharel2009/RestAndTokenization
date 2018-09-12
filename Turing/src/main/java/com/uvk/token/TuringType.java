package com.uvk.token;

import com.uvk.tokenProcessor.InvalidInputException;
import com.uvk.tokenProcessor.TuringScope;

public enum TuringType {
	SSN, SSN_PARTIAL, SIN, SSS, PAN, PARTNERACCT, PLCC, NONUSBAN, CBGMCUSTTID, CBCOSTCOCUSTID, CBBPACCTID, CBBPCUSTID, CBGMACCTID, ACCT;
	
	public static TuringType fromString(String type) {
		try {
			return TuringType.valueOf(type);
			
		}catch (IllegalArgumentException e) {
			throw new InvalidInputException(e);
		}
	}
	public static boolean isPci(TuringType type) {
		return PAN == type || PARTNERACCT == type;
	}
	
	public static TuringType from(TuringScope scope) {
		switch (scope) {
		case USTAXID :
			return TuringType.SSN;
		case USTAXIDPARTIAL :
			return TuringType.SSN_PARTIAL;
		case PAN :
			return TuringType.PAN;
		case ACCT :
			return TuringType.ACCT;
		case PARTNERACCT :
			return TuringType.PARTNERACCT;
		case NONUSBAN :
			return TuringType.NONUSBAN;
		case PLCC :
			return TuringType.PLCC;
			
		case CBGMACCTID :
			return TuringType.CBGMACCTID;
		case CBCOSTCOCUSTID :
			return TuringType.CBCOSTCOCUSTID;
		case CBBPACCTID :
			return TuringType.CBBPACCTID;
		default :
			throw new InvalidInputException("Invalid Turing Scope " + scope);
		
		}
	}
}
