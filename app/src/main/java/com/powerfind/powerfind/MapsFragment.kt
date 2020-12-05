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
    private lateinit var clusterManager: ClusterManager<MyItem>
    private val callback = OnMapReadyCallback { googleMap ->

        val uppsala = LatLng(59.8, 17.6)
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