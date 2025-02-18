package Aufgaben.Woche1.IO;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * IO - ReverseOutputStream
 *
 * Implementieren Sie eine Klasse `ReverseOutputStream`, die Bytes in umgekehrter Reihenfolge ausgibt.
 * Beachten Sie, dass das letzte Byte erst nach dem Aufruf von `close` bekannt ist.
 *
 */

public class ReverseOutputStream extends OutputStream {

    private final OutputStream out;
    private final ByteArrayOutputStream buffer;

    public ReverseOutputStream(OutputStream out) {
        this.out = out;
        this.buffer = new ByteArrayOutputStream();
    }

    @Override
    public void write(int bite) throws IOException {
        //ToDo: Implement
        buffer.write(bite);
    }

    @Override
    public void write(byte[] buffer) throws IOException {
        //ToDo: Implement
        this.buffer.write(buffer);
    }

    @Override
    public void write(byte[] buffer, int start, int count) throws IOException {
        //ToDo: Implement
        this.buffer.write(buffer, start, count);
    }

    @Override
    public void close() throws IOException {
        //ToDo: Implement
        byte[] data = this.buffer.toByteArray();
        for(int index = data.length - 1; index >= 0; index--){
            out.write(data[index]);
        }
        out.flush();
        out.close();
    }
}
