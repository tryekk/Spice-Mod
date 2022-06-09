package com.example.tommod.datagen;

import com.example.tommod.TomMod;
import com.example.tommod.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TutBlockTags extends BlockTagsProvider {

    public TutBlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, TomMod.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(Registration.SPICE_ORE_OVERWORLD.get())
                .add(Registration.SPICE_ORE_NETHER.get())
                .add(Registration.SPICE_ORE_END.get())
                .add(Registration.SPICE_ORE_DEEPSLATE.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(Registration.SPICE_ORE_OVERWORLD.get())
                .add(Registration.SPICE_ORE_NETHER.get())
                .add(Registration.SPICE_ORE_END.get())
                .add(Registration.SPICE_ORE_DEEPSLATE.get());
        tag(Tags.Blocks.ORES)
                .add(Registration.SPICE_ORE_OVERWORLD.get())
                .add(Registration.SPICE_ORE_NETHER.get())
                .add(Registration.SPICE_ORE_END.get())
                .add(Registration.SPICE_ORE_DEEPSLATE.get());
    }

    @Override
    public String getName() {
        return "Tutorial Tags";
    }
}
