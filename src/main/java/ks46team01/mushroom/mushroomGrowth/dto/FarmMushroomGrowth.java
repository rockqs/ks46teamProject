package ks46team01.mushroom.mushroomGrowth.dto;

import lombok.Data;

@Data
public class FarmMushroomGrowth {
    private Long mushroom_growth_idx;
    private String username;
    private Long company_info_idx;
    private Long farm_data_idx;
    private Long crop_idx;
    private String mushroom_growth_daily;
    private String mushroom_growth_status;
    private String mushroom_growth_date;
    private String mushroom_growth_content;


}