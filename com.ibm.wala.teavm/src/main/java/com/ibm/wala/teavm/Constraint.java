package com.ibm.wala.teavm;

import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;

public interface Constraint extends JSObject {

	@JSProperty
	Hashable getSub();
	
	@JSProperty
	Hashable getSuper();
}
