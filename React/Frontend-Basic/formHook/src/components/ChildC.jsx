import { ThemeContext,UserContext } from '../App'
import { useContext } from 'react';



const ChildC = () => {
    const user = useContext(UserContext); 
    const {theme, setTheme} = useContext(ThemeContext);
    function toggleTheme() {
        if(theme === 'light')
            setTheme('dark')
        else
            setTheme('light')
    }
  return (
    <div>
      <button onClick={toggleTheme}>
        Change Theme 
      </button>
      data: {user.name}
    </div>
  )
}

export default ChildC
