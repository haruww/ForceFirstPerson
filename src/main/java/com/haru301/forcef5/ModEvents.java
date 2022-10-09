package com.haru301.forcef5;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.PointOfView;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "forcef5")
public class ModEvents
{
    @SubscribeEvent
    public static void onClientTick(TickEvent.ClientTickEvent e)
    {
        if(Minecraft.getInstance().world == null)
            return;
        Minecraft.getInstance().gameSettings.setPointOfView(PointOfView.FIRST_PERSON);
    }
}
