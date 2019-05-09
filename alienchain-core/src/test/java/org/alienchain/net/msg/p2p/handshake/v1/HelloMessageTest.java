/**
 * Copyright (c) 2017-2018 The Alienchain Developers
 *
 * Distributed under the MIT software license, see the accompanying file
 * LICENSE or https://opensource.org/licenses/mit-license.php
 */
package org.alienchain.net.msg.p2p.handshake.v1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.alienchain.config.Config;
import org.alienchain.config.Constants;
import org.alienchain.config.DevnetConfig;
import org.alienchain.crypto.Key;

public class HelloMessageTest {

  @Test
    public void testCodec() {
        Config config = new DevnetConfig(Constants.DEFAULT_DATA_DIR);

        Key key = new Key();
        String peerId = key.toAddressString();
        HelloMessage msg = new HelloMessage(config.network(), config.networkVersion(), peerId, "127.0.0.1", 9169,
                config.getClientId(), 2, key);
        assertTrue(msg.validate(config));
        assertEquals(key.toAddressString(), msg.getPeer().getPeerId());

        msg = new HelloMessage(msg.getBody());
        assertTrue(msg.validate(config));
        assertEquals(key.toAddressString(), msg.getPeer().getPeerId());
    }
}
