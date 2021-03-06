/**
 * Copyright (c) 2017-2018 The Alienchain Developers
 *
 * Distributed under the MIT software license, see the accompanying file
 * LICENSE or https://opensource.org/licenses/mit-license.php
 */
package org.alienchain.config;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.alienchain.Network;

public class TestnetConfigTest {

  @Test
    public void testNetworkId() {
        Config config = new TestnetConfig(Constants.DEFAULT_DATA_DIR);
        assertEquals(Network.TESTNET, config.network());
    }

}
