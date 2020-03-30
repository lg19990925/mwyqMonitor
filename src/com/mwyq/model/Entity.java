package com.mwyq.model;

public class Entity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entity.entity_id
     *
     * @mbggenerated
     */
    private Integer entity_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entity.entity_type
     *
     * @mbggenerated
     */
    private String entity_type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entity.entity_key
     *
     * @mbggenerated
     */
    private String entity_key;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entity.lang_type
     *
     * @mbggenerated
     */
    private String lang_type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entity.count
     *
     * @mbggenerated
     */
    private Integer count;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column entity.entity_id
     *
     * @return the value of entity.entity_id
     *
     * @mbggenerated
     */
    public Integer getEntity_id() {
        return entity_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column entity.entity_id
     *
     * @param entity_id the value for entity.entity_id
     *
     * @mbggenerated
     */
    public void setEntity_id(Integer entity_id) {
        this.entity_id = entity_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column entity.entity_type
     *
     * @return the value of entity.entity_type
     *
     * @mbggenerated
     */
    public String getEntity_type() {
        return entity_type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column entity.entity_type
     *
     * @param entity_type the value for entity.entity_type
     *
     * @mbggenerated
     */
    public void setEntity_type(String entity_type) {
        this.entity_type = entity_type == null ? null : entity_type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column entity.entity_key
     *
     * @return the value of entity.entity_key
     *
     * @mbggenerated
     */
    public String getEntity_key() {
        return entity_key;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column entity.entity_key
     *
     * @param entity_key the value for entity.entity_key
     *
     * @mbggenerated
     */
    public void setEntity_key(String entity_key) {
        this.entity_key = entity_key == null ? null : entity_key.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column entity.lang_type
     *
     * @return the value of entity.lang_type
     *
     * @mbggenerated
     */
    public String getLang_type() {
        return lang_type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column entity.lang_type
     *
     * @param lang_type the value for entity.lang_type
     *
     * @mbggenerated
     */
    public void setLang_type(String lang_type) {
        this.lang_type = lang_type == null ? null : lang_type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column entity.count
     *
     * @return the value of entity.count
     *
     * @mbggenerated
     */
    public Integer getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column entity.count
     *
     * @param count the value for entity.count
     *
     * @mbggenerated
     */
    public void setCount(Integer count) {
        this.count = count;
    }
}