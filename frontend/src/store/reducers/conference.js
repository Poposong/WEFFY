import { createSlice } from "@reduxjs/toolkit";

let conference = createSlice({
    name : 'conference',
    initialState : {
        activeSessionId: null,
    },
    reducers: {
        setActiveSessionId(state, action) {
            state.activeSessionIdnpm = action.payload
        }
    }
})

export const { setActiveSessionId } = conference.actions
export default conference.reducer;