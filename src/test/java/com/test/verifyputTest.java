package com.test;

import java.io.FileNotFoundException;
import java.lang.reflect.GenericArrayType;

import org.testng.annotations.Test;

import com.Generic.script.Genric;

public class verifyputTest {
	@Test
	public void verify_put_method() throws FileNotFoundException
	{
		Genric ref2=new Genric();
		ref2.put(499);
	}

}
