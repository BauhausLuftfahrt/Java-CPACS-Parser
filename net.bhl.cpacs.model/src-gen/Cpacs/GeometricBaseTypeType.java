/**
 */
package Cpacs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Geometric Base Type Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Cpacs.CpacsPackage#getGeometricBaseTypeType()
 * @model extendedMetaData="name='geometricBaseType_._type'"
 * @generated
 */
public enum GeometricBaseTypeType implements Enumerator {
	/**
	 * The '<em><b>Cone</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONE_VALUE
	 * @generated
	 * @ordered
	 */
	CONE(0, "cone", "cone"),

	/**
	 * The '<em><b>Sphere</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPHERE_VALUE
	 * @generated
	 * @ordered
	 */
	SPHERE(1, "sphere", "sphere"),

	/**
	 * The '<em><b>Cube</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUBE_VALUE
	 * @generated
	 * @ordered
	 */
	CUBE(2, "cube", "cube"),

	/**
	 * The '<em><b>Cylinder</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CYLINDER_VALUE
	 * @generated
	 * @ordered
	 */
	CYLINDER(3, "cylinder", "cylinder");

	/**
	 * The '<em><b>Cone</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONE
	 * @model name="cone"
	 * @generated
	 * @ordered
	 */
	public static final int CONE_VALUE = 0;

	/**
	 * The '<em><b>Sphere</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPHERE
	 * @model name="sphere"
	 * @generated
	 * @ordered
	 */
	public static final int SPHERE_VALUE = 1;

	/**
	 * The '<em><b>Cube</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUBE
	 * @model name="cube"
	 * @generated
	 * @ordered
	 */
	public static final int CUBE_VALUE = 2;

	/**
	 * The '<em><b>Cylinder</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CYLINDER
	 * @model name="cylinder"
	 * @generated
	 * @ordered
	 */
	public static final int CYLINDER_VALUE = 3;

	/**
	 * An array of all the '<em><b>Geometric Base Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GeometricBaseTypeType[] VALUES_ARRAY = new GeometricBaseTypeType[] { CONE, SPHERE, CUBE,
			CYLINDER, };

	/**
	 * A public read-only list of all the '<em><b>Geometric Base Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GeometricBaseTypeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Geometric Base Type Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GeometricBaseTypeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GeometricBaseTypeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Geometric Base Type Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GeometricBaseTypeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GeometricBaseTypeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Geometric Base Type Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GeometricBaseTypeType get(int value) {
		switch (value) {
		case CONE_VALUE:
			return CONE;
		case SPHERE_VALUE:
			return SPHERE;
		case CUBE_VALUE:
			return CUBE;
		case CYLINDER_VALUE:
			return CYLINDER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private GeometricBaseTypeType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //GeometricBaseTypeType
