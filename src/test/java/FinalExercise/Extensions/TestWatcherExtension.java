package FinalExercise.Extensions;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.util.Optional;

/**
 * Extension class that implements {@link TestWatcher} to monitor the
 * execution of tests and log their results.
 *
 * <p>This class provides custom behavior for handling test events,
 * such as when a test succeeds, fails, or is aborted.</p>
 *
 * <p>Upon the execution of a test, this extension will print the
 * result of the test to the standard output.</p>
 */

public class TestWatcherExtension implements TestWatcher {

    /**
     * Called when a test succeeds.
     *
     * @param context the context of the test that was executed
     */
    @Override
    public void testSuccessful (ExtensionContext context) {
        System.out.println("Test " + context.getDisplayName() + " succeeded!");
    }

    /**
     * Called when a test fails.
     *
     * @param context the context of the test that failed
     * @param cause the exception that caused the test to fail
     */
    @Override
    public void testFailed (ExtensionContext context, Throwable cause) {
        System.out.println("Test " + context.getDisplayName() + " failed with exception: " + cause.getMessage());
    }

    /**
     * Called when a test is aborted.
     *
     * @param context the context of the aborted test
     * @param cause the exception that caused the test to be aborted
     */
    @Override
    public void testAborted (ExtensionContext context, Throwable cause) {
        System.out.println("Test " + context.getDisplayName() + " aborted with exception: " + cause.getMessage());
    }

    /**
     * Handles the event when a test is disabled.
     *
     * This method logs the display name of the disabled test along with
     * the reason for its disabling. If no reason is provided, it defaults
     * to "No reason specified."
     *
     * @param context the context of the test being disabled
     * @param reason an optional reason for the test being disabled
     */
    public void testDisabled(ExtensionContext context, Optional<String> reason) {
        System.out.println("Test disabled: " + context.getDisplayName() +
                " with reason: " + reason.orElse("No reason specified."));
    }
}

