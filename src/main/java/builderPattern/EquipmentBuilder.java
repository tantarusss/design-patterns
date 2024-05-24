package builderPattern;

public interface EquipmentBuilder {
    void reset();
    EquipmentBuilder weapon(String weapon);
    EquipmentBuilder armorHead(String armorHead);
    EquipmentBuilder armorChest(String armorChest);
    EquipmentBuilder armorArms(String armorArms);
    EquipmentBuilder armorWaist(String armorWaist);
    EquipmentBuilder armorLegs(String armorLegs);
    EquipmentBuilder charm(String charm);
    Equipment build();
}
