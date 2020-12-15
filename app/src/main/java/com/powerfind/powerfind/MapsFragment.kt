package com.powerfind.powerfind


import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.maps.android.clustering.ClusterManager


class MapsFragment : Fragment() {


    // Declare a variable for the cluster manager.
    //private lateinit var clusterManager: ClusterManager<MyItem>
    private val callback = OnMapReadyCallback { googleMap ->

     /*fun setUpClusterer() {
            // Position the map.
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(LatLng(59.86, 17.63), 10f))

            // Initialize the manager with the context and the map.
            // (Activity extends context, so we can pass 'this' in the constructor.)
            clusterManager = ClusterManager(context, googleMap)

            // Point the map's listeners at the listeners implemented by the cluster
            // manager.
            googleMap.setOnCameraIdleListener(clusterManager)
            googleMap.setOnMarkerClickListener(clusterManager)

            // Add cluster items (markers) to the cluster manager.
       //    addItems()
        }

        fun addItems() {

            // Set some lat/lng coordinates to start with.
            var lat = 59.86804
            var lng = 17.63715

            // Add ten cluster items in close proximity, for purposes of this example.
            for (i in 0..9) {
                val offset = i / 60.0
                lat += offset
                lng += offset
                val offsetItem =
                    MyItem(lat, lng, "Title $i", "Snippet $i")
                clusterManager.addItem(offsetItem)
            }
        }*/


        val uppsala = LatLng(59.86804, 17.63715)
        googleMap.addMarker(MarkerOptions().position(uppsala).title("Marker in Uppsala"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(uppsala))
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_maps, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)
    }

}