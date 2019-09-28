package com.time.collaborate;

class Autumn {

    private static final String START_DATE = "September 23, 2019";

    private static final String START_TIME = "7:50 UTC";
    
    private static Integer numberAutumns = 0;

    static String getStartDateTime() {
        return START_DATE + " " + START_TIME;
        
        
    }
    
    //We need some instance variables..but what?
    
    public Autumn() {
    	numberAutumns++;
    	
    	
    }
    
    
}
