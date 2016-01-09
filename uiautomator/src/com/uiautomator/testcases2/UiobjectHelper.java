package com.uiautomator.testcases2;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiSelector;

public class UiobjectHelper {
	/*通过文本定位的方法
	 * @param text
	 * @return
	 * */
	
	public static UiObject getUiobjectByText(String text){
		UiObject object=new UiObject(new UiSelector().text(text));
		return object;
	}
	
	public static UiObject getUiObjectByResourId(String id){
		UiObject object=new UiObject(new UiSelector().resourceId(id));
		return object;
	}

	public static UiObject getUiObjectByIdAndInstanetIndex(String id,int indext){
		return new UiObject(new UiSelector().resourceId(id).instance(indext));
	}
	
	

}
