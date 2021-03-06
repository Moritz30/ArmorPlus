package sokratis12gr.armorplus;

import sokratis12gr.sokratiscore.config.ModConfigProperty;

/**
 * sokratis12gr.armorplus
 * ArmorPlus created by sokratis12GR on 7/26/2016 4:47 PM.
 */
public class ARPConfig {

    //SuperStarArmor
    @ModConfigProperty(category = "SuperStarArmor", name = "enableSuperStarHRegen", comment = "Enable/Disable The Super Star Helmet Regeneration")
    public static boolean enableSuperStarHRegen = true;

    @ModConfigProperty(category = "SuperStarArmor", name = "enableSuperStarCRegen", comment = "Enable/Disable The Super Star Chestplate Regeneration")
    public static boolean enableSuperStarCRegen = true;

    @ModConfigProperty(category = "SuperStarArmor", name = "enableSuperStarLRegen", comment = "Enable/Disable The Super Star Leggings Regeneration")
    public static boolean enableSuperStarLRegen = true;

    @ModConfigProperty(category = "SuperStarArmor", name = "enableSuperStarBRegen", comment = "Enable/Disable The Super Star Boots Regeneration")
    public static boolean enableSuperStarBRegen = true;

    @ModConfigProperty(category = "SuperStarArmor", name = "enableFullSuperStarArmorEffect", comment = "Enable/Disable The Full Super Star Armor Effect")
    public static boolean enableFullSuperStarArmorEffect = false;

    //LavaArmor
    @ModConfigProperty(category = "LavaArmor", name = "enableLavaHEffects", comment = "Enable/Disable The Lava Helmet Resistance and Fire Resistance")
    public static boolean enableLavaHEffects = true;

    @ModConfigProperty(category = "LavaArmor", name = "enableLavaCEffects", comment = "Enable/Disable The Lava Chestplate Resistance and Fire Resistance")
    public static boolean enableLavaCEffects = true;

    @ModConfigProperty(category = "LavaArmor", name = "enableLavaLEffects", comment = "Enable/Disable The Lava Leggings Resistance and Fire Resistance")
    public static boolean enableLavaLEffects = true;

    @ModConfigProperty(category = "LavaArmor", name = "enableLavaBEffects", comment = "Enable/Disable The Lava Boots Resistance and Fire Resistance")
    public static boolean enableLavaBEffects = true;

    @ModConfigProperty(category = "LavaArmor", name = "enableFullLavaArmorEffect", comment = "Enable/Disable The Full Lava Armor Effect")
    public static boolean enableFullLavaArmorEffect = false;

    //ObsidianArmor
    @ModConfigProperty(category = "ObsidianArmor", name = "enableObsidianHResistance", comment = "Enable/Disable The Obsidian Helmet Resistance")
    public static boolean enableObsidianHResistance = true;

    @ModConfigProperty(category = "ObsidianArmor", name = "enableObsidianCResistance", comment = "Enable/Disable The Obsidian Chestplate Resistance")
    public static boolean enableObsidianCResistance = true;

    @ModConfigProperty(category = "ObsidianArmor", name = "enableObsidianLResistance", comment = "Enable/Disable The Obsidian Leggings Resistance")
    public static boolean enableObsidianLResistance = true;

    @ModConfigProperty(category = "ObsidianArmor", name = "enableObsidianBResistance", comment = "Enable/Disable The Obsidian Boots Resistance")
    public static boolean enableObsidianBResistance = true;

    @ModConfigProperty(category = "ObsidianArmor", name = "enableFullObsidianArmorEffect", comment = "Enable/Disable The Full Obsidian Armor Effect")
    public static boolean enableFullObsidianArmorEffect = false;

    //EmeraldArmor
    @ModConfigProperty(category = "EmeraldArmor", name = "enableEmeraldHHaste", comment = "Enable/Disable The Emerald Helmet Haste")
    public static boolean enableEmeraldHHaste = true;

    @ModConfigProperty(category = "EmeraldArmor", name = "enableEmeraldCHaste", comment = "Enable/Disable The Emerald Chestplate Haste")
    public static boolean enableEmeraldCHaste = true;

