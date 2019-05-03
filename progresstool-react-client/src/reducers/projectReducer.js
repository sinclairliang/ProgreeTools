import { GET_PROJECTS } from "../actions/types";

const initialState = {
  projetcs: [],
  project: {}
};

export default function(state = initialState, action) {
  switch (action.type) {
    case GET_PROJECTS:
      return {
        ...state,
        projetcs: action.payload
      };
    default:
      return state;
  }
}
