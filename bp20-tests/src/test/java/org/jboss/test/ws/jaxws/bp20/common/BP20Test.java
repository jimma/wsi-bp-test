/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2013, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.test.ws.jaxws.bp20.common;

import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.wsf.test.JBossWSTest;
//TODO: move these to JBossWSTest
public abstract class BP20Test extends JBossWSTest {
	   protected final String PROXY_ADDRESS = System.getProperty("proxy.address", "http://localhost:8080");
	   protected final String PROXY_PORT = System.getProperty("proxy.port", "8080");

	   public static void listFiles(String directoryName, Set<File> files, String... types)
	   {
	      File directory = new File(directoryName);
	      File[] fList = directory.listFiles();
	      for (File file : fList)
	      {
	         if (file.isFile())
	         {
	            for (String type : types) {
	               if (file.getName().endsWith(type)) {
	                  files.add(file);
	               }
	            }           
	         }
	         else if (file.isDirectory())
	         {
	            listFiles(file.getPath(), files, types);
	         }
	      }
	   }

	   public static Map<File, String> getResources(String directory, String ... types)
	   {
	      Set<File> files = new HashSet<File>();
	      listFiles(directory, files, types);
	      Map<File, String> maps = new HashMap<File, String>();
	      for (File file : files)
	      {
	         maps.put(file, new File(directory).toURI().relativize(file.toURI()).getPath());
	      }
	      return maps;
	   }
	   
	   
	   protected static void addResroucesToWebInf(String resourceDir, WebArchive archive, String... resourceType) {
	      Map<File, String> resources = getResources(resourceDir, resourceType);
	      for (File file : resources.keySet()) {
	         archive.addAsWebInfResource(file, resources.get(file));
	      }
	      
	   }
	   
	   protected String getProxyAddress(URL baseURL) {
	      return this.PROXY_ADDRESS + baseURL.getPath();
	   }

}
