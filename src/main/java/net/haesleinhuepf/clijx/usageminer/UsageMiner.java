package net.haesleinhuepf.clijx.usageminer;

import ij.IJ;
import ij.ImageJ;
import ij.plugin.PlugIn;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UsageMiner implements PlugIn {

    @Override
    public void run(String arg) {
        String folder = IJ.getDirectory("Folder with clij-macros");
        UsageAnalyser combinedUsageStats = new UsageAnalyser(
                folder);

        String output = combinedUsageStats.all();


        String target_file = System.getProperty("java.io.tmpdir") + "/suggestions_" + System.currentTimeMillis() + ".txt";

        File outputTarget = new File(target_file);
        try {
            FileWriter writer = new FileWriter(outputTarget);
            writer.write(output);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        IJ.open(target_file);
    }

    public static void main(String[] args) {
        new ImageJ();


        String folder = "C:\\Users\\rober\\Downloads\\temp2";
        UsageAnalyser combinedUsageStats = new UsageAnalyser(
                folder);

        String output = combinedUsageStats.all();


        String target_file = System.getProperty("java.io.tmpdir") + "/suggestions_" + System.currentTimeMillis() + ".txt";

        File outputTarget = new File(target_file);
        try {
            FileWriter writer = new FileWriter(outputTarget);
            writer.write(output);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        IJ.open(target_file);
    }
}
