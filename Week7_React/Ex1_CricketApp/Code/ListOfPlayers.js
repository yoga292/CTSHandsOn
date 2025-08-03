import React from "react";


const ListOfPlayers = ({players})=>{
    return(
        <div>
            {players.map((item,index)=>(
                <li key = {index}>Mr. {item.name} <span>{item.score}</span></li>
            ))}
        </div>
    );
};
export default ListOfPlayers;