    @ModConfigProperty(category = "EmeraldArmor", name = "enableEmeraldLHaste", comment = "Enable/Disable The Emerald Leggings Haste")
    public static boolean enableEmeraldLHaste = true;

    @ModConfigProperty(category = "EmeraldArmor", name = "enableEmeraldBHaste", comment = "Enable/Disable The Emerald Boots Haste")
    public static boolean enableEmeraldBHaste = true;

    @ModConfigProperty(category = "EmeraldArmor", name = "enableFullEmeraldArmorEffect", comment = "Enable/Disable The Full Emerald Armor Effect")
    public static boolean enableFullEmeraldArmorEffect = false;

    //RedstoneArmor
    @ModConfigProperty(category = "RedstoneArmor", name = "enableRedstoneHSpeed", comment = "Enable/Disable The Redstone Helmet Speed")
    public static boolean enableRedstoneHSpeed = true;

    @ModConfigProperty(category = "RedstoneArmor", name = "enableRedstoneCSpeed", comment = "Enable/Disable The Redstone Chestplate Speed")
    public static boolean enableRedstoneCSpeed = true;

    @ModConfigProperty(category = "RedstoneArmor", name = "enableRedstoneLSpeed", comment = "Enable/Disable The Redstone Leggings Speed")
    public static boolean enableRedstoneLSpeed = true;

    @ModConfigProperty(category = "RedstoneArmor", name = "enableRedstoneBSpeed", comment = "Enable/Disable The Redstone Boots Speed")
    public static boolean enableRedstoneBSpeed = true;

    @ModConfigProperty(category = "RedstoneArmor", name = "enableFullRedstoneArmorEffect", comment = "Enable/Disable The Full Redstone Armor Effect")
    public static boolean enableFullRedstoneArmorEffect = false;

    //LapisArmor
    @ModConfigProperty(category = "LapisArmor", name = "enableLapisHBreathing", comment = "Enable/Disable The Lapis Helmet Water Breathing")
    public static boolean enableLapisHBreathing = true;

    @ModConfigProperty(category = "LapisArmor", name = "enableLapisCBreathing", comment = "Enable/Disable The Lapis Chestplate Water Breathing")
    public static boolean enableLapisCBreathing = true;

    @ModConfigProperty(category = "LapisArmor", name = "enableLapisLBreathing", comment = "Enable/Disable The Lapis Leggings Water Breathing")
    public static boolean enableLapisLBreathing = true;

    @ModConfigProperty(category = "LapisArmor", name = "enableLapisBBreathing", comment = "Enable/Disable The Lapis Boots Water Breathing")
    public static boolean enableLapisBBreathing = true;

    @ModConfigProperty(category = "LapisArmor", name = "enableFullLapisArmorEffect", comment = "Enable/Disable The Full Lapis Armor Effect")
    public static boolean enableFullLapisArmorEffect = false;

    //CoalArmor
    @ModConfigProperty(category = "CoalArmor", name = "enableCoalHNightVision", comment = "Enable/Disable The Coal Helmet NightVision")
    public static boolean enableCoalHNightVision = true;

    @ModConfigProperty(category = "CoalArmor", name = "enableCoalCNightVision", comment = "Enable/Disable The Coal Chestplate NightVision")
    public static boolean enableCoalCNightVision = true;

    @ModConfigProperty(category = "CoalArmor", name = "enableCoalLNightVision", comment = "Enable/Disable The Coal Leggings NightVision")
    public static boolean enableCoalLNightVision = true;

    @ModConfigProperty(category = "CoalArmor", name = "enableCoalBNightVision", comment = "Enable/Disable The Coal Boots NightVision")
    public static boolean enableCoalBNightVision = true;

    @ModConfigProperty(category = "CoalArmor", name = "enableFullCoalArmorEffect", comment = "Enable/Disable The Full Coal Armor Effect")
    public static boolean enableFullCoalArmorEffect = false;

    //FlightAbility
    @ModConfigProperty(category = "FlightAbility", name = "enableFlightAbility", comment = "Enable/Disable The Armors Flight")
    public static boolean enableFlightAbility = true;

    //EffectLevel
    @ModConfigProperty(category = "EffectLevel", name = "emeraldArmorEffectlevel", comment = "Set the level of the Haste effect by the Emerald Armor.")
    public static int emeraldArmorEffectlevel = 1;

