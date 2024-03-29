package com.codefountain.spring.core.factory.staticfactory;

public class ReaderFactory {

    public static Reader getReader(ReaderType readerType) {
        switch(readerType) {
            case FILE_READER: return new FileReader();
            case SOCKET_READER: return new SocketReader();
            case DB_READER: return new DBReader();
            default: throw new IllegalArgumentException("Invalid reader type");
        }
    }
}
