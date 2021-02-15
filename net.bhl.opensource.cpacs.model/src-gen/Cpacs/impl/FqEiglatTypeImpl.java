/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.FqEiglatType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fq Eiglat Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FqEiglatTypeImpl#getDutchRollFrequency <em>Dutch Roll Frequency</em>}</li>
 *   <li>{@link Cpacs.impl.FqEiglatTypeImpl#getDutchRollDamping <em>Dutch Roll Damping</em>}</li>
 *   <li>{@link Cpacs.impl.FqEiglatTypeImpl#getRollTimeConstant <em>Roll Time Constant</em>}</li>
 *   <li>{@link Cpacs.impl.FqEiglatTypeImpl#getSpiralDoublingTime <em>Spiral Doubling Time</em>}</li>
 *   <li>{@link Cpacs.impl.FqEiglatTypeImpl#getRatioPhiBeta <em>Ratio Phi Beta</em>}</li>
 *   <li>{@link Cpacs.impl.FqEiglatTypeImpl#getRollFrequency <em>Roll Frequency</em>}</li>
 *   <li>{@link Cpacs.impl.FqEiglatTypeImpl#getRollSpiralDamping <em>Roll Spiral Damping</em>}</li>
 *   <li>{@link Cpacs.impl.FqEiglatTypeImpl#getRollSpiralProduct <em>Roll Spiral Product</em>}</li>
 *   <li>{@link Cpacs.impl.FqEiglatTypeImpl#getDurchroll <em>Durchroll</em>}</li>
 *   <li>{@link Cpacs.impl.FqEiglatTypeImpl#getRoll <em>Roll</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FqEiglatTypeImpl extends ComplexBaseTypeImpl implements FqEiglatType {
	/**
	 * The cached value of the '{@link #getDutchRollFrequency() <em>Dutch Roll Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDutchRollFrequency()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType dutchRollFrequency;

	/**
	 * The cached value of the '{@link #getDutchRollDamping() <em>Dutch Roll Damping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDutchRollDamping()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType dutchRollDamping;

	/**
	 * The cached value of the '{@link #getRollTimeConstant() <em>Roll Time Constant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRollTimeConstant()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType rollTimeConstant;

	/**
	 * The cached value of the '{@link #getSpiralDoublingTime() <em>Spiral Doubling Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpiralDoublingTime()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType spiralDoublingTime;

	/**
	 * The cached value of the '{@link #getRatioPhiBeta() <em>Ratio Phi Beta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatioPhiBeta()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType ratioPhiBeta;

	/**
	 * The cached value of the '{@link #getRollFrequency() <em>Roll Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRollFrequency()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType rollFrequency;

	/**
	 * The cached value of the '{@link #getRollSpiralDamping() <em>Roll Spiral Damping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRollSpiralDamping()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType rollSpiralDamping;

	/**
	 * The cached value of the '{@link #getRollSpiralProduct() <em>Roll Spiral Product</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRollSpiralProduct()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType rollSpiralProduct;

	/**
	 * The cached value of the '{@link #getDurchroll() <em>Durchroll</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurchroll()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType durchroll;

	/**
	 * The cached value of the '{@link #getRoll() <em>Roll</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoll()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType roll;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FqEiglatTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFqEiglatType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getDutchRollFrequency() {
		return dutchRollFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDutchRollFrequency(DoubleBaseType newDutchRollFrequency, NotificationChain msgs) {
		DoubleBaseType oldDutchRollFrequency = dutchRollFrequency;
		dutchRollFrequency = newDutchRollFrequency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_EIGLAT_TYPE__DUTCH_ROLL_FREQUENCY, oldDutchRollFrequency, newDutchRollFrequency);
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
	public void setDutchRollFrequency(DoubleBaseType newDutchRollFrequency) {
		if (newDutchRollFrequency != dutchRollFrequency) {
			NotificationChain msgs = null;
			if (dutchRollFrequency != null)
				msgs = ((InternalEObject) dutchRollFrequency).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_EIGLAT_TYPE__DUTCH_ROLL_FREQUENCY, null, msgs);
			if (newDutchRollFrequency != null)
				msgs = ((InternalEObject) newDutchRollFrequency).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_EIGLAT_TYPE__DUTCH_ROLL_FREQUENCY, null, msgs);
			msgs = basicSetDutchRollFrequency(newDutchRollFrequency, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_EIGLAT_TYPE__DUTCH_ROLL_FREQUENCY,
					newDutchRollFrequency, newDutchRollFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getDutchRollDamping() {
		return dutchRollDamping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDutchRollDamping(DoubleBaseType newDutchRollDamping, NotificationChain msgs) {
		DoubleBaseType oldDutchRollDamping = dutchRollDamping;
		dutchRollDamping = newDutchRollDamping;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_EIGLAT_TYPE__DUTCH_ROLL_DAMPING, oldDutchRollDamping, newDutchRollDamping);
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
	public void setDutchRollDamping(DoubleBaseType newDutchRollDamping) {
		if (newDutchRollDamping != dutchRollDamping) {
			NotificationChain msgs = null;
			if (dutchRollDamping != null)
				msgs = ((InternalEObject) dutchRollDamping).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_EIGLAT_TYPE__DUTCH_ROLL_DAMPING, null, msgs);
			if (newDutchRollDamping != null)
				msgs = ((InternalEObject) newDutchRollDamping).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_EIGLAT_TYPE__DUTCH_ROLL_DAMPING, null, msgs);
			msgs = basicSetDutchRollDamping(newDutchRollDamping, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_EIGLAT_TYPE__DUTCH_ROLL_DAMPING,
					newDutchRollDamping, newDutchRollDamping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getRollTimeConstant() {
		return rollTimeConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRollTimeConstant(DoubleBaseType newRollTimeConstant, NotificationChain msgs) {
		DoubleBaseType oldRollTimeConstant = rollTimeConstant;
		rollTimeConstant = newRollTimeConstant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_EIGLAT_TYPE__ROLL_TIME_CONSTANT, oldRollTimeConstant, newRollTimeConstant);
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
	public void setRollTimeConstant(DoubleBaseType newRollTimeConstant) {
		if (newRollTimeConstant != rollTimeConstant) {
			NotificationChain msgs = null;
			if (rollTimeConstant != null)
				msgs = ((InternalEObject) rollTimeConstant).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_EIGLAT_TYPE__ROLL_TIME_CONSTANT, null, msgs);
			if (newRollTimeConstant != null)
				msgs = ((InternalEObject) newRollTimeConstant).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_EIGLAT_TYPE__ROLL_TIME_CONSTANT, null, msgs);
			msgs = basicSetRollTimeConstant(newRollTimeConstant, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_EIGLAT_TYPE__ROLL_TIME_CONSTANT,
					newRollTimeConstant, newRollTimeConstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getSpiralDoublingTime() {
		return spiralDoublingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpiralDoublingTime(DoubleBaseType newSpiralDoublingTime, NotificationChain msgs) {
		DoubleBaseType oldSpiralDoublingTime = spiralDoublingTime;
		spiralDoublingTime = newSpiralDoublingTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_EIGLAT_TYPE__SPIRAL_DOUBLING_TIME, oldSpiralDoublingTime, newSpiralDoublingTime);
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
	public void setSpiralDoublingTime(DoubleBaseType newSpiralDoublingTime) {
		if (newSpiralDoublingTime != spiralDoublingTime) {
			NotificationChain msgs = null;
			if (spiralDoublingTime != null)
				msgs = ((InternalEObject) spiralDoublingTime).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_EIGLAT_TYPE__SPIRAL_DOUBLING_TIME, null, msgs);
			if (newSpiralDoublingTime != null)
				msgs = ((InternalEObject) newSpiralDoublingTime).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_EIGLAT_TYPE__SPIRAL_DOUBLING_TIME, null, msgs);
			msgs = basicSetSpiralDoublingTime(newSpiralDoublingTime, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_EIGLAT_TYPE__SPIRAL_DOUBLING_TIME,
					newSpiralDoublingTime, newSpiralDoublingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getRatioPhiBeta() {
		return ratioPhiBeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRatioPhiBeta(DoubleBaseType newRatioPhiBeta, NotificationChain msgs) {
		DoubleBaseType oldRatioPhiBeta = ratioPhiBeta;
		ratioPhiBeta = newRatioPhiBeta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_EIGLAT_TYPE__RATIO_PHI_BETA, oldRatioPhiBeta, newRatioPhiBeta);
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
	public void setRatioPhiBeta(DoubleBaseType newRatioPhiBeta) {
		if (newRatioPhiBeta != ratioPhiBeta) {
			NotificationChain msgs = null;
			if (ratioPhiBeta != null)
				msgs = ((InternalEObject) ratioPhiBeta).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_EIGLAT_TYPE__RATIO_PHI_BETA, null, msgs);
			if (newRatioPhiBeta != null)
				msgs = ((InternalEObject) newRatioPhiBeta).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_EIGLAT_TYPE__RATIO_PHI_BETA, null, msgs);
			msgs = basicSetRatioPhiBeta(newRatioPhiBeta, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_EIGLAT_TYPE__RATIO_PHI_BETA,
					newRatioPhiBeta, newRatioPhiBeta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getRollFrequency() {
		return rollFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRollFrequency(DoubleBaseType newRollFrequency, NotificationChain msgs) {
		DoubleBaseType oldRollFrequency = rollFrequency;
		rollFrequency = newRollFrequency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_EIGLAT_TYPE__ROLL_FREQUENCY, oldRollFrequency, newRollFrequency);
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
	public void setRollFrequency(DoubleBaseType newRollFrequency) {
		if (newRollFrequency != rollFrequency) {
			NotificationChain msgs = null;
			if (rollFrequency != null)
				msgs = ((InternalEObject) rollFrequency).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_EIGLAT_TYPE__ROLL_FREQUENCY, null, msgs);
			if (newRollFrequency != null)
				msgs = ((InternalEObject) newRollFrequency).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_EIGLAT_TYPE__ROLL_FREQUENCY, null, msgs);
			msgs = basicSetRollFrequency(newRollFrequency, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_EIGLAT_TYPE__ROLL_FREQUENCY,
					newRollFrequency, newRollFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getRollSpiralDamping() {
		return rollSpiralDamping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRollSpiralDamping(DoubleBaseType newRollSpiralDamping, NotificationChain msgs) {
		DoubleBaseType oldRollSpiralDamping = rollSpiralDamping;
		rollSpiralDamping = newRollSpiralDamping;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_EIGLAT_TYPE__ROLL_SPIRAL_DAMPING, oldRollSpiralDamping, newRollSpiralDamping);
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
	public void setRollSpiralDamping(DoubleBaseType newRollSpiralDamping) {
		if (newRollSpiralDamping != rollSpiralDamping) {
			NotificationChain msgs = null;
			if (rollSpiralDamping != null)
				msgs = ((InternalEObject) rollSpiralDamping).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_EIGLAT_TYPE__ROLL_SPIRAL_DAMPING, null, msgs);
			if (newRollSpiralDamping != null)
				msgs = ((InternalEObject) newRollSpiralDamping).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_EIGLAT_TYPE__ROLL_SPIRAL_DAMPING, null, msgs);
			msgs = basicSetRollSpiralDamping(newRollSpiralDamping, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_EIGLAT_TYPE__ROLL_SPIRAL_DAMPING,
					newRollSpiralDamping, newRollSpiralDamping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getRollSpiralProduct() {
		return rollSpiralProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRollSpiralProduct(DoubleBaseType newRollSpiralProduct, NotificationChain msgs) {
		DoubleBaseType oldRollSpiralProduct = rollSpiralProduct;
		rollSpiralProduct = newRollSpiralProduct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_EIGLAT_TYPE__ROLL_SPIRAL_PRODUCT, oldRollSpiralProduct, newRollSpiralProduct);
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
	public void setRollSpiralProduct(DoubleBaseType newRollSpiralProduct) {
		if (newRollSpiralProduct != rollSpiralProduct) {
			NotificationChain msgs = null;
			if (rollSpiralProduct != null)
				msgs = ((InternalEObject) rollSpiralProduct).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_EIGLAT_TYPE__ROLL_SPIRAL_PRODUCT, null, msgs);
			if (newRollSpiralProduct != null)
				msgs = ((InternalEObject) newRollSpiralProduct).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_EIGLAT_TYPE__ROLL_SPIRAL_PRODUCT, null, msgs);
			msgs = basicSetRollSpiralProduct(newRollSpiralProduct, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_EIGLAT_TYPE__ROLL_SPIRAL_PRODUCT,
					newRollSpiralProduct, newRollSpiralProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getDurchroll() {
		return durchroll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDurchroll(DoubleBaseType newDurchroll, NotificationChain msgs) {
		DoubleBaseType oldDurchroll = durchroll;
		durchroll = newDurchroll;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_EIGLAT_TYPE__DURCHROLL, oldDurchroll, newDurchroll);
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
	public void setDurchroll(DoubleBaseType newDurchroll) {
		if (newDurchroll != durchroll) {
			NotificationChain msgs = null;
			if (durchroll != null)
				msgs = ((InternalEObject) durchroll).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_EIGLAT_TYPE__DURCHROLL, null, msgs);
			if (newDurchroll != null)
				msgs = ((InternalEObject) newDurchroll).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_EIGLAT_TYPE__DURCHROLL, null, msgs);
			msgs = basicSetDurchroll(newDurchroll, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_EIGLAT_TYPE__DURCHROLL, newDurchroll,
					newDurchroll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getRoll() {
		return roll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoll(DoubleBaseType newRoll, NotificationChain msgs) {
		DoubleBaseType oldRoll = roll;
		roll = newRoll;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_EIGLAT_TYPE__ROLL, oldRoll, newRoll);
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
	public void setRoll(DoubleBaseType newRoll) {
		if (newRoll != roll) {
			NotificationChain msgs = null;
			if (roll != null)
				msgs = ((InternalEObject) roll).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_EIGLAT_TYPE__ROLL, null, msgs);
			if (newRoll != null)
				msgs = ((InternalEObject) newRoll).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_EIGLAT_TYPE__ROLL, null, msgs);
			msgs = basicSetRoll(newRoll, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_EIGLAT_TYPE__ROLL, newRoll, newRoll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FQ_EIGLAT_TYPE__DUTCH_ROLL_FREQUENCY:
			return basicSetDutchRollFrequency(null, msgs);
		case CpacsPackage.FQ_EIGLAT_TYPE__DUTCH_ROLL_DAMPING:
			return basicSetDutchRollDamping(null, msgs);
		case CpacsPackage.FQ_EIGLAT_TYPE__ROLL_TIME_CONSTANT:
			return basicSetRollTimeConstant(null, msgs);
		case CpacsPackage.FQ_EIGLAT_TYPE__SPIRAL_DOUBLING_TIME:
			return basicSetSpiralDoublingTime(null, msgs);
		case CpacsPackage.FQ_EIGLAT_TYPE__RATIO_PHI_BETA:
			return basicSetRatioPhiBeta(null, msgs);
		case CpacsPackage.FQ_EIGLAT_TYPE__ROLL_FREQUENCY:
			return basicSetRollFrequency(null, msgs);
		case CpacsPackage.FQ_EIGLAT_TYPE__ROLL_SPIRAL_DAMPING:
			return basicSetRollSpiralDamping(null, msgs);
		case CpacsPackage.FQ_EIGLAT_TYPE__ROLL_SPIRAL_PRODUCT:
			return basicSetRollSpiralProduct(null, msgs);
		case CpacsPackage.FQ_EIGLAT_TYPE__DURCHROLL:
			return basicSetDurchroll(null, msgs);
		case CpacsPackage.FQ_EIGLAT_TYPE__ROLL:
			return basicSetRoll(null, msgs);
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
		case CpacsPackage.FQ_EIGLAT_TYPE__DUTCH_ROLL_FREQUENCY:
			return getDutchRollFrequency();
		case CpacsPackage.FQ_EIGLAT_TYPE__DUTCH_ROLL_DAMPING:
			return getDutchRollDamping();
		case CpacsPackage.FQ_EIGLAT_TYPE__ROLL_TIME_CONSTANT:
			return getRollTimeConstant();
		case CpacsPackage.FQ_EIGLAT_TYPE__SPIRAL_DOUBLING_TIME:
			return getSpiralDoublingTime();
		case CpacsPackage.FQ_EIGLAT_TYPE__RATIO_PHI_BETA:
			return getRatioPhiBeta();
		case CpacsPackage.FQ_EIGLAT_TYPE__ROLL_FREQUENCY:
			return getRollFrequency();
		case CpacsPackage.FQ_EIGLAT_TYPE__ROLL_SPIRAL_DAMPING:
			return getRollSpiralDamping();
		case CpacsPackage.FQ_EIGLAT_TYPE__ROLL_SPIRAL_PRODUCT:
			return getRollSpiralProduct();
		case CpacsPackage.FQ_EIGLAT_TYPE__DURCHROLL:
			return getDurchroll();
		case CpacsPackage.FQ_EIGLAT_TYPE__ROLL:
			return getRoll();
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
		case CpacsPackage.FQ_EIGLAT_TYPE__DUTCH_ROLL_FREQUENCY:
			setDutchRollFrequency((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FQ_EIGLAT_TYPE__DUTCH_ROLL_DAMPING:
			setDutchRollDamping((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FQ_EIGLAT_TYPE__ROLL_TIME_CONSTANT:
			setRollTimeConstant((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FQ_EIGLAT_TYPE__SPIRAL_DOUBLING_TIME:
			setSpiralDoublingTime((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FQ_EIGLAT_TYPE__RATIO_PHI_BETA:
			setRatioPhiBeta((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FQ_EIGLAT_TYPE__ROLL_FREQUENCY:
			setRollFrequency((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FQ_EIGLAT_TYPE__ROLL_SPIRAL_DAMPING:
			setRollSpiralDamping((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FQ_EIGLAT_TYPE__ROLL_SPIRAL_PRODUCT:
			setRollSpiralProduct((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FQ_EIGLAT_TYPE__DURCHROLL:
			setDurchroll((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FQ_EIGLAT_TYPE__ROLL:
			setRoll((DoubleBaseType) newValue);
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
		case CpacsPackage.FQ_EIGLAT_TYPE__DUTCH_ROLL_FREQUENCY:
			setDutchRollFrequency((DoubleBaseType) null);
			return;
		case CpacsPackage.FQ_EIGLAT_TYPE__DUTCH_ROLL_DAMPING:
			setDutchRollDamping((DoubleBaseType) null);
			return;
		case CpacsPackage.FQ_EIGLAT_TYPE__ROLL_TIME_CONSTANT:
			setRollTimeConstant((DoubleBaseType) null);
			return;
		case CpacsPackage.FQ_EIGLAT_TYPE__SPIRAL_DOUBLING_TIME:
			setSpiralDoublingTime((DoubleBaseType) null);
			return;
		case CpacsPackage.FQ_EIGLAT_TYPE__RATIO_PHI_BETA:
			setRatioPhiBeta((DoubleBaseType) null);
			return;
		case CpacsPackage.FQ_EIGLAT_TYPE__ROLL_FREQUENCY:
			setRollFrequency((DoubleBaseType) null);
			return;
		case CpacsPackage.FQ_EIGLAT_TYPE__ROLL_SPIRAL_DAMPING:
			setRollSpiralDamping((DoubleBaseType) null);
			return;
		case CpacsPackage.FQ_EIGLAT_TYPE__ROLL_SPIRAL_PRODUCT:
			setRollSpiralProduct((DoubleBaseType) null);
			return;
		case CpacsPackage.FQ_EIGLAT_TYPE__DURCHROLL:
			setDurchroll((DoubleBaseType) null);
			return;
		case CpacsPackage.FQ_EIGLAT_TYPE__ROLL:
			setRoll((DoubleBaseType) null);
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
		case CpacsPackage.FQ_EIGLAT_TYPE__DUTCH_ROLL_FREQUENCY:
			return dutchRollFrequency != null;
		case CpacsPackage.FQ_EIGLAT_TYPE__DUTCH_ROLL_DAMPING:
			return dutchRollDamping != null;
		case CpacsPackage.FQ_EIGLAT_TYPE__ROLL_TIME_CONSTANT:
			return rollTimeConstant != null;
		case CpacsPackage.FQ_EIGLAT_TYPE__SPIRAL_DOUBLING_TIME:
			return spiralDoublingTime != null;
		case CpacsPackage.FQ_EIGLAT_TYPE__RATIO_PHI_BETA:
			return ratioPhiBeta != null;
		case CpacsPackage.FQ_EIGLAT_TYPE__ROLL_FREQUENCY:
			return rollFrequency != null;
		case CpacsPackage.FQ_EIGLAT_TYPE__ROLL_SPIRAL_DAMPING:
			return rollSpiralDamping != null;
		case CpacsPackage.FQ_EIGLAT_TYPE__ROLL_SPIRAL_PRODUCT:
			return rollSpiralProduct != null;
		case CpacsPackage.FQ_EIGLAT_TYPE__DURCHROLL:
			return durchroll != null;
		case CpacsPackage.FQ_EIGLAT_TYPE__ROLL:
			return roll != null;
		}
		return super.eIsSet(featureID);
	}

} //FqEiglatTypeImpl
