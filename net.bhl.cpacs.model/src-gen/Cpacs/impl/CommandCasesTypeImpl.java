/**
 */
package Cpacs.impl;

import Cpacs.CommandCaseType;
import Cpacs.CommandCasesType;
import Cpacs.CpacsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command Cases Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CommandCasesTypeImpl#getDp <em>Dp</em>}</li>
 *   <li>{@link Cpacs.impl.CommandCasesTypeImpl#getDq <em>Dq</em>}</li>
 *   <li>{@link Cpacs.impl.CommandCasesTypeImpl#getDr <em>Dr</em>}</li>
 *   <li>{@link Cpacs.impl.CommandCasesTypeImpl#getDx <em>Dx</em>}</li>
 *   <li>{@link Cpacs.impl.CommandCasesTypeImpl#getDy <em>Dy</em>}</li>
 *   <li>{@link Cpacs.impl.CommandCasesTypeImpl#getDz <em>Dz</em>}</li>
 *   <li>{@link Cpacs.impl.CommandCasesTypeImpl#getCommandCase <em>Command Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommandCasesTypeImpl extends ComplexBaseTypeImpl implements CommandCasesType {
	/**
	 * The cached value of the '{@link #getDp() <em>Dp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDp()
	 * @generated
	 * @ordered
	 */
	protected CommandCaseType dp;

	/**
	 * The cached value of the '{@link #getDq() <em>Dq</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDq()
	 * @generated
	 * @ordered
	 */
	protected CommandCaseType dq;

	/**
	 * The cached value of the '{@link #getDr() <em>Dr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDr()
	 * @generated
	 * @ordered
	 */
	protected CommandCaseType dr;

	/**
	 * The cached value of the '{@link #getDx() <em>Dx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDx()
	 * @generated
	 * @ordered
	 */
	protected CommandCaseType dx;

	/**
	 * The cached value of the '{@link #getDy() <em>Dy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDy()
	 * @generated
	 * @ordered
	 */
	protected CommandCaseType dy;

	/**
	 * The cached value of the '{@link #getDz() <em>Dz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDz()
	 * @generated
	 * @ordered
	 */
	protected CommandCaseType dz;

	/**
	 * The cached value of the '{@link #getCommandCase() <em>Command Case</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandCase()
	 * @generated
	 * @ordered
	 */
	protected EList<CommandCaseType> commandCase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandCasesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCommandCasesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommandCaseType getDp() {
		return dp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDp(CommandCaseType newDp, NotificationChain msgs) {
		CommandCaseType oldDp = dp;
		dp = newDp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COMMAND_CASES_TYPE__DP, oldDp, newDp);
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
	public void setDp(CommandCaseType newDp) {
		if (newDp != dp) {
			NotificationChain msgs = null;
			if (dp != null)
				msgs = ((InternalEObject) dp).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMMAND_CASES_TYPE__DP, null, msgs);
			if (newDp != null)
				msgs = ((InternalEObject) newDp).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMMAND_CASES_TYPE__DP, null, msgs);
			msgs = basicSetDp(newDp, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COMMAND_CASES_TYPE__DP, newDp, newDp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommandCaseType getDq() {
		return dq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDq(CommandCaseType newDq, NotificationChain msgs) {
		CommandCaseType oldDq = dq;
		dq = newDq;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COMMAND_CASES_TYPE__DQ, oldDq, newDq);
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
	public void setDq(CommandCaseType newDq) {
		if (newDq != dq) {
			NotificationChain msgs = null;
			if (dq != null)
				msgs = ((InternalEObject) dq).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMMAND_CASES_TYPE__DQ, null, msgs);
			if (newDq != null)
				msgs = ((InternalEObject) newDq).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMMAND_CASES_TYPE__DQ, null, msgs);
			msgs = basicSetDq(newDq, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COMMAND_CASES_TYPE__DQ, newDq, newDq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommandCaseType getDr() {
		return dr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDr(CommandCaseType newDr, NotificationChain msgs) {
		CommandCaseType oldDr = dr;
		dr = newDr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COMMAND_CASES_TYPE__DR, oldDr, newDr);
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
	public void setDr(CommandCaseType newDr) {
		if (newDr != dr) {
			NotificationChain msgs = null;
			if (dr != null)
				msgs = ((InternalEObject) dr).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMMAND_CASES_TYPE__DR, null, msgs);
			if (newDr != null)
				msgs = ((InternalEObject) newDr).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMMAND_CASES_TYPE__DR, null, msgs);
			msgs = basicSetDr(newDr, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COMMAND_CASES_TYPE__DR, newDr, newDr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommandCaseType getDx() {
		return dx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDx(CommandCaseType newDx, NotificationChain msgs) {
		CommandCaseType oldDx = dx;
		dx = newDx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COMMAND_CASES_TYPE__DX, oldDx, newDx);
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
	public void setDx(CommandCaseType newDx) {
		if (newDx != dx) {
			NotificationChain msgs = null;
			if (dx != null)
				msgs = ((InternalEObject) dx).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMMAND_CASES_TYPE__DX, null, msgs);
			if (newDx != null)
				msgs = ((InternalEObject) newDx).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMMAND_CASES_TYPE__DX, null, msgs);
			msgs = basicSetDx(newDx, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COMMAND_CASES_TYPE__DX, newDx, newDx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommandCaseType getDy() {
		return dy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDy(CommandCaseType newDy, NotificationChain msgs) {
		CommandCaseType oldDy = dy;
		dy = newDy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COMMAND_CASES_TYPE__DY, oldDy, newDy);
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
	public void setDy(CommandCaseType newDy) {
		if (newDy != dy) {
			NotificationChain msgs = null;
			if (dy != null)
				msgs = ((InternalEObject) dy).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMMAND_CASES_TYPE__DY, null, msgs);
			if (newDy != null)
				msgs = ((InternalEObject) newDy).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMMAND_CASES_TYPE__DY, null, msgs);
			msgs = basicSetDy(newDy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COMMAND_CASES_TYPE__DY, newDy, newDy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommandCaseType getDz() {
		return dz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDz(CommandCaseType newDz, NotificationChain msgs) {
		CommandCaseType oldDz = dz;
		dz = newDz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COMMAND_CASES_TYPE__DZ, oldDz, newDz);
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
	public void setDz(CommandCaseType newDz) {
		if (newDz != dz) {
			NotificationChain msgs = null;
			if (dz != null)
				msgs = ((InternalEObject) dz).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMMAND_CASES_TYPE__DZ, null, msgs);
			if (newDz != null)
				msgs = ((InternalEObject) newDz).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMMAND_CASES_TYPE__DZ, null, msgs);
			msgs = basicSetDz(newDz, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COMMAND_CASES_TYPE__DZ, newDz, newDz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CommandCaseType> getCommandCase() {
		if (commandCase == null) {
			commandCase = new EObjectContainmentEList<CommandCaseType>(CommandCaseType.class, this,
					CpacsPackage.COMMAND_CASES_TYPE__COMMAND_CASE);
		}
		return commandCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.COMMAND_CASES_TYPE__DP:
			return basicSetDp(null, msgs);
		case CpacsPackage.COMMAND_CASES_TYPE__DQ:
			return basicSetDq(null, msgs);
		case CpacsPackage.COMMAND_CASES_TYPE__DR:
			return basicSetDr(null, msgs);
		case CpacsPackage.COMMAND_CASES_TYPE__DX:
			return basicSetDx(null, msgs);
		case CpacsPackage.COMMAND_CASES_TYPE__DY:
			return basicSetDy(null, msgs);
		case CpacsPackage.COMMAND_CASES_TYPE__DZ:
			return basicSetDz(null, msgs);
		case CpacsPackage.COMMAND_CASES_TYPE__COMMAND_CASE:
			return ((InternalEList<?>) getCommandCase()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.COMMAND_CASES_TYPE__DP:
			return getDp();
		case CpacsPackage.COMMAND_CASES_TYPE__DQ:
			return getDq();
		case CpacsPackage.COMMAND_CASES_TYPE__DR:
			return getDr();
		case CpacsPackage.COMMAND_CASES_TYPE__DX:
			return getDx();
		case CpacsPackage.COMMAND_CASES_TYPE__DY:
			return getDy();
		case CpacsPackage.COMMAND_CASES_TYPE__DZ:
			return getDz();
		case CpacsPackage.COMMAND_CASES_TYPE__COMMAND_CASE:
			return getCommandCase();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CpacsPackage.COMMAND_CASES_TYPE__DP:
			setDp((CommandCaseType) newValue);
			return;
		case CpacsPackage.COMMAND_CASES_TYPE__DQ:
			setDq((CommandCaseType) newValue);
			return;
		case CpacsPackage.COMMAND_CASES_TYPE__DR:
			setDr((CommandCaseType) newValue);
			return;
		case CpacsPackage.COMMAND_CASES_TYPE__DX:
			setDx((CommandCaseType) newValue);
			return;
		case CpacsPackage.COMMAND_CASES_TYPE__DY:
			setDy((CommandCaseType) newValue);
			return;
		case CpacsPackage.COMMAND_CASES_TYPE__DZ:
			setDz((CommandCaseType) newValue);
			return;
		case CpacsPackage.COMMAND_CASES_TYPE__COMMAND_CASE:
			getCommandCase().clear();
			getCommandCase().addAll((Collection<? extends CommandCaseType>) newValue);
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
		case CpacsPackage.COMMAND_CASES_TYPE__DP:
			setDp((CommandCaseType) null);
			return;
		case CpacsPackage.COMMAND_CASES_TYPE__DQ:
			setDq((CommandCaseType) null);
			return;
		case CpacsPackage.COMMAND_CASES_TYPE__DR:
			setDr((CommandCaseType) null);
			return;
		case CpacsPackage.COMMAND_CASES_TYPE__DX:
			setDx((CommandCaseType) null);
			return;
		case CpacsPackage.COMMAND_CASES_TYPE__DY:
			setDy((CommandCaseType) null);
			return;
		case CpacsPackage.COMMAND_CASES_TYPE__DZ:
			setDz((CommandCaseType) null);
			return;
		case CpacsPackage.COMMAND_CASES_TYPE__COMMAND_CASE:
			getCommandCase().clear();
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
		case CpacsPackage.COMMAND_CASES_TYPE__DP:
			return dp != null;
		case CpacsPackage.COMMAND_CASES_TYPE__DQ:
			return dq != null;
		case CpacsPackage.COMMAND_CASES_TYPE__DR:
			return dr != null;
		case CpacsPackage.COMMAND_CASES_TYPE__DX:
			return dx != null;
		case CpacsPackage.COMMAND_CASES_TYPE__DY:
			return dy != null;
		case CpacsPackage.COMMAND_CASES_TYPE__DZ:
			return dz != null;
		case CpacsPackage.COMMAND_CASES_TYPE__COMMAND_CASE:
			return commandCase != null && !commandCase.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CommandCasesTypeImpl
