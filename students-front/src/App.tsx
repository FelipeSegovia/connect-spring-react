import { useEffect, useState } from 'react'
import './App.css'
import { Usuario } from './interface'
import axios, { AxiosError } from 'axios'

function App() {

  const [usuarios, setUsuarios] = useState<Usuario[]>([])

  const getUsers = async () => {
    await axios.get('http://localhost:8080/student/')
    .then((response: any) => setUsuarios(response.data))
    .catch((error: AxiosError) => console.log("Error =>", error))
  }

  useEffect(() => {
    getUsers();
  },[])

  return (
    <div className="App">
      <h1>Listado de usuarios</h1>
      <ul>
        {usuarios.map((usuario, index) => {
          return <li key={index}>{usuario.name} - {usuario.address}</li>
        })}
      </ul>
    </div>
  )
}

export default App
