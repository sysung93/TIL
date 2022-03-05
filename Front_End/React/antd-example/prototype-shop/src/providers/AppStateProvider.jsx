import { useState } from "react"
import AppStateContext from "../contexts/AppState"

const AppStateProvider = ({children}) => {
  const {prototypes, }
  const [orders, setOrders] = useState([]);

  return <AppStateContext.Provider value={{
    orders,
  }}>
    {children}
  </AppStateContext.Provider>
}

export default AppStateProvider