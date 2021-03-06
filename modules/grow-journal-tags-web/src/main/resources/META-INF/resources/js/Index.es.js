import {GrowVerticalTagsNav} from "grow-clay";
import React, { useMemo } from 'react';

const Component = (props) => {
  const spritemap = Liferay.ThemeDisplay.getPathThemeImages() + '/lexicon/icons.svg';

  const tags = useMemo(() => {
    let tags = [];

    props.data.items.map((tag) => {
      tags.push(tag.name)
    });

    return tags;
  }, [props.data.items]);

  return (
    <GrowVerticalTagsNav
	  items={tags}
      label="Tags"
      labelIcon="tag"
      spritemap={spritemap}
	  tagCount={9}
      tagLength={20}
    />
  );
};

export default function(props) {
  return (
    <Component data={props} />
  );
}