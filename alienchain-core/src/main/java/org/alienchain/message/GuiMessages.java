/**
 * Copyright (c) 2017-2018 The Alienchain Developers
 *
 * Distributed under the MIT software license, see the accompanying file
 * LICENSE or https://opensource.org/licenses/mit-license.php
 */
package org.alienchain.message;

import java.util.ResourceBundle;

public final class GuiMessages {

    private static final ResourceBundle RESOURCES = ResourceBundles.getDefaultBundle(ResourceBundles.GUI_MESSAGES);

    private GuiMessages() {
    }

    public static String get(String key, Object... args) {
        return MessageFormatter.get(RESOURCES, key, args);
    }
}