package com.stringeereactnative;

import com.stringee.StringeeClient;
import com.stringee.call.StringeeCall;
import com.stringee.conference.StringeeRoom;
import com.stringee.conference.StringeeStream;

import java.util.HashMap;
import java.util.Map;

public class StringeeManager {

    private static StringeeManager stringeeManager;
    private Map<String, StringeeClient> clientsMap = new HashMap<>();
    private Map<String, StringeeCall> callsMap = new HashMap<>();
    private Map<String, StringeeStream> streamsMap = new HashMap<>();
    private Map<Integer, StringeeRoom> roomsMap = new HashMap<>();

    public static synchronized StringeeManager getInstance() {
        if (stringeeManager == null) {
            stringeeManager = new StringeeManager();
        }
        return stringeeManager;
    }

    public Map<String, StringeeCall> getCallsMap() {
        return callsMap;
    }

    public Map<String, StringeeStream> getStreamsMap() {
        return streamsMap;
    }

    public Map<Integer, StringeeRoom> getRoomsMap() {
        return roomsMap;
    }

    public Map<String, StringeeClient> getClientsMap() {
        return clientsMap;
    }
}
