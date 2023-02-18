fun main(args: Array<String>) {
    val landRoverModels = listOf(
        VehicleModel("Defender"),
        VehicleModel("Discovery"),
        VehicleModel("Discovery Sport"),
        VehicleModel("Range Rover"),
        VehicleModel("Range Rover Evoque"),
        VehicleModel("Range Rover Sport"),
        VehicleModel("Range Rover Velar")
    )

    val landRover = VehicleMake("Land Rover", landRoverModels)
    println(landRover)
}

data class VehicleMake(val make: String, val list: List<VehicleModel>)
data class VehicleModel(val model: String)