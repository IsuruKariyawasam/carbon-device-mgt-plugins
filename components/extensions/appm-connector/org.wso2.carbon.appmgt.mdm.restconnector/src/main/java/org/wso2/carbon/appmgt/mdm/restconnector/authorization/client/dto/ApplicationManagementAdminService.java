/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.carbon.appmgt.mdm.restconnector.authorization.client.dto;


import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/admin/applications")

/**
 * This interface provided the definition of the application management service.
 */
public interface ApplicationManagementAdminService {

    /**
     * Install application.
     *
     * @param applicationWrapper {@link ApplicationWrapper} object
     * @return {@link Activity} object
     */
    @POST
    @Path("/install-application")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    Activity installApplication(ApplicationWrapper applicationWrapper);

    /**
     * Uninstall application.
     *
     * @param applicationWrapper {@link ApplicationWrapper} object
     * @return {@link Activity} object
     */
    @POST
    @Path("/uninstall-application")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    Activity uninstallApplication(ApplicationWrapper applicationWrapper);
}