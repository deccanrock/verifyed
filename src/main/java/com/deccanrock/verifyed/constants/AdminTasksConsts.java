package com.deccanrock.verifyed.constants;

/**
* Place all constants relating to Admin Tasks here.
*
*/


public class AdminTasksConsts {
	
	public enum Status {
	    OPEN(0),
	    LOCKED(1),
	    CLOSED(2);

	    private final int value;

	    private Status(int value) {
	        this.value = value;
	    }

	    public int getValue() {
	        return value;
	    }
	}
	
	public enum Code {
		VERIFY_NEW_ORG(0), 
		NEW_ORG_VERIFIED(1), 
		ENABLE_ORG_FOR_ACTIVITY(2), 
		AWAITING_ORG_CONFIRMATION(3), 
		ORG_DETAILS_VERIFIED(4), 
		ORG_SUSPENDED(5);
		
	    private final int value;

	    private Code(int value) {
	        this.value = value;
	    }

	    public int getValue() {
	        return value;
	    }		
	}
	
}
