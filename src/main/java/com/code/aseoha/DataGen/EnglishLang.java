package com.code.aseoha.DataGen;

import com.code.aseoha.aseoha;
import com.code.aseoha.items.AseohaItems;
import com.code.aseoha.registries.AnimReg;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class EnglishLang extends LanguageProvider {

    public EnglishLang(DataGenerator gen) {
        super(gen, aseoha.MODID, "en_us");
    }

    @Override
    /**
     * THANKS JERYN!
     */
    protected void addTranslations() {
        add(AseohaItems.MANUAL.get(), "ASEOHA Manual");
        add(AnimReg.FAST_AF.get().getTranslationKey(), "Fast Animation");
        add("ars.piece.category.aseoha.astronomer", "Astronomer");
        add("ars.piece.category.aseoha.cavern", "Cavern");
        add("ars.piece.category.aseoha.cavern_rooms", "Cavern Rooms");
        add("ars.piece.category.aseoha.corridor", "Corridors [ASEOHA]");
        add("ars.piece.category.aseoha.jade", "Jade");
        add("ars.piece.category.aseoha.mesh", "Mesh");
        add("ars.piece.category.aseoha.metallic", "Metallic");
        add("ars.piece.category.aseoha.nautilus", "Nautilus");
        add("ars.piece.category.aseoha.rooms", "Rooms [ASEOHA]");
        add("aseoha.gui.coord.desc", "Set the Coordinate");
        add("aseoha.gui.coord.suggestion.current_value", "Current Coordinate,");
        add("aseoha.gui.coord.suggestion.default", "Set the Coordinate");
        add("aseoha.gui.coord.title", "TARDIS Coordinates");
        add("aseoha.gui.coord_set", "Confirm");
        add("aseoha.k9.container.screen", "K9 Interface");
        add("aseoha.k9.inventory", "K-9 Inventory");
        add("aseoha.tardis.coor_x", "Set X Coordinate");
        add("aseoha.tardis.coord_x", "Set X Coordinate");
        add("aseoha.tardis.coord_y", "Set Y Coordinate");
        add("aseoha.tardis.coord_z", "Set Z Coordinate");
        add("aseoha.tardis.fly", "Takeoff");
        add("aseoha.tardis.lock_doors", "Toggle Doors Lock");
        add("aseoha.tardis.submenu", "TARDIS");
        add("block.aseoha.eye_of_harmony", "Eye Of Harmony");
        add("block.aseoha.harmonic_pillar", "Harmonic Pillar");
        add("block.aseoha.ars_egg_old", "Mini - ARS Tree");
        add("block.aseoha.artron_bank_old", "Artron Bank");
        add("block.aseoha.blue_crystal", "Blue Crystal");
        add("block.aseoha.coatrack", "Coat Rack");
        add("block.aseoha.copper_column", "Copper Time Column");
        add("block.aseoha.copper_column_top", "Copper Time Column Top");
        add("block.aseoha.copper_roundel", "Copper Roundel");
        add("block.aseoha.dimensional_button", "Modular Dimensional Shifters");
        add("block.aseoha.facing_control", "Modular Facing Control");
        add("block.aseoha.faultlocator", "Hellbent Fault Locator");
        add("block.aseoha.faultlocator_s", "Hellbent Fault Locator (South)");
        add("block.aseoha.flight_button", "Modular Flight Button");
        add("block.aseoha.foodmachine_old", "Food Machine");
        add("block.aseoha.handbreak_control", "Modular Handbrake");
        add("block.aseoha.hb_floor", "Hellbent Floor");
        add("block.aseoha.hb_glass01", "Hellbent Glass 1");
        add("block.aseoha.hb_glass02", "Hellbent Glass 2");
        add("block.aseoha.hb_glass03", "Hellbent Glass 3");
        add("block.aseoha.hb_glass04", "Hellbent Glass 4");
        add("block.aseoha.hb_glass05", "Hellbent Glass 5");
        add("block.aseoha.hb_glass06", "Hellbent Glass 6");
        add("block.aseoha.hb_glass07", "Hellbent Glass 7");
        add("block.aseoha.hb_glass08", "Hellbent Glass 8");
        add("block.aseoha.hb_hex", "Hellbent Ceiling Thing");
        add("block.aseoha.hb_pole", "Hellbent Pole");
        add("block.aseoha.hb_roundel01", "Hellbent Roundel 1");
        add("block.aseoha.hb_roundel02", "Hellbent Roundel 2");
        add("block.aseoha.hb_roundel03", "Hellbent Roundel 3");
        add("block.aseoha.hb_vent", "Hellbent Vent");
        add("block.aseoha.hb_wall", "Hellbent Wall");
        add("block.aseoha.hb_wallsilver", "Hellbent Silver Wall");
        add("block.aseoha.inc_control", "Modular Increment Modifier");
        add("block.aseoha.mangrove_planks", "Mangrove Planks");
        add("block.aseoha.megalos", "1.12 Meglos");
        add("block.aseoha.megalos_floor", "1.12 Meglos Floor");
        add("block.aseoha.megalos_full_roundel", "1.12 Meglos Full Roundel");
        add("block.aseoha.megalos_half_roundel", "1.12 Meglos Half Roundel");
        add("block.aseoha.megalos_half_roundel_bottom_edge", "1.12 Meglos Half Roundel Lower Border");
        add("block.aseoha.megalos_half_roundel_top_edge", "1.12 Meglos Half Roundel Upper Border");
        add("block.aseoha.megalos_pillar", "1.12 Meglos Pillar");
        add("block.aseoha.megalos_pillar_top", "1.12 Meglos Pillar Cap");
        add("block.aseoha.megalos_slab", "1.12 Meglos Slab");
        add("block.aseoha.megalos_stripe", "1.12 Meglos Stripe");
        add("block.aseoha.megalos_white_full_roundel", "1.12 Meglos Full Roundel (White)");
        add("block.aseoha.megalos_white_half_roundel", "1.12 Meglos Half Roundel (White)");
        add("block.aseoha.megalos_white_half_roundel_bottom", "1.12 Meglos Half Roundel Border (White)");
        add("block.aseoha.megalos_white_half_roundel_bottom_edge", "1.12 Meglos Half Roundel Lower Border (White)");
        add("block.aseoha.megalos_white_half_roundel_top", "1.12 Meglos Half Roundel Border (White)");
        add("block.aseoha.megalos_white_half_roundel_top_edge", "1.12 Meglos Half Roundel Upper Border (White)");
        add("block.aseoha.mg_blank", "Meglos Blank");
        add("block.aseoha.mg_blank_wall", "Meglos Blank Wall");
        add("block.aseoha.mg_floor", "Meglos Floor");
        add("block.aseoha.mg_roundel1", "Meglos Roundel 01");
        add("block.aseoha.mg_roundel2", "Meglos Roundel 02");
        add("block.aseoha.mg_roundel3", "Meglos Roundel 03");
        add("block.aseoha.mg_roundel4", "Meglos Roundel 04");
        add("block.aseoha.mg_roundel5", "Meglos Roundel 05");
        add("block.aseoha.ochre_froglight", "Ochre Froglight");
        add("block.aseoha.orange_terracotta_roundel", "Orange Terracotta Roundel");
        add("block.aseoha.orange_terracotta_roundel_half", "Orange Terracotta Roundel Half");
        add("block.aseoha.randomizer_control", "Modular Randomizer");
        add("block.aseoha.refueler_control", "Modular Refueler");
        add("block.aseoha.sonic_workbench", "Sonic Workbench (Decorative)");
        add("block.aseoha.structure_panel_old", "1.12 Structure Panel");
        add("block.aseoha.structure_panel_open_old", "1.12 Structure Panel Open");
        add("block.aseoha.structure_remove_old", "1.12 Structure Remove");
        add("block.aseoha.structure_spawn_old", "1.12 Structure Spawn");
        add("block.aseoha.tardis_coral", "TARDIS Coral");
        add("block.aseoha.toaster", "Toaster");
        add("block.aseoha.toyota_lower_hexagon_full", "1.12 Toyota Lower Wall Pattern 1");
        add("block.aseoha.toyota_lower_hexagon_full_lit", "1.12 Toyota Lower Wall Pattern 1 Lit");
        add("block.aseoha.toyota_lower_hexagon_left", "1.12 Toyota Lower Wall Pattern 2");
        add("block.aseoha.toyota_lower_hexagon_left_blank", "1.12 Toyota Lower Wall Pattern 2 Blank");
        add("block.aseoha.toyota_lower_hexagon_left_lit", "1.12 Toyota Lower Wall Pattern 2 Lit");
        add("block.aseoha.toyota_lower_hexagon_right", "1.12 Toyota Lower Wall Pattern 3");
        add("block.aseoha.toyota_lower_hexagon_right_blank", "1.12 Toyota Lower Wall Pattern 3 Blank");
        add("block.aseoha.toyota_lower_hexagon_right_lit", "1.12 Toyota Lower Wall Pattern 3 Lit");
        add("block.aseoha.toyota_lower_lightstrip", "1.12 Toyota Lower LightStrip");
        add("block.aseoha.toyota_lower_lightstrip_blank", "1.12 Toyota Lower LightStrip Blank");
        add("block.aseoha.toyota_lower_lightstrip_lit", "1.12 Toyota Lower LightStrip Lit");
        add("block.aseoha.toyota_platform_block", "1.12 Toyota Platform Block");
        add("block.aseoha.toyota_platform_edge", "1.12 Toyota Platform Edge");
        add("block.aseoha.toyota_roof", "1.12 Toyota Roof");
        add("block.aseoha.toyota_roof_roundel", "1.12 Toyota Roof Roundel");
        add("block.aseoha.toyota_upper_divider", "1.12 Toyota Light Divider");
        add("block.aseoha.toyota_upper_light", "1.12 Toyota Light");
        add("block.aseoha.toyota_upper_light_emergency", "1.12 Toyota Emergency Light");
        add("block.aseoha.toyota_upper_wall_pattern_bottom_left", "1.12 Toyota Upper Wall Pattern 1");
        add("block.aseoha.toyota_upper_wall_pattern_bottom_middle", "1.12 Toyota Upper Wall Pattern 2");
        add("block.aseoha.toyota_upper_wall_pattern_bottom_right", "1.12 Toyota Upper Wall Pattern 3");
        add("block.aseoha.toyota_upper_wall_pattern_top_left", "1.12 Toyota Upper Wall Pattern 4");
        add("block.aseoha.toyota_upper_wall_pattern_top_middle", "1.12 Toyota Upper Wall Pattern 5");
        add("block.aseoha.toyota_upper_wall_pattern_top_right", "1.12 Toyota Upper Wall Pattern 6");
        add("block.aseoha.trenzalore_sand", "Trenzalore Sand");
        add("block.aseoha.verdant_froglight", "Verdant Froglight");
        add("block.aseoha.x_control", "Modular X Shifter");
        add("block.aseoha.y_control", "Modular Y Shifter");
        add("block.aseoha.z_control", "Modular Z Shifter");
        add("command.aseoha.book.given", "Gave Manual");
        add("command.aseoha.controls.fixed", "Re-Positioned Console Controls");
        add("console.aseoha.brackolin", "Brackolin Console");
        add("console.custard.blue", "Blue");
        add("console.custard.default", "Default");
        add("console.custard.off", "Off");
        add("control.aseoha.coffeepot", "Coffee Pot");
        add("control.aseoha.wibbly_lever", "Wibbly Lever");
        add("entity.aseoha.k9", "K9");
        add("exterior.tardis.bluedoctor", "Blue Doctor Exterior");
        add("exterior.tardis.brackolin", "Brackolin Exterior");
        add("exterior.tardis.hartnell112", "1.12 Hartnell Exterior");
        add("exterior.tardis.olwarrior", "Ol' warrior Exterior");
        add("exterior.tardis.rani", "Rani Exterior");
        add("exterior.tardis.wardrobe", "Wardrobe Exterior");
        add("flight_events.aseoha.power_fault", "Power Fault!");
        add("flight_events.aseoha.tardis_taking_over", "TARDIS Taking Over!");
        add("item.aseoha.bessie_spawn_egg", "Bessie");
        add("item.aseoha.control_mold", "Control Mold");
        add("item.aseoha.deadlocker", "Deadlocker");
        add("item.aseoha.engine", "Engine");
        add("item.aseoha.golden_potato", "Golden Potato");
        add("item.aseoha.hammer", "Hammer");
        add("item.aseoha.k9_spawn_egg", "K-9");
        add("item.aseoha.majestic_tale_disc", "The Majestic Tale");
        add("item.aseoha.majestic_tale_disc.desc", "The Majestic Tale (Of A Madman In A Box)");
        add("item.aseoha.sonic_fourteenth", "Fourteenth Doctor's Sonic");
        add("item.aseoha.sonic_screwdriver", "Sonic Screwdriver");
        add("item.aseoha.sonic_wiimote", "Sonic Wiimote");
        add("item.aseoha.tezarak_coin", "Tezerak Coin");
        add("item.aseoha.twinkie", "Twinkie");
        add("item.aseoha.undeadlocker", "(ADMIN) Un-Deadlocker");
        add("item.aseoha.upgrades.atrium", "[ASEOHA] Atrium Upgrade");
        add("item.aseoha.upgrades.engine_booster", "Engine Boosters Upgrade");
        add("item.aseoha.upgrades.hads", "HADS Upgrade");
        add("item.aseoha.walle_spawn_egg", "Wall-E");
        add("itemGroup.aseoha", "ASEOHA Main Tab");
        add("itemGroup.aseoha_food", "ASEOHA Food");
        add("itemGroup.aseoha_modular", "ASEOHA Modular Console");
        add("message.aseoha.sonic.mode.one", "Block Names");
        add("mixin.sonic.modes.info.set_coords", "Right clicking in the world will set the attuned Tardis's destination coordinates to the right clicked position, right clicking after the HADS have been triggered will force the TARDIS to land");
        add("protocol.aseoha.eject", "Eject Timeship Occupants");
        add("protocol.aseoha.hads", "Toggle HADs");
        add("protocol.aseoha.shrink", "Shrink Exterior");
        add("sound_scheme.aseoha.stealth", "Stealth");
        add("texvar.aseoha.brackolin.normal", "Clean");
        add("texvar.aseoha.console.vale.normal", "Normal");
        add("texvar.aseoha.console.vale.purple", "Spacetime");
        add("texvar.aseoha.consoles.copper.blue", "Blue");
        add("texvar.aseoha.consoles.copper.crystal", "Crystal");
        add("texvar.aseoha.consoles.copper.normal", "Default");
        add("texvar.aseoha.consoles.copper.rosegold", "Rosegold");
        add("texvar.aseoha.consoles.copper.steel", "Steel");
        add("texvar.aseoha.exterior.capaldi.default", "Default");
        add("texvar.aseoha.exterior.capaldi.tribute", "Clara Tribute");
        add("texvar.aseoha.exterior.invisible", "Invisible");
        add("texvar.aseoha.exterior.mcgann.default", "Default");
        add("texvar.aseoha.exteriors.coral.badwolf", "Bad Wolf");
        add("texvar.aseoha.exteriors.coral.default", "Default");
        add("texvar.aseoha.olwarrior.normal", "Normal");
        add("texvar.aseoha.wardrobe.acacia", "Acacia Wood");
        add("texvar.aseoha.wardrobe.birch", "Birch Wood");
        add("texvar.aseoha.wardrobe.crimson", "Crimson Wood");
        add("texvar.aseoha.wardrobe.dark_oak", "Dark Oak Wood");
        add("texvar.aseoha.wardrobe.jungle", "Jungle Wood");
        add("texvar.aseoha.wardrobe.mangrove", "Mangrove Wood");
        add("texvar.aseoha.wardrobe.oak", "Oak Wood");
        add("texvar.aseoha.wardrobe.spruce", "Spruce Wood");
        add("texvar.aseoha.wardrobe.spruce_stone", "Stone Brick & Spruce Wood");
        add("texvar.aseoha.wardrobe.stone", "Stone Brick");
        add("texvar.aseoha.wardrobe.warped", "Warped Wood");
        add("texvar.tardis.console.brass.black", "Brass Black");
        add("texvar.tardis.console.brass.blue", "Brass Blue");
        add("texvar.tardis.console.brass.cyan", "Brass Cyan");
        add("texvar.tardis.console.brass.darkblue", "Brass Dark Blue");
        add("texvar.tardis.console.brass.orange", "Brass Orange");
        add("texvar.tardis.console.brass.pink", "Brass Pink");
        add("texvar.tardis.console.brass.purple", "Brass Purple");
        add("texvar.tardis.console.brass.red", "Brass Red");
        add("texvar.tardis.console.brass.white", "Brass White");
        add("texvar.tardis.console.brass.yellow", "Brass Yellow");
        add("texvar.tardis.console.coral.black", "Black");
        add("texvar.tardis.console.coral.blue", "Blue");
        add("texvar.tardis.console.coral.cyan", "Cyan");
        add("texvar.tardis.console.coral.darkblue", "Dark blue");
        add("texvar.tardis.console.coral.orange", "Orange");
        add("texvar.tardis.console.coral.pink", "Pink");
        add("texvar.tardis.console.coral.purple", "Purple");
        add("texvar.tardis.console.coral.red", "Red");
        add("texvar.tardis.console.coral.white", "White");
        add("texvar.tardis.console.coral.yellow", "Yellow");
        add("texvar.tardis.console.galvanic.galvanic_blackandwhite", "Normal Black & White gradient");
        add("texvar.tardis.console.galvanic.galvanic_blue", "Normal Blue");
        add("texvar.tardis.console.galvanic.galvanic_cyan", "Normal Cyan");
        add("texvar.tardis.console.galvanic.galvanic_darkblue", "Normal Dark Blue");
        add("texvar.tardis.console.galvanic.galvanic_green", "Normal Green");
        add("texvar.tardis.console.galvanic.galvanic_orange", "Normal Orange");
        add("texvar.tardis.console.galvanic.galvanic_pink", "Normal Pink");
        add("texvar.tardis.console.galvanic.galvanic_purple", "Normal Purple");
        add("texvar.tardis.console.galvanic.galvanic_red", "Normal Red");
        add("texvar.tardis.console.galvanic.galvanic_yellow", "Normal Yellow");
        add("texvar.tardis.console.galvanic.gold", "1.14 Gold");
        add("texvar.tardis.console.galvanic.imperial", "Imperial");
        add("texvar.tardis.console.galvanic.imperial_blackandwhite", "Imperial Black & White Gradient");
        add("texvar.tardis.console.galvanic.imperial_blue", "Imperial Blue");
        add("texvar.tardis.console.galvanic.imperial_cyan", "Imperial Cyan");
        add("texvar.tardis.console.galvanic.imperial_darkblue", "Imperial Dark Blue");
        add("texvar.tardis.console.galvanic.imperial_green", "Imperial Green");
        add("texvar.tardis.console.galvanic.imperial_orange", "Imperial Orange");
        add("texvar.tardis.console.galvanic.imperial_pink", "Imperial Pink");
        add("texvar.tardis.console.galvanic.imperial_purple", "Imperial Purple");
        add("texvar.tardis.console.galvanic.imperial_red", "Imperial Red");
        add("texvar.tardis.console.galvanic.joker", "1.14 Joker");
        add("texvar.tardis.console.galvanic.sith", "Sith");
        add("texvar.tardis.console.galvanic.sith_blackandwhite", "Sith Black & White gradient");
        add("texvar.tardis.console.galvanic.sith_blue", "Sith Blue");
        add("texvar.tardis.console.galvanic.sith_cyan", "Sith Cyan");
        add("texvar.tardis.console.galvanic.sith_darkblue", "Sith Dark Blue");
        add("texvar.tardis.console.galvanic.sith_green", "Sith Green");
        add("texvar.tardis.console.galvanic.sith_orange", "Sith Orange");
        add("texvar.tardis.console.galvanic.sith_pink", "Sith Pink");
        add("texvar.tardis.console.galvanic.sith_purple", "Sith Purple");
        add("texvar.tardis.console.galvanic.sith_yellow", "Sith Yellow");
        add("texvar.tardis.console.galvanic.white", "1.14 White");
        add("texvar.tardis.console.galvanic.wood", "Wooden");
        add("texvar.tardis.console.galvanic.wood_blackandwhite", "Wood Black & White gradient");
        add("texvar.tardis.console.galvanic.wood_blue", "Wood Blue");
        add("texvar.tardis.console.galvanic.wood_cyan", "Wood Cyan");
        add("texvar.tardis.console.galvanic.wood_darkblue", "Wood Dark Blue");
        add("texvar.tardis.console.galvanic.wood_green", "Wood Green");
        add("texvar.tardis.console.galvanic.wood_orange", "Wood Orange");
        add("texvar.tardis.console.galvanic.wood_pink", "Wood Pink");
        add("texvar.tardis.console.galvanic.wood_purple", "Wood Purple");
        add("texvar.tardis.console.galvanic.wood_red", "Wood Red");
        add("texvar.tardis.console.galvanic.wood_yellow", "Wood Yellow");
        add("texvar.tardis.console.ironclad.black", "Ironclad Black");
        add("texvar.tardis.console.ironclad.blue", "Ironclad Blue");
        add("texvar.tardis.console.ironclad.cyan", "Ironclad Cyan");
        add("texvar.tardis.console.ironclad.darkblue", "Ironclad Dark blue");
        add("texvar.tardis.console.ironclad.orange", "Ironclad Orange");
        add("texvar.tardis.console.ironclad.pink", "Ironclad Pink");
        add("texvar.tardis.console.ironclad.purple", "Ironclad Purple");
        add("texvar.tardis.console.ironclad.red", "Ironclad Red");
        add("texvar.tardis.console.ironclad.white", "Ironclad White");
        add("texvar.tardis.console.ironclad.yellow", "Ironclad Yellow");
        add("texvar.tardis.console.nemo.black", "Black");
        add("texvar.tardis.console.nemo.blue", "Blue");
        add("texvar.tardis.console.nemo.classic", "Classic");
        add("texvar.tardis.console.nemo.cyan", "Cyan");
        add("texvar.tardis.console.nemo.darkblue", "Dark blue");
        add("texvar.tardis.console.nemo.ivory", "Ivory");
        add("texvar.tardis.console.nemo.normal", "Normal");
        add("texvar.tardis.console.nemo.orange", "Orange");
        add("texvar.tardis.console.nemo.pink", "Pink");
        add("texvar.tardis.console.nemo.purple", "Purple");
        add("texvar.tardis.console.nemo.red", "Red");
        add("texvar.tardis.console.nemo.wood", "Wooden");
        add("texvar.tardis.console.nemo.yellow", "Yellow");
        add("texvar.tardis.console.neutron.black", "Normal Black");
        add("texvar.tardis.console.neutron.brass", "Brass");
        add("texvar.tardis.console.neutron.cyan", "Normal Cyan");
        add("texvar.tardis.console.neutron.darkblue", "Normal Dark Blue");
        add("texvar.tardis.console.neutron.green", "Normal Green");
        add("texvar.tardis.console.neutron.orange", "Normal Orage");
        add("texvar.tardis.console.neutron.pink", "Normal Pink");
        add("texvar.tardis.console.neutron.purple", "Normal Purple");
        add("texvar.tardis.console.neutron.red", "Normal Red");
        add("texvar.tardis.console.neutron.thaumic", "Thaumic");
        add("texvar.tardis.console.neutron.white", "Normal White");
        add("texvar.tardis.console.neutron.yellow", "Normal Yellow");
        add("texvar.tardis.console.rosewood.black", "Rosewood Black");
        add("texvar.tardis.console.rosewood.blue", "Rosewood Blue");
        add("texvar.tardis.console.rosewood.cyan", "Rosewood Cyan");
        add("texvar.tardis.console.rosewood.darkblue", "Rosewood Dark blue");
        add("texvar.tardis.console.rosewood.green", "Rosewood Green");
        add("texvar.tardis.console.rosewood.orange", "Rosewood Orange");
        add("texvar.tardis.console.rosewood.pink", "Rosewood Pink");
        add("texvar.tardis.console.rosewood.purple", "Rosewood Purple");
        add("texvar.tardis.console.rosewood.red", "Rosewood Red");
        add("texvar.tardis.console.rosewood.white", "Rosewood White");
        add("texvar.tardis.console.rosewood.yellow", "Rosewood Yellow");
        add("texvar.tardis.console.steam.black", "Normal Black");
        add("texvar.tardis.console.steam.blue", "Normal Blue");
        add("texvar.tardis.console.steam.cyan", "Normal Cyan");
        add("texvar.tardis.console.steam.darkblue", "Normal Dark blue");
        add("texvar.tardis.console.steam.ironclad", "Iron Clad");
        add("texvar.tardis.console.steam.normal", "Normal");
        add("texvar.tardis.console.steam.orange", "Normal Orange");
        add("texvar.tardis.console.steam.pink", "Normal Pink");
        add("texvar.tardis.console.steam.purple", "Normal Purple");
        add("texvar.tardis.console.steam.red", "Normal Red");
        add("texvar.tardis.console.steam.rosewood", "Rosewood");
        add("texvar.tardis.console.steam.tardisblue", "Tradis blue");
        add("texvar.tardis.console.steam.white", "Normal White");
        add("texvar.tardis.console.steam.yellow", "Normal Yellow");
        add("texvar.tardis.console.thaumic.black", "Thaumic Black");
        add("texvar.tardis.console.thaumic.blue", "Thaumic Blue");
        add("texvar.tardis.console.thaumic.cyan", "Thaumic Cyan");
        add("texvar.tardis.console.thaumic.darkblue", "Thaumic Dark Blue");
        add("texvar.tardis.console.thaumic.green", "Thaumic Green");
        add("texvar.tardis.console.thaumic.orange", "Thaumic Orange");
        add("texvar.tardis.console.thaumic.pink", "Thaumic Pink");
        add("texvar.tardis.console.thaumic.red", "Thaumic Red");
        add("texvar.tardis.console.thaumic.white", "Thaumic White");
        add("texvar.tardis.console.thaumic.yellow", "Thaumic Yellow");
        add("texvar.tardis.console.toyota.1.14blue", "1.14 Blue");
        add("texvar.tardis.console.toyota.1.14red", "1.14 Red");
        add("texvar.tardis.console.toyota.1.14white", "1.14 White");
        add("texvar.tardis.console.toyota.black", "Black");
        add("texvar.tardis.console.toyota.blue", "Blue");
        add("texvar.tardis.console.toyota.cyan", "Cyan");
        add("texvar.tardis.console.toyota.darkblue", "Dark Blue");
        add("texvar.tardis.console.toyota.green", "Green");
        add("texvar.tardis.console.toyota.normal", "Normal");
        add("texvar.tardis.console.toyota.pink", "Pink");
        add("texvar.tardis.console.toyota.purple", "Purple");
        add("texvar.tardis.console.toyota.red", "Red");
        add("texvar.tardis.console.toyota.violet", "Violet");
        add("texvar.tardis.console.toyota.white", "White");
        add("texvar.tardis.console.toyota.yellow", "Yellow");
        add("texvar.tardis.console.xion.black", "Black");
        add("texvar.tardis.console.xion.blue", "Blue");
        add("texvar.tardis.console.xion.cyan", "Cyan");
        add("texvar.tardis.console.xion.glass", "Glass");
        add("texvar.tardis.console.xion.orange", "Orange");
        add("texvar.tardis.console.xion.pink", "Pink");
        add("texvar.tardis.console.xion.purple", "Purple");
        add("texvar.tardis.console.xion.ruby", "Ruby");
        add("texvar.tardis.console.xion.sapphire", "Sapphire");
        add("texvar.tardis.console.xion.white", "White");
        add("texvar.tardis.console.xion.yellow", "Yellow");
        add("texvar.tardis.exterior.fortune.blue", "Blue");
        add("texvar.tardis.exterior.fortune.normal", "Normal");
        add("texvar.tardis.exterior.fortune.red", "Red");
        add("texvar.tardis.exterior.steam.blue", "Blue");
        add("texvar.tardis.exterior.steam.normal", "Normal");
        add("texvar.tardis.exterior.steam.rust", "Rusted");
        add("texvar.tardis.exterior.telephone.cyberpunk", "Cyberpunk");
        add("texvar.tardis.exterior.trunk.dark", "Dark");
        add("texvar.tardis.tardis.common.normal", "Normal");
        add("tooltip.aseoha.deadlocker", "Toggles the deadlock state of the attuned TARDIS");
        add("tooltip.aseoha.undeadlocker", "Un-Deadlocks a TARDIS");
        add("tooltip.item.info.reenabled", "This was Re-Enabled by ASEOHA!");
        add("tooltip.part.upgrades/atrium.description", "Takes blocks with the TARDIS exterior \nConsult the ASEOHA Manual for more information");
        add("tooltip.part.upgrades/dynamic_coordinates.description", "Makes the TARDIS monitor update flight position while flying");
        add("item.aseoha.upgrades.dynamic_coordinates", "Dynamic Coordinates Upgrade");
        add("block.aseoha.gallifrey_sand", "Gallifreyan Sand");
        add("block.aseoha.skaro_sand", "Skaro Sand");
        add("item.aseoha.blue_crystal_shard", "Blue Crystal Shard");
        add("item.aseoha.blue_crystal_pile", "Blue Crystal Pile");
        add("item.aseoha.blue_crystal_nugget", "Blue Crystal Nugget");
        add("item.aseoha.blue_crystal_ingot", "Blue Crystal Ingot");
        add("item.aseoha.jelly_baby.red", "Red Jelly Baby");
        add("texvar.aseoha.consoles.copper.turquoise", "Turquoise");
//        add("regen.sound.staser", "Staser Fires");
//        add(RItems.FOB.get(), "Chameleon Arch");
//        add(RegenTraitRegistry.PHOTOSYNTHETIC.get().description().getKey(), "The sun energizes you!");
    }

    public String grammerNazi(String text) {
        String firstLetter = text.substring(0, 1).toUpperCase();
        return firstLetter + text.substring(1);
    }
}