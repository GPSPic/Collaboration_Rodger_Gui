const BeerDetails = ({beer}) => {

    if (beer == null) {
        return <p>Loading...</p>
    }

    return ( 
        <>
            <p>You are seeing the details about {beer.name}</p>
        </>
     );
}
 
export default BeerDetails;