    @ModConfigProperty(category = "EffectLevel", name = "obsidianArmorEffectlevel", comment = "Set the level of the Resistance effect by the Obsidian Armor.")
    public static int obsidianArmorEffectlevel = 0;

    @ModConfigProperty(category = "EffectLevel", name = "redstoneArmorEffectlevel", comment = "Set the level of the Swiftness effect by the Redstone Armor.")
    public static int redstoneArmorEffectlevel = 1;

    @ModConfigProperty(category = "EffectLevel", name = "lavaArmorEffectlevel", comment = "Set the level of the Resistance effect by the Lava Armor.")
    public static int lavaArmorEffectlevel = 0;

    @ModConfigProperty(category = "EffectLevel", name = "superstarArmorEffectlevel", comment = "Set the level of the Regeneration effect by the Super Star Armor.")
    public static int superstarArmorEffectlevel = 1;

    @ModConfigProperty(category = "EffectLevel", name = "ultimateArmorEffectlevel", comment = "Set the level of the Regeneration effect by The Ultimate Armor.")
    public static int ultimateArmorEffectlevel = 1;

    //WorldGeneration.LavaCrystal
    @ModConfigProperty(category = "WorldGeneration", name = "enableLavaCrystalOreOverworldGen", comment = "Enable/Disable The Lava Crystal World Generation in the dimension `Overworld`")
    public static boolean enableLavaCrystalOverworldGen = true;

    @ModConfigProperty(category = "WorldGeneration", name = "enableLavaCrystalOreTheEndGen", comment = "Enable/Disable The Lava Crystal World Generation in the dimension `The End`")
    public static boolean enableLavaCrystalTheEndGen = false;

    @ModConfigProperty(category = "WorldGeneration", name = "enableLavaCrystalOreTheNetherGen", comment = "Enable/Disable The Lava Crystal World Generation in the dimension `The Nether`")
    public static boolean enableLavaCrystalTheNetherGen = false;

    @ModConfigProperty(category = "WorldGeneration", name = "lavaCrystalOverworldRarity", comment = "Set the rarity level of the Lava Crystal Generation in the dimension `Overworld`")
    public static int lavaCrystalOverworldRarity = 7;

    @ModConfigProperty(category = "WorldGeneration", name = "lavaCrystalOverworldMinYSpawn", comment = "Set the min Y level of the Lava Crystal Generation in the dimension `Overworld`")
    public static int lavaCrystalOverworldMinYSpawn = 8;

    @ModConfigProperty(category = "WorldGeneration", name = "lavaCrystalOverworldMaxYSpawn", comment = "Set the max Y level of the Lava Crystal Generation in the dimension `Overworld`")
    public static int lavaCrystalOverworldMaxYSpawn = 58;

    @ModConfigProperty(category = "WorldGeneration", name = "lavaCrystalTheEndRarity", comment = "Set the rarity level of the Lava Crystal Generation in the dimension `The End`")
    public static int lavaCrystalTheEndRarity = 0;

    @ModConfigProperty(category = "WorldGeneration", name = "lavaCrystalTheEndMinYSpawn", comment = "Set the min Y level of the Lava Crystal Generation in the dimension `The End`")
    public static int lavaCrystalTheEndMinYSpawn = 0;

    @ModConfigProperty(category = "WorldGeneration", name = "lavaCrystalTheEndMaxYSpawn", comment = "Set the max Y level of the Lava Crystal Generation in the dimension `The End`")
    public static int lavaCrystalTheEndMaxYSpawn = 0;

    @ModConfigProperty(category = "WorldGeneration", name = "lavaCrystalTheEndRarity", comment = "Set the rarity level of the Lava Crystal Generation in the dimension `The Nether`")
    public static int lavaCrystalTheNetherRarity = 0;

    @ModConfigProperty(category = "WorldGeneration", name = "lavaCrystalTheEndMinYSpawn", comment = "Set the min Y level of the Lava Crystal Generation in the dimension `The Nether`")
    public static int lavaCrystalTheNetherMinYSpawn = 0;

