package com.yuki.decmarket.mapper;

import com.yuki.decmarket.model.Transactions;
import com.yuki.decmarket.model.TransactionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransactionsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transactions
     *
     * @mbggenerated Mon Jul 16 16:46:29 CST 2018
     */
    int countByExample(TransactionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transactions
     *
     * @mbggenerated Mon Jul 16 16:46:29 CST 2018
     */
    int deleteByExample(TransactionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transactions
     *
     * @mbggenerated Mon Jul 16 16:46:29 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transactions
     *
     * @mbggenerated Mon Jul 16 16:46:29 CST 2018
     */
    int insert(Transactions record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transactions
     *
     * @mbggenerated Mon Jul 16 16:46:29 CST 2018
     */
    int insertSelective(Transactions record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transactions
     *
     * @mbggenerated Mon Jul 16 16:46:29 CST 2018
     */
    List<Transactions> selectByExampleWithBLOBs(TransactionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transactions
     *
     * @mbggenerated Mon Jul 16 16:46:29 CST 2018
     */
    List<Transactions> selectByExample(TransactionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transactions
     *
     * @mbggenerated Mon Jul 16 16:46:29 CST 2018
     */
    Transactions selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transactions
     *
     * @mbggenerated Mon Jul 16 16:46:29 CST 2018
     */
    int updateByExampleSelective(@Param("record") Transactions record, @Param("example") TransactionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transactions
     *
     * @mbggenerated Mon Jul 16 16:46:29 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") Transactions record, @Param("example") TransactionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transactions
     *
     * @mbggenerated Mon Jul 16 16:46:29 CST 2018
     */
    int updateByExample(@Param("record") Transactions record, @Param("example") TransactionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transactions
     *
     * @mbggenerated Mon Jul 16 16:46:29 CST 2018
     */
    int updateByPrimaryKeySelective(Transactions record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transactions
     *
     * @mbggenerated Mon Jul 16 16:46:29 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(Transactions record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transactions
     *
     * @mbggenerated Mon Jul 16 16:46:29 CST 2018
     */
    int updateByPrimaryKey(Transactions record);

    List<Transactions> getTransByBuyerID(int buyer_id);

    Transactions getTranByID(int tran_id);

    List<Transactions> getTransList();

    void delCommentByID(int tran_id);

    List<Transactions> getTransBySellerID(int seller_id);
}