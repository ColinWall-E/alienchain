/**
 * Copyright (c) 2017-2018 The Alienchain Developers
 *
 * Distributed under the MIT software license, see the accompanying file
 * LICENSE or https://opensource.org/licenses/mit-license.php
 */
package org.alienchain.net.msg.p2p.handshake.v2;

import org.alienchain.crypto.Hex;
import org.alienchain.net.msg.Message;
import org.alienchain.net.msg.MessageCode;
import org.alienchain.util.SimpleDecoder;
import org.alienchain.util.SimpleEncoder;

public class InitMessage extends Message {

    public static final int SECRET_LENGTH = 32;

    private final byte[] secret;
    private final long timestamp;

    public InitMessage(byte[] secret, long timestamp) {
        super(MessageCode.HANDSHAKE_INIT, null);

        this.secret = secret;
        this.timestamp = timestamp;

        SimpleEncoder enc = new SimpleEncoder();
        enc.writeBytes(secret);
        enc.writeLong(timestamp);

        this.body = enc.toBytes();
    }

    public InitMessage(byte[] body) {
        super(MessageCode.HANDSHAKE_INIT, null);

        SimpleDecoder dec = new SimpleDecoder(body);
        this.secret = dec.readBytes();
        this.timestamp = dec.readLong();

        this.body = body;
    }

    public boolean validate() {
        return secret != null && secret.length == SECRET_LENGTH
                && timestamp > 0;
    }

    public byte[] getSecret() {
        return secret;
    }

    public long getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "InitMessage{" +
                "secret=" + Hex.encode(secret) +
                ", timestamp=" + timestamp +
                '}';
    }
}
