package subaraki.badbone.registry;

import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import subaraki.badbone.effects.EffectArthritis;
import subaraki.badbone.effects.EffectBackpain;
import subaraki.badbone.effects.EffectWeakKnees;
import subaraki.badbone.mod.BadBone;

public class BadBoneEffects {

    public static DeferredRegister<MobEffect> EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, BadBone.MODID);
    public static final RegistryObject<MobEffect> BACK_HURT = EFFECTS.register("hurt", EffectBackpain::new);
    public static final RegistryObject<MobEffect> KNEE_HURT = EFFECTS.register("knee", EffectWeakKnees::new);
    public static final RegistryObject<MobEffect> ARTHRITIS = EFFECTS.register("arthritis", EffectArthritis::new);


}
