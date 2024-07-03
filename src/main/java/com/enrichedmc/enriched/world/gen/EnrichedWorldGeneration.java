package com.enrichedmc.enriched.world.gen;

public class EnrichedWorldGeneration
{
    public static void generateWorldGeneration()
    {
        EnrichedOreGeneration.generateOres();
        EnrichedTreeGeneration.generateTrees();
    }
}
