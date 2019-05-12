import { combineReducers } from "redux";
import errorReducer from "./errorReducers";
import projectReducer from "./projectReducer";

export default combineReducers ({
    errors:errorReducer,

    project: projectReducer
});