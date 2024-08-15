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
 * gitlab代码分支表
 * </p>
 *
 * @author meego
 * @since 2024-08-02
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("gitlab_code_branch")
public class GitlabCodeBranch extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 空间Key
     */
    private String projectKey;

    /**
     * 工作项ID
     */
    private Long workItemId;

    /**
     * 关联标志符
     */
    private String identifier;

    /**
     * 关联信息
     */
    private String binding;

    /**
     * 关联类型
     */
    private Integer bindingType;

    /**
     * 仓库路径
     */
    private String pathWithNamespace;
}