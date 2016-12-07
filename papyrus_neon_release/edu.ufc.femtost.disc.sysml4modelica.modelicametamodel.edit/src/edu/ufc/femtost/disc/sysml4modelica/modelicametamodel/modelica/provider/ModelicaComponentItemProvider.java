/**
 */
package edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.provider;


import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaComponent;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaComponent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelicaComponentItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaComponentItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addConditionalExpressionPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addIsFinalPropertyDescriptor(object);
			addModificationPropertyDescriptor(object);
			addIsReplaceablePropertyDescriptor(object);
			addArraySizePropertyDescriptor(object);
			addType_specifierPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Conditional Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConditionalExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelicaComponent_conditionalExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelicaComponent_conditionalExpression_feature", "_UI_ModelicaComponent_type"),
				 modelicaPackage.Literals.MODELICA_COMPONENT__CONDITIONAL_EXPRESSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelicaComponent_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelicaComponent_name_feature", "_UI_ModelicaComponent_type"),
				 modelicaPackage.Literals.MODELICA_COMPONENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Final feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsFinalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelicaComponent_isFinal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelicaComponent_isFinal_feature", "_UI_ModelicaComponent_type"),
				 modelicaPackage.Literals.MODELICA_COMPONENT__IS_FINAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Modification feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModificationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelicaComponent_modification_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelicaComponent_modification_feature", "_UI_ModelicaComponent_type"),
				 modelicaPackage.Literals.MODELICA_COMPONENT__MODIFICATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Replaceable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsReplaceablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelicaComponent_isReplaceable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelicaComponent_isReplaceable_feature", "_UI_ModelicaComponent_type"),
				 modelicaPackage.Literals.MODELICA_COMPONENT__IS_REPLACEABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Array Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArraySizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelicaComponent_arraySize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelicaComponent_arraySize_feature", "_UI_ModelicaComponent_type"),
				 modelicaPackage.Literals.MODELICA_COMPONENT__ARRAY_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type specifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addType_specifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelicaComponent_type_specifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelicaComponent_type_specifier_feature", "_UI_ModelicaComponent_type"),
				 modelicaPackage.Literals.MODELICA_COMPONENT__TYPE_SPECIFIER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ModelicaComponent)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ModelicaComponent_type") :
			getString("_UI_ModelicaComponent_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ModelicaComponent.class)) {
			case modelicaPackage.MODELICA_COMPONENT__CONDITIONAL_EXPRESSION:
			case modelicaPackage.MODELICA_COMPONENT__NAME:
			case modelicaPackage.MODELICA_COMPONENT__IS_FINAL:
			case modelicaPackage.MODELICA_COMPONENT__MODIFICATION:
			case modelicaPackage.MODELICA_COMPONENT__IS_REPLACEABLE:
			case modelicaPackage.MODELICA_COMPONENT__ARRAY_SIZE:
			case modelicaPackage.MODELICA_COMPONENT__TYPE_SPECIFIER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ModelicaEditPlugin.INSTANCE;
	}

}
