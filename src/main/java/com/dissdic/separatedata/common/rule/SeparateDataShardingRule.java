package com.dissdic.separatedata.common.rule;

import java.util.List;

public abstract class SeparateDataShardingRule {

    public final static int HORIZONTAL_TABLE = 1;
    public final static int VERTICAL_TABLE = 2;
    public final static int HORIZONTAL_DATABASE = 3;
    public final static int VERTICAL_DATABASE = 4;

    protected int mode;

    public int getMode() {
        return mode;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }

    public abstract List<String> physicalTables();

}
