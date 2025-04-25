  </testcase>
# TEST 1
  <testcase name="testGetEmployeeById_Found" classname="com.example.demo.EmployeeServiceTest" time="0.294"/>
  
# TEST 2
  <testcase name="testGetEmployeeById_NotFound" classname="com.example.demo.EmployeeServiceTest" time="0.02"/>

# TEST 3 IT GIVES ERROR BECAUSE IT COULDNT ABLE TO FIND THE DATA USING PATH VARIABLE AT /employee/5 since there is data only for id:1
  <testcase name="testGetEmployeeById2_Found" classname="com.example.demo.EmployeeServiceTest" time="0.037">
    <failure message="Status expected:&lt;200&gt; but was:&lt;404&gt;" type="java.lang.AssertionError"><![CDATA[java.lang.AssertionError: Status expected:<200> but was:<404>
	at org.springframework.test.util.AssertionErrors.fail(AssertionErrors.java:61)
	at org.springframework.test.util.AssertionErrors.assertEquals(AssertionErrors.java:128)
	at org.springframework.test.web.servlet.result.StatusResultMatchers.lambda$matcher$9(StatusResultMatchers.java:640)
	at org.springframework.test.web.servlet.MockMvc$1.andExpect(MockMvc.java:214)
	at com.example.demo.EmployeeServiceTest.testGetEmployeeById2_Found(EmployeeServiceTest.java:79)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
]]></failure>
    <system-out><![CDATA[
MockHttpServletRequest:
      HTTP Method = GET
      Request URI = /employees/5
       Parameters = {}
          Headers = []
             Body = null
    Session Attrs = {}

Handler:
             Type = com.example.demo.controller.EmployeeController
           Method = com.example.demo.controller.EmployeeController#getEmployeeById(Long)

Async:
    Async started = false
     Async result = null

Resolved Exception:
             Type = null

ModelAndView:
        View name = null
             View = null
            Model = null

FlashMap:
       Attributes = null

MockHttpServletResponse:
           Status = 404
    Error message = null
          Headers = []
     Content type = null
             Body = 
    Forwarded URL = null
   Redirected URL = null
          Cookies = []
]]></system-out>
  </testcase>

# TEST 4
  <testcase name="testCreateEmployee" classname="com.example.demo.EmployeeServiceTest" time="0.126"/>
  
# TEST 5
  <testcase name="testGetAllEmployees" classname="com.example.demo.EmployeeServiceTest" time="0.036"/>
