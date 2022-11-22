package JUnitTestPackage;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ testaddNumbers.class, testAddStrings.class })
public class AllTests {

}
