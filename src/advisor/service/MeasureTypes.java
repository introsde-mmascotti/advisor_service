package advisor.service;

public enum MeasureTypes {
	
	WEIGHT ("Weight"),
	HEIGHT ("Height"),
	PAL_FACTOR  ("PAL factor");

    private final String type;
    
    MeasureTypes(String type) {
        this.type = type;
    }
    
    public String getType() {
		return type;
	}
}