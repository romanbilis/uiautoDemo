package com.uiautomator.testcases;

import java.io.IOException;

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class New extends UiAutomatorTestCase{
		
	public void newsTest() throws IOException,UiObjectNotFoundException{
		Runtime.getRuntime().exec("com.netease.newsreader.activity/com.netease.nr.biz.ad.AdActivity");
		
		VoidDemo vd=new VoidDemo();
		vd.getUiObjectByIdAndInstanetIndex("com.netease.newsreader.activity:id/biz_navi_tab", 0);
		
		vd.getUiObjectByIdAndInstanetIndex("com.netease.newsreader.activity:id/biz_navi_tab", 4);
		
		
	}

}
