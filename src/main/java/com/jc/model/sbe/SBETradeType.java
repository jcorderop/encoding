/* Generated SBE (Simple Binary Encoding) message codec. */
package com.jc.model.sbe;

public enum SBETradeType
{
    Buy((short)0),

    Sell((short)1),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    SBETradeType(final short value)
    {
        this.value = value;
    }

    /**
     * The raw encoded value in the Java type representation.
     *
     * @return the raw value encoded.
     */
    public short value()
    {
        return value;
    }

    /**
     * Lookup the enum value representing the value.
     *
     * @param value encoded to be looked up.
     * @return the enum value representing the value.
     */
    public static SBETradeType get(final short value)
    {
        switch (value)
        {
            case 0: return Buy;
            case 1: return Sell;
            case 255: return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
