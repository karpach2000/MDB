package com.vending.devs

object Rs232Comands {




}

/**
 *  VMC Commands page - 62.
 */
object VmcCommandsCoinAcceptor
{

    /**
     *Command for changer to self-reset
     */
    val RESET = ArrayList<Int>(0x08)
    /**
     *Request for changer setup information.
     */
    val SETUP = ArrayList<Int>(0x09)
    /**
     *Request for changer tube status.
     */
    val TUBE_STATUS = ArrayList<Int>(0x0A)
    /**
     *Request for changer activity status.
     */
    val POLL = ArrayList<Int>(0x0B)
    /**
     *Signifies coin types accepted and
        allowable coin dispensing. This
        command is followed by setup data.
        See command format section.
     */
    val COIN_TYPE = ArrayList<Int>(0x0C)
    /**
     *Command to dispense a coin type.
        Followed by coin type to dispense.
        See command format section.
     */
    val DISPENSE  = ArrayList<Int>(0x0D)
    /**
     *Command to allow addition of  features and future enhancements.
        Changers at feature level 2 do not support
        this command.
     */
    val EXPANSION_COMMAND  = ArrayList<Int>(0x0F)




}

object VmcCommandsBillValidator
{

    /**
     *Command for bill validator to self-reset.
     */
    val RESET = ArrayList<Int>(0x30)
    /**
     *Request for bill validator setup information.
     */
    val SETUP = ArrayList<Int>(0x31)
    /**
     *Sets Validator Security Mode.
     */
    val SECURITY  = ArrayList<Int>(0x32)
    /**
     *Request for Bill Validator activity Status.
     */
    val POLL = ArrayList<Int>(0x33)
    /**
     *Indicates Bill Type enable or disable.
            Command is followed by set-up data.
            See command format.
     */
    val BILL_TYPE = ArrayList<Int>(0x34)
    /**
     *Sent by VMC to indicate action for a bill in escrow.
     */
    val ESCROW   = ArrayList<Int>(0x35)
    /**
     *Indicates stacker full and the number of bills.
     */
    val STACKER   = ArrayList<Int>(0x36)
    /**
     *Command to allow addition of  features and future enhancements.
    Changers at feature level 2 do not support
    this command.
     */
    val EXPANSION_COMMAND  = ArrayList<Int>(0x37)

}