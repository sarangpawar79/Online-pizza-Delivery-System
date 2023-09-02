import CustHomeNv from "./../../components/CustHomeNv";
import axios from "axios";
import { useState, useEffect } from "react";

import config from "../../config";
import { toast } from "react-toastify";

const CustomerHome = () => {
  const [category, setCategory] = useState([]);
  const [menu, setMenu] = useState([]);
  const [quantity, setQuantity] = useState(0);

  useEffect(() => {
    allCategories();
    allMenus();
  }, []);

  const allCategories = () => {
    axios.get(`${config.serverURL}/category/all`).then((Response) => {
      const result = Response.data;

      if (result["status"] === "success") {
        console.log(result);
        setCategory(result["data"]);
      } else {
        toast.error("ERROR OCCURED...");
      }
    });
  };

  const allMenus = () => {
    axios.get(`${config.serverURL}/menu/allMenus`).then((Response) => {
      const result = Response.data;
      console.log("result from axios ",result);
      if (result["status"] === "success") {
        console.log(result);
        setMenu(result["data"]);
      } else {
        console.log("Error occured something.......")
        toast.error("ERROR OCCURED...");
      }
    });
  };
  // const allMenus = () => {
  //   axios.get(`${config.serverURL}/menu/allMenus`).then((response) => {
  //     const result = response.data;
  //     console.log("result from axios: ", result); // Log the response data for debugging
  
  //     if (result["status"] === "success") {
  //       console.log("Request was successful.");
  //       setMenu(result["data"]); // Update the menu state with data from the server
  //     } else {
  //       console.log("Error occurred: ", result.error); // Log the specific error message
  //       toast.error("ERROR OCCURRED: " + result.error); // Display an error toast
  //     }
  //   }).catch((error) => {
  //     console.error("Network error occurred: ", error); // Log network errors
  //     toast.error("NETWORK ERROR OCCURRED: " + error.message); // Display a network error toast
  //   });
  // };
  
  const addToCart = (id) => {
    console.log("incart method");
    const userId = sessionStorage.getItem("customerId");
    if (quantity === 0) {
      toast.warning("Enter Quantity to add into cart");
    } else {
      axios
        .post(
          `${config.serverURL}/cart/add`,
          { menuId: id, userId: userId, quantity: quantity },
          { "Content-Type": "application/json" }
        )
        .then((Response) => {
          const result = Response.data;

          if (result["status"] === "success") {
            console.log(result);
            toast.success("menu added to cart");
          } else {
            toast.error("ERROR OCCURED...");
          }
        });
    }
  };
  const menuByCategory = (catId) => {
    axios
      .get(`${config.serverURL}/menu/allMenuByType/${catId}`)
      .then((Response) => {
        const result = Response.data;

        if (result["status"] === "success") {
          console.log(result);
          setMenu(result["data"]);
        } else {
          toast.error("ERROR OCCURED...");
        }
      });
  };

  return (
    <div className="container-fluid" >
      <CustHomeNv />
      <div className="container-fluid">
  {category.map((cat) => {
    return (
      <button
        key={cat.id} // Unique key for each category button
        onClick={() => menuByCategory(cat.id)}
        type="submit"
        className="btn btn-outline-primary btn-lg"
        style={{ margin: 20 }}
      >
        {cat.name}
      </button>
    );
  })}
</div>

      <div className="row">
        {menu.map((m) => {
          return (
            <div
              key={m.id}
              className="col-3"
              style={{
                position: "relative",
                padding: 20,
                display: "inline-block",
                cursor: "pointer",
              }}
            >
              <img
                alt="menu"
                style={{
                  height: 200,
                  width: "100%",
                  display: "block",

                  borderRadius: 10,
                }}
                 //src={'http://localhost:3001/' + m.image}
                //src={ require('../images/*'+m.image).default}
                src={config.serverURL + "/" + m.image}
              />
              <div style={{ marginTop: 20 }}>
                <h5 className="card-title">{m.productName} <span><h6>({m.restaurant.name})</h6></span></h5>
               
                <p>
                  {m.description} <br />
                  Rs. {m.price}
                </p>
              </div>


              { <div className="col">

  
                <label className="form-label" for="form3Example97">
                  Qty
                </label>
                </div> }
              <div className="row">
              
                <div className="col">
                <input
                  type="text"
                  id="form3Example97"
                  className="form-control form-control-sm"
                  placeholder="Enter Qty"
                  onChange={(e) => {
                    setQuantity(e.target.value);
                  }}
                />
              </div>
              <div className="col">
                <button
                  onClick={() => addToCart(m.id)}
                  type="button"
                  className="btn btn-success btn-sm"
                  style={{ marginTop: 5 }}
                >
                  Add To Cart
                </button>
              </div>
              </div>
            </div>
          );
        })}
      </div>
    </div>
  );
};

export default CustomerHome;
