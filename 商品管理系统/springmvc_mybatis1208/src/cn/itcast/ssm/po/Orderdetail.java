package cn.itcast.ssm.po;

public class Orderdetail {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORDERDETAIL.ID
     *
     * @mbggenerated Tue Dec 05 15:43:05 GMT+08:00 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORDERDETAIL.ORDERS_ID
     *
     * @mbggenerated Tue Dec 05 15:43:05 GMT+08:00 2017
     */
    private Integer ordersId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORDERDETAIL.ITEMS_ID
     *
     * @mbggenerated Tue Dec 05 15:43:05 GMT+08:00 2017
     */
    private Integer itemsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORDERDETAIL.ITEMS_NUM
     *
     * @mbggenerated Tue Dec 05 15:43:05 GMT+08:00 2017
     */
    private Integer itemsNum;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORDERDETAIL.ID
     *
     * @return the value of ORDERDETAIL.ID
     *
     * @mbggenerated Tue Dec 05 15:43:05 GMT+08:00 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORDERDETAIL.ID
     *
     * @param id the value for ORDERDETAIL.ID
     *
     * @mbggenerated Tue Dec 05 15:43:05 GMT+08:00 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORDERDETAIL.ORDERS_ID
     *
     * @return the value of ORDERDETAIL.ORDERS_ID
     *
     * @mbggenerated Tue Dec 05 15:43:05 GMT+08:00 2017
     */
    public Integer getOrdersId() {
        return ordersId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORDERDETAIL.ORDERS_ID
     *
     * @param ordersId the value for ORDERDETAIL.ORDERS_ID
     *
     * @mbggenerated Tue Dec 05 15:43:05 GMT+08:00 2017
     */
    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORDERDETAIL.ITEMS_ID
     *
     * @return the value of ORDERDETAIL.ITEMS_ID
     *
     * @mbggenerated Tue Dec 05 15:43:05 GMT+08:00 2017
     */
    public Integer getItemsId() {
        return itemsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORDERDETAIL.ITEMS_ID
     *
     * @param itemsId the value for ORDERDETAIL.ITEMS_ID
     *
     * @mbggenerated Tue Dec 05 15:43:05 GMT+08:00 2017
     */
    public void setItemsId(Integer itemsId) {
        this.itemsId = itemsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORDERDETAIL.ITEMS_NUM
     *
     * @return the value of ORDERDETAIL.ITEMS_NUM
     *
     * @mbggenerated Tue Dec 05 15:43:05 GMT+08:00 2017
     */
    public Integer getItemsNum() {
        return itemsNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORDERDETAIL.ITEMS_NUM
     *
     * @param itemsNum the value for ORDERDETAIL.ITEMS_NUM
     *
     * @mbggenerated Tue Dec 05 15:43:05 GMT+08:00 2017
     */
    public void setItemsNum(Integer itemsNum) {
        this.itemsNum = itemsNum;
    }
}