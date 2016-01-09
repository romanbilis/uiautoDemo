package com.uiautomator.testcases2;

import java.io.IOException;

import android.provider.Contacts.Intents.UI;

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class TestDemo extends UiAutomatorTestCase{
	
	
	public void TestText() throws UiObjectNotFoundException{
		try {
			Runtime.getRuntime().exec("am start -n com.example.todolist/com.example.todolist.LoginActivity");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			UiobjectHelper ub=new UiobjectHelper();
			ub.getUiobjectByText("com.example.todolist:id/nameET").clickAndWaitForNewWindow();
			ub.getUiobjectByText("com.example.todolist:id/nameET").setText("hellword");
		}
	}

}
