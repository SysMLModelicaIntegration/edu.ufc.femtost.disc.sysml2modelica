/**
 */
package edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.provider;


import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaFactory;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Package} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PackageItemProvider extends ModelicaClassDefinitionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageItemProvider(AdapterFactory adapterFactory) {
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

			addWithinClausePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Within Clause feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWithinClausePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Package_withinClause_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Package_withinClause_feature", "_UI_Package_type"),
				 modelicaPackage.Literals.PACKAGE__WITHIN_CLAUSE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(modelicaPackage.Literals.PACKAGE__MODELICA_CLASSES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Package.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Package"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Package)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Package_type") :
			getString("_UI_Package_type") + " " + label;
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

		switch (notification.getFeatureID(edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Package.class)) {
			case modelicaPackage.PACKAGE__WITHIN_CLAUSE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case modelicaPackage.PACKAGE__MODELICA_CLASSES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(modelicaPackage.Literals.PACKAGE__MODELICA_CLASSES,
				 modelicaFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(modelicaPackage.Literals.PACKAGE__MODELICA_CLASSES,
				 modelicaFactory.eINSTANCE.createConnector()));

		newChildDescriptors.add
			(createChildParameter
				(modelicaPackage.Literals.PACKAGE__MODELICA_CLASSES,
				 modelicaFactory.eINSTANCE.createModel()));

		newChildDescriptors.add
			(createChildParameter
				(modelicaPackage.Literals.PACKAGE__MODELICA_CLASSES,
				 modelicaFactory.eINSTANCE.createRecord()));

		newChildDescriptors.add
			(createChildParameter
				(modelicaPackage.Literals.PACKAGE__MODELICA_CLASSES,
				 modelicaFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(modelicaPackage.Literals.PACKAGE__MODELICA_CLASSES,
				 modelicaFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(modelicaPackage.Literals.PACKAGE__MODELICA_CLASSES,
				 modelicaFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(modelicaPackage.Literals.PACKAGE__MODELICA_CLASSES,
				 modelicaFactory.eINSTANCE.createDerFunction()));

		newChildDescriptors.add
			(createChildParameter
				(modelicaPackage.Literals.PACKAGE__MODELICA_CLASSES,
				 modelicaFactory.eINSTANCE.createType()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == modelicaPackage.Literals.MODELICA_CLASS_DEFINITION__RECORDS ||
			childFeature == modelicaPackage.Literals.PACKAGE__MODELICA_CLASSES;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
