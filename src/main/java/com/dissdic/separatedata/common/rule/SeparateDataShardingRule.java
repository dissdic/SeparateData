package com.dissdic.separatedata.common.rule;

public abstract class SeparateDataShardingRule {

    public final static int HORIZONTAL_TABLE = 1;
    public final static int VERTICAL_TABLE = 2;
    public final static int HORIZONTAL_DATABASE = 3;
    public final static int VERTICAL_DATABASE = 4;

    private int mode;

    public int getMode() {
        return mode;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }

}
