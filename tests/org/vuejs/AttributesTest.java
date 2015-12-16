package org.vuejs;

import com.intellij.testFramework.fixtures.LightPlatformCodeInsightFixtureTestCase;

public class AttributesTest extends LightPlatformCodeInsightFixtureTestCase {

    @Override
    protected String getTestDataPath() {
        return VueJSTestUtil.getBaseTestDataPath(getClass()) + "attributes";
    }

    @Override
    protected boolean isWriteActionRequired() {
        return getTestName(true).contains("Completion");
    }

    public void testStandardAttributesCompletion() {
        myFixture.testCompletion("standard.html", "standard.after.html");
    }
}
