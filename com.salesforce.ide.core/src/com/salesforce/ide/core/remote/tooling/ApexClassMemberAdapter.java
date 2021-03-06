/*******************************************************************************
 * Copyright (c) 2015 Salesforce.com, inc..
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Salesforce.com, inc. - initial API and implementation
 ******************************************************************************/
package com.salesforce.ide.core.remote.tooling;

import com.salesforce.ide.core.model.Component;
import com.sforce.soap.tooling.sobject.MetadataContainer;

/**
 * Adapts an ApexClass component to a ApexClassMember for deployment.
 * 
 * @author nchen
 * 
 */
public class ApexClassMemberAdapter extends ContainerMemberAdapter {

    public ApexClassMemberAdapter(Component component, MetadataContainer container) {
        super(component, container);
    }

}
