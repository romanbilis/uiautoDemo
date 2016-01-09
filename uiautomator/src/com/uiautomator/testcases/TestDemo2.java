package com.uiautomator.testcases;


import java.io.IOException;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class TestDemo2 extends UiAutomatorTestCase{
	
		public void testIndex() throws UiObjectNotFoundException {
			try {
				Runtime.getRuntime().exec("am start -n com.example.todolist/com.example.todolist.LoginActivity");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			UiObject usernameObject=new UiObject(new UiSelector().index(0));
			usernameObject.click();
			usernameObject.clearTextField();
			usernameObject.setText("hello word"); 
			
			UiObject passwordoObject=new UiObject(new UiSelector().resourceId("com.example.todolist:id/passwordET"));
			passwordoObject.setText("123456");
			UiObject loginObject=new UiObject(new UiSelector().index(2));
			loginObject.clickAndWaitForNewWindow();
			
			
		}
}
