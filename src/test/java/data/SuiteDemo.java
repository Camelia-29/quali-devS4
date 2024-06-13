package data;

import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("Suite Test VenteVoiture")
@SelectPackages({"data", "service"})
@IncludeClassNamePatterns(".*Test")
public class SuiteDemo {
}

