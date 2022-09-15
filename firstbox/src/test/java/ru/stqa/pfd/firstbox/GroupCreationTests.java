package ru.stqa.pfd.firstbox;

import org.testng.annotations.*;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {
        gotoGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("name", "logo", "comment"));
        submitGroupCreation();
        returnToGroupPage();
    }
}
