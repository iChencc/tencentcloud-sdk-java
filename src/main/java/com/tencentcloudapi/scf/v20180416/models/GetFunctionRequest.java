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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetFunctionRequest  extends AbstractModel{

    /**
    * 需要获取详情的函数名称
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * 函数的版本号
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
    * 是否显示代码, TRUE表示显示代码，FALSE表示不显示代码,大于1M的入口文件不会显示
    */
    @SerializedName("ShowCode")
    @Expose
    private String ShowCode;

    /**
     * 获取需要获取详情的函数名称
     * @return FunctionName 需要获取详情的函数名称
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * 设置需要获取详情的函数名称
     * @param FunctionName 需要获取详情的函数名称
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * 获取函数的版本号
     * @return Qualifier 函数的版本号
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * 设置函数的版本号
     * @param Qualifier 函数的版本号
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    /**
     * 获取是否显示代码, TRUE表示显示代码，FALSE表示不显示代码,大于1M的入口文件不会显示
     * @return ShowCode 是否显示代码, TRUE表示显示代码，FALSE表示不显示代码,大于1M的入口文件不会显示
     */
    public String getShowCode() {
        return this.ShowCode;
    }

    /**
     * 设置是否显示代码, TRUE表示显示代码，FALSE表示不显示代码,大于1M的入口文件不会显示
     * @param ShowCode 是否显示代码, TRUE表示显示代码，FALSE表示不显示代码,大于1M的入口文件不会显示
     */
    public void setShowCode(String ShowCode) {
        this.ShowCode = ShowCode;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);
        this.setParamSimple(map, prefix + "ShowCode", this.ShowCode);

    }
}

