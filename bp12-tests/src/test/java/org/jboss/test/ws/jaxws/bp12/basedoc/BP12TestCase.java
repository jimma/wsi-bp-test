package org.jboss.test.ws.jaxws.bp12.basedoc;

import java.io.File;
import java.util.Map;

import org.jboss.test.ws.jaxws.bp12.common.BP12Test;
import org.junit.Test;

public class BP12TestCase
{
   @Test
   public void testResource() {
     Map<File, String> maps = BP12Test.getResources("/home/jimma/code/jbossws/wsi-bp-test/bp12-test/src/test/resources", "wsdl", "xsd");
     for (File file : maps.keySet()) {
        System.out.println(file.getAbsolutePath());
     }
   }

}
