package ro.cts.suite;


import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.cts.seminar.PachetTuristicTest;
import ro.cts.seminar.getVarstaTest;
import ro.cts.tests.TesteBoundary;

@RunWith(Categories.class)
@Suite.SuiteClasses({getVarstaTest.class, PachetTuristicTest.class})
@Categories.IncludeCategory(TesteBoundary.class)
public class SuitaCustom {
}
