package org.jboss.test.ws.jaxws.bp.common;

import java.io.File;
import java.util.Map;

import junit.framework.Assert;

import org.jboss.wsf.test.JBossWSTestHelper;
import org.junit.Test;

public class BPTestCase
{
   @Test
   public void testResource() {
     Map<File, String> maps = BPTest.getResources(JBossWSTestHelper.getTestResourcesDir() + "/test/WEB-INF", "wsdl", "xsd");
     Assert.assertEquals("Unexpected resources files", 3, maps.size());
   }

}
