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
        add("itemGroup." + TAB_NAME, "Tutorial");
        add(Registration.MYSTERIOUS_ORE_OVERWORLD.get(), "Mysterious ore");
        add(Registration.MYSTERIOUS_ORE_NETHER.get(), "Mysterious ore");
        add(Registration.MYSTERIOUS_ORE_END.get(), "Mysterious ore");
        add(Registration.MYSTERIOUS_ORE_DEEPSLATE.get(), "Mysterious ore");
    }
}
