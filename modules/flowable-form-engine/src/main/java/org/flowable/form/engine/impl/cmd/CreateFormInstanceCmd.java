/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.flowable.form.engine.impl.cmd;

import java.io.Serializable;
import java.util.Map;

import org.flowable.form.engine.FormEngineConfiguration;
import org.flowable.form.engine.impl.persistence.entity.FormInstanceEntity;
import org.flowable.form.model.FormModel;

/**
 * @author Tijs Rademakers
 */
public class CreateFormInstanceCmd extends SaveFormInstanceCmd implements Serializable {

    private static final long serialVersionUID = 1L;

    public CreateFormInstanceCmd(FormModel formModel, Map<String, Object> variables, String taskId, String processInstanceId) {
        super(formModel, variables, taskId, processInstanceId);
    }

    @Override
    protected FormInstanceEntity findExistingFormInstance(FormEngineConfiguration formEngineConfiguration) {
        // We always want to create a formInstance.
        return null;
    }

}