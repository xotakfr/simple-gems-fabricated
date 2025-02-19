package fr.xotak.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class SimpleGemsDataGen implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator dataGenerator) {
        FabricDataGenerator.Pack pack = dataGenerator.createPack();

        pack.addProvider(SimpleGemsItemTagGenerator::new);
        pack.addProvider(SimpleGemsBlockTagGenerator::new);
        pack.addProvider(SimpleGemsLootTableGenerator::new);
        pack.addProvider(SimpleGemsRecipeDataGenerator::new);
        pack.addProvider(SimpleGemsModelGenerator::new);
    }
}
