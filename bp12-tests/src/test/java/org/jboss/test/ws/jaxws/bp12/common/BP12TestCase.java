package org.jboss.test.ws.jaxws.bp12.common;

import java.io.File;
import java.util.Map;

import junit.framework.Assert;

import org.jboss.wsf.test.JBossWSTestHelper;
import org.junit.Test;

public class BP12TestCase
{
   @Test
   public void testResource() {
     Map<File, String> maps = BP12Test.getResources(JBossWSTestHelper.getTestResourcesDir() + "/jaxws/bp12/basedoc/WEB-INF", "wsdl", "xsd");
     Assert.assertEquals("Unexpected resources files", 3, maps.size());
   }

}
