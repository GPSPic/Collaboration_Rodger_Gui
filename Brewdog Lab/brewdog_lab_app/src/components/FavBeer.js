const FavBeer = ({favBeer}) => {

    if (favBeer === null) return

    return ( 
        <li>{favBeer.name}</li>
     );
}
 
export default FavBeer;