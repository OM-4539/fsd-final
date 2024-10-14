export interface HotelResponse{
    payload:Hotel[],
    message:string
}

export interface Hotel{
        id: number
        name: string
        roomprice: number
        imageurl: string
        description: string
        city: string
        email: string
        rating: number
        wifi: string
        gym: string
        pool: string
        createddt: string
        updateddt: string
}