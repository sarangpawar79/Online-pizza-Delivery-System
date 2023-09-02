import NavbarAdmin from "../../components/navbarAdmin"
import admin from './../../images/pizzahutimage.png'
const AdminHome=()=>{
    return(
        <div className="contaimer-fluid">
             <NavbarAdmin/>

             <img
        style={{
            height:'100%',
            width: '100%',
            display: 'block',
            borderRadius: 10,
          }}
            src={admin}
        />
        </div>
       )
}

export default AdminHome