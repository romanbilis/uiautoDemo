package com.uiautomator.testcases3;

import android.provider.Contacts.Intents;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiSelector;
import com.uiautomator.testcases2.UiobjectHelper;

public class NewsDemo {
	public UiObject getUiObjectByIdAndInstanetIndex(String id,int index){
		return new UiObject(new UiSelector().resourceId(id).instance(index));
	}
	
	
	public UiObject getReaTab(){
		return 	UiobjectHelper.getUiObjectByIdAndInstanetIndex("com.netease.newsreader.activity:id/biz_navi_tab",0);
	}
	
	}
