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

package com.liferay.social.activity.customizer.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the CustomSocialActivitySet service. Represents a row in the &quot;sac_CustomSocialActivitySet&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.social.activity.customizer.model.impl.CustomSocialActivitySetModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.social.activity.customizer.model.impl.CustomSocialActivitySetImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CustomSocialActivitySet
 * @see com.liferay.social.activity.customizer.model.impl.CustomSocialActivitySetImpl
 * @see com.liferay.social.activity.customizer.model.impl.CustomSocialActivitySetModelImpl
 * @generated
 */
@ProviderType
public interface CustomSocialActivitySetModel extends BaseModel<CustomSocialActivitySet> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a custom social activity set model instance should use the {@link CustomSocialActivitySet} interface instead.
	 */

	/**
	 * Returns the primary key of this custom social activity set.
	 *
	 * @return the primary key of this custom social activity set
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this custom social activity set.
	 *
	 * @param primaryKey the primary key of this custom social activity set
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this custom social activity set.
	 *
	 * @return the ID of this custom social activity set
	 */
	public long getId();

	/**
	 * Sets the ID of this custom social activity set.
	 *
	 * @param id the ID of this custom social activity set
	 */
	public void setId(long id);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(CustomSocialActivitySet customSocialActivitySet);

	@Override
	public int hashCode();

	@Override
	public CacheModel<CustomSocialActivitySet> toCacheModel();

	@Override
	public CustomSocialActivitySet toEscapedModel();

	@Override
	public CustomSocialActivitySet toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}