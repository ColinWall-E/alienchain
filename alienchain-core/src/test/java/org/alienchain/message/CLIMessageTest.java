/**
 * Copyright (c) 2017-2018 The Alienchain Developers
 *
 * Distributed under the MIT software license, see the accompanying file
 * LICENSE or https://opensource.org/licenses/mit-license.php
 */
package org.alienchain.message;

import static org.junit.Assert.assertNotNull;

import java.util.MissingResourceException;

import org.junit.Test;

public class CLIMessageTest {

  @Test
    public void testExists() {
        assertNotNull(CliMessages.get("Address"));
    }

  @Test(expected = MissingResourceException.class)
    public void testNotExists() {
        assertNotNull(CliMessages.get("NotExist"));
    }
}
