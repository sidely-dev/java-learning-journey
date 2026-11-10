package com.sysmonitor;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HardwareAbstractionLayer;

public class App {
    public static void main(String[] args) {
        System.out.println("=== INITIALISING SYSTEM MONITOR ENGINE ===\n");

        // Initialize the OSHI entry point
        SystemInfo si = new SystemInfo();
        HardwareAbstractionLayer hal = si.getHardware();
        
        // 1. Fetch CPU Model Info
        CentralProcessor processor = hal.getProcessor();
        System.out.println("CPU Model: " + processor.getProcessorIdentifier().getName());
        System.out.println("Physical Cores: " + processor.getPhysicalProcessorCount());
        System.out.println("Logical Cores: " + processor.getLogicalProcessorCount());

        // 2. Fetch Total RAM Memory
        GlobalMemory memory = hal.getMemory();
        long totalMemoryBytes = memory.getTotal();
        double totalMemoryGB = totalMemoryBytes / (1024.0 * 1024.0 * 1024.0);
        
        System.out.printf("Total System RAM: %.2f GB\n", totalMemoryGB);
        System.out.println("\n=========================================");
    }
}
