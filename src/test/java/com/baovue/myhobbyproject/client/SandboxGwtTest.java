package com.baovue.myhobbyproject.client;

import com.google.gwt.junit.client.GWTTestCase;

public class SandboxGwtTest extends GWTTestCase {
    @Override
    public String getModuleName() {
        return "com.baovue.myhobbyproject.MyHobbyProject";
    }

    public void testSandbox() {
        assertTrue(true);
    }
}
