package com.example.rentomojo.get_lists;

import com.example.rentomojo.R;
import com.example.rentomojo.explore_packages.ExplorePackageModel;
import com.example.rentomojo.packageactivity.PackageItem;
import com.example.rentomojo.recyclerview.CategoryItem;
import com.example.rentomojo.recyclerview.ItemHFModelClass;
import com.example.rentomojo.recyclerview.SelectCityModelClass;

import java.util.ArrayList;
import java.util.List;

public class GetLists {

    public static List<String> getRecentSearches() {
        List<String> list = new ArrayList<>();
        list.add("Bed");
        list.add("Washing Machine");
        list.add("Fridge");
        list.add("Air Conditioner");
        list.add("Mattresses");
        list.add("TV");
        list.add("Sofa");
        list.add("iPhone");
        list.add("Air Conditioner");
        return list;
    }

    public static List<ItemHFModelClass> getItemHFModelClassList() {
        List<ItemHFModelClass> itemHFModelClassList = new ArrayList<>();
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.one_hf, "₹449/mo", "Napster Queen Bed (Black)"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.two_hf, "₹259/mo", "Atticus Single Platform Bed"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.three_hf, "₹569/mo", "Top Load Washing Machine"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.four_hf, "₹109/mo", "Minion Bedside Table"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.five_hf, "₹429/mo", "Single Door Fridge (170 Litre)"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.six_hf, "₹1549/mo", "Voltas Inverter Air Conditioner 1 Ton"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.seven_hf, "₹499/mo", "Stowy 2-Door Wardrobe"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.eight_hf, "₹309/mo", "Pixar TV Unit"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.nine_hf, "₹669/mo", "Poise Queen Bed"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.ten_hf, "₹349/mo", "Queen (6x5) Foam Mattress"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.eleven_hf, "₹1069/mo", "Barney Recliner"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.tweleve_hf, "₹199/mo", "Stuart Study Table"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.thrteen_hf, "₹3999/mo", "Galaxy Note 10 Plus (Aura Glow)"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.fourteen_hf, "₹350/mo", "WFH Chair"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.fifteen_hf, "₹619/mo", "Magnum 3-Door Wardrobe"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.one_hf, "₹449/mo", "Napster Queen Bed (Black)"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.two_hf, "₹259/mo", "Atticus Single Platform Bed"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.three_hf, "₹569/mo", "Top Load Washing Machine"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.four_hf, "₹109/mo", "Minion Bedside Table"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.five_hf, "₹429/mo", "Single Door Fridge (170 Litre)"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.six_hf, "₹1549/mo", "Voltas Inverter Air Conditioner 1 Ton"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.seven_hf, "₹499/mo", "Stowy 2-Door Wardrobe"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.eight_hf, "₹309/mo", "Pixar TV Unit"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.nine_hf, "₹669/mo", "Poise Queen Bed"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.ten_hf, "₹349/mo", "Queen (6x5) Foam Mattress"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.eleven_hf, "₹1069/mo", "Barney Recliner"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.tweleve_hf, "₹199/mo", "Stuart Study Table"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.thrteen_hf, "₹3999/mo", "Galaxy Note 10 Plus (Aura Glow)"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.fourteen_hf, "₹350/mo", "WFH Chair"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.fifteen_hf, "₹619/mo", "Magnum 3-Door Wardrobe"));
        return itemHFModelClassList;
    }

    public static List<ItemHFModelClass> getItemHFModelClassListSearch() {
        List<ItemHFModelClass> itemHFModelClassList = new ArrayList<>();
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.five_hf, "₹429/mo", "Single Door Fridge (170 Litre)"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.fourteen_hf, "₹350/mo", "WFH Chair"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.fifteen_hf, "₹619/mo", "Magnum 3-Door Wardrobe"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.one_hf, "₹449/mo", "Napster Queen Bed (Black)"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.two_hf, "₹259/mo", "Atticus Single Platform Bed"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.three_hf, "₹569/mo", "Top Load Washing Machine"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.four_hf, "₹109/mo", "Minion Bedside Table"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.five_hf, "₹429/mo", "Single Door Fridge (170 Litre)"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.six_hf, "₹1549/mo", "Voltas Inverter Air Conditioner 1 Ton"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.seven_hf, "₹499/mo", "Stowy 2-Door Wardrobe"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.eight_hf, "₹309/mo", "Pixar TV Unit"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.nine_hf, "₹669/mo", "Poise Queen Bed"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.ten_hf, "₹349/mo", "Queen (6x5) Foam Mattress"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.eleven_hf, "₹1069/mo", "Barney Recliner"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.tweleve_hf, "₹199/mo", "Stuart Study Table"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.thrteen_hf, "₹3999/mo", "Galaxy Note 10 Plus (Aura Glow)"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.fourteen_hf, "₹350/mo", "WFH Chair"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.fifteen_hf, "₹619/mo", "Magnum 3-Door Wardrobe"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.one_hf, "₹449/mo", "Napster Queen Bed (Black)"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.two_hf, "₹259/mo", "Atticus Single Platform Bed"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.three_hf, "₹569/mo", "Top Load Washing Machine"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.four_hf, "₹109/mo", "Minion Bedside Table"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.five_hf, "₹429/mo", "Single Door Fridge (170 Litre)"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.six_hf, "₹1549/mo", "Voltas Inverter Air Conditioner 1 Ton"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.seven_hf, "₹499/mo", "Stowy 2-Door Wardrobe"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.eight_hf, "₹309/mo", "Pixar TV Unit"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.nine_hf, "₹669/mo", "Poise Queen Bed"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.ten_hf, "₹349/mo", "Queen (6x5) Foam Mattress"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.eleven_hf, "₹1069/mo", "Barney Recliner"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.tweleve_hf, "₹199/mo", "Stuart Study Table"));
        itemHFModelClassList.add(new ItemHFModelClass(R.drawable.thrteen_hf, "₹3999/mo", "Galaxy Note 10 Plus (Aura Glow)"));
        return itemHFModelClassList;
    }

    public static List<CategoryItem> getCategoryItemList1() {
        List<CategoryItem> categoryItemList_1 = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            if (i % 10 == 0) {
                categoryItemList_1.add(new CategoryItem(R.drawable.air_conditioner, "Air Conditioner", "Rs 20,000"));
            }
            if (i % 10 == 1) {
                categoryItemList_1.add(new CategoryItem(R.drawable.semiautometic_washingmachine, "Semi Autometic..", "Rs 12,000"));
            }
            if (i % 10 == 2) {
                categoryItemList_1.add(new CategoryItem(R.drawable.television, "Television", "Rs 14,400"));
            }
            if (i % 10 == 3) {
                categoryItemList_1.add(new CategoryItem(R.drawable.singledoor_refrigerator, "Singledoor..", "Rs 12,000"));
            }
            if (i % 10 == 4) {
                categoryItemList_1.add(new CategoryItem(R.drawable.water_purifier, "Water Purifier", "Rs 8,000"));
            }
            if (i % 10 == 5) {
                categoryItemList_1.add(new CategoryItem(R.drawable.washing_machine, "Fully Autometic..", "Rs 25,000"));
            }
            if (i % 10 == 6) {
                categoryItemList_1.add(new CategoryItem(R.drawable.microwave, "Micro Wave", "Rs 6,000"));
            }
            if (i % 10 == 7) {
                categoryItemList_1.add(new CategoryItem(R.drawable.refrigerator, "Refrigerator", "Rs 28,999"));
            }
            if (i % 10 == 8) {
                categoryItemList_1.add(new CategoryItem(R.drawable.air_coolers, "Air Coolers", "Rs 12,000"));
            }
            if (i % 10 == 9) {
                categoryItemList_1.add(new CategoryItem(R.drawable.led_tv, "LED Tv", "Rs 12,000"));
            }
        }
        return categoryItemList_1;
    }

    public static List<CategoryItem> getCatergoryItemList2() {
        List<CategoryItem> categoryItemList_1 = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            if (i % 6 == 0) {
                categoryItemList_1.add(new CategoryItem(R.drawable.bed, "Bed", "Rs 20,000"));
            }
            if (i % 6 == 1) {
                categoryItemList_1.add(new CategoryItem(R.drawable.sofa, "Sofa", "Rs 25,000"));
            }
            if (i % 6 == 2) {
                categoryItemList_1.add(new CategoryItem(R.drawable.poise_queen_bed, "Poise Queen..", "Rs 14,400"));
            }
            if (i % 6 == 3) {
                categoryItemList_1.add(new CategoryItem(R.drawable.diner_table, "Dinner Table", "Rs 14,400"));
            }
            if (i % 6 == 4) {
                categoryItemList_1.add(new CategoryItem(R.drawable.study_table, "Study Table", "Rs 8,000"));
            }
            if (i % 6 == 5) {
                categoryItemList_1.add(new CategoryItem(R.drawable.atticus_single_bed, "Atticus Single..", "Rs 8,000"));
            }
        }
        return categoryItemList_1;
    }

    public static List<CategoryItem> getCatergoryItemList3() {
        List<CategoryItem> categoryItemList_3 = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            if (i % 6 == 0) {
                categoryItemList_3.add(new CategoryItem(R.drawable.mobile, "Mobiles", "Rs 20,000"));
            }
            if (i % 6 == 1) {
                categoryItemList_3.add(new CategoryItem(R.drawable.laptop, "Laptops", "Rs 25,000"));
            }
            if (i % 6 == 2) {
                categoryItemList_3.add(new CategoryItem(R.drawable.bluetooth_speaker, "Bluetooth Speaker", "Rs 14,400"));
            }
            if (i % 6 == 3) {
                categoryItemList_3.add(new CategoryItem(R.drawable.led_tv, "LED TV", "Rs 14,400"));
            }
            if (i % 6 == 4) {
                categoryItemList_3.add(new CategoryItem(R.drawable.electric_iron, "Electric Iron", "Rs 8,000"));
            }
            if (i % 6 == 5) {
                categoryItemList_3.add(new CategoryItem(R.drawable.home_theatre, "Home Theatre", "Rs 8,000"));
            }
        }
        return categoryItemList_3;
    }

    public static List<CategoryItem> getCatergoryItemList4() {
        List<CategoryItem> categoryItemList_4 = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            if (i % 6 == 0) {
                categoryItemList_4.add(new CategoryItem(R.drawable.sofa_table, "Sofa & Table", "Rs 20,000"));
            }
            if (i % 6 == 1) {
                categoryItemList_4.add(new CategoryItem(R.drawable.home_decoration, "Room Decoration", "Rs 25,000"));
            }
            if (i % 6 == 2) {
                categoryItemList_4.add(new CategoryItem(R.drawable.book_shelf, "Book Shelf", "Rs 14,400"));
            }
            if (i % 6 == 3) {
                categoryItemList_4.add(new CategoryItem(R.drawable.shelf, "Shoe Shelf", "Rs 14,400"));
            }
            if (i % 6 == 4) {
                categoryItemList_4.add(new CategoryItem(R.drawable.study_table, "Study Table Combo", "Rs 8,000"));
            }
            if (i % 6 == 5) {
                categoryItemList_4.add(new CategoryItem(R.drawable.bed_package, "Best Package", "Rs 8,000"));
            }
        }
        return categoryItemList_4;
    }

    public static List<SelectCityModelClass> selectCityModelClassList() {
        List<SelectCityModelClass> selectCityModelClassList = new ArrayList<>();
        selectCityModelClassList.add(new SelectCityModelClass(R.drawable.bangalore_image, "Bangalore"));
        selectCityModelClassList.add(new SelectCityModelClass(R.drawable.mumbai_image, "Mumbai"));
        selectCityModelClassList.add(new SelectCityModelClass(R.drawable.pune_image, "Pune"));
        selectCityModelClassList.add(new SelectCityModelClass(R.drawable.delhi_image, "Delhi"));
        selectCityModelClassList.add(new SelectCityModelClass(R.drawable.noida_image, "Noida"));
        selectCityModelClassList.add(new SelectCityModelClass(R.drawable.noida_image, "Gurgaon"));
        selectCityModelClassList.add(new SelectCityModelClass(R.drawable.noida_image, "Hydrabad"));
        selectCityModelClassList.add(new SelectCityModelClass(R.drawable.noida_image, "Chennai"));
        selectCityModelClassList.add(new SelectCityModelClass(R.drawable.noida_image, "Ahmedabad"));
        selectCityModelClassList.add(new SelectCityModelClass(R.drawable.noida_image, "Mysore"));
        selectCityModelClassList.add(new SelectCityModelClass(R.drawable.noida_image, "Jaipur"));
        selectCityModelClassList.add(new SelectCityModelClass(R.drawable.noida_image, "Faridabad"));
        selectCityModelClassList.add(new SelectCityModelClass(R.drawable.noida_image, "Ghaziabad"));
        return selectCityModelClassList;
    }

    public static List<ItemHFModelClass> getcategoryItemList_Item1() {
        List<ItemHFModelClass> categoryItemList_3 = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            if (i % 6 == 0) {
                categoryItemList_3.add(new ItemHFModelClass(R.drawable.mobiles, "₹20,000m/o", "Mobiles"));
            }
            if (i % 6 == 1) {
                categoryItemList_3.add(new ItemHFModelClass(R.drawable.laptop, "₹25,000m/o", "Laptops"));
            }
            if (i % 6 == 2) {
                categoryItemList_3.add(new ItemHFModelClass(R.drawable.bluetooth_speaker, "₹14,400m/o", "Bluetooth Speaker"));
            }
            if (i % 6 == 3) {
                categoryItemList_3.add(new ItemHFModelClass(R.drawable.led_tv, "₹ 14,400m/o", "LED TV"));
            }
            if (i % 6 == 4) {
                categoryItemList_3.add(new ItemHFModelClass(R.drawable.electric_iron, "₹8,000", "Electric Iron"));
            }
            if (i % 6 == 5) {
                categoryItemList_3.add(new ItemHFModelClass(R.drawable.home_theatre, "₹8,000", "Home Theatre"));
            }
        }
        return categoryItemList_3;
    }

    public static List<ItemHFModelClass> getcategoryItemList_Item2() {
        List<ItemHFModelClass> categoryItemList_1 = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            if (i % 10 == 0) {
                categoryItemList_1.add(new ItemHFModelClass(R.drawable.air_conditioner, "₹20,000m/o", "Air Conditioner"));
            }
            if (i % 10 == 1) {
                categoryItemList_1.add(new ItemHFModelClass(R.drawable.semiautometic_washingmachine, "₹12,000m/o", "Semi Automatic"));
            }
            if (i % 10 == 2) {
                categoryItemList_1.add(new ItemHFModelClass(R.drawable.television, "₹14,400m/o", "Television"));
            }
            if (i % 10 == 3) {
                categoryItemList_1.add(new ItemHFModelClass(R.drawable.singledoor_refrigerator, "₹12,000m/o", "Singledoor"));
            }
            if (i % 10 == 4) {
                categoryItemList_1.add(new ItemHFModelClass(R.drawable.water_purifier, "₹8,000m/o", "Water Purifier"));
            }
            if (i % 10 == 5) {
                categoryItemList_1.add(new ItemHFModelClass(R.drawable.washing_machine, "₹25,000m/o.", "Fully Automatic"));
            }
            if (i % 10 == 6) {
                categoryItemList_1.add(new ItemHFModelClass(R.drawable.microwave, "₹6,000m/o", "Micro Wave"));
            }
            if (i % 10 == 7) {
                categoryItemList_1.add(new ItemHFModelClass(R.drawable.refrigerator, "₹28,999m/o", "Refrigerator"));
            }
            if (i % 10 == 8) {
                categoryItemList_1.add(new ItemHFModelClass(R.drawable.air_coolers, "₹12,000m/o", "Air Coolers"));
            }
            if (i % 10 == 9) {
                categoryItemList_1.add(new ItemHFModelClass(R.drawable.led_tv, "₹12,000m/o", "LED Tv"));
            }
        }
        return categoryItemList_1;
    }

    public static List<ItemHFModelClass> getcategoryItemList_Item3() {
        List<ItemHFModelClass> categoryItemList_2 = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            if (i % 6 == 0) {
                categoryItemList_2.add(new ItemHFModelClass(R.drawable.bed, "₹20,000m/o", "Bed"));
            }
            if (i % 6 == 1) {
                categoryItemList_2.add(new ItemHFModelClass(R.drawable.sofa_table, "₹25,000m/o", "Sofa"));
            }
            if (i % 6 == 2) {
                categoryItemList_2.add(new ItemHFModelClass(R.drawable.poise_queen_bed, "₹14,400m/o", "Poise Queen"));
            }
            if (i % 6 == 3) {
                categoryItemList_2.add(new ItemHFModelClass(R.drawable.diner_table, "₹14,400m/o", "Dinner Table"));
            }
            if (i % 6 == 4) {
                categoryItemList_2.add(new ItemHFModelClass(R.drawable.study_table, "₹8,000m/o", "Study Table"));
            }
            if (i % 6 == 5) {
                categoryItemList_2.add(new ItemHFModelClass(R.drawable.atticus_single_bed, "₹8,000m/o", "Attics Single"));
            }

        }
        return categoryItemList_2;
    }

    public static List<PackageItem> getPackageList1() {
        List<PackageItem> packageItemList_1 = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            if (i % 10 == 0) {
                packageItemList_1.add(new PackageItem(R.drawable.air_cooler, "Air Coolers", "3 Products"));
            }
            if (i % 10 == 1) {
                packageItemList_1.add(new PackageItem(R.drawable.fully_autometic, "Fully Auto..", "2 Products"));
            }
            if (i % 10 == 2) {
                packageItemList_1.add(new PackageItem(R.drawable.television, "Television", "5 Products"));
            }
            if (i % 10 == 3) {
                packageItemList_1.add(new PackageItem(R.drawable.refrigerator, "Refrigerator", "4 Products"));
            }
            if (i % 10 == 4) {
                packageItemList_1.add(new PackageItem(R.drawable.water_purifier, "Water Purifier", "3 Products"));
            }
            if (i % 10 == 5) {
                packageItemList_1.add(new PackageItem(R.drawable.washing_machine, "Fully Autometic..", "1 Products"));
            }
            if (i % 10 == 6) {
                packageItemList_1.add(new PackageItem(R.drawable.microwave, "Micro Wave", "2 Products"));
            }
            if (i % 10 == 7) {
                packageItemList_1.add(new PackageItem(R.drawable.singledoor_refrigerator, "Singledoor...", "1 Products"));
            }
            if (i % 10 == 8) {
                packageItemList_1.add(new PackageItem(R.drawable.air_coolers, "Air Coolers", "3 Products"));
            }
            if (i % 10 == 9) {
                packageItemList_1.add(new PackageItem(R.drawable.led_tv, "LED Tv", "2 Products"));
            }
        }
        return packageItemList_1;
    }

    public static List<PackageItem> getPackageList2() {
        List<PackageItem> packageItemList_1 = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            if (i % 6 == 0) {
                packageItemList_1.add(new PackageItem(R.drawable.mobile, "Smartphones", "10 Products"));
            }
            if (i % 6 == 1) {
                packageItemList_1.add(new PackageItem(R.drawable.bluetooth_speaker, "Smart Devic..", "2 Products"));
            }
            if (i % 6 == 2) {
                packageItemList_1.add(new PackageItem(R.drawable.laptop, "Laptops", "7 Products"));
            }
            if (i % 6 == 3) {
                packageItemList_1.add(new PackageItem(R.drawable.television, "LED TV", "4 Products"));
            }
            if (i % 6 == 4) {
                packageItemList_1.add(new PackageItem(R.drawable.electric_iron, "Electric Ir..", "2 Products"));
            }
            if (i % 6 == 5) {
                packageItemList_1.add(new PackageItem(R.drawable.home_theatre, "Home Thea..", "5 Products"));
            }
        }
        return packageItemList_1;
    }

    public static List<PackageItem> getPackageList3() {
        List<PackageItem> packageItemList_1 = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            if (i % 4 == 0) {
                packageItemList_1.add(new PackageItem(R.drawable.treadmills, "Treadmills", "5 Products"));
            }
            if (i % 4 == 1) {
                packageItemList_1.add(new PackageItem(R.drawable.cross_trainers, "Cross Trainer", "8 Products"));
            }
            if (i % 4 == 2) {
                packageItemList_1.add(new PackageItem(R.drawable.exercise_bikes, "Exercise Bikes", "4 Products"));
            }
            if (i % 4 == 3) {
                packageItemList_1.add(new PackageItem(R.drawable.massager, "Massagers", "1 Products"));
            }
        }
        return packageItemList_1;
    }

    public static List<PackageItem> getPackageList4() {
        List<PackageItem> packageItemList_1 = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            if (i % 6 == 0) {
                packageItemList_1.add(new PackageItem(R.drawable.sofa_table, "Sofa & Table", "8 Products"));
            }
            if (i % 6 == 1) {
                packageItemList_1.add(new PackageItem(R.drawable.home_decoration, "Room Decoration", "3 Products"));
            }
            if (i % 6 == 2) {
                packageItemList_1.add(new PackageItem(R.drawable.book_shelf, "Book Shelf", "5 Products"));
            }
            if (i % 6 == 3) {
                packageItemList_1.add(new PackageItem(R.drawable.shelf, "Shoe Shelf", "3 Products"));
            }
            if (i % 6 == 4) {
                packageItemList_1.add(new PackageItem(R.drawable.study_table, "Study Table Combo", "10 Products"));
            }
            if (i % 6 == 5) {
                packageItemList_1.add(new PackageItem(R.drawable.bed_package, "Bed Package", "13 Products"));
            }
        }
        return packageItemList_1;
    }

    public static List<ExplorePackageModel> getExplorePackageModelList1() {
        List<ExplorePackageModel> explorePackageModelList_1 = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            if (i % 5 == 0) {
                explorePackageModelList_1.add(new ExplorePackageModel(R.drawable.almera, "Almirah", "Rs 1208/mo", "5 Items"));
            }
            if (i % 5 == 1) {
                explorePackageModelList_1.add(new ExplorePackageModel(R.drawable.bed, "Magnum Queen Master", "Rs 1000/mo", "3 Items"));
            }
            if (i % 5 == 2) {
                explorePackageModelList_1.add(new ExplorePackageModel(R.drawable.shelf, "Sofa", "Rs 700/mo", "2 Items"));
            }
            if (i % 5 == 3) {
                explorePackageModelList_1.add(new ExplorePackageModel(R.drawable.bedthree, "Napstar Single Bed", "Rs 570/mo", "8 Items"));
            }
            if (i % 5 == 4) {
                explorePackageModelList_1.add(new ExplorePackageModel(R.drawable.shelf, "Shue Self", "Rs 331/mo", "2 Items"));
            }

        }
        return explorePackageModelList_1;
    }

    public static List<ExplorePackageModel> getExplorePackageModelList2() {
        List<ExplorePackageModel> explorePackageModelList_2 = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            if (i % 5 == 0) {
                explorePackageModelList_2.add(new ExplorePackageModel(R.drawable.study_table, "Study Table", "Rs 1208/mo", "5 Items"));
            }
            if (i % 5 == 1) {
                explorePackageModelList_2.add(new ExplorePackageModel(R.drawable.book_shelf, "Book Shelf", "Rs 700/mo", "3 Items"));
            }
            if (i % 5 == 2) {
                explorePackageModelList_2.add(new ExplorePackageModel(R.drawable.package_study_table, "Study Table", "Rs 700/mo", "3 Items"));
            }
            if (i % 5 == 3) {
                explorePackageModelList_2.add(new ExplorePackageModel(R.drawable.almirah, "Living Room Basics", "Rs 700/mo", "3 Items"));
            }
            if (i % 5 == 4) {
                explorePackageModelList_2.add(new ExplorePackageModel(R.drawable.almerafour, "Almirah", "Rs 700/mo", "3 Items"));
            }

        }
        return explorePackageModelList_2;
    }

    public static List<ExplorePackageModel> getExplorePackageModelList3() {
        List<ExplorePackageModel> explorePackageModelList_3 = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            if (i % 5 == 0) {
                explorePackageModelList_3.add(new ExplorePackageModel(R.drawable.refrigerator, "Refrigerator", "Rs 1208/mo", "5 Items"));
            }
            if (i % 5 == 1) {
                explorePackageModelList_3.add(new ExplorePackageModel(R.drawable.washingmachine, "Washing Machine", "Rs 700/mo", "3 Items"));
            }
            if (i % 5 == 2) {
                explorePackageModelList_3.add(new ExplorePackageModel(R.drawable.air_cooler, "Air Coolers", "Rs 700/mo", "3 Items"));
            }
            if (i % 5 == 3) {
                explorePackageModelList_3.add(new ExplorePackageModel(R.drawable.microwave, "Microwave", "Rs 700/mo", "3 Items"));
            }
            if (i % 5 == 4) {
                explorePackageModelList_3.add(new ExplorePackageModel(R.drawable.singledoor_refrigerator, "Refrigerator", "Rs 700/mo", "3 Items"));
            }

        }
        return explorePackageModelList_3;
    }

    public static List<ExplorePackageModel> getExplorePackageModelList4() {
        List<ExplorePackageModel> explorePackageModelList_4 = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                explorePackageModelList_4.add(new ExplorePackageModel(R.drawable.package_study_table, "Study Table", "Rs 1208/mo", "5 Items"));
            }
            if (i % 3 == 1) {
                explorePackageModelList_4.add(new ExplorePackageModel(R.drawable.chair, "Chair", "Rs 400/mo", "9 Items"));
            }
            if (i % 3 == 2) {
                explorePackageModelList_4.add(new ExplorePackageModel(R.drawable.book_shelf, "BOOK Shelf", "Rs 700/mo", "3 Items"));
            }

        }
        return explorePackageModelList_4;
    }

    public static List<ExplorePackageModel> getExplorePackageModelList5() {
        List<ExplorePackageModel> explorePackageModelList_5 = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            if (i % 2 == 0) {
                explorePackageModelList_5.add(new ExplorePackageModel(R.drawable.kitchen_appliances, "Kitchen Appliance", "Rs 1208/mo", "5 Items"));
            }
            if (i % 2 == 1) {
                explorePackageModelList_5.add(new ExplorePackageModel(R.drawable.sofa_table, "Sofa", "Rs 700/mo", "3 Items"));
            }

        }
        return explorePackageModelList_5;
    }


    public static List<ExplorePackageModel> getExplorePackageModelList6() {
        List<ExplorePackageModel> explorePackageModelList_6 = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            if (i % 2 == 0) {
                explorePackageModelList_6.add(new ExplorePackageModel(R.drawable.television, "Television", "Rs 1208/mo", "5 Items"));
            }
            if (i % 2 == 1) {
                explorePackageModelList_6.add(new ExplorePackageModel(R.drawable.tablet, "Tablet", "Rs 700/mo", "3 Items"));
            }

        }
        return explorePackageModelList_6;
    }

    public static List<ExplorePackageModel> getExplorePackageModelList7() {
        List<ExplorePackageModel> explorePackageModelList_7 = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            if (i % 3 == 0) {
                explorePackageModelList_7.add(new ExplorePackageModel(R.drawable.treadmills, "Treadmills", "Rs 1208/mo", "5 Items"));
            }
            if (i % 3 == 1) {
                explorePackageModelList_7.add(new ExplorePackageModel(R.drawable.exercise_bikes, "Exercise Bike", "Rs 700/mo", "3 Items"));
            }
            if (i % 3 == 2) {
                explorePackageModelList_7.add(new ExplorePackageModel(R.drawable.cross_trainer, "Cross Trainer", "Rs 500/mo", "3 Items"));
            }

        }
        return explorePackageModelList_7;
    }

    public static List<ExplorePackageModel> getExplorePackageModelList8() {
        List<ExplorePackageModel> explorePackageModelList_8 = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            if (i % 2 == 0) {
                explorePackageModelList_8.add(new ExplorePackageModel(R.drawable.almera, "Almira", "Rs 1208/mo", "5 Items"));
            }
            if (i % 2 == 1) {
                explorePackageModelList_8.add(new ExplorePackageModel(R.drawable.sofa_table, "Sofa", "Rs 700/mo", "3 Items"));
            }

        }
        return explorePackageModelList_8;
    }

    public static List<ExplorePackageModel> getExplorePackageModelList9() {
        List<ExplorePackageModel> explorePackageModelList_9 = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            if (i % 2 == 0) {
                explorePackageModelList_9.add(new ExplorePackageModel(R.drawable.almera, "Almirah", "Rs 1208/mo", "5 Items"));
            }

            if (i % 2 == 1) {
                explorePackageModelList_9.add(new ExplorePackageModel(R.drawable.sofa_table, "Sofa", "Rs 700/mo", "3 Items"));
            }

        }
        return explorePackageModelList_9;
    }

    public static List<ExplorePackageModel> getExplorePackageModelList10() {
        List<ExplorePackageModel> explorePackageModelList_10 = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            if (i % 2 == 0) {
                explorePackageModelList_10.add(new ExplorePackageModel(R.drawable.almera, "Almirah", "Rs 1208/mo", "5 Items"));
            }
            if (i % 2 == 1) {
                explorePackageModelList_10.add(new ExplorePackageModel(R.drawable.sofa_table, "Sofa", "Rs 700/mo", "3 Items"));
            }

        }
        return explorePackageModelList_10;
    }

}
