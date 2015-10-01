package es.upm.miw.iwvg.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
    PointTest.class, 
    DecCollectionTest.class,
    FracTest.class,
    UsTest.class
})
public class AllIwvgJunittests {

}
