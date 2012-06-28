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
    static void verifyTable(DataTable table, Object... actualValues) {
        int expectedRowCount = table.asMaps().size();
        assertTrue("Expected at least " + expectedRowCount +
                " rows, but got only " + actualValues.length + " rows.",
                expectedRowCount <= actualValues.length);

        int actualRowIndex = 0;
        for (Map<String, String> map : table.asMaps()) {
            Set<Map.Entry<String, String>> expectedRowValues = map.entrySet();

            BeanWrapper actualValue = PropertyAccessorFactory.forBeanPropertyAccess(actualValues[actualRowIndex]);

            for (Map.Entry<String, String> expectedValue : expectedRowValues) {
                String propertyName = expectedValue.getKey();
                String propertyValue = expectedValue.getValue();

                try {
                    assertEquals(propertyValue, actualValue.getPropertyValue(propertyName).toString());
                } catch (BeansException e) {
                    fail("Property with name " + propertyName + " was not found on the bean " +
                            actualValue.getWrappedInstance());
                }

            }

            actualRowIndex++;
        }
    }
}
