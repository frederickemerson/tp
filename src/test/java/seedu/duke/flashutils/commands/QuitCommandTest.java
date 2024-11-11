package seedu.duke.flashutils.commands;

import org.junit.jupiter.api.Test;
import seedu.duke.flashutils.utils.Storage;
import seedu.duke.flashutils.utils.StubStorage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QuitCommandTest {

    @Test
    public void testQuitCommandSuccessMessage() {
        Storage stubStorage = new StubStorage();
        QuitCommand command = new QuitCommand();
        CommandResult result = command.execute();

        assertEquals("Quit Flash Session", result.getFeedbackToUser());
    }

}
