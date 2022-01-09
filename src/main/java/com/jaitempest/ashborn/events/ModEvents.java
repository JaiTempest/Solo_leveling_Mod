package com.jaitempest.ashborn.events;

import com.jaitempest.ashborn.item.ModItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ModEvents




{
    @SubscribeEvent
    public void KarasakasEffect(AttackEntityEvent event)
    {
        if(event.getPlayer().getHeldItemMainhand().getItem() == ModItems.KARASAKAS.get())
        {
          if(event.getTarget().isAlive())
          {

              LivingEntity target = (LivingEntity)event.getTarget();
              if(target instanceof WitherEntity)
              {
                  PlayerEntity player = event.getPlayer();

                  target.addPotionEffect(new EffectInstance(Effects.POISON,600));



              }

          }


        }



    }



}
