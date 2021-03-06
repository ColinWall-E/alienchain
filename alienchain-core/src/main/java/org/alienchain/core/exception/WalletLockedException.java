/**
 * Copyright (c) 2017-2018 The Alienchain Developers
 *
 * Distributed under the MIT software license, see the accompanying file
 * LICENSE or https://opensource.org/licenses/mit-license.php
 */
package org.alienchain.core.exception;

public class WalletLockedException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public WalletLockedException() {
        super("Wallet is locked");
    }
}
