import { useEffect, useState } from 'react';
import BeerList from '../components/BeerList'
import FavBeerList from '../components/FavBeerList';
import BeerDetails from '../components/BeerDetails';

const BeerBox = ({url}) => {
    const [beers, setBeers] = useState([])
    const [selectedBeer, setSelectedBeer] = useState(null)
    const [favBeers, setFavBeers]= useState([])

    useEffect(() => {
        loadBeers(url)
        // loadFavBeers()
    }, [url])

    const loadBeers = (url) => {
        fetch(url)
        .then(result => result.json())
        .then(data => setBeers(data))
    }

    const onBeerSelect = function (beer) {
        setSelectedBeer(beer)
    }

    const onBeerToggleFavourite = function (favBeer) {
        const beerInList = favBeers.find((beer) => {
            return beer === favBeer
        })
        if (beerInList) {
            const beerIndex = favBeers.indexOf(beerInList);
            const reducedFavBeers = favBeers.splice(beerIndex, 1)
            setFavBeers(reducedFavBeers)
            console.log(reducedFavBeers)

        } else {
            setFavBeers([...favBeers, favBeer])
            console.log(favBeers)
        }
    }

    return ( 
        <>
            <h2>Beer Box</h2>
            <FavBeerList favBeers={favBeers}/>
            <BeerList beers={beers} onBeerSelect={onBeerSelect}/>
            <BeerDetails selectedBeer={selectedBeer} onBeerToggleFavourite={onBeerToggleFavourite}/>
        </>
     );
}

export default BeerBox;