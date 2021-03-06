package com.jaitempest.ashborn.block;

import com.jaitempest.ashborn.AshBornMod;
import com.jaitempest.ashborn.util.Registration;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final RegistryObject<Block> DEATH_ORE = register(("death_ore"),
            ()-> new Block(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(50f,2000f).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));


    public static  final RegistryObject<Block> DEATH_BLOCK = register("death_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(50f,2000f).sound((SoundType.METAL))));








    public static void register() {}
    private static <T extends Block>RegistryObject<T>
    register(String name, Supplier <T> block)
    {
        RegistryObject<T> toReturn = Registration.BLOCKS.register(name,block);
        Registration.ITEMS.register(name,()-> new BlockItem(toReturn.get(),
                new Item.Properties().group(AshBornMod.COURSE_TAB)));
        return toReturn;




    }






}
