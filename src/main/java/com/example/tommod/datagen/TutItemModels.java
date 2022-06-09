package com.example.tommod.datagen;

import com.example.tommod.TomMod;
import com.example.tommod.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;


/** Blocks in inventory */

public class TutItemModels extends ItemModelProvider {

    public TutItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, TomMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(Registration.SPICE_ORE_OVERWORLD_ITEM.get().getRegistryName().getPath(), modLoc("block/spice_ore_overworld"));
        withExistingParent(Registration.SPICE_ORE_NETHER_ITEM.get().getRegistryName().getPath(), modLoc("block/spice_ore_nether"));
        withExistingParent(Registration.SPICE_ORE_END_ITEM.get().getRegistryName().getPath(), modLoc("block/spice_ore_end"));
        withExistingParent(Registration.SPICE_ORE_DEEPSLATE_ITEM.get().getRegistryName().getPath(), modLoc("block/spice_ore_deepslate"));
    }
}
