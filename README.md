# WS-I Basic Profile Tests
* Run these tests
  
  Go to each module and run with
  
  *mvn clean test -Dproxy.port=7070 -Dproxy.address=http://localhost:8080 -Pwildfly1000 -Djboss.home=/path/to/wildfy.10.0.0/home*

* Proxy port and address
  - proxy port is used to relace the EPR address in wsa test soap message, and proxy address is the target endpoint address which monitor the inbound and outbound message.
  - Default proxy port is set to 8080 and address is set to http://localhost:8080. Change these properites by setting a system property when run mvn test. 
  - To make it less configured, we'll change all these values we already set up to run ws-i bp tests.
  
  
* Test utils class and improvement

  There are couple of repeat utily class like BP12Test, BP20Test and BSP11Test. These utily class will be removed and merged into JBossWSTest in jbossws-cxf : 
  https://issues.jboss.org/browse/JBWS-3943
  
  

