/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

import java.math.BigDecimal;

/**
 *
 * @author Sasha
 */
public class Meal {
    
    /** meal id */
    private int id;
    
    /** meal type */
    private MealType type;
    
    /** meal name */
    private String name;
    
    /** meal description */
    private String description;
    
    /** money variable */
    private BigDecimal price;

    /**
     * Default constructor
     */
    public Meal() {}
    
    /**
     * Constructor
     * @param id meal id
     * @param type meal type
     * @param name meal name
     * @param description meal description 
     * @param price meal price
     */
    public Meal(int id, String type, String name, String description, BigDecimal price) {
        this.id = id;
        setType(type);
        this.name = name;
        this.description = description;
        this.price = price;
    }

    /**
     * Get meal id
     * @return meal id
     */
    public int getId() {
        return id;
    }

    /**
     * Get meal type
     * @return 
     */
    public MealType getType() {
        return type;
    }
    
    public String getTypeString() {
        switch (type) {
            case EXPRESS_LUNCH:
                return "Express Lunch";
            case DESSERT:
                return "Dessert";
            case BEVERAGE:
                return "Beverage";
            case BOTTLE_BEER:
                return "Bottled Beer"; 
            default: 
                return null;
        }
    }
    
    /**
     * get meal name
     * @return meal name
     */
    public String getName() {
        return name;
    }

    /**
     * Get meal description 
     * @return meal description
     */
    public String getDescription() {
        return description;
    }

    /**
     * get meal price
     * @return meal price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Set meal id
     * @param id meal id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Set meal type
     * @param type meal type
     */
    public void setType(MealType type) {
        this.type = type;
    }

    /**
     * Set meal type
     * @param typeString meal type as string variable
     */
    public final void setType(String typeString) {
        switch (typeString) {
            case "Express Lunch":
                this.type = MealType.EXPRESS_LUNCH;
                break;
            case "Dessert":
                this.type = MealType.DESSERT;
                break;
            case "Beverage":
                this.type = MealType.BEVERAGE;
                break;
            case "Bottled Beer":
                this.type = MealType.BOTTLE_BEER;
                break;   
        }
    }
    
    /**
     * Set meal name
     * @param name meal name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set meal description
     * @param description meal description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Set meal price
     * @param price meal price
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    
    /**
     * Class of the meal type
     */
    public enum MealType {
        EXPRESS_LUNCH, DESSERT, BEVERAGE, BOTTLE_BEER
    }
}