package org.IODecorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

public class ConvertInput extends FilterInputStream {
    public ConvertInput(InputStream in) {
        super(in);
    }

    @Override
    public byte[] readAllBytes() throws IOException {
        byte[] bytes = super.readAllBytes();
        String lower = new String(bytes);
        lower = lower.toLowerCase();
        return lower.getBytes();
    }
}
