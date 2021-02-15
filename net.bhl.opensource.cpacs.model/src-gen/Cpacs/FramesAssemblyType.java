/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frames Assembly Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FramesAssemblyType#getFrame <em>Frame</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFramesAssemblyType()
 * @model extendedMetaData="name='framesAssemblyType' kind='elementOnly'"
 * @generated
 */
public interface FramesAssemblyType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Frame</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.FrameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getFramesAssemblyType_Frame()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='frame' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FrameType> getFrame();

} // FramesAssemblyType
