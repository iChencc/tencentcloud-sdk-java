/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBSlowLogsRequest  extends AbstractModel{

    /**
    * 实例 ID，形如：tdsql-ow728lmc。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 从结果的第几条数据开始返回
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 返回的结果条数
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * 查询的起始时间，形如2016-07-23 14:55:20
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询的结束时间，形如2016-08-22 14:55:20
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 要查询的具体数据库名称
    */
    @SerializedName("Db")
    @Expose
    private String Db;

    /**
    * 排序指标，取值为query_time_sum或者query_count
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 排序类型，desc或者asc
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
     * 获取实例 ID，形如：tdsql-ow728lmc。
     * @return InstanceId 实例 ID，形如：tdsql-ow728lmc。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例 ID，形如：tdsql-ow728lmc。
     * @param InstanceId 实例 ID，形如：tdsql-ow728lmc。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取从结果的第几条数据开始返回
     * @return Offset 从结果的第几条数据开始返回
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置从结果的第几条数据开始返回
     * @param Offset 从结果的第几条数据开始返回
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取返回的结果条数
     * @return Limit 返回的结果条数
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置返回的结果条数
     * @param Limit 返回的结果条数
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取查询的起始时间，形如2016-07-23 14:55:20
     * @return StartTime 查询的起始时间，形如2016-07-23 14:55:20
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置查询的起始时间，形如2016-07-23 14:55:20
     * @param StartTime 查询的起始时间，形如2016-07-23 14:55:20
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取查询的结束时间，形如2016-08-22 14:55:20
     * @return EndTime 查询的结束时间，形如2016-08-22 14:55:20
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * 设置查询的结束时间，形如2016-08-22 14:55:20
     * @param EndTime 查询的结束时间，形如2016-08-22 14:55:20
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * 获取要查询的具体数据库名称
     * @return Db 要查询的具体数据库名称
     */
    public String getDb() {
        return this.Db;
    }

    /**
     * 设置要查询的具体数据库名称
     * @param Db 要查询的具体数据库名称
     */
    public void setDb(String Db) {
        this.Db = Db;
    }

    /**
     * 获取排序指标，取值为query_time_sum或者query_count
     * @return OrderBy 排序指标，取值为query_time_sum或者query_count
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * 设置排序指标，取值为query_time_sum或者query_count
     * @param OrderBy 排序指标，取值为query_time_sum或者query_count
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * 获取排序类型，desc或者asc
     * @return OrderByType 排序类型，desc或者asc
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * 设置排序类型，desc或者asc
     * @param OrderByType 排序类型，desc或者asc
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Db", this.Db);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);

    }
}

