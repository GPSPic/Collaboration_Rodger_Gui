import FavBeer from "./FavBeer";

const FavBeerList = ({favBeers}) => {

    if (favBeers == null || favBeers.length === 0) {
       return (
        <>
            <h3>These are a few of my favourite beers</h3>
            <p>Pick your poison(s)!</p>
        </>
       )    
    }

    return ( 
        <>
            <h3>These are a few of my favourite beers</h3>
            <ul>
                {favBeers.map((favBeer, index) => {
                    return <FavBeer favBeer={favBeer} key={index} />
                })}
            </ul>
        </>
     );
}
 
export default FavBeerList;