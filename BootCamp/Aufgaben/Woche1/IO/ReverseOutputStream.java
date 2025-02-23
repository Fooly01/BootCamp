package Aufgaben.Woche1.IO;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/**
 * IO - ReverseOutputStream
 *
 * Implementieren Sie eine Klasse `ReverseOutputStream`, die Bytes in umgekehrter Reihenfolge ausgibt.
 * Beachten Sie, dass das letzte Byte erst nach dem Aufruf von `close` bekannt ist.
 *
 */

public class ReverseOutputStream extends OutputStream {

    @Override
    public void write(int bite) throws IOException {
        byte[] biteArray = ByteBuffer.allocate(4).putInt(bite).array();
        byte[] reversedBiteArray = new byte[biteArray.length];
        for (int i = 0; i < biteArray.length; i++) {
            reversedBiteArray[i] = biteArray[(biteArray.length-1) - i];
        }
        super.write(reversedBiteArray);
    }

    @Override
    public void write(byte[] buffer) throws IOException {
        byte[] reversedBuffer = new byte[buffer.length];
        for (int i = 0; i < buffer.length; i++) {
            reversedBuffer[i] = buffer[(buffer.length-1) - i];
        }
        super.write(reversedBuffer);
    }

    @Override
    public void write(byte[] buffer, int start, int count) throws IOException {
        byte[] reversedBuffer = new byte[count];
        for (int i = start; i < start + count; i++) {
            reversedBuffer[i] = buffer[(buffer.length-1) - i];
        }
        super.write(reversedBuffer);
    }

    @Override
    public void close() throws IOException {
        super.close();
    }
}
