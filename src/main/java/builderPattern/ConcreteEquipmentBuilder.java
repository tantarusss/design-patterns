package builderPattern;

public class ConcreteEquipmentBuilder implements EquipmentBuilder {
    private Equipment result;

    @Override
    public void reset() {
        this.result = new Equipment();
    }

    @Override
    public ConcreteEquipmentBuilder weapon(String weapon) {
        this.result.setWeapon(weapon);
        return this;
    }

    @Override
    public ConcreteEquipmentBuilder armorHead(String armorHead) {
        this.result.setArmorHead(armorHead);
        return this;
    }

    @Override
    public ConcreteEquipmentBuilder armorChest(String armorChest) {
        this.result.setArmorChest(armorChest);
        return this;
    }

    @Override
    public ConcreteEquipmentBuilder armorArms(String armorArms) {
        this.result.setArmorArms(armorArms);
        return this;
    }

    @Override
    public ConcreteEquipmentBuilder armorWaist(String armorWaist) {
        this.result.setArmorWaist(armorWaist);
        return this;
    }

    @Override
    public ConcreteEquipmentBuilder armorLegs(String armorLegs) {
        this.result.setArmorLegs(armorLegs);
        return this;
    }

    @Override
    public ConcreteEquipmentBuilder charm(String charm) {
        this.result.setCharm(charm);
        return this;
    }

    @Override
    public Equipment build() {
        Equipment product = this.result;
        this.reset();
        return product;
    }
}
