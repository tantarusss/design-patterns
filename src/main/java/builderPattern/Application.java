package builderPattern;

import builderPattern.director.EquipmentDirector;

public class Application {
    public static void main(String[] args) {
        EquipmentDirector director = new EquipmentDirector();
        EquipmentBuilder builder = new ConcreteEquipmentBuilder();
        director.constructStrongest(builder);
        Equipment strongest = builder.build();
        Equipment antiRajang = new ConcreteEquipmentBuilder()
                .weapon("Kjárr Strongarm \"Ice\"")
                .charm("Ironside Charm V")
                .armorHead("Safi Crested Crown β+")
                .armorChest("Safi Crested Chest β+")
                .armorArms("Safi Crested Vambraces")
                .armorWaist("Safi Crested Belt β+")
                .armorLegs("Safi Crested Boots β+")
                .build();
    }
}
