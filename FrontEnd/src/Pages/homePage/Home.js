import homeImage from "../../images/pngwing.com.png"
import ContactFooter from "../../components/ContactFooter"
import "./home.css"
import { useNavigate } from "react-router-dom"

const Home = () => {

    const navigate = useNavigate()
    const loginUser=()=>{
        navigate('/signin')
    }
    const SignupUser=()=>{
        navigate('/signup')
    }
   
    return(
       
        <div className="container-fluid" class="gradient">
          
            <div class="nav">
            <nav className="navbar navbar-expand-lg "  >
                
                    <div className="container-fluid">
                     <ul  className='navbar-nav me-auto mb-2 mb-lg-0'>
                     {/* <li className='nav-item' > <button className="btn"
                     onClick={RegisterRest}>
                        Add Restaurants
                       </button></li>  */}
                       <li className='nav-item '> 
                        <button className="btn" onClick={loginUser} >
                        Login
                        </button>
                       </li>
                       <li className='nav-item' class="d">
                         <button  className="btn" onClick={SignupUser} >
                         Sign Up
                         </button>
                       </li>
                      
                    </ul>
                    </div>
                  </nav>
                 
            </div>
      
           <div class="p">
           <div className="row">
            <div className="col col-7" >
            <div class="foodi">Welcome to <b>PIZZA HUT</b></div>
               {/* <form>
               <div className="row">
                    <div className="col">
                        <div className="mb-3" class="a">
                        <input className="form-control" placeholder="Enter your location"/>
                        </div>
                    </div>
                    <div className="col">
                        <div class="b">
                        <button className="btn" type="submit" ><span>search</span></button>
                        </div>
                    </div>
                </div>
               </form> */}
                
            </div>
            <div className="col col-5">
            <img alt='Home' src={homeImage} style={{
                height: 400, width: 400, marginleft: 70
                }}/>
            </div>
        </div>
           </div>
            <div style={{textAlign:"center",marginTop:-20}}>
                
                <h6><b style={{fontSize:50,color:'burlywood'}}>Pizza Hut</b></h6>
                <div className="container"style={{textAlign:"match-parent",
                fontFamily:"sans-serif",
                textIndent:50,
                color:"black",
                fontStyle:"oblique"}}>
                    <p> <b> Welcome to PizzaHut...Your go-to destination for delicious and convenient pizza delivery!<br/>
                         At PizzaHut, we are passionate about delivering the best flavors right to your doorstep.
                         Our mission is to make your pizza experience unforgettable by offering a wide range of mouthwatering pizzas, sides 
                         and beverages that cater to all taste preferences.
                         Join the PizzaHut family today and indulge in the perfect slice of happiness. We are excited to serve you and make every meal special.
                         Your satisfaction is our top priority.
                         </b>
                     </p>
                </div>
                <hr/>
                <div className="container gradient-background"> {/* Apply the gradient background to this container */}
                <div className="container" style={{margin:30,marginLeft:140}}>
                    <h2 style={{marginTop:10,marginLeft:-300}}>Contact Us</h2>
                    <div className="row" style={{height:50,marginTop:30,marginLeft:-350}}>
                        <div className="col" >
                        {/* <img src={Kalpesh} className="card-img-top" style={{ height: 250,
                                width: 200,
                               boxShadow: "0px 4px 18px 3px rgba(0,0,0,0.38)",
                                display: "block",
                                 borderRadius: 5,}} alt="..."/> */}
                                 <div style={{marginRight:-90,marginTop:10}}> <h5 style={{textAlign:"center"}}>Pranjal Suryawanshi</h5></div>
                                 <div style={{marginRight:-110,marginTop:10,marginBottom:20, color:"white"}}> <h7 style={{textAlign:"center"}}>PranjalSuryawanshi@gmail.com</h7></div>

                        </div>
                        <div className="col" >
                        {/* <img src={Kalpesh} className="card-img-top" style={{ height: 250,
                                width: 200,
                               boxShadow: "0px 4px 18px 3px rgba(0,0,0,0.38)",
                                display: "block",
                                 borderRadius: 5,}} alt="..."/> */}
                                 <div style={{marginRight:-90,marginTop:10}}> <h5 style={{textAlign:"center"}}>Pratik Kale</h5></div>
                                 <div style={{marginRight:-110,marginTop:10,marginBottom:20, color:"white"}}> <h7 style={{textAlign:"center"}}>PratikKale@gmail.com</h7></div>

                        </div>
                        <div className="col" >
                        {/* <img src={Kalpesh} className="card-img-top" style={{ height: 250,
                                width: 200,
                               boxShadow: "0px 4px 18px 3px rgba(0,0,0,0.38)",
                                display: "block",
                                 borderRadius: 5,}} alt="..."/> */}
                                 <div style={{marginRight:-90,marginTop:10}}> <h5 style={{textAlign:"center"}}>Pritish Ulmale</h5></div>
                                 <div style={{marginRight:-110,marginTop:10,marginBottom:20, color:"white"}}> <h7 style={{textAlign:"center"}}>PritishUlmale@gmail.com</h7></div>

                        </div>
                        
                        <div className="col">
                        {/* <img src={Pankaj} className="card-img-top" style={{ height: 250,
                                width: 200,
                                boxShadow: "0px 4px 18px 3px rgba(0,0,0,0.38)",
                                display: "block",
                                 borderRadius: 5,}} alt="..."/> */}
                                 <div style={{marginRight:-90,marginTop:10}}> <h5 style={{textAlign:"center"}}>Prachi Zarekar </h5></div>
                                 <div style={{marginRight:-110,marginTop:10,marginBottom:20, color:"white"}}> <h7 style={{textAlign:"center"}}>PrachiZarekar@gmail.com</h7></div>

                        </div>
                        <div className="col">
                        {/* <img src={Raviraj} className="card-img-top" style={{ height: 250,
                                width: 200,
                                boxShadow: "0px 4px 18px 3px rgba(0,0,0,0.38)",
                                display: "block",
                                 borderRadius: 5,}} alt="..."/> */}
                                 <div style={{marginRight:-90,marginTop:10}}> <h5 style={{textAlign:"center"}}> Sarang Pawar</h5></div>
                                 <div style={{marginRight:-110,marginTop:10,marginBottom:20, color:"white"}}> <h7 style={{textAlign:"center"}}>sarangpawar@gmail.com</h7></div>

                        </div>
                        <div className="col">
                        {/* <img src={Omkar} className="card-img-top" style={{ height: 250,
                                width: 200,
                                boxShadow: "0px 4px 18px 3px rgba(0,0,0,0.38)",
                                display: "block",
                                 borderRadius: 5,}} alt="..."/> */}
                                 <div style={{marginRight:-90,marginTop:10}}> <h5 style={{textAlign:"center"}}>Pawan Rathod</h5></div>
                                 <div style={{marginRight:-110,marginTop:10,marginBottom:20, color:"white"}}> <h7 style={{textAlign:"center"}}>rathodp2712@gmail.com</h7></div>

                        </div>
                    </div>

                </div>
            </div>
        </div>
        {/* Add the ContactFooter component */}
      <ContactFooter />
       </div> 
 
    );
}

export default Home;



