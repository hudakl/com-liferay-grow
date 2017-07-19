/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.social.activity.customizer.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.social.activity.customizer.model.CustomSocialActivitySet;
import com.liferay.social.activity.customizer.service.CustomSocialActivitySetLocalServiceUtil;

/**
 * The extended model base implementation for the CustomSocialActivitySet service. Represents a row in the &quot;sac_CustomSocialActivitySet&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CustomSocialActivitySetImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CustomSocialActivitySetImpl
 * @see CustomSocialActivitySet
 * @generated
 */
@ProviderType
public abstract class CustomSocialActivitySetBaseImpl
	extends CustomSocialActivitySetModelImpl implements CustomSocialActivitySet {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a custom social activity set model instance should use the {@link CustomSocialActivitySet} interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			CustomSocialActivitySetLocalServiceUtil.addCustomSocialActivitySet(this);
		}
		else {
			CustomSocialActivitySetLocalServiceUtil.updateCustomSocialActivitySet(this);
		}
	}
}