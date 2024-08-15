/**
 * Copyright (2024) Bytedance Ltd. and/or its affiliates 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License. 
 */

package com.meego.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.meego.demo.entity.base.BaseEntity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * gitlab节点/状态映射表
 * </p>
 *
 * @author meego
 * @since 2024-07-29
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("gitlab_template_state_mapping")
public class GitlabTemplateStateMapping extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 关联的配置主键id
     */
    private Long configId;

    /**
     * 分组id
     */
    private String groupId;

    /**
     * 事件类型
     */
    private String eventType;

    /**
     * 流转状态/节点key
     */
    private String targetKey;

    /**
     * 节点名称
     */
    private String name;

    /**
     * 流转卡点key
     */
    private String signalKey;

    /**
     * 管控级别
     */
    private Integer controlLevel;

    private String projectKey;
	
}