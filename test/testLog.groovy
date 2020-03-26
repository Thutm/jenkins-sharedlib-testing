// Import the required stuff: JUnit &amp; Jenkins Pipeline Unit
import org.junit.*
import static org.junit.Assert.*
import com.lesfurets.jenkins.unit.*

// Extend the BasePipelineTest to use the Jenkins Pipeline Unit framework
class logTest extends BasePipelineTest {
    def log

    // Before every testcase is run, do this:
    @Before
    void setUp() {
        super.setUp()
        // Load the entire library
        def library = library().name('sharedlib')
                        .defaultVersion('<notNeeded>')
                        .allowOverride(true)
                        .implicit(false)
                        .targetPath('<notNeeded>')
                        .retriever(projectSource())
                        .build()
        helper.registerSharedLibrary(library)
    }

    // Test stuff
    @Test
    void 'Log message to console with "INFO" prepended'() {
        // Execute the 'call' method on our class under test
        log.info('message')

        // Validate that echo is only called once
        assertEquals(1, helper.methodCallCount('echo'))

        // Validate that the call to echo contains the string 'ERROR'
        assertTrue(helper.getCallStack()[1].args[0].toString().contains('INFO'))

        // Print the complete callstack to console for good measure
        printCallStack()
    }
}
