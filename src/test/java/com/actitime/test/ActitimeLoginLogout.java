package com.actitime.test;

import org.testng.Reporter;
import org.testng.annotations.Test;
import com.actitime.generics.BaseTest;

public class ActitimeLoginLogout extends BaseTest
{
	@Test
	public void login()
	{
		Reporter.log("login method is executing" , true);
	}
}