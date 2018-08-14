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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImagesResponse  extends AbstractModel{

    /**
    * 一个关于镜像详细信息的结构体，主要包括镜像的主要状态与属性。
    */
    @SerializedName("ImageSet")
    @Expose
    private Image [] ImageSet;

    /**
    * 符合要求的镜像数量。
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取一个关于镜像详细信息的结构体，主要包括镜像的主要状态与属性。
     * @return ImageSet 一个关于镜像详细信息的结构体，主要包括镜像的主要状态与属性。
     */
    public Image [] getImageSet() {
        return this.ImageSet;
    }

    /**
     * 设置一个关于镜像详细信息的结构体，主要包括镜像的主要状态与属性。
     * @param ImageSet 一个关于镜像详细信息的结构体，主要包括镜像的主要状态与属性。
     */
    public void setImageSet(Image [] ImageSet) {
        this.ImageSet = ImageSet;
    }

    /**
     * 获取符合要求的镜像数量。
     * @return TotalCount 符合要求的镜像数量。
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置符合要求的镜像数量。
     * @param TotalCount 符合要求的镜像数量。
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @return RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @param RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ImageSet.", this.ImageSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

