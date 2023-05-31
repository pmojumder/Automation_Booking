package com.test;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import com.Generic.script.Genric;

public class VerifyPostTest {

@Test
public void verify_post_method() throws FileNotFoundException
{
		Genric ref1=new Genric();
		ref1.post();
		

	}

}
