<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
<test thread-count="5" name="Test">
<groups>
<run>
<include name="Smoke"></include>
</run>
</groups>
<classes>
<class name="TestNgFeatures.Program1" />
<class name="TestNgFeatures.Program2" />
</classes>
</test> <!-- Test -->
</suite> <!-- Suite -->

