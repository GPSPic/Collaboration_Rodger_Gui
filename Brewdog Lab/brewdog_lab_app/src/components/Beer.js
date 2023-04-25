import React from 'react';
import BeerDetails from './BeerDetails';

const Beer = ({beer, name, onBeerSelect}) => {

    const handleClick = () => {
        onBeerSelect(beer)
    }

    return ( 
        <li onClick={handleClick}>
            {name}
        </li>
     );
}
 
export default Beer;