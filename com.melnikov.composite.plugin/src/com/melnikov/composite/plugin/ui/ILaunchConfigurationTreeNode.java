package com.melnikov.composite.plugin.ui;

import org.eclipse.swt.graphics.Image;

interface ILaunchConfigurationTreeNode {
	ILaunchConfigurationTreeNode[] getChildren();
	ILaunchConfigurationTreeNode getParent();
	boolean hasChildren();
	boolean hasSelectedChildren();

	Image getImage();
	String getText();

	boolean isChecked();
	boolean isGrayed();

	void setChecked(boolean state);
}
