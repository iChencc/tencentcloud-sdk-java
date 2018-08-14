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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTaskTemplateRequest  extends AbstractModel{

    /**
    * 任务模板名称
    */
    @SerializedName("TaskTemplateName")
    @Expose
    private String TaskTemplateName;

    /**
    * 任务模板内容，参数要求与任务一致
    */
    @SerializedName("TaskTemplateInfo")
    @Expose
    private Task TaskTemplateInfo;

    /**
    * 任务模板描述
    */
    @SerializedName("TaskTemplateDescription")
    @Expose
    private String TaskTemplateDescription;

    /**
     * 获取任务模板名称
     * @return TaskTemplateName 任务模板名称
     */
    public String getTaskTemplateName() {
        return this.TaskTemplateName;
    }

    /**
     * 设置任务模板名称
     * @param TaskTemplateName 任务模板名称
     */
    public void setTaskTemplateName(String TaskTemplateName) {
        this.TaskTemplateName = TaskTemplateName;
    }

    /**
     * 获取任务模板内容，参数要求与任务一致
     * @return TaskTemplateInfo 任务模板内容，参数要求与任务一致
     */
    public Task getTaskTemplateInfo() {
        return this.TaskTemplateInfo;
    }

    /**
     * 设置任务模板内容，参数要求与任务一致
     * @param TaskTemplateInfo 任务模板内容，参数要求与任务一致
     */
    public void setTaskTemplateInfo(Task TaskTemplateInfo) {
        this.TaskTemplateInfo = TaskTemplateInfo;
    }

    /**
     * 获取任务模板描述
     * @return TaskTemplateDescription 任务模板描述
     */
    public String getTaskTemplateDescription() {
        return this.TaskTemplateDescription;
    }

    /**
     * 设置任务模板描述
     * @param TaskTemplateDescription 任务模板描述
     */
    public void setTaskTemplateDescription(String TaskTemplateDescription) {
        this.TaskTemplateDescription = TaskTemplateDescription;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskTemplateName", this.TaskTemplateName);
        this.setParamObj(map, prefix + "TaskTemplateInfo.", this.TaskTemplateInfo);
        this.setParamSimple(map, prefix + "TaskTemplateDescription", this.TaskTemplateDescription);

    }
}

