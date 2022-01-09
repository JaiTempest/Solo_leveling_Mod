package com.jaitempest.ashborn.item;

import com.jaitempest.ashborn.AshBornMod;
import com.jaitempest.ashborn.util.Registration;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

public class ModItems

{
        public static final RegistryObject<Item> DEATH_INGOT =
                Registration.ITEMS.register("death_ingot",
                () -> new Item(new Item.Properties().group(AshBornMod.COURSE_TAB)));

        public static final RegistryObject<Item> Death_String =
                Registration.ITEMS.register("death_string",
                ()-> new Item(new Item.Properties().group(AshBornMod.COURSE_TAB)));
        public static final RegistryObject<Item> DEATH_APPLE =
                Registration.ITEMS.register("death_apple",
                ()-> new DeathApple());
        public static final RegistryObject<Item> DEATH_SHOVEL =
                Registration.ITEMS.register("death_shovel",
                        ()-> new ShovelItem(ModItemTier.DEATH,0f,0f,
                                new Item.Properties()
                                        .defaultMaxDamage(999999)
                                        .addToolType(ToolType.SHOVEL,10)
                                        .group(AshBornMod.COURSE_TAB)));
        public static final RegistryObject<Item> DEATH_LONG_SWORD =
                Registration.ITEMS.register("death_longsword",
                        ()-> new SwordItem(ModItemTier.DEATH,349,2,
                                new Item.Properties()
                                        .defaultMaxDamage(999999)
                                        .group(AshBornMod.COURSE_TAB)));
        public static final RegistryObject<Item> DEATH_PICKAXE =
                Registration.ITEMS.register("death_pickaxe",
                        ()-> new PickaxeItem(ModItemTier.DEATH,99,0f,
                                new Item.Properties()
                                        .defaultMaxDamage(999999)
                                        .addToolType(ToolType.PICKAXE,20)
                                        .group(AshBornMod.COURSE_TAB)));
        public static final RegistryObject<Item> DEATH_HOE =
                Registration.ITEMS.register("death_hoe",
                        ()-> new HoeItem(ModItemTier.DEATH,1,0f,
                                new Item.Properties()
                                        .defaultMaxDamage(999999)
                                        .addToolType(ToolType.HOE,20)
                                        .group(AshBornMod.COURSE_TAB)));
        public static final RegistryObject<Item> DEATH_AXE =
                Registration.ITEMS.register("death_axe",
                        ()-> new AxeItem(ModItemTier.DEATH,149,1,
                                new Item.Properties()
                                        .defaultMaxDamage(999999)
                                        .addToolType(ToolType.AXE,20)
                                        .group(AshBornMod.COURSE_TAB)));
        public static final RegistryObject<Item> KARASAKAS =
                Registration.ITEMS.register("karasakas",
                        ()-> new SwordItem(ModItemTier.DEATH,24,10,
                                new Item.Properties()
                                        .defaultMaxDamage(1000)
                                        .group(AshBornMod.COURSE_TAB)));

















        public static void register(){}

        public enum ModItemTier implements IItemTier



        {
                DEATH(20, 999999, 20, 0, 20, Ingredient.
                        fromStacks(new ItemStack(ModItems.DEATH_INGOT.get())));
                private final int harvestLevel;
                private final int maxUSes;
                private final int efficiency;
                private final int attackDamage;
                private final int enchantability;
                private final Ingredient repaierMaterial;

                ModItemTier(int harvestLevel, int maxUSes, int efficiency, int attackDamage, int enchantability, Ingredient repaierMaterial) {
                        this.harvestLevel = harvestLevel;
                        this.maxUSes = maxUSes;
                        this.efficiency = efficiency;
                        this.attackDamage = attackDamage;
                        this.enchantability = enchantability;
                        this.repaierMaterial = repaierMaterial;
                }


                @Override
                public int getMaxUses() {
                        return maxUSes;
                }

                @Override
                public float getEfficiency() {
                        return efficiency;
                }

                @Override
                public float getAttackDamage() {

                        return attackDamage;
                }

                @Override
                public int getHarvestLevel() {
                        return harvestLevel;
                }

                @Override
                public int getEnchantability() {
                        return enchantability;
                }

                @Override
                public Ingredient getRepairMaterial() {
                        return null;
                }
        }







}
