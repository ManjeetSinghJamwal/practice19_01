package com.gisfy.testscripts;

import com.gisfy.lib.General;

public class TC001 {

	public static void main(String[] args) throws InterruptedException {
		General obj = new General();
		obj.openbrowser();
		obj.enterurl();
		obj.login();
		obj.informationtechnology();
		obj.verifylinks();
		obj.logout();
		obj.closebrowse();

	}

}
