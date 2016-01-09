package com.uiautomator.testcases;

import java.io.IOException;

import android.os.RemoteException;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;



public class FirstTest extends UiAutomatorTestCase {
		/*public void testDemo() throws UiObjectNotFoundException {
			
			getUiDevice().pressHome();
			
			UiObject appButton=new UiObject(new UiSelector().description("Apps"));
			appButton.clickAndWaitForNewWindow();
		}*/
	
	public void testDemo() throws UiObjectNotFoundException,RemoteException {
		//UiDevice.getInstance().pressHome();
		
		
			try {
				Runtime.getRuntime().exec("am start -n com.example.todolist/com.example.todolist.LoginActivity");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			// TODO Auto-generated catch block		
		UiDevice.getInstance().pressBack();
	}
}
