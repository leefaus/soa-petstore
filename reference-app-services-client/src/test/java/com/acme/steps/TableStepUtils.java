package com.acme.steps;

import cucumber.table.DataTable;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyAccessorFactory;

import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class TableStepUtils {
    static void verifyTable(DataTable table, Object... expectedValues) {
        int expectedRows = table.asMaps().size();
        assertTrue("Expected at least " + expectedRows +
                " rows, but got only "+ expectedValues.length + " rows.",
                expectedRows <= expectedValues.length);

        int index = 0;
        for (Map<String, String> map : table.asMaps()) {
            Set<Map.Entry<String,String>> entries = map.entrySet();
            Object expectedValue = expectedValues[index];
            for (Map.Entry<String, String> entry : entries) {
                BeanWrapper wrapper = PropertyAccessorFactory.forBeanPropertyAccess(expectedValue);

                String propertyName = entry.getKey();
                String propertyValue = entry.getValue();

                try {
                    assertEquals(propertyValue, wrapper.getPropertyValue(propertyName).toString());
                } catch (BeansException e) {
                    fail("Property with name " + propertyName + " was not found on the bean " +
                            wrapper.getWrappedInstance());
                }

            }

            index++;
        }
    }
}
