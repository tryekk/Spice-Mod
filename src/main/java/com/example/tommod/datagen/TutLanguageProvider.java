package com.example.tommod.datagen;

import com.example.tommod.TomMod;
import com.example.tommod.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static com.example.tommod.setup.ModSetup.TAB_NAME;

public class TutLanguageProvider extends LanguageProvider {

    public TutLanguageProvider(DataGenerator gen, String locale) {
        super(gen, TomMod.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + TAB_NAME, "Spice");
        add(Registration.SPICE_ORE_OVERWORLD.get(), "Spice Ore");
        add(Registration.SPICE_ORE_NETHER.get(), "Nether Spice Ore");
        add(Registration.SPICE_ORE_END.get(), "End Spice Ore");
        add(Registration.SPICE_ORE_DEEPSLATE.get(), "Deepslate Spice ore");
    }
}
