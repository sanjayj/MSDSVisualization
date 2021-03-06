
package msds.vs.livetraffic.wsclient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.7-b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "FlightXML2Soap", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface FlightXML2Soap {


    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.AircraftTypeResults
     */
    @WebMethod(operationName = "AircraftType", action = "FlightXML2:AircraftType")
    @WebResult(name = "AircraftTypeResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public AircraftTypeResults aircraftType(
        @WebParam(name = "AircraftTypeRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        AircraftTypeRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.AirlineFlightInfoResults
     */
    @WebMethod(operationName = "AirlineFlightInfo", action = "FlightXML2:AirlineFlightInfo")
    @WebResult(name = "AirlineFlightInfoResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public AirlineFlightInfoResults airlineFlightInfo(
        @WebParam(name = "AirlineFlightInfoRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        AirlineFlightInfoRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.AirlineFlightSchedulesResults
     */
    @WebMethod(operationName = "AirlineFlightSchedules", action = "FlightXML2:AirlineFlightSchedules")
    @WebResult(name = "AirlineFlightSchedulesResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public AirlineFlightSchedulesResults airlineFlightSchedules(
        @WebParam(name = "AirlineFlightSchedulesRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        AirlineFlightSchedulesRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.AirlineInfoResults
     */
    @WebMethod(operationName = "AirlineInfo", action = "FlightXML2:AirlineInfo")
    @WebResult(name = "AirlineInfoResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public AirlineInfoResults airlineInfo(
        @WebParam(name = "AirlineInfoRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        AirlineInfoRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.AirlineInsightResults
     */
    @WebMethod(operationName = "AirlineInsight", action = "FlightXML2:AirlineInsight")
    @WebResult(name = "AirlineInsightResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public AirlineInsightResults airlineInsight(
        @WebParam(name = "AirlineInsightRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        AirlineInsightRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.AirportInfoResults
     */
    @WebMethod(operationName = "AirportInfo", action = "FlightXML2:AirportInfo")
    @WebResult(name = "AirportInfoResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public AirportInfoResults airportInfo(
        @WebParam(name = "AirportInfoRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        AirportInfoRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.AllAirlinesResults
     */
    @WebMethod(operationName = "AllAirlines", action = "FlightXML2:AllAirlines")
    @WebResult(name = "AllAirlinesResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public AllAirlinesResults allAirlines(
        @WebParam(name = "AllAirlinesRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        AllAirlinesRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.AllAirportsResults
     */
    @WebMethod(operationName = "AllAirports", action = "FlightXML2:AllAirports")
    @WebResult(name = "AllAirportsResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public AllAirportsResults allAirports(
        @WebParam(name = "AllAirportsRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        AllAirportsRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.ArrivedResults
     */
    @WebMethod(operationName = "Arrived", action = "FlightXML2:Arrived")
    @WebResult(name = "ArrivedResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public ArrivedResults arrived(
        @WebParam(name = "ArrivedRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        ArrivedRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.BlockIdentCheckResults
     */
    @WebMethod(operationName = "BlockIdentCheck", action = "FlightXML2:BlockIdentCheck")
    @WebResult(name = "BlockIdentCheckResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public BlockIdentCheckResults blockIdentCheck(
        @WebParam(name = "BlockIdentCheckRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        BlockIdentCheckRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.CountAirportOperationsResults
     */
    @WebMethod(operationName = "CountAirportOperations", action = "FlightXML2:CountAirportOperations")
    @WebResult(name = "CountAirportOperationsResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public CountAirportOperationsResults countAirportOperations(
        @WebParam(name = "CountAirportOperationsRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        CountAirportOperationsRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.CountAllEnrouteAirlineOperationsResults
     */
    @WebMethod(operationName = "CountAllEnrouteAirlineOperations", action = "FlightXML2:CountAllEnrouteAirlineOperations")
    @WebResult(name = "CountAllEnrouteAirlineOperationsResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public CountAllEnrouteAirlineOperationsResults countAllEnrouteAirlineOperations(
        @WebParam(name = "CountAllEnrouteAirlineOperationsRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        CountAllEnrouteAirlineOperationsRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.DecodeFlightRouteResults
     */
    @WebMethod(operationName = "DecodeFlightRoute", action = "FlightXML2:DecodeFlightRoute")
    @WebResult(name = "DecodeFlightRouteResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public DecodeFlightRouteResults decodeFlightRoute(
        @WebParam(name = "DecodeFlightRouteRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        DecodeFlightRouteRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.DecodeRouteResults
     */
    @WebMethod(operationName = "DecodeRoute", action = "FlightXML2:DecodeRoute")
    @WebResult(name = "DecodeRouteResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public DecodeRouteResults decodeRoute(
        @WebParam(name = "DecodeRouteRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        DecodeRouteRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.DeleteAlertResults
     */
    @WebMethod(operationName = "DeleteAlert", action = "FlightXML2:DeleteAlert")
    @WebResult(name = "DeleteAlertResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public DeleteAlertResults deleteAlert(
        @WebParam(name = "DeleteAlertRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        DeleteAlertRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.DepartedResults
     */
    @WebMethod(operationName = "Departed", action = "FlightXML2:Departed")
    @WebResult(name = "DepartedResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public DepartedResults departed(
        @WebParam(name = "DepartedRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        DepartedRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.EnrouteResults
     */
    @WebMethod(operationName = "Enroute", action = "FlightXML2:Enroute")
    @WebResult(name = "EnrouteResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public EnrouteResults enroute(
        @WebParam(name = "EnrouteRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        EnrouteRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.FleetArrivedResults
     */
    @WebMethod(operationName = "FleetArrived", action = "FlightXML2:FleetArrived")
    @WebResult(name = "FleetArrivedResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public FleetArrivedResults fleetArrived(
        @WebParam(name = "FleetArrivedRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        FleetArrivedRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.FleetScheduledResults
     */
    @WebMethod(operationName = "FleetScheduled", action = "FlightXML2:FleetScheduled")
    @WebResult(name = "FleetScheduledResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public FleetScheduledResults fleetScheduled(
        @WebParam(name = "FleetScheduledRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        FleetScheduledRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.FlightInfoResults
     */
    @WebMethod(operationName = "FlightInfo", action = "FlightXML2:FlightInfo")
    @WebResult(name = "FlightInfoResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public FlightInfoResults flightInfo(
        @WebParam(name = "FlightInfoRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        FlightInfoRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.FlightInfoExResults
     */
    @WebMethod(operationName = "FlightInfoEx", action = "FlightXML2:FlightInfoEx")
    @WebResult(name = "FlightInfoExResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public FlightInfoExResults flightInfoEx(
        @WebParam(name = "FlightInfoExRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        FlightInfoExRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.GetAlertsResults
     */
    @WebMethod(operationName = "GetAlerts", action = "FlightXML2:GetAlerts")
    @WebResult(name = "GetAlertsResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public GetAlertsResults getAlerts(
        @WebParam(name = "GetAlertsRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        GetAlertsRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.GetFlightIDResults
     */
    @WebMethod(operationName = "GetFlightID", action = "FlightXML2:GetFlightID")
    @WebResult(name = "GetFlightIDResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public GetFlightIDResults getFlightID(
        @WebParam(name = "GetFlightIDRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        GetFlightIDRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.GetHistoricalTrackResults
     */
    @WebMethod(operationName = "GetHistoricalTrack", action = "FlightXML2:GetHistoricalTrack")
    @WebResult(name = "GetHistoricalTrackResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public GetHistoricalTrackResults getHistoricalTrack(
        @WebParam(name = "GetHistoricalTrackRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        GetHistoricalTrackRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.GetLastTrackResults
     */
    @WebMethod(operationName = "GetLastTrack", action = "FlightXML2:GetLastTrack")
    @WebResult(name = "GetLastTrackResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public GetLastTrackResults getLastTrack(
        @WebParam(name = "GetLastTrackRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        GetLastTrackRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.InboundFlightInfoResults
     */
    @WebMethod(operationName = "InboundFlightInfo", action = "FlightXML2:InboundFlightInfo")
    @WebResult(name = "InboundFlightInfoResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public InboundFlightInfoResults inboundFlightInfo(
        @WebParam(name = "InboundFlightInfoRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        InboundFlightInfoRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.InFlightInfoResults
     */
    @WebMethod(operationName = "InFlightInfo", action = "FlightXML2:InFlightInfo")
    @WebResult(name = "InFlightInfoResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public InFlightInfoResults inFlightInfo(
        @WebParam(name = "InFlightInfoRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        InFlightInfoRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.LatLongsToDistanceResults
     */
    @WebMethod(operationName = "LatLongsToDistance", action = "FlightXML2:LatLongsToDistance")
    @WebResult(name = "LatLongsToDistanceResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public LatLongsToDistanceResults latLongsToDistance(
        @WebParam(name = "LatLongsToDistanceRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        LatLongsToDistanceRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.LatLongsToHeadingResults
     */
    @WebMethod(operationName = "LatLongsToHeading", action = "FlightXML2:LatLongsToHeading")
    @WebResult(name = "LatLongsToHeadingResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public LatLongsToHeadingResults latLongsToHeading(
        @WebParam(name = "LatLongsToHeadingRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        LatLongsToHeadingRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.MapFlightResults
     */
    @WebMethod(operationName = "MapFlight", action = "FlightXML2:MapFlight")
    @WebResult(name = "MapFlightResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public MapFlightResults mapFlight(
        @WebParam(name = "MapFlightRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        MapFlightRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.MapFlightExResults
     */
    @WebMethod(operationName = "MapFlightEx", action = "FlightXML2:MapFlightEx")
    @WebResult(name = "MapFlightExResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public MapFlightExResults mapFlightEx(
        @WebParam(name = "MapFlightExRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        MapFlightExRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.MetarResults
     */
    @WebMethod(operationName = "Metar", action = "FlightXML2:Metar")
    @WebResult(name = "MetarResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public MetarResults metar(
        @WebParam(name = "MetarRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        MetarRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.MetarExResults
     */
    @WebMethod(operationName = "MetarEx", action = "FlightXML2:MetarEx")
    @WebResult(name = "MetarExResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public MetarExResults metarEx(
        @WebParam(name = "MetarExRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        MetarExRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.NTafResults
     */
    @WebMethod(operationName = "NTaf", action = "FlightXML2:NTaf")
    @WebResult(name = "NTafResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public NTafResults nTaf(
        @WebParam(name = "NTafRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        NTafRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.RegisterAlertEndpointResults
     */
    @WebMethod(operationName = "RegisterAlertEndpoint", action = "FlightXML2:RegisterAlertEndpoint")
    @WebResult(name = "RegisterAlertEndpointResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public RegisterAlertEndpointResults registerAlertEndpoint(
        @WebParam(name = "RegisterAlertEndpointRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        RegisterAlertEndpointRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.RoutesBetweenAirportsResults
     */
    @WebMethod(operationName = "RoutesBetweenAirports", action = "FlightXML2:RoutesBetweenAirports")
    @WebResult(name = "RoutesBetweenAirportsResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public RoutesBetweenAirportsResults routesBetweenAirports(
        @WebParam(name = "RoutesBetweenAirportsRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        RoutesBetweenAirportsRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.RoutesBetweenAirportsExResults
     */
    @WebMethod(operationName = "RoutesBetweenAirportsEx", action = "FlightXML2:RoutesBetweenAirportsEx")
    @WebResult(name = "RoutesBetweenAirportsExResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public RoutesBetweenAirportsExResults routesBetweenAirportsEx(
        @WebParam(name = "RoutesBetweenAirportsExRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        RoutesBetweenAirportsExRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.ScheduledResults
     */
    @WebMethod(operationName = "Scheduled", action = "FlightXML2:Scheduled")
    @WebResult(name = "ScheduledResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public ScheduledResults scheduled(
        @WebParam(name = "ScheduledRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        ScheduledRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.SearchResults
     */
    @WebMethod(operationName = "Search", action = "FlightXML2:Search")
    @WebResult(name = "SearchResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public SearchResults search(
        @WebParam(name = "SearchRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        SearchRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.SearchBirdseyeInFlightResults
     */
    @WebMethod(operationName = "SearchBirdseyeInFlight", action = "FlightXML2:SearchBirdseyeInFlight")
    @WebResult(name = "SearchBirdseyeInFlightResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public SearchBirdseyeInFlightResults searchBirdseyeInFlight(
        @WebParam(name = "SearchBirdseyeInFlightRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        SearchBirdseyeInFlightRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.SearchBirdseyePositionsResults
     */
    @WebMethod(operationName = "SearchBirdseyePositions", action = "FlightXML2:SearchBirdseyePositions")
    @WebResult(name = "SearchBirdseyePositionsResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public SearchBirdseyePositionsResults searchBirdseyePositions(
        @WebParam(name = "SearchBirdseyePositionsRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        SearchBirdseyePositionsRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.SearchCountResults
     */
    @WebMethod(operationName = "SearchCount", action = "FlightXML2:SearchCount")
    @WebResult(name = "SearchCountResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public SearchCountResults searchCount(
        @WebParam(name = "SearchCountRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        SearchCountRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.SetAlertResults
     */
    @WebMethod(operationName = "SetAlert", action = "FlightXML2:SetAlert")
    @WebResult(name = "SetAlertResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public SetAlertResults setAlert(
        @WebParam(name = "SetAlertRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        SetAlertRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.SetMaximumResultSizeResults
     */
    @WebMethod(operationName = "SetMaximumResultSize", action = "FlightXML2:SetMaximumResultSize")
    @WebResult(name = "SetMaximumResultSizeResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public SetMaximumResultSizeResults setMaximumResultSize(
        @WebParam(name = "SetMaximumResultSizeRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        SetMaximumResultSizeRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.TafResults
     */
    @WebMethod(operationName = "Taf", action = "FlightXML2:Taf")
    @WebResult(name = "TafResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public TafResults taf(
        @WebParam(name = "TafRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        TafRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.TailOwnerResults
     */
    @WebMethod(operationName = "TailOwner", action = "FlightXML2:TailOwner")
    @WebResult(name = "TailOwnerResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public TailOwnerResults tailOwner(
        @WebParam(name = "TailOwnerRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        TailOwnerRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns msds.vs.livetraffic.wsclient.ZipcodeInfoResults
     */
    @WebMethod(operationName = "ZipcodeInfo", action = "FlightXML2:ZipcodeInfo")
    @WebResult(name = "ZipcodeInfoResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    public ZipcodeInfoResults zipcodeInfo(
        @WebParam(name = "ZipcodeInfoRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
        ZipcodeInfoRequest parameters);

}
