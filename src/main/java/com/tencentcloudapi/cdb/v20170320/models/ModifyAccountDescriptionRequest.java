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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAccountDescriptionRequest  extends AbstractModel{

    /**
    * 实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 云数据库账号。
    */
    @SerializedName("Accounts")
    @Expose
    private Account [] Accounts;

    /**
    * 数据库账号的备注信息。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * 获取实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同。
     * @return InstanceId 实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同。
     * @param InstanceId 实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取云数据库账号。
     * @return Accounts 云数据库账号。
     */
    public Account [] getAccounts() {
        return this.Accounts;
    }

    /**
     * 设置云数据库账号。
     * @param Accounts 云数据库账号。
     */
    public void setAccounts(Account [] Accounts) {
        this.Accounts = Accounts;
    }

    /**
     * 获取数据库账号的备注信息。
     * @return Description 数据库账号的备注信息。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置数据库账号的备注信息。
     * @param Description 数据库账号的备注信息。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Accounts.", this.Accounts);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

