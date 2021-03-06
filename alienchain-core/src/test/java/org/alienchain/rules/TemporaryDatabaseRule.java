/**
 * Copyright (c) 2017-2018 The Alienchain Developers
 *
 * Distributed under the MIT software license, see the accompanying file
 * LICENSE or https://opensource.org/licenses/mit-license.php
 */
package org.alienchain.rules;

import java.io.File;
import java.nio.file.Path;
import java.util.EnumMap;

import org.junit.rules.TemporaryFolder;
import org.alienchain.config.Constants;
import org.alienchain.db.Database;
import org.alienchain.db.DatabaseFactory;
import org.alienchain.db.DatabaseName;
import org.alienchain.db.LeveldbDatabase;

public class TemporaryDatabaseRule extends TemporaryFolder implements DatabaseFactory {

    private EnumMap<DatabaseName, Database> databases = new EnumMap<>(DatabaseName.class);

    @Override
    public void before() throws Throwable {
        create();
        open();
    }

    @Override
    public void after() {
        close();
        delete();
    }

    @Override
    public void open() {
        for (DatabaseName name : DatabaseName.values()) {
            File file = new File(getRoot(), Constants.DATABASE_DIR + File.separator + name.toString().toLowerCase());
            databases.put(name, new LeveldbDatabase(file));
        }
    }

    @Override
    public void close() {
        for (Database db : databases.values()) {
            db.close();
        }
    }

    @Override
    public Path getDataDir() {
        return super.getRoot().toPath();
    }

    @Override
    public Database getDB(DatabaseName name) {
        return databases.get(name);
    }
}