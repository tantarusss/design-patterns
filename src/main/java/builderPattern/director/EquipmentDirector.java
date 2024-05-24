package builderPattern.director;

import builderPattern.EquipmentBuilder;
// α β
public class EquipmentDirector {
    EquipmentBuilder builder;
    public void constructStrongest(EquipmentBuilder builder) {
        builder.reset();
        builder.weapon("True Fatalis Charger");
        builder.charm("Challenger Charm V");
        builder.armorHead("Dragonhead β+");
        builder.armorChest("Dragonhide β+");
        builder.armorArms("Dragonclaws β+");
        builder.armorWaist("Dragonbarbs α+");
        builder.armorLegs("Kulve Taroth's Wrath β+");
    }
    public void constructAntiRajang(EquipmentBuilder builder) {
        builder.reset();
        builder.weapon("Kjárr Strongarm \"Ice\"");
        builder.charm("Ironside Charm V");
        builder.armorHead("Safi Crested Crown β+");
        builder.armorChest("Safi Crested Chest β+");
        builder.armorArms("Safi Crested Vambraces");
        builder.armorWaist("Safi Crested Belt β+");
        builder.armorLegs("Safi Crested Boots β+");
    }
}