    @ModConfigProperty(category = "WorldGeneration", name = "lavaCrystalTheEndMaxYSpawn", comment = "Set the max Y level of the Lava Crystal Generation in the dimension `The Nether`")
    public static int lavaCrystalTheNetherMaxYSpawn = 0;

    @ModConfigProperty(category = "WorldGeneration", name = "lavaCrystalVeinAmount", comment = "Set the vein amount of the Lava Crystal Generation")
    public static int lavaCrystalVeinAmount = 5;

    //GameModes
    @ModConfigProperty(category = "GameModes", name = "recipes", comment = "Sets the Recipe Difficulty \n0 = easy , 1 = expert")
    public static int recipes = 1;

    //WhiteList
    @ModConfigProperty(category = "WhiteList", name = "whitelistmax", comment = "Set the maximum amount of items that the player can get by the \"The Gift Of The Gods\". \nNote:You will need to have that many WhiteListed Items.")
    public static int whitelistmax = 0;

    @ModConfigProperty(category = "WhiteList", name = "whitelistmin", comment = "Set the minimum amount of items that the player can get by the \"The Gift Of The Gods\". \nNote:Don't change this from 0\"")
    public static int whitelistmin = 0;

    @ModConfigProperty(category = "WhiteList", name = "enableWhiteList", comment = "Enable/Disable the WhiteList")
    public static boolean enableWhiteList = false;

    @ModConfigProperty(category = "WhiteList", name = "whiteListedItems", comment = "Add WhiteListed Items to the \"The Gift Of The Gods\" \nIf You add want to add an item to the whitelist \nYou will need to replace 1 from \"minecraft:dirt\" to the item you want to add")
    public static String[] whiteListedItems = new String[]{"minecraft:dirt"};

    //BlackList
    @ModConfigProperty(category = "BlackList", name = "enableBlackList", comment = "Enable/Disable the BlackList")
    public static boolean enableBlackList = false;

    @ModConfigProperty(category = "BlackList", name = "blackListedItems", comment = "Add Blacklisted Items to the \"The Gift Of The Gods\" \nIf You add want to add an item to the blacklist \nYou will need to replace 1 from \"minecraft:dirt\" to the item you want to add")
    public static String[] blackListedItems = new String[]{"minecraft:dirt"};

    //TinkersEffects
    @ModConfigProperty(category = "TinkersEffects", name = "enableArditeArmorEffects", comment = "Enable/Disable Ardite Armor Effects")
    public static boolean enableArditeArmorEffects = true;

    @ModConfigProperty(category = "TinkersEffects", name = "enableCobaltArmorEffects", comment = "Enable/Disable Cobalt Armor Effects ")
    public static boolean enableCobaltArmorEffects = true;

    @ModConfigProperty(category = "TinkersEffects", name = "enableManyullynArmorEffects", comment = "Enable/Disable The Ultimate Armor Invincibility")
    public static boolean enableManyullynArmorEffects = true;

    @ModConfigProperty(category = "TinkersEffects", name = "enablePigIronArmorEffects", comment = "Enable/Disable Manyullym Armor Effects")
    public static boolean enablePigIronArmorEffects = true;

    @ModConfigProperty(category = "TinkersEffects", name = "enableKnightSlimeArmorEffects", comment = "Enable/Disable Knight Slime Armor Effects")
    public static boolean enableKnightSlimeArmorEffects = true;

    //TheUltimateArmor
    @ModConfigProperty(category = "TheUltimateArmor", name = "enableTheUltimateArmorIncinvibility", comment = "Enable/Disable The Ultimate Armor Invincibility")
    public static boolean enableTheUltimateArmorIncinvibility = true;

    //Recipes
    @ModConfigProperty(category = "Recipes", name = "enableCoalArmorRecipes", comment = "Enable/Disable The Coal Armor Recipes")
    public static boolean enableCoalArmorRecipes = true;

    @ModConfigProperty(category = "Recipes", name = "enableCharcoalCoalArmorRecipe", comment = "Enable/Disable The Charcoal Coal Armor Recipes")
    public static boolean enableCharcoalCoalArmorRecipe = false;

    @ModConfigProperty(category = "Recipes", name = "enableLapisArmorRecipes", comment = "Enable/Disable The Lapis Armor Recipes")
    public static boolean enableLapisArmorRecipes = true;

