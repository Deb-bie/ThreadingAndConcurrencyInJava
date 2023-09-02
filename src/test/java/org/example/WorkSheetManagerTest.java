package org.example;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutionException;

import static org.junit.jupiter.api.Assertions.*;

class WorkSheetManagerTest {
    WorkSheetManager workSheetManager = new WorkSheetManager();

    @Test
    void testTripleThreaded () throws ExecutionException, InterruptedException {
        workSheetManager.tripleThreaded();
    }

}