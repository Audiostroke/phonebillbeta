package edu.pdx.cs410J.mckean;

import com.sun.org.glassfish.gmbal.ParameterNames;
import edu.pdx.cs410J.AbstractPhoneBill;
import edu.pdx.cs410J.AbstractPhoneCall;

import java.util.*;

/**
 * Created by TylerMcKean on 7/8/15.
 */
public class PhoneBill extends AbstractPhoneBill {

    /**
     * Data members include a string to represent the customer's name in the phone bill
     * and a list that holds phone calls to represent the data contained in a real phone bill.
     */
    protected String Customer;
    protected List<AbstractPhoneCall> PhoneCalls = new ArrayList<AbstractPhoneCall>();

    /**
     * Constructor for the instantiation of a phone bill. Sets the customer name to the
     * name that is read in.
     * @param customer
     */
    public PhoneBill(String customer) {
        this.Customer = customer;
    }

    /**
     * Returns the name of the customer whose phone bill this is
     */
    @Override
    public String getCustomer() {
        return Customer;
    }

    /**
     * Adds a phone call to this phone bill
     *
     * @param call
     */
    @Override
    public void addPhoneCall(AbstractPhoneCall call) {
        PhoneCalls.add(call);
    }

    /**
     * Returns all of the phone calls (as instances of {@link
     * AbstractPhoneCall}) in this phone bill
     */
    @Override
    public List getPhoneCalls() {
        return PhoneCalls;
    }
}
