package com.jaitempest.ashborn.item;

import com.jaitempest.ashborn.AshBornMod;
import net.minecraft.client.gui.fonts.TexturedGlyph;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class DeathApple extends Item
{
public DeathApple()
{
    super(new Properties().group(AshBornMod.COURSE_TAB)
            .food(new Food.Builder()
            .hunger(5)
             .saturation(1.5f)
            .effect(()->new EffectInstance(Effects.SATURATION,999999,1), 1f)
            .build()));

}




}
