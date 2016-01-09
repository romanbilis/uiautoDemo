package com.uiautomator.testcases;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiSelector;

public class VoidDemo {
	
	public static UiObject getObjectById(String id){
		UiObject uiObject=new UiObject(new UiSelector().resourceId(id));
		return uiObject;
	}
	
	public static UiObject getUiObjectByIdAndInstanetIndex(String id,int indext){
		return new UiObject(new UiSelector().resourceId(id).instance(indext));
		
	}

}
