import { useState } from "react";
import AppStateContext from "../contexts/AppStateContext"

const AppStateProvider = ({children}) => {
    const [prototype, ] = useState();
    const [orders, setOrders] = useState([]);

  return <AppStateContext.Provider 
    value={{
      orders, 
    }}
    >
    {children}
  </AppStateContext.Provider>
}

export default AppStateProvider;