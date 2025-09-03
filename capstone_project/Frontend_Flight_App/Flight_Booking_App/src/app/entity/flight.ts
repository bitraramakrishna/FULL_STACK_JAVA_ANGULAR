export interface FlightDTO {
  flightId: string;
  airline: string;
  source: string;
  destination: string;
  startDate: string | Date;
  endDate: string | Date;
  price: number;
}