    @ModConfigProperty(category = "Recipes", name = "enableRedstoneArmorRecipes", comment = "Enable/Disable The Redstone Armor Recipes")
    public static boolean enableRedstoneArmorRecipes = true;

    @ModConfigProperty(category = "Recipes", name = "enableEmeraldArmorRecipes", comment = "Enable/Disable The Emerald Armor Recipes")
    public static boolean enableEmeraldArmorRecipes = true;

    @ModConfigProperty(category = "Recipes", name = "enableObsidianArmorRecipes", comment = "Enable/Disable The Obsidian Armor Recipes")
    public static boolean enableObsidianArmorRecipes = true;

    @ModConfigProperty(category = "Recipes", name = "enableLavaArmorRecipes", comment = "Enable/Disable The Lava Armor Recipes")
    public static boolean enableLavaArmorRecipes = true;

    @ModConfigProperty(category = "Recipes", name = "enableSuperStarArmorRecipes", comment = "Enable/Disable The Super Star Armor Recipes")
    public static boolean enableSuperStarArmorRecipes = true;

    @ModConfigProperty(category = "Recipes", name = "enableEnderDragonArmorRecipes", comment = "Enable/Disable The Ender Dragon Armor Recipes")
    public static boolean enableEnderDragonArmorRecipes = true;

    @ModConfigProperty(category = "Recipes", name = "enableGuardianArmorRecipes", comment = "Enable/Disable The Guardian Armor Recipes")
    public static boolean enableGuardianArmorRecipes = true;

    @ModConfigProperty(category = "Recipes", name = "enableTheUltimateArmorRecipes", comment = "Enable/Disable The Ultimate Armor Recipes")
    public static boolean enableTheUltimateArmorRecipes = true;

    @ModConfigProperty(category = "Recipes", name = "enableReinforcedArmorsRecipes", comment = "Enable/Disable The Reinforced Armors Recipes")
    public static boolean enableReinforcedArmorsRecipes = true;

    @ModConfigProperty(category = "Recipes", name = "enableChainArmorRecipes", comment = "Enable/Disable The Chain Armors Recipes")
    public static boolean enableChainArmorRecipes = true;

    @ModConfigProperty(category = "Recipes", name = "enableArditeArmorRecipes", comment = "Enable/Disable The Ardite Armors Recipes")
    public static boolean enableArditeArmorRecipes = true;

    @ModConfigProperty(category = "Recipes", name = "enableCobaltArmorRecipes", comment = "Enable/Disable The Cobalt Armors Recipes")
    public static boolean enableCobaltArmorRecipes = true;

    @ModConfigProperty(category = "Recipes", name = "enableManyullynArmorRecipes", comment = "Enable/Disable The Manyullyn Armors Recipes")
    public static boolean enableManyullynArmorRecipes = true;

    @ModConfigProperty(category = "Recipes", name = "enablePigIronArmorRecipes", comment = "Enable/Disable The Pig Iron Armors Recipes")
    public static boolean enablePigIronArmorRecipes = true;

    @ModConfigProperty(category = "Recipes", name = "enableKnightSlimeArmorRecipes", comment = "Enable/Disable The Knight Slime Armors Recipes")
    public static boolean enableKnightSlimeArmorRecipes = true;

    @ModConfigProperty(category = "Recipes", name = "enableChickenArmorRecipes", comment = "Enable/Disable The Chicken Armors Recipes")
    public static boolean enableChickenArmorRecipes = true;

    @ModConfigProperty(category = "Recipes", name = "enableSlimeArmorRecipes", comment = "Enable/Disable The Slime Armors Recipes")
    public static boolean enableSlimeArmorRecipes = true;

    @ModConfigProperty(category = "Recipes", name = "enableOldLavaArmorRecipes", comment = "Enable/Disable The Old Lava Armors Recipes")
    public static boolean enableOldLavaArmorRecipes = false;

    @ModConfigProperty(category = "Recipes", name = "enableRedstoneAppleRecipes", comment = "Enable/Disable The Redstone Apple Recipes")
    public static boolean enableRedstoneAppleRecipes = true;
}