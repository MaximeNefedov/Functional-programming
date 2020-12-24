package Task2;

import java.util.ArrayList;
import java.util.List;

public class AreaSeller {
    private List<Area> areaList = new ArrayList<>();

    public AreaSeller() {
        generateAreas();
    }

    public List<Area> getAreaList() {
        return areaList;
    }

    private void generateAreas() {
        Area area1 = new AreaBuilder().setName("Участок 1")
                .setHeight(50)
                .setWidth(40)
                .calculateLandArea()
                .setPrice(140_000)
                .build();
        areaList.add(area1);

        Area area2 = new AreaBuilder().setName("Участок 2")
                .setHeight(150)
                .setWidth(240)
                .calculateLandArea()
                .setPrice(1_400_000)
                .build();
        areaList.add(area2);

        Area area3 = new AreaBuilder().setName("Участок 3")
                .setHeight(10)
                .setWidth(80)
                .calculateLandArea()
                .setPrice(50_000)
                .build();
        areaList.add(area3);

        Area area4 = new AreaBuilder().setName("Участок 4")
                .setHeight(1050)
                .setWidth(9000)
                .calculateLandArea()
                .setPrice(110_500_000)
                .build();
        areaList.add(area4);

        Area area5 = new AreaBuilder().setName("Участок 5")
                .setHeight(150)
                .setWidth(240)
                .calculateLandArea()
                .setPrice(1_300_000)
                .build();
        areaList.add(area5);

    }
}
