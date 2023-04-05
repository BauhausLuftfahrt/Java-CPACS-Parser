/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GenericGeometryComponentType;
import Cpacs.LinkToFileType;
import Cpacs.TransformationType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Geometry Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.GenericGeometryComponentTypeImpl#getLinkToFile <em>Link To File</em>}</li>
 *   <li>{@link Cpacs.impl.GenericGeometryComponentTypeImpl#getTransformation <em>Transformation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericGeometryComponentTypeImpl extends ComplexBaseTypeImpl implements GenericGeometryComponentType {
	/**
	 * The cached value of the '{@link #getLinkToFile() <em>Link To File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkToFile()
	 * @generated
	 * @ordered
	 */
	protected LinkToFileType linkToFile;

	/**
	 * The cached value of the '{@link #getTransformation() <em>Transformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation()
	 * @generated
	 * @ordered
	 */
	protected TransformationType transformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericGeometryComponentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getGenericGeometryComponentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkToFileType getLinkToFile() {
		return linkToFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkToFile(LinkToFileType newLinkToFile, NotificationChain msgs) {
		LinkToFileType oldLinkToFile = linkToFile;
		linkToFile = newLinkToFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GENERIC_GEOMETRY_COMPONENT_TYPE__LINK_TO_FILE, oldLinkToFile, newLinkToFile);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkToFile(LinkToFileType newLinkToFile) {
		if (newLinkToFile != linkToFile) {
			NotificationChain msgs = null;
			if (linkToFile != null)
				msgs = ((InternalEObject) linkToFile).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERIC_GEOMETRY_COMPONENT_TYPE__LINK_TO_FILE, null,
						msgs);
			if (newLinkToFile != null)
				msgs = ((InternalEObject) newLinkToFile).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERIC_GEOMETRY_COMPONENT_TYPE__LINK_TO_FILE, null,
						msgs);
			msgs = basicSetLinkToFile(newLinkToFile, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GENERIC_GEOMETRY_COMPONENT_TYPE__LINK_TO_FILE, newLinkToFile, newLinkToFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransformationType getTransformation() {
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformation(TransformationType newTransformation, NotificationChain msgs) {
		TransformationType oldTransformation = transformation;
		transformation = newTransformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GENERIC_GEOMETRY_COMPONENT_TYPE__TRANSFORMATION, oldTransformation, newTransformation);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransformation(TransformationType newTransformation) {
		if (newTransformation != transformation) {
			NotificationChain msgs = null;
			if (transformation != null)
				msgs = ((InternalEObject) transformation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERIC_GEOMETRY_COMPONENT_TYPE__TRANSFORMATION, null,
						msgs);
			if (newTransformation != null)
				msgs = ((InternalEObject) newTransformation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERIC_GEOMETRY_COMPONENT_TYPE__TRANSFORMATION, null,
						msgs);
			msgs = basicSetTransformation(newTransformation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GENERIC_GEOMETRY_COMPONENT_TYPE__TRANSFORMATION, newTransformation,
					newTransformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.GENERIC_GEOMETRY_COMPONENT_TYPE__LINK_TO_FILE:
			return basicSetLinkToFile(null, msgs);
		case CpacsPackage.GENERIC_GEOMETRY_COMPONENT_TYPE__TRANSFORMATION:
			return basicSetTransformation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CpacsPackage.GENERIC_GEOMETRY_COMPONENT_TYPE__LINK_TO_FILE:
			return getLinkToFile();
		case CpacsPackage.GENERIC_GEOMETRY_COMPONENT_TYPE__TRANSFORMATION:
			return getTransformation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CpacsPackage.GENERIC_GEOMETRY_COMPONENT_TYPE__LINK_TO_FILE:
			setLinkToFile((LinkToFileType) newValue);
			return;
		case CpacsPackage.GENERIC_GEOMETRY_COMPONENT_TYPE__TRANSFORMATION:
			setTransformation((TransformationType) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CpacsPackage.GENERIC_GEOMETRY_COMPONENT_TYPE__LINK_TO_FILE:
			setLinkToFile((LinkToFileType) null);
			return;
		case CpacsPackage.GENERIC_GEOMETRY_COMPONENT_TYPE__TRANSFORMATION:
			setTransformation((TransformationType) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CpacsPackage.GENERIC_GEOMETRY_COMPONENT_TYPE__LINK_TO_FILE:
			return linkToFile != null;
		case CpacsPackage.GENERIC_GEOMETRY_COMPONENT_TYPE__TRANSFORMATION:
			return transformation != null;
		}
		return super.eIsSet(featureID);
	}

} //GenericGeometryComponentTypeImpl
