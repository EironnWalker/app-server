package com.weds.antd.appserver.entity;

public class SystemChart {

    private String cPUTotalUsage;

    private String diskTotalUsage;

    private String memoryTotalUsage;

    public SystemChart() {
    }

    public String getcPUTotalUsage() {
        return cPUTotalUsage;
    }

    public void setcPUTotalUsage(String cPUTotalUsage) {
        this.cPUTotalUsage = cPUTotalUsage;
    }

    public String getDiskTotalUsage() {
        return diskTotalUsage;
    }

    public void setDiskTotalUsage(String diskTotalUsage) {
        this.diskTotalUsage = diskTotalUsage;
    }

    public String getMemoryTotalUsage() {
        return memoryTotalUsage;
    }

    public void setMemoryTotalUsage(String memoryTotalUsage) {
        this.memoryTotalUsage = memoryTotalUsage;
    }
}
