package com.shop.diamond.general;

import com.shop.diamond.item.entities.Brand;
import com.shop.diamond.item.entities.Item;
import com.shop.diamond.item.services.ItemService;
import com.shop.diamond.user.entities.TestUser;
import com.shop.diamond.user.entities.User;
import com.shop.diamond.user.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Initializer {
    private static final Logger LOG = LoggerFactory.getLogger(Initializer.class);

    public ItemService itemService;
    public UserService userService;

    @Autowired
    public Initializer(ItemService itemService, UserService userService) {
        this.itemService = itemService;
        this.userService = userService;
        setupDemoItems();
        setupDemoUsers();
    }

    public void setupDemoItems(){
        LOG.info("Setup demo Items");

        itemService.save(new Item(50L, " Sexy Blazer mit Hose ", "images/shop/ensemble.jpg",
                "HOSE AUS REINER SEIDE MIT HOHEM BUND. ABGESETZTER STOFF IM GLEICHEN FARBTON AN DER VORDERSEITE. WEITES BEIN. MIT PATTE VERDECKTE KNOPFLEISTE VORNE.",
                20L, false , Brand.Damen));
        itemService.save(new Item(25L, "Herbst Neueste Kleid Sets Elegante Mode", "images/shop/robe.jpg",
                "HOSE AUS REINER SEIDE MIT HOHEM BUND. ABGESETZTER STOFF IM GLEICHEN FARBTON AN DER VORDERSEITE. WEITES BEIN. MIT PATTE VERDECKTE KNOPFLEISTE VORNE.",
                20L, false , Brand.Damen));
        itemService.save(new Item(30L, "Night Dress", "images/shop/sexy.jpg",
                "HOSE AUS REINER SEIDE MIT HOHEM BUND. ABGESETZTER STOFF IM GLEICHEN FARBTON AN DER VORDERSEITE. WEITES BEIN. MIT PATTE VERDECKTE KNOPFLEISTE VORNE.",
                20L, true , Brand.Damen));
        itemService.save(new Item(35L, "sexy Damen zweiteiler set Blaser", "images/shop/beauty.jpg",
                "Shalom.", 20L, false , Brand.Damen));
        itemService.save(new Item(20L, " Hellblauer Wide Leg Jeans mit hoher Taille ", "images/shop/pant.jpg",
                "HOSE AUS REINER SEIDE MIT HOHEM BUND. ABGESETZTER STOFF IM GLEICHEN FARBTON AN DER VORDERSEITE. WEITES BEIN. MIT PATTE VERDECKTE KNOPFLEISTE VORNE.",
                20L, false , Brand.Damen));
        itemService.save(new Item(75L, "BlueBlack Men's Lorenzo Anzug (Hose / Mantel) ", "images/shop/costume.jpg",
                "HOSE AUS REINER SEIDE MIT HOHEM BUND. ABGESETZTER STOFF IM GLEICHEN FARBTON AN DER VORDERSEITE. WEITES BEIN. MIT PATTE VERDECKTE KNOPFLEISTE VORNE.",
                20L, true , Brand.Herren));
        itemService.save(new Item(19L, "Easy Polo Black Edition", "images/shop/tshirt.jpg",
                "HOSE AUS REINER SEIDE MIT HOHEM BUND. ABGESETZTER STOFF IM GLEICHEN FARBTON AN DER VORDERSEITE. WEITES BEIN. MIT PATTE VERDECKTE KNOPFLEISTE VORNE.",
                20L, true , Brand.Herren));
        itemService.save(new Item(40L, "Männer Blazer Modern Freizeit", "images/shop/veste.jpg",
                "HOSE AUS REINER SEIDE MIT HOHEM BUND. ABGESETZTER STOFF IM GLEICHEN FARBTON AN DER VORDERSEITE. WEITES BEIN. MIT PATTE VERDECKTE KNOPFLEISTE VORNE.",
                20L, true , Brand.Herren));
        itemService.save(new Item(20L, "Männer Hemd Freizeit", "images/shop/chemise.jpg",
                "HOSE AUS REINER SEIDE MIT HOHEM BUND. ABGESETZTER STOFF IM GLEICHEN FARBTON AN DER VORDERSEITE. WEITES BEIN. MIT PATTE VERDECKTE KNOPFLEISTE VORNE.",
                20L, true , Brand.Herren));
        itemService.save(new Item(20L, "Schick Männer Hemd Freizeit", "images/shop/chemise.jpg",
                "HOSE AUS REINER SEIDE MIT HOHEM BUND. ABGESETZTER STOFF IM GLEICHEN FARBTON AN DER VORDERSEITE. WEITES BEIN. MIT PATTE VERDECKTE KNOPFLEISTE VORNE.",
                20L, true , Brand.Herren));
        itemService.save(new Item(35L, "dress kind Edition", "images/shop/enfant.jpg",
                "HOSE AUS REINER SEIDE MIT HOHEM BUND. ABGESETZTER STOFF IM GLEICHEN FARBTON AN DER VORDERSEITE. WEITES BEIN. MIT PATTE VERDECKTE KNOPFLEISTE VORNE.",
                20L, false , Brand.Kinder));
        itemService.save(new Item(48L, "zweiteil kinder", "images/shop/enfant1.jpg",
                "HOSE AUS REINER SEIDE MIT HOHEM BUND. ABGESETZTER STOFF IM GLEICHEN FARBTON AN DER VORDERSEITE. WEITES BEIN. MIT PATTE VERDECKTE KNOPFLEISTE VORNE.",
                20L, false , Brand.Kinder));
        itemService.save(new Item(59L, "Zweiteil kind", "images/shop/enfant2.jpg",
                "HOSE AUS REINER SEIDE MIT HOHEM BUND. ABGESETZTER STOFF IM GLEICHEN FARBTON AN DER VORDERSEITE. WEITES BEIN. MIT PATTE VERDECKTE KNOPFLEISTE VORNE.",
                20L, true , Brand.Kinder));
        itemService.save(new Item(25L, "mädschen zweiteil", "images/shop/enfant3.jpg",
                "HOSE AUS REINER SEIDE MIT HOHEM BUND. ABGESETZTER STOFF IM GLEICHEN FARBTON AN DER VORDERSEITE. WEITES BEIN. MIT PATTE VERDECKTE KNOPFLEISTE VORNE.",
                20L, false , Brand.Kinder));

        itemService.save(new Item(49L, "Komplett bedrucktes figurbetontes Kleid mit Daumenloch ", "images/shop/dress.jpg",
                "HOSE AUS REINER SEIDE MIT HOHEM BUND. ABGESETZTER STOFF IM GLEICHEN FARBTON AN DER VORDERSEITE. WEITES BEIN. MIT PATTE VERDECKTE KNOPFLEISTE VORNE.",
                20L, true , Brand.Damen));
        itemService.save(new Item(22L, "Cool & Sexy Frauen Schwarz-Pudra Asymmetrischer Rock LV81 ", "images/shop/jupe.jpg",
                "HOSE AUS REINER SEIDE MIT HOHEM BUND. ABGESETZTER STOFF IM GLEICHEN FARBTON AN DER VORDERSEITE. WEITES BEIN. MIT PATTE VERDECKTE KNOPFLEISTE VORNE.",
                20L, false , Brand.Damen));
        itemService.save(new Item(40L, "Sweatschirt Black Edition", "images/shop/pull.jpg",
                "HOSE AUS REINER SEIDE MIT HOHEM BUND. ABGESETZTER STOFF IM GLEICHEN FARBTON AN DER VORDERSEITE. WEITES BEIN. MIT PATTE VERDECKTE KNOPFLEISTE VORNE.",
                20L, true , Brand.Herren));

    }

    public void setupDemoUsers(){

        LOG.info("Creating default Users.");

        User user;
        for (TestUser testUser : TestUser.values()) {
            user = new User(testUser.firstName , testUser.lastName , testUser.email ,
                    testUser.password , testUser.grantedAuthorities);

            userService.generateAndSaveNewValidationTokenForUser(user);
            userService.rehashPassword(testUser.password , user);
        }
    }